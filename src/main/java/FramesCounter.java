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
    public final int RESET_AND_DONT_RUN = 0;
    public final int RESET_AND_RUN = 1;
    public final int DONT_RESET_PAUSE = 2;
    public final int DONT_RESET_CONTINUE = 3;

    FramesCounter() {
        running = true;
        framesCounter.start();
    }
    public void startFramesTimer() {
        running = true;
        framesCounter.start();
    }
    public void stopFramesTimer(boolean reset) {
        running = false;
        if (reset) {
            frames = 0;
        }
    }
    public long getFrames(int restart) {
        switch (restart) {
            case RESET_AND_DONT_RUN:
                stopFramesTimer(true);
                break;
            case RESET_AND_RUN:
                frames = 0;
                startFramesTimer();
                break;
            case DONT_RESET_CONTINUE:
                if (framesCounter.isInterrupted()) {
                    startFramesTimer();
                }
                break;
            case DONT_RESET_PAUSE:
                stopFramesTimer(false);
        }
        return frames;
    }
}