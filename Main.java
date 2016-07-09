package com.example.lesson27;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class c = Thread.class;
        int modifiers = c.getModifiers();
        System.out.print(c.getName() + " Modifiers:");
        if (Modifier.isPrivate(modifiers)) {
            System.out.println(" private");
        }
        if (Modifier.isPublic(modifiers)) {
            System.out.print(" public");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println(" final");
        }
        if (Modifier.isStatic(modifiers)) {
            System.out.println(" static");
        }
        System.out.println("\n");
        Method[] methods = c.getMethods();
        for (Method method : methods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Parameter Type: ");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName());
            }
            System.out.println();
            Annotation[] annotations = method.getAnnotations();
            System.out.print("Annotation: ");
            for (Annotation annotation : annotations) {
                System.out.print("@" + annotation.annotationType().getSimpleName());
            }
            System.out.println("\n");
        }
    }
}
