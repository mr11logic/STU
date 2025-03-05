package uni;
import java.util.ArrayList;
public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<PresentedCourse>();
    public int CourseID;
    public int ProfessorID;
    public int capacity;
    public ArrayList<Integer> studentIds;
    public PresentedCourse(int CourseID, int ProfessorID, int capacity) {
        this.CourseID = CourseID;
        this.ProfessorID = ProfessorID;
        this.capacity = capacity;
        this.studentIds = new ArrayList<>();
        this.id = presentedCourseList.size()+1;
        presentedCourseList.add(this);
    }
    public static PresentedCourse findByID(int id) {
        for (PresentedCourse p : presentedCourseList) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
    public void addStudentId(int StudentID) {
        if (studentIds.size() < capacity) {
            System.out.println("Student" + studentIds + "added successfully to course" + this.id);
            studentIds.add(StudentID);
        }
        else {
            System.out.println("The capacity is full");
        }
    }
}
