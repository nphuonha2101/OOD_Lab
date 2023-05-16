package verify_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextComponent extends Component {

    public TextComponent(String data) {
        super(data);
    }

    public boolean checkIsNumber() {
        String[] numberStrArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean result = false;
        int countDot = 0;
        for (String charOfData : data.split("")
        ) {
            if (charOfData.equals("."))
                countDot++;
            if (Arrays.asList(numberStrArr).contains(charOfData) || countDot > 1) {
                result = true;
                break;
            } else
                result = false;

        }

        validationResult.add(result);
        return result;

    }

    public boolean checkIsEmail() {
        boolean result = false;
        for (String charOfData : data.split("")
        ) {
            if (charOfData.equals("@")) {
                result = true;
                break;
            } else
                result = false;
        }

        validationResult.add(result);
        return result;
    }



    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent("NHA");
        System.out.println(textComponent.checkIsNumber());
        System.out.println(textComponent.checkIsEmail());

        System.out.println(textComponent.checkAllValidates());
    }
}
