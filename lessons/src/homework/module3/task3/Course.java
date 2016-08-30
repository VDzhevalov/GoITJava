package homework.module3.task3;

import java.util.Date;

public class Course {
    Date startDate;
    String name;
    String teacherName;
    int hoursDuration;

    public Course(Date startDate, String name){
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName){
        this(new Date(), name);
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }
}
