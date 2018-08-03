package com.khoa.algorithm.utils;

public class FramesCounter {
    private long frames = 0;
    private boolean running;
    private Thread framesCounter = new Thread() {
        @Override
        public void run() {
            super.run();
            while (running) {
                frames++;
            }
        }
    };
    public FramesCounter() {
        running = true;
        framesCounter.start();
    }
    public void startFramesTimer() {
        running = true;
        framesCounter.start();
    }
    public void stopFramesTimer(boolean reset, boolean printFrames) {
        running = false;
        if (reset) {
            frames = 0;
        }
        if (printFrames) {
            long numberOfFrames = getFrames();
            if (numberOfFrames == 1) {
                System.out.println("took " + getFrames() + " frame");
            } else {
                System.out.println("took " + getFrames() + " frames");
            }
        }
    }
    public long getFrames() {
        return frames;
    }
}