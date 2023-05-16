package lab1;

public class RegisterSubject {
    private Subject subject;
    private double grade;

    public RegisterSubject(Subject subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
