package lesson6.part2;

public enum Group1 {
    Student1("Daria", "Two", 2, CourseList.fourth, Faculty.Facsy),
    Student2("Olena", "Grey", 3, CourseList.fourth, Faculty.Facsy),
    Student3("Max", "Point", 4, CourseList.fourth, Faculty.Facsy);

    private String firstName;
    private String secondName;
    private Integer id;
    private final CourseList courseList;
    private final Faculty faculty;

    Group1(String firstName, String secondName, Integer id, CourseList courseList, Faculty faculty) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.courseList = courseList;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CourseList getCourseList() {
        return courseList;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    }
