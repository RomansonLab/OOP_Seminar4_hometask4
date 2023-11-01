package view;

import data.Teacher;

import java.util.List;

public class TeacherGroupView {
    public void printTeacherGroup(List<Teacher> teacherGroup){
        for (Teacher th: teacherGroup) {
            System.out.println(th);
        }
    }
}
