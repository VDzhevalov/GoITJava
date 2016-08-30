package homework.module3.task3;

import java.util.Date;

public class Course {
    Date startDate;
    String name, teacherName;
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

}
