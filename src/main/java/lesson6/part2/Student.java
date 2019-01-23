package lesson6.part2;


public class Student extends Person {


    private Integer id, phone ;
    private String faculty, address, group,course;



    public Student(String firstName, String secondName, Integer id, String course, String faculty, String group) {
        super(firstName, secondName);
        this.id = id;
        this.course = course;
        this.faculty = faculty;
        this.group = group;

    }

    public Student(Person person, Integer id, String course, String faculty, String group) {
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
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
