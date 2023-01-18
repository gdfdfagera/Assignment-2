public abstract class Person implements Comparable<Person>, Payable {
    public int id;
    private static int iD = 0;
    public String name;
    public String surname;

    public Person(){
        id = iD++;
    }

    public Person(String name, String surname){
        setName(name);
        setSurname(surname);
        id = iD++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }


    @Override
    public String toString(){
        return (id + "." + name + " " + surname);
    }



    public abstract String getPosition();

    public abstract double getPaymentAmount();

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount() > o.getPaymentAmount()){
            return 1;
        }else return -1;
    }
}
