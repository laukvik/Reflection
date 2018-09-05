package org.laukvik.reflection;

import jdk.javadoc.doclet.Doclet;

public interface Plugin {

    public boolean accept(Doclet doclet);

}
