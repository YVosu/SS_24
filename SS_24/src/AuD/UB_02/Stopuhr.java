package AuD.UB_02;

public class Stopuhr {
    private long startTime, stopTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public long getDuration() {
        return stopTime - startTime;
    }
}
