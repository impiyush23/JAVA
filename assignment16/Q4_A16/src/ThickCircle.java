class Circle{
    private double radius;
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }


}
class ThickCircle extends Circle {
    private double thickness;
    public void setThickness(double thick){
        thickness=thick;
    }
    public double getThickness(){
        return thickness;
    }
    public double getThicknessArea(){
        return calculateArea()-getHollowArea();
    }
    public double getHollowArea(){
        return (3.14*(getRadius()-thickness)*(getRadius()-thickness));
    }

    public static void main(String[] args) {
        ThickCircle t = new ThickCircle();
        t.setRadius(5.0);
        System.out.println("Area is:"+t.calculateArea());
        t.setThickness(2.0);
        System.out.println("THICKNESS AREA:"+t.getThicknessArea());
        System.out.println("hollow area:"+t.getHollowArea());
    }

}
