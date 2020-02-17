package com.don.myapplication.java;

import java.lang.reflect.Field;

/**
 * Utility interface that trims all String fields of the implementing class.
 */
public interface Trimmable {

    default void trim(){
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(this);
                if (value != null){
                    if (value instanceof String){
                        String trimmed = (String) value;
                        field.set(this, trimmed.trim());
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}