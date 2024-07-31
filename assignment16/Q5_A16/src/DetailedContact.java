class Contact{
    private String name;
    private long mobileNo;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMobileNo(long mob){
        mobileNo=mob;
    }
    public long getMobileNo(){
        return mobileNo;
    }
}
    class DetailedContact extends Contact{
        private String email;
        private String dob;
        public void saveContact(String n,long m){
            setName(n);
            setMobileNo(m);
        }
        public void setEmail(String mail){
            email=mail;
        }
        public String getEmail() {
            return email;
        }
        public String getDob() {
            return dob;
        }
        public void setDob(String dob) {
            this.dob = dob;
        }
        public void showContact(){
            System.out.println("Name:"+getName());
            System.out.println("Mobile no:"+getMobileNo());
            System.out.println("Email:"+getEmail());
            System.out.println("DOB:"+getDob());
        }

        public static void main(String[] args) {
            DetailedContact d = new DetailedContact();
            d.saveContact("Chhotu new",909080800);
            d.setEmail("chhotu123@gmail.com");
            d.setDob("31/07/1997");
            d.showContact();

        }
    }
