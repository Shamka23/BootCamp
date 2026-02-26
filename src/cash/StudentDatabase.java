package cash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class StudentDatabase {
    private static final Map<Student, Map<Subject, Integer>> studentSubjects = new HashMap<>();
    private static final Map<Subject, List<Student>> subjectsStudent = new HashMap<>();

    public static void main(String[] args) {
        addStudentWithScore("Shama", "Math", 4);
        addStudentWithScore("Shama", "Russian Language", 4);
        addStudentWithScore("Rupert", "Math", 4);
        addStudentWithScore("Rupert", "Russian Language", 4);

    }

    public static void addStudentWithScore(String studentName, String subjectName, int score) {
        studentSubjects
                .computeIfAbsent(new Student(studentName), subject -> new HashMap<>())
                .put(new Subject(subjectName), score);
        subjectsStudent
                .computeIfAbsent(new Subject(subjectName), s -> new ArrayList<>())
                .add(new Student(studentName));
    }

    public static void addSubjectForStudents() {
        studentSubjects.putIfAbsent()
    }


}
