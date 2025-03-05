package uni;
import java.util.ArrayList;
import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer,Double> transcript;
    public Transcript(int StudentID) {
        this.studentID = StudentID;
        this.transcript = new HashMap<>();
    }
    public void setGrade (int presentedCourseID, double grade){
        this.transcript.put(presentedCourseID,grade);
        System.out.println("Grade set to "+ grade + " for Course "+presentedCourseID);
    }
    public void printTranscript(){
        System.out.println("Student's Transcript:" + studentID + ":");
        for (HashMap.Entry<Integer,Double> entry : transcript.entrySet()){
            int PresentedCourseID = entry.getKey();
            double Grade = entry.getValue();
            PresentedCourse presentedCourse = PresentedCourse.findByID(PresentedCourseID);
            if(presentedCourse != null){
                Course c = Course.findById(presentedCourse.CourseID);
                if (c!=null) {
                    System.out.println("course : " + c.title + " ** grade :" + Grade);
                }
                else {
                    System.out.println("course" + presentedCourse.CourseID + "not found.");
                }
            }
            else {
                System.out.println("course" + PresentedCourseID + "not found.");
            }
        }
        System.out.println("avg :" + getGPA());
    }
    public double getGPA(){
        if (transcript.isEmpty()){
            return 0;
        }
        else {
            double sum = 0;
            int u_sum = 0;
            for (Integer id : transcript.keySet()) {
                Course c = Course.findById(id);
                if (c != null) {
                    sum += transcript.get(id) * c.units;
                    u_sum += c.units;
                }
                else {
                    System.out.println("course" + id + "not found.");
                }
            }
            return sum / u_sum;
        }
    }
}
