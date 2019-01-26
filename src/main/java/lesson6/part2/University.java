package lesson6.part2;

import java.util.ArrayList;

public class University {

    //полями Название, Список студентов переопределить метод toString()

    private String universityName;
    private ArrayList<Student> listOfStudentsResult = new ArrayList<Student>();
    private Faculty faculty ;

    public void setStydentsList(ArrayList<Student> stydentsList) {
        this.stydentsList = stydentsList;
    }

    private ArrayList<Student> stydentsList;

    public ArrayList<Student> getStydentsList(){
        return stydentsList;
    }


    public University(String name) {
        this.universityName = name;
        this.stydentsList = null;
    }

    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }

    public String getUniversityName(){
        return universityName;
    }

    public University(String universityName, ArrayList<Student> stydentsList) {
        this.universityName = universityName;
        this.stydentsList = stydentsList;
      }

     public  void updateUniversityList(Student student){
        this.stydentsList.add(student);
     }

    @Override
    public String toString() {
        return "University{" +
                "stydentsList=" + stydentsList +
                '}';
    }

    public ArrayList<Student> getListOfStudentsFaculty(String faculty){
        //ArrayList<Student> listOfStudentsFaculty = new ArrayList<Student>();
        for (Student st : stydentsList){
            if (st.getFaculty() == faculty){
                listOfStudentsResult.add(st);
            }
        }
       return listOfStudentsResult;
    }

    public ArrayList<Student> getListOfStudentsAfterYear(Integer year) {

        for (Student st : stydentsList){
            if (st.getDateOfBirth() > year){
                listOfStudentsResult.add(st);
            }
        }
        return listOfStudentsResult;
    }

    public ArrayList<Student> getListOfGroup(String group) {

        for (Student st : stydentsList){
            if (st.getGroup() == group){
                listOfStudentsResult.add(st);
            }
        }
        return listOfStudentsResult;
    }



}
