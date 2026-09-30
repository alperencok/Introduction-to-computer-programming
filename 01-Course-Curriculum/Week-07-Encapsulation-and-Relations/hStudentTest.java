package Examples;

public class hStudentTest {
    public static void main(String[] args) {
        hStudent[] studentArray = new hStudent[3];
        studentArray[0] = new hStudent();
        studentArray[0].grade = 100;
        System.out.println(studentArray[0].grade);
        studentArray[1] = new hStudent();
        studentArray[1].grade = 99;
        System.out.println(studentArray[1].grade);
        studentArray[2] = new hStudent();
        studentArray[2].grade = 98;
        System.out.println(studentArray[2].grade);
        int sum = 0;
        // Get the average grade of the students
        for (int i = 0; i < studentArray.length; i++) {
            sum = sum + studentArray[i].grade;
        }
        sum = 0;
        for (hStudent s : studentArray) {
            sum += s.grade;
        }
        System.out.println(sum / studentArray.length);
    }
}
