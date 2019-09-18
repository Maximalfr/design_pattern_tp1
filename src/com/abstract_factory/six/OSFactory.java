package com.abstract_factory.six;

public class OSFactory {

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    private static boolean isMac() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }
    

    public static Factory getFactory() {
        if (isWindows())
            return new WindowsFactory();
        else if (isMac())
            return new MacintoshFactory();
        return new LinuxFactory();
    }
}
