import java.util.HashMap;
import java.util.Map;

public class GradeBookWithHashMap
{
    public static void runGradeBook()
    {
        HashMap<String, Double> students = new HashMap<>();

        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");

        do
        {
            System.out.println("Student: ");
            newStudent = CodePracticeApp.getString();

            if(!newStudent.equals(""))
            {
                System.out.println("Grade: ");
                double newGrade = CodePracticeApp.getDouble();
                students.put(newStudent, newGrade); // Put is similar to add for Lists.

                CodePracticeApp.getString();
            }
        }
        while(!newStudent.equals(""));

        System.out.println("\nClass roster:");
        double sum = 0.0;

        for(Map.Entry<String, Double> student : students.entrySet())
        {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average: " + avg);
    }
}