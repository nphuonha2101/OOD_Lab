package encrypt_data;

public class TestDrive {
    public static void main(String[] args) {
        Component component = new MyComponent();
        component.input("aBcD");
        component.setEncryptStrategy(new ShiftCharacterEncrypt());
        System.out.println(component.getResult());
    }

}
