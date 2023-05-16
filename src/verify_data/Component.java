package verify_data;

import java.util.ArrayList;
import java.util.List;

public class Component {
    protected String data;
    protected List<Boolean> validationResult = new ArrayList<>();

    public Component(String data) {
        this.data = data;
    }

    public boolean checkAllValidates() {

        for (boolean result :
                validationResult) {
            if (result == true)
                return false;
        }
        return true;
    }
}
