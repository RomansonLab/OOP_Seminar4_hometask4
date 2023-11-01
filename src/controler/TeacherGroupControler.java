package controler;

import data.Student;
import data.Teacher;
import service.StudentGroupService;
import service.TeacherGroupService;
import view.StudentGroupView;
import view.TeacherGroupView;

import java.util.List;

public class TeacherGroupControler implements UserControler<Teacher>{
    TeacherGroupService teacherGroupService = new TeacherGroupService();
    TeacherGroupView teacherGroupView = new TeacherGroupView();

    public void createTeacherGroup(List<Teacher> teacherList){
        teacherGroupService.createGroup(teacherList);
    }

    public void print(){
        teacherGroupView.printTeacherGroup(teacherGroupService.getListTeacher());
    }

    public void print(List<Teacher> list){
        teacherGroupView.printTeacherGroup(list);
    }

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return teacherGroupService.createTeacher(firstName, secondName, lastName);
    }
    public void editTeacher(int teacherId, String firstName, String secondName, String lastName) {
        teacherGroupService.editTeacher(teacherId, firstName, secondName, lastName);
    }
    public List<Teacher> getAllTeachers() {
        return teacherGroupService.getTeacherGroup().getTeacherList();
    }

}
