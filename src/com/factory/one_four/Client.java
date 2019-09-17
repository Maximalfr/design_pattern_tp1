package com.factory.one_four;

public class Client {

    public static void main(String[] args) {
        Client.getProgramN(2).go();
    }

    private static ProgramInterface getProgramN(int programNumber) {
        switch (programNumber) {
            case 2:
                return new Program2();
            case 3:
                return new Program3();
            default:
                return new Program1();
        }
    }
}
