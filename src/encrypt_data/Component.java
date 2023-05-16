package encrypt_data;

public interface Component {
    void input(String data);
    void process();
    String getResult();
    void setEncryptStrategy(EncryptStrategy encryptStrategy);


}
