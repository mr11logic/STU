package uni;
import java.util.ArrayList;
public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public int personID;
    public final int enteranceYear;
    public int majorID;
    public String StudentID;
    public Student(int personID, int enteranceYear, int majorID) {
        this.personID = personID;
        this.enteranceYear = enteranceYear;
        this.majorID = majorID;
        this.id = studentList.size()+1;
        this.StudentID = String.format("%04d", this.id);
        studentList.add(this);
        Major m = Major.findById(majorID);
        if (m != null) {
            m.addStudent();
        }
        else {
            System.out.println("No major found!");
        }
        this.setStudentCode();
    }
    public static Student findById(int id) {
        for (Student s : studentList) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }
    public void setStudentCode(){
        Major m = Major.findById(this.majorID);
        if (m != null) {
            System.out.println("Student code:" + this.enteranceYear + "-" + m.id + "-" + m.numberOfStudents);
        }
        else {
            System.out.println("Major id invalid");
        }
    }
}
