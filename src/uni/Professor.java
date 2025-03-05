package uni;
import java.util.ArrayList;
public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<Professor>();
    public int personID;
    public int majorID;
    public Professor(int personID , int majorID) {
        this.personID = personID;
        this.majorID = majorID;
        this.id = professorList.size()+1;
        professorList.add(this);
    }
    public static Professor findByID(int id) {
        for (Professor p : professorList) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
}
