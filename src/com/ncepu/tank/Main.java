package com.ncepu.tank;

public class Main {
    public static void main(String[] args){
        TankFrame tf=new TankFrame();
        System.out.println("hello world");

        tf.setVisible(true);

        for (;;){
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tf.repaint();
        }
    }
}
