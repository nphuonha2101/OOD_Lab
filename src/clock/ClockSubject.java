package clock;

public interface ClockSubject {
    void registerObserver(ClockObserver clockObserver);
    void unregisterObserver(ClockObserver clockObserver);
    void notifyObservers();
}
