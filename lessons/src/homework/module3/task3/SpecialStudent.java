package homework.module3.task3;

public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    SpecialStudent (long secretKey){
        this("","",0);
        this.secretKey = secretKey;
    }

    SpecialStudent(String firstName, String lastName, int group){
        super(firstName, lastName, group);

    }

    SpecialStudent(String firstName, String lastName,
    int group, int age, Course[] courseTaken, String collegeName, int rating, long id){
        super(firstName, lastName, group, age, courseTaken, collegeName, rating, id);
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
