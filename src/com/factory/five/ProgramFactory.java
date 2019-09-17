package com.factory.five;

public class ProgramFactory {
    public static ProgramInterface getProgram(int programNumber) {
        switch (programNumber) {
            case 2:
                return new Program2();
            case 3:
                return new Program3();
            default: // Return program 1 by default
                return new Program1();
        }
    }
}
