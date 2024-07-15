public class Circle {
    private Double radius; // instead of double radius

    public Double getRadius() {
        return radius;
    }

    public void setRadius( Double radius) {
        this.radius = radius;
    }
    public Double getArea(){
        return 3.14*radius*radius;
    }
    public Double getCircumference(){
        return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.26);
        System.out.println("RADIUS IS :"+c1.getRadius());
        System.out.println("AREA IS :"+c1.getArea());
        System.out.println("CIRCUMFERENCE IS :"+c1.getCircumference());

    }
}
