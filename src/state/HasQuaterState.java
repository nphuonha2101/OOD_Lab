package state;

public class HasQuaterState implements State {
    private GumbalMachine gumbalMachine;
    public HasQuaterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You cannot insert a new quarter");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        gumbalMachine.
    }

    @Override
    public void dispense() {

    }
}
