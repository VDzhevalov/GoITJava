package homework.module3.task3;


public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group){
        super (firstName, lastName, group);
        this.collegeName="";
        this.rating=0;
        this.id = 0;
    }

    public CollegeStudent(String lastName, Course[] courseTaken){
        super(lastName, courseTaken);
        this.collegeName="";
        this.rating = 0;
        this.id = 0;
    }

    public CollegeStudent (String firstName, String lastName,
            int group, int age, Course[] courseTaken, String collegeName, int rating, long id){
        this(firstName, lastName, group);
        super.setAge(age);
        super.setCourseTaken(courseTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
