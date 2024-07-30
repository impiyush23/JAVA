package p3;
// An institute can have multiple users (HIERARCHICAL INHERITANCE)
public class User {
    private String name;
    private String email;
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Email:"+ email);
    }

}
        class Admin extends User{ // features of User inherited
        private String adminPost;
        private User user;
        public void displayUserDetails(){
            System.out.println("n");
        }

    }
     class Learner extends User{

    }
