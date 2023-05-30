package Adapter;

public class TestDrive {
    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);
        duck.quack();
        duck.fly();
    }
}
