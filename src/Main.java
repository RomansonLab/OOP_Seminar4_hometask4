import controler.StudentGroupControler;
import controler.TeacherGroupControler;
import data.Student;
import data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();
        controler.create("5","5", "5");
        controler.create("7","2", "2");
        controler.create("3","3", "3");
//        List<Student> studentList= List.of(new Student[]{student1, student2, student3});
//        controler.createStudentGroup(studentList);
        controler.print();
        System.out.println("Cортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());
        System.out.println("Cортировка(FIO)...");
        controler.print(controler.sortedStudentGroupByFIO());
        TeacherGroupControler controler2 = new TeacherGroupControler();
        controler2.create("1","3", "5");
        controler2.create("2","2", "2");
        controler2.create("4","8", "9");
        controler2.print();
        controler2.editTeacher(1,"Ivan", "Ivanovich", "Ivanov");
        controler2.print();
        controler2.getAllTeachers();
        controler2.print();
    }
}