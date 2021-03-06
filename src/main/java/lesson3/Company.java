package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    private ArrayList<Person> employeeList ;

    public ArrayList<Person> getEmployeeList(){
        return employeeList;
    }


    public Company(String companyName, ArrayList<Person> employeeList) {
        this.companyName = companyName;
        this.employeeList = employeeList;
    }

    public Integer numberOfEmployees(){
        return employeeList.size();
    }




    public String searchEmpplyeeByFirstName(String FirstName){
        int i=0;
        for (Person employee : employeeList){
            if (employee.getFirstName().equals(FirstName)){
                return  FirstName;
            }
        }
                return "No";
        }

    public String searchEmpplyeeByLastName(String LastName){
        int i=0;
        while (i< employeeList.size()){
            String employee = employeeList.get(i).getLastName();
            if (employee == LastName){
                return LastName;
            }
            i++;
        }
        return "No";
    }


}
