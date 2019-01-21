package lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Main {



    public static void main(String [] args){

        ArrayList<Person> employeeList = listOfPerson.person();

        Person first = new Person("firstname1", "lastname1", 22);
        employeeList.add(first);

        Company Mytest = new Company("Mytest", employeeList);

        // check
        System.out.println("numberOfEmployees = "+Mytest.numberOfEmployees());
        System.out.println("Empplyee with FirstName AAA   "+Mytest.searchEmpplyeeByFirstName("AAA"));
        System.out.println("Empplyee with FirstName BBB  "+Mytest.searchEmpplyeeByLastName("BBB"));
        System.out.println("Empplyee with FirstName firstname1  "+Mytest.searchEmpplyeeByFirstName("firstname1"));
        System.out.println("Empplyee with LastName lastname1    "+Mytest.searchEmpplyeeByLastName("lastname1"));

        HashSet<Person> setOfPerson = new HashSet<Person>(employeeList);
        for (Person person:setOfPerson){
            System.out.println(person.getFirstName());
        }

        System.out.println(first);

    }

}
