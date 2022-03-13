package io;

public class NonOutput implements Output {

    public static NonOutput nonOutput() {
        return new NonOutput();
    }
}
