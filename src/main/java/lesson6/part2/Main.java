package lesson6.part2;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

     ArrayList<Student> stydentsList = new ArrayList<Student>();
     Person firstperson = new Person("Margo", "One");
     Student student1 = new Student(firstperson, 1, CourseList.first.toString(), Faculty.Fitki.toString(), GroupList.Group1.toString());
     Student student2 = new Student("John", "Foo", 2,CourseList.second.toString(), Faculty.Facsy.toString(), GroupList.Group1.toString());
     Student student3 = new Student("Daria", "Two", 3,CourseList.first.toString(), Faculty.Fitki.toString(), GroupList.Group2.toString());
     Student student4 = new Student("Alex", "Hi", 4,CourseList.first.toString(), Faculty.Energy.toString(), GroupList.Group2.toString());
    University one = new University("one");
     stydentsList.add(student1);
     stydentsList.add(student2);
     one.setStydentsList(stydentsList);
     one.updateUniversityList(student3);

     System.out.println("++ "+one.getListOfStudentsFaculty("Fitki"));

     one.print(PrintList.courseList);
     one.print(PrintList.facultyList);
    }
}
