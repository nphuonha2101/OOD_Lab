package state;

public class NoQuaterState implements State {
    public NoQuaterState(GumbalMachine gumbalMachine) {
    }

    @Override
    public void insertQuater() {
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You haven insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned a crank but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
