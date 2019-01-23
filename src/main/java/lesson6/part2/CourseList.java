package lesson6.part2;

public enum  CourseList {
    first("first"),
    second("second"),
    third ("third"),
    fourth("fourth");

    private final String courseNumber;

    CourseList(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return courseNumber; }
}
