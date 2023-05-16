package encrypt_data;

public class MyComponent implements Component{
    private String data;
    private String result;
    private EncryptStrategy encryptStrategy;

    @Override
    public void input(String data) {
        this.data = data;
    }

    @Override
    public void process() {
        this.data.trim();
    }

    @Override
    public String getResult() {
        result = encryptStrategy.encrypt(this.data);
        return result;
    }

    @Override
    public void setEncryptStrategy(EncryptStrategy encryptStrategy) {
        this.encryptStrategy = encryptStrategy;
    }
}
