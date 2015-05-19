package org.reflection_no_reflection;

import java.lang.reflect.Type;
import java.util.List;

/**
 * This is the base class for all RNR implementation of fields.
 * It has the exact same API as Java core reflection fields, and
 * can contain extra methods if required.
 * Subclass will provide their own implementations of the various field methods.
 */
public class Field {

    private String name;
    private final Class<?> type;
    private Class<?> enclosingClass;
    private int modifiers;
    private final List<Annotation> annotationList;

    public Field(String name, Class<?> type, Class<?> enclosingClass, int modifiers, List<Annotation> annotationList) {
        this.name = name;
        this.type = type;
        this.enclosingClass = enclosingClass;
        this.modifiers = modifiers;
        this.annotationList = annotationList;
    }

    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        return null; //not implemented
    }

    public Annotation[] getDeclaredAnnotations() {
        return null; //not implemented
    }

    public Class<?> getDeclaringClass() {
        return enclosingClass;
    }

    public Type getGenericType() {
        return null; //not implemented
    }

    public int getModifiers() {
        return modifiers;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }

    public int hashCode() {
        return 0; //not implemented
    }

    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        return false; //not implemented
    }

    public boolean isEnumConstant() {
        return false; //not implemented
    }

    public boolean isSynthetic() {
        return false; //not implemented
    }

    public String toGenericString() {
        return null; //not implemented
    }

    public String toString() {
        return null; //not implemented
    }
}