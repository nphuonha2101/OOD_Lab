package lab1;

public class Subject {
    private String name;
    private int credits;
    private Lecturer lecturer;

    public Subject(String name, int credits, Lecturer lecturer) {
        this.name = name;
        this.credits = credits;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
