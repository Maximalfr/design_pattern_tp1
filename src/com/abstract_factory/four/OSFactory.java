package com.abstract_factory.four;

public class OSFactory {

    private static boolean isWindows() {
        return false; // Mock
    }

    public static Factory getFactory() {
        if (isWindows())
            return new WindowsFactory();
        return new LinuxFactory();
    }
}
