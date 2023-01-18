import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Student("Dias", "Gainatulin", "Student", 3.01);
        Person p2 = new Employee("Zheka", "Tur", "Employee", 80000);
        Person p3 = new Employee("Kara", "Wer", "Employee", 32000);
        Person p4 = new Student("Den", "Dobreev", "Student", 1.6);
        Person p5 = new Student("Faga", "Vud", "Student", 3.3);

        ArrayList<Person> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);

        Collections.sort(arr);
        printData(arr);
    }

    public static void printData(Iterable<Person> list){
        list.forEach((element) -> {
            System.out.println(element.getPosition() + ": " + element.toString() + " earns " + element.getPaymentAmount() + " tenge");
        });
    }
}