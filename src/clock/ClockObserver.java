package clock;

public interface ClockObserver {
    void update(int hour, int minute, int second);
}
