package com.company;

public class PingPong {
    public static void playPong() throws PongException {
        throw new PongException();
    }

    public static void playPing() throws PingException {
        throw new PingException();
    }

    public static void playPingPong() throws PingPongException {
        throw new PingPongException();
    }
}
