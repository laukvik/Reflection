package org.laukvik.reflection;

import jdk.javadoc.doclet.Doclet;

import java.beans.JavaBean;
import java.util.Objects;

@JavaBean
public class ExamplePlugin implements Plugin {

    @Override
    public boolean accept(Doclet doclet) {
        return isMatching(doclet);
    }

    boolean isMatching(Doclet qualifiedTypeName) {
        return Objects.equals(Example.class.getName(), qualifiedTypeName.getClass().getName());
    }

    public void process(Model model) throws Exception {

    }
}