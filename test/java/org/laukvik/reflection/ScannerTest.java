package org.laukvik.reflection;

import org.junit.jupiter.api.Test;
import java.beans.JavaBean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScannerTest {

    @Test
    public void isAnnotatedByClass() {
        Scanner scanner = new Scanner(ExamplePlugin.class);
        assertTrue(scanner.isAnnotatedByClass(JavaBean.class));
    }

    @Test
    public void isPlugin() {
        assertTrue(Scanner.isPlugin(ExamplePlugin.class));
        assertFalse(Scanner.isPlugin(Object.class));
    }

    @Test
    void processModel() {
        Scanner scanner = new Scanner(ExamplePlugin.class);
        scanner.processModel(new ExampleModel());
        assert true;
    }
}
