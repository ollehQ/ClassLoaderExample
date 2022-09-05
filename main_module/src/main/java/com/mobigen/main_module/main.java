package com.mobigen.main_module;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        String className = "com.mobigen.sub_module.sub_module";
        String path = "sub_module-1.0-SNAPSHOT-jar-with-dependencies.jar";
        File file = new File(path);
        URL url = file.toURI().toURL();
        var classLoader = new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());

        var cls = classLoader.loadClass(className);
        var a = cls.getDeclaredMethod("Hello", null);
        var d = a.invoke(cls.newInstance(), null);
        System.out.println(d);
    }
}
