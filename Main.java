package com.example.lesson27;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class c = Thread.class;
        System.out.println(c.getName());
        int modifiers = c.getModifiers();
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("private");
        }
        if (Modifier.isPublic(modifiers)) {
            System.out.println("public");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("final");
        }
        if (Modifier.isStatic(modifiers)) {
            System.out.println("static");
        }
    }
}
