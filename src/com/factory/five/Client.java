package com.factory.five;

public class Client {

    public static void main(String[] args) {
        ProgramFactory.getProgram(1).go();
        ProgramFactory.getProgram(2).go();
        ProgramFactory.getProgram(3).go();
    }
}
