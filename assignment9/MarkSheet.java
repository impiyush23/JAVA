
// ALL 5 TYPES OF THIS QUESTION SOLVED BELOW :>>>>>>>>
public class MarkSheet {
    private Integer physics, mathematics, chemistry, hindi, english;

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
    // QUE 3 > PROVIDE A MTHOD TO FIND MAXIMUM MARKS (IT SHOULD ALSO A WRAPPER CLASS METHOD)
   public Integer maxMarks(){
        Integer max = 0;
        if(max<physics)
            max=physics;
        if(max<mathematics)
            max=mathematics;
        if(max<chemistry)
            max=chemistry;
        if(max<hindi)
            max=hindi;
        if(max<english)
            max=english;

        return max;
   }
    // QUE 4 FIND AVERAGE OF ALL SUB
    public Double averageMark(){
        Double avg = (physics+chemistry+mathematics+hindi+english)/5.0;
        return avg;
    }
    // QUE  5 PASS OR FAIL, PASSING MARK OS TAKEN AS ARGUMRNT
    public Boolean isPass(Integer passingMarks){
        Boolean result=true;
        if(physics<passingMarks)
            result=false;
        if(chemistry<passingMarks)
            result=false;
        if(mathematics<passingMarks)
            result=false;
        if(hindi<passingMarks)
            result=false;
        if(english<passingMarks)
            result=false;

        return result;
    }


    public static void main(String[] args) {
        MarkSheet m1 = new MarkSheet();
        m1.setPhysics(82);
        System.out.println("Physics Marks="+m1.getPhysics());
        m1.setChemistry(63);
        System.out.println("Chemistry Marks="+m1.getChemistry());
        m1.setMathematics(87);
        System.out.println("Math Mark="+m1.getMathematics());
        m1.setHindi(84);
        System.out.println("Hindi Marks="+m1.getHindi());
        m1.setEnglish(89);
        System.out.println("English Marks="+m1.getEnglish());

        // calling max Mark method (wrapper class method
        System.out.println("Maximum mark from among all sub is = "+m1.maxMarks()+"*");

        System.out.println("Average of all sub ="+m1.averageMark());

        // checking pass or fail
        Boolean Result = m1.isPass(33);
        if(!Result)
            System.out.println("FAIL");
        else
            System.out.println("PASS");

    }
}
