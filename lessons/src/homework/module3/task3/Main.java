package homework.module3.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(new Date(), "Course1");
        Course course2 = new Course(115,"Cousre2","Teacher1");
        Course course3 = new Course(15,"Cousre3","Teacher2");
        Course course4 = new Course(new Date(2014,10,12),"Course4");
        Course course5 = new Course(new Date(2014,10,12),"Course5");

        Student student1 = new Student("Student1","Lastname1", 1);
        Student student2 = new Student("LastName2", new Course[]{course1,course2,course3,course4,course5});

        CollegeStudent collegeStudent1 = new CollegeStudent("FirstName1","LastName1", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("LastName2",new Course[]{course1,course2,course3,course4,course5});
        CollegeStudent collegeStudent3 = new CollegeStudent("FirstName3","LastName3",3,25,new Course[]{course1,course2,course3,course4,course5}, "PTU #5",2,12);

        SpecialStudent specialStudent1 = new SpecialStudent(12321312312L);
        SpecialStudent specialStudent2 = new SpecialStudent("FirstName1","LastName", 4);
        SpecialStudent specialStudent3 = new SpecialStudent("FirstName","LastName", 5, 27, new Course[]{course1,course2,course3,course4,course5}, "PTU #6",1,13);

    }
}
