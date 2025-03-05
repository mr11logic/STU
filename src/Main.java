import base.*;
import uni.*;
public class Main {
    public static void main(String[] args) {
        Person person_num1 = new Person("Ali" , "01");
        Person person_num2 = new Person("Mahan" , "02");
        Person person_num3 = new Person("Hooman" , "03");
        Person person_num4 = new Person("Sasan" , "04");
        Person person_num5 = new Person("Susan" , "05"); Major major_1 = new Major("Math", 65);
        Major major_2 = new Major("CS", 65);
        Student student_1 = new Student(1, 403, major_1.id);
        Student student_2 = new Student(2, 403, major_1.id);
        Student student_3 = new Student(3, 403, major_2.id);

        Professor professor_1 = new Professor(4, major_1.id);
        Professor professor_2 = new Professor(5, major_2.id);

        Course course_1 = new Course("Math2", 3);
        Course course_2 = new Course("Maharat", 2);
        Course course_3 = new Course("AP", 3);

        System.out.println("Name             ID");
        System.out.println(person_num1.name);
        System.out.println(person_num2.name);
        System.out.println(person_num3.name);

        System.out.println(person_num4.name + " " + professor_1.personID);
        System.out.println(person_num5.name + " " + professor_2.personID);

        PresentedCourse Math2 = new PresentedCourse(course_1.id, professor_1.id, 65);
        PresentedCourse Maharat = new PresentedCourse(course_2.id, professor_2.id, 65);
        PresentedCourse AP = new PresentedCourse(course_3.id, professor_2.id, 65);

        Math2.addStudentId(1);
        Math2.addStudentId(2);
        Maharat.addStudentId(1);
        Maharat.addStudentId(2);
        Maharat.addStudentId(3);
        AP.addStudentId(3);
        Transcript transcript_1 = new Transcript(student_1.id);
        Transcript transcript_2 = new Transcript(student_2.id);
        Transcript transcript_3 = new Transcript(student_3.id);

        transcript_1.setGrade(Math2.id, 19.5);
        transcript_1.setGrade(Maharat.id, 18.5);
        transcript_2.setGrade(Math2.id, 7.5);
        transcript_2.setGrade(Maharat.id, 17.0);
        transcript_3.setGrade(Maharat.id, 19.0);
        transcript_3.setGrade(AP.id, 14.0);

        transcript_1.printTranscript();
        transcript_2.printTranscript();
        transcript_3.printTranscript();
    }
}