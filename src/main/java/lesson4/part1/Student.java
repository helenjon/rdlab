package lesson4.part1;

import lesson4.part1.Person;



public class Student extends Person {


    private Integer id, phone, course;
    private String faculty, address, group;



    public Student(String firstName, String secondName, Integer id, Integer course, String faculty, String group) {
        super(firstName, secondName);
        this.id = id;
        this.course = course;
        this.faculty = faculty;
        this.group = group;

    }

    public Student(Person person, Integer id, Integer course, String faculty, String group) {
        super(person.getFirstName(),person.getSecondName());
        this.id = id;
        this.course = course;
        this.faculty = faculty;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{"  + "First Name =" + super.getFirstName()+ ", Second Name = " + super.getSecondName()+
                ", id=" + id +
                ", phone=" + phone +
                ", course=" + course +
                ", faculty='" + faculty + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
