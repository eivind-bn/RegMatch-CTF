package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        EasySocket.start(new RegMatch(), 8080);
    }
}
