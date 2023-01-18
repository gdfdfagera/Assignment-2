public class Employee extends Person implements Payable{
    public String position;
    private double salary;

    public Employee(){}

    public Employee(String name, String surname, String position, double salary){
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String getPosition(){
        return "Employee";
    }

}
