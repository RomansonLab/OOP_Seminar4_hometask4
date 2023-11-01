package service;

import data.*;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public void createGroup(List<Teacher> teacherList){
        teacherGroup = new TeacherGroup(teacherList);
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public Teacher createTeacher(String firstName, String secondName, String lastName){
        if(teacherGroup == null)
            createGroup(new ArrayList<>());
        int maxid = 0;
        for(Teacher teacher : teacherGroup.getTeacherList())
            if (teacher.getTeacherId() > maxid)
                maxid = teacher.getTeacherId();
        maxid++;
        Teacher teacher = new Teacher(firstName, secondName, lastName, maxid, 0);
        teacherGroup.addGroup(teacher);
        return teacher;
    }

    public List<Teacher> getListTeacher(){
        return teacherGroup.getTeacherList();
    }

    public void editTeacher(int teacherId, String firstName, String secondName, String lastName) {
        for (Teacher teacher : teacherGroup) {
            if (teacher.getId() == teacherId) {
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setLastName(lastName);
                return;
            }
        }
    }

}
