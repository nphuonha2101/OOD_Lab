package lab1;

import java.util.ArrayList;
import java.util.List;

public class InformaticCenter {
    private List<Student> studentList = new ArrayList<>();
    private List<Lecturer> lecturerList = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();

    public List<Student> getStudentsOfSubject(Subject subject) {
        List<Student> studentListResult = new ArrayList<>();
        for (Student st: studentList
             ) {
            for (RegisterSubject registerSubject : st.getRegisterSubjectList())
                if (registerSubject.getSubject().getName().equalsIgnoreCase(subject.getName()))
                    studentListResult.add(st);

        }
        return studentListResult;
    }
}
