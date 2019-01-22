package lesson6.part2;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

     ArrayList<Student> stydentsList = new ArrayList<Student>();
     Person firstperson = new Person("Margo", "One");
     Student student1 = new Student(firstperson, 1, 1, "test1", "group1");
     Student student2 = new Student("Daria", "Two", 2, 1, "test", "group1");
     Student student3 = new Student("Alex", "Hi", 2, 1, "test", "group1");
     University one = new University("one");
     stydentsList.add(student1);
     stydentsList.add(student2);
     one.setStydentsList(stydentsList);
     one.updateUniversityList(student3);

     System.out.println("++ "+one.getListOfStudentsFaculty("test"));
    }
}
