package Examples;

public class iCourseTest {
    public static void main(String[] args) {
        iCourse courses[]=new iCourse[2];
        courses[0]=new iCourse();
        courses[0].courseName="Biology";
        courses[0].students[0]=new hStudent();
        courses[0].students[0].grade=100;
        courses[0].students[1]=new hStudent();
        courses[0].students[1].grade=95;
        courses[0].students[2]=new hStudent();
        courses[0].students[2].grade=90;
        courses[1]=new iCourse();
        courses[1].courseName="Math";
        courses[1].students[0]=new hStudent();
        courses[1].students[0].grade=90;
        courses[1].students[1]=new hStudent();
        courses[1].students[1].grade=80;
        courses[1].students[2]=new hStudent();
        courses[1].students[2].grade=100;
        //Get the average of courses
        int sum;
        for (int i = 0; i < courses.length; i++) {
            sum=0;
            for (int j = 0; j < courses[i].students.length; j++) {
               sum=sum+courses[i].students[j].grade;
            }
            System.out.println(courses[i].courseName+": "
                    + ""+(sum/courses[i].students.length));
        }
    }
}
