import java.sql.SQLOutput;

public class SuperCar {
    private String ownerName;
    private double price;
    private String color;
    private String brand;


    private static int countInstance; // for new object

    public static SuperCar getInstance() { // method for creating only single Object
        if (countInstance == 0) {
            countInstance++;
            return new SuperCar();
        }
        return null;         // otherwise return null
    }

     public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
         return brand;
    }

    public static void main(String[] args) {
        SuperCar s1 =new SuperCar();
        s1.setBrand("PORCHE");
        System.out.println(s1.getBrand());

    }
}
