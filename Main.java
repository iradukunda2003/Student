import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Student Manager System ");

        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        try {
            manager.addStudent(students, 1, "Claudine");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addStudent(students, -5, "Bob");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addStudent(students, 2, "");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            students.put(3, null);
            System.out.println(students.get(3).length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null value detected!");
        } finally {
            System.out.println("Finished testing null values.\n");
        }


        try {
            manager.addStudent(students, 4, "Beatrice");
            manager.addStudent(students, 2, "Claudine");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        manager.sortStudents(students);

        manager.searchStudent(students, 1);
        manager.searchStudent(students, 10);

        manager.removeStudent(students, 2);
        manager.removeStudent(students, 10);

        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);
    }
}