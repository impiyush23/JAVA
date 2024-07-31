package p3;
            class User{         // cant be public, if we create it public we have to create file as User.java
                private String name;
                private String email;
                public void setName(String n){
                    name=n;
                }
                public String getName() {
                    return name;
                }
                public void setEmail(String mail){
                    email=mail;
                }
                public String getEmail(){
                    return email;
                }
            }
            class Learner extends User{
                public void displayLearner(){
                    System.out.println("Learner Name:"+getName());
                    System.out.println("Learner Email:"+getEmail());
                }
            }
            class Admin extends User{
                public void displayAdmin(){
                    System.out.println("Admin name:"+getName());
                    System.out.println("Admin Email:"+getEmail());
                }
            }
            public class MainClass{
                public static void main(String[] args) {
                    Learner learner = new Learner();
                    learner.setName("Piyush Rao");
                    learner.setEmail("piyush123@gmail.com");
                    learner.displayLearner();
                }
                    //Admin admin = new Admin();
                    //admin.setName("Saurabh Shukla");
                    //admin.setEmail("mysirg462@gmail.com");
                    //admin.displayInfo();
}



//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// 2ND WAY TO ACCESS SUBCLASS METHODS
//       " POLYMORPHISM BUT LATE BINDING "
/*
package p3;
class User{         // cant be public, if we create it public we have to create file as User.java
    private String name;
    private String email;
    public void setName(String n){
        name=n;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String mail){
        email=mail;
    }
    public String getEmail(){
        return email;
    }
    public void displayInfo(){
        System.out.println("User Name:"+getName());
        System.out.println("User Eamil:"+getEmail());
    }
}
class Learner extends User{
    @override
    public void displayInfo(){       // OVERRIDDEN METHOD
        System.out.println("Learner Name:"+getName());
        System.out.println("Learner Email:"+getEmail());
    }
}
class Admin extends User{
    @override
    public void displayInfo(){        //OVERRIDDEN METHOD
        System.out.println("Admin name:"+getName());
        System.out.println("Admin Email:"+getEmail());
    }
}
public class MainClass{
    public static void main(String[] args) {
        User learner = new Learner();       // learner class obj will map when compiler will go to the learner class
                                                //n bind methods,there will be>(LATE BINDING)
        learner.setName("Piyush Rao");
        learner.setEmail("piyush123@gmail.com");
        learner.displayInfo();
    }
    //User admin = new Admin();
    //admin.setName("Saurabh Shukla");
    //admin.setEmail("mysirg462@gmail.com");
    //admin.displayInfo();

}

 */

