class Person {
    private String name;
    private int age;
    public void setPerson(String name){
        this.name=name;
    }

    public void setPerson(int age) {
        this.age = age;
    }
    public void setPerson(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String displayPerson(){
        return name;
    }
}

