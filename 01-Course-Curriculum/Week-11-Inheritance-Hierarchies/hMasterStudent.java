package Examples;

public class hMasterStudent extends hStudent {
    hMasterStudent(){
        super(0,0);
    }
    String calculateLetterGrade(){
        if (grade==100)
            return "AA+";
        else
            return super.calculateLetterGrade();
    }
    /*Not allowed
    void graduate(){

    }*/

}
