package base;
import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> PersonList = new ArrayList<Person>();
    public String name;
    public String nationalID;
    public Person(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        this.id = PersonList.size()+1;
        PersonList.add(this);
    }
    public static Person findById(int id) {
        for(Person p : PersonList) {
            if(p.id == id) {
                return p;
            }
        }
        return null;
    }
}
