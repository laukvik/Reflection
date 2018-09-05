package org.laukvik.reflection;

public class Scanner {

    private Class c;

    public Scanner(final Class aClass) {
        this.c = aClass;
    }

    public boolean isAnnotatedByClass(final Class aclass) {
        return c.isAnnotationPresent(aclass);
    }

    public static boolean isPlugin(final Class aClass) {
        return Plugin.class.isAssignableFrom(aClass);
    }

    public void processModel(final Model model){

    }

}
