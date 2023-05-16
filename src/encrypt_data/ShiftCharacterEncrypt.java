package encrypt_data;

import java.util.Arrays;

public class ShiftCharacterEncrypt implements EncryptStrategy {
    @Override
    public String encrypt(String data) {
        String[] dataArr = data.split("");
        String result = "";
        String[] uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        for (int i = 0; i < data.length(); i++) {
            // check if character of data is Upper case
            if (Arrays.asList(uppercaseAlphabet).contains(dataArr[i])) {
                // get index of character in uppercase alphabet
                int indexInAlphabet = Arrays.asList(uppercaseAlphabet).indexOf(dataArr[i]);
                result += (char) (((indexInAlphabet) + 2) % 26 + 65);
            } else{
                // get index of character in lowercase alphabet
                int indexInAlphabet = Arrays.asList(lowercaseAlphabet).indexOf(dataArr[i]);
                result += (char) (((indexInAlphabet) + 2) % 26 + 97);
            }
        }

        return result;
    }


}
