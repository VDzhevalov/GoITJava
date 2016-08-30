package homework.module3.task3;


public class Student {
    private String firstName;
    private String lastName;
    private int group;
    int age;
    private Course[] courseTaken;

    public Student(String firstName, String lastName, int group){
        this(lastName,new Course[0]);
        this.firstName = firstName;
        this.group = group;
    }

    public Student(String lastName, Course[] courseTaken){
        this.firstName="";
        this.lastName = lastName;
        this.courseTaken = courseTaken.clone();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course[] getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
