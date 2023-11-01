package data;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private List<Teacher> teacherList;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teacherList = teacherGroup.getTeacherList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext())
            return null;
        if (teacherList.get(counter).getSecondName().equals("2")) {
            counter++;
            return next();
        }
        return teacherList.get(counter++);
    }

    @Override
    public void remove() {
        teacherList.remove(counter);
    }
}
