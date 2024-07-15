public class Box {
    private float length, breadth, height;

    private static int boxCount; /////static variable  for static method
    // to display boxCount

    public void setDimensions(float length, float  breadth, float height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void showDimensions(){
        System.out.println("Length= "+length);
        System.out.println("Breadth= "+breadth);
        System.out.println("Height= "+height);
    }

    public static void  showBoxCount(){
        System.out.println("Box Count="+boxCount);
    }  // *** static method to display box count.***


    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimensions(2,3.6f,2.89f);
        b1.showDimensions();
        Box.showBoxCount(); // calling static method via className.staticMethod*
    }
}
