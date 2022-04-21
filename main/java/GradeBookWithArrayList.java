import java.util.ArrayList;


public class GradeBookWithArrayList
{
    public static void runGradeBook()
    {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");

        do
        {
            newStudent = CodePracticeApp.getString();

            if(!newStudent.equals(""))
            {
                students.add(newStudent);
            }
        }
        while(!newStudent.equals(""));

        for (String student : students)
        {
            System.out.println("Grade for " + student + ": ");
            grades.add(CodePracticeApp.getDouble());
        }

        System.out.println("\nClass roster:");
        double sum = 0.0;

        for(int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i) + " (" +grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}