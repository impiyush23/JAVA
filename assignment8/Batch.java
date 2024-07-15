public class Batch {
    private int batchCode, studentCount, time,totalBatches;
    private String startDate, days;
    
    public void setBatchCode(int batchCode){
        this.batchCode = batchCode;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public void studentCount(int x){
        studentCount = x;
    }
    public void setDays(String days){
        this.days = days;
        
    }
    public int getBatchCode(){
        return batchCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getTime() {
        return time;
    }

    public int getTotalBatches() {
        return totalBatches;
    }

    public String getDays() {
        return days;
    }

    public static void main(String[] args) {
        Batch b1 = new Batch();
        b1.setBatchCode(1);
        System.out.println(b1.getBatchCode());
        b1.setStartDate("14-july-2024");
        System.out.println(b1.getStartDate());
        b1.setDays("Monday || Wednesday || Friday");
        System.out.println(b1.getDays());
    }
}
