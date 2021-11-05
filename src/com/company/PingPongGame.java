package com.company;

public class PingPongGame {
    public static void main(String[] args) {
        try {
            PingPong.playPong();
            PingPong.playPing();
        } catch (PingPongException e) {
            System.out.println("can't play ");
        } finally {
            System.out.println("Try again ");
        }
    }
}
