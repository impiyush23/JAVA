public class Find_output2 {
    private int radius = 5;
    float area(){
        return 3.14f*radius*radius;
    }

    public static void main(String[] args) {
        Find_output2 f1= new Find_output2();
        System.out.println("Area="+f1.area());
    }
}
