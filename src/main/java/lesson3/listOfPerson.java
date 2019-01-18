package lesson3;

import java.util.ArrayList;

public class listOfPerson {

    public static ArrayList<Person> person(){

        ArrayList<Person> employeeList =new ArrayList();
        employeeList.add(new Person("firstname2", "secondname2", 23));
        employeeList.add(new Person("firstname3", "secondname3", 19));
        employeeList.add(new Person("firstname4", "secondname4", 16));
        return employeeList;
    }

}
