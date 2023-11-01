package data;

public class Teacher extends User implements Comparable<Teacher>{
    private int teacherId;


    public Teacher(String firstName, String secondName, String lastName, int teacherId, int i) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }



    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int TeacherId) {
        this.teacherId = teacherId;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", teacherId=" + teacherId + '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }

    public int getId() {
        return teacherId;
    }
}
