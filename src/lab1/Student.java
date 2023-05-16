package lab1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String dateOfBirth;
    private Lecturer lecturer;
    private List<RegisterSubject> registerSubjectList =  new ArrayList<>();

    public Student(String name, String dateOfBirth, Lecturer lecturer) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.lecturer = lecturer;
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

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<RegisterSubject> getRegisterSubjectList() {
        return registerSubjectList;
    }

    public void setRegisterSubjectList(List<RegisterSubject> registerSubjectList) {
        this.registerSubjectList = registerSubjectList;
    }
}
