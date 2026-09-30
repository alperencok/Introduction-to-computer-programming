package Examples;

public class hStudent {
    String school = "DemoUniversity";
    int grade;

    hStudent(int x, int y) {
        System.out.println("Student object instantiated.");
    }

    String calculateLetterGrade() {
        String letterGrade = "";
        if (grade < 50) {
            letterGrade = "FF";
        } else {
            letterGrade = "AA";
        }
        return letterGrade;
    }

    final void graduate(){
        System.out.println("Graduated");
    }

}
