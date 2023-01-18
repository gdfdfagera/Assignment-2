public class Student extends Person implements Payable {
    private double gpa;
    public String position;

    public Student(){}

    public Student (String name, String surname, String position, double gpa){
        setName(name);
        setSurname(surname);
        setPosition(position);
        setGPA(gpa);
    }
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public double getPaymentAmount() {
        if (this.gpa > 2.67){
            return 36660.00;
        }
        return 0;
    }

    @Override
    public String getPosition(){
        return "Student";
    }
}
