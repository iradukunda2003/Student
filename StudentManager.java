import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {

    public void addStudent(Map<Integer, String> students, int studentId, String name) {

        if (studentId <= 0) {
            throw new IllegalArgumentException("Error: Student ID cannot be negative or zero!");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Student name cannot be empty!");
        }

        students.put(studentId, name);
        System.out.println("Student added: ID = " + studentId + ", Name = " + name);
    }

    public void sortStudents(Map<Integer, String> students) {

        TreeMap<Integer, String> sorted = new TreeMap<>(students);

        System.out.println("Students sorted by ID:");
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId) {

        if (students.containsKey(studentId)) {
            System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
        } else {
            System.out.println("Student not found.");
        }
    }

    public void removeStudent(Map<Integer, String> students, int studentId) {

        if (students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Student removed with ID: " + studentId);
        } else {
            System.out.println("Cannot remove. Student not found.");
        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students) {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        int highestId = new TreeMap<>(students).lastKey();
        System.out.println("Student with highest ID: ID = " + highestId +
                ", Name = " + students.get(highestId));
    }

    public void findStudentWithLowestId(Map<Integer, String> students) {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        int lowestId = new TreeMap<>(students).firstKey();
        System.out.println("Student with lowest ID: ID = " + lowestId +
                ", Name = " + students.get(lowestId));
    }
}