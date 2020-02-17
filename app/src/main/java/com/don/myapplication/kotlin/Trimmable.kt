package com.don.myapplication.kotlin



/**
 * Utility interface that trims all String fields of the implementing class.
 */
interface Trimmable {

    /**
     * Trim all Strings
     */
    fun trim() {
        for (field in this.javaClass.declaredFields) {
            try {
                field.isAccessible = true
                val value = field.get(this)
                if (value != null) {
                    if (value is String) {
                        field.set(this, value.trim { it <= ' ' })
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
}