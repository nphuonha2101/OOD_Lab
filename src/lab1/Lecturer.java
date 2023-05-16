package lab1;

public class Lecturer {
    private String name;
    private String dateOfBirth;
    private String degree;

    public Lecturer(String name, String dateOfBirth, String degree) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
