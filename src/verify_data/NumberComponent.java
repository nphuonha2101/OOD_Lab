package verify_data;

import java.util.ArrayList;
import java.util.List;

public class NumberComponent extends Component {
    private int data;


    public NumberComponent(String data) {
        super(data);
        this.data = Integer.parseInt(data);
    }

    public boolean checkIsLargerThanMax(int max) {
        boolean result = false;

        if (data <= max)
            result = false;
        else
            result = true;

        validationResult.add(result);
        return result;
    }

    public boolean checkIsSmallerThanMin(int min) {
        boolean result = false;

        if (data >= min)
            result = false;
        else
            result = true;

        validationResult.add(result);
        return result;
    }

    public static void main(String[] args) {
        NumberComponent numberComponent = new NumberComponent("45698");

        System.out.println(numberComponent.checkIsLargerThanMax(50000));
        System.out.println(numberComponent.checkIsSmallerThanMin(400));

        System.out.println(numberComponent.checkAllValidates());

    }


}
