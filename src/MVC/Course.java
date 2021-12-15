package MVC;

public class Course {
    private String courseName;
    private String courseId;
    private String courseCategory;

    Course(String courseName, String courseId, String courseCategory) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCategory = courseCategory;
    }

    public void setName(String name) {
        courseName = name;
    }
    public String getName() {
        return courseName;
    }
    public void setId(String id) {
        courseId = id;
    }
    public String getId() {
        return courseId;
    }
    public void setCategory(String category) {
        courseCategory = category;
    }
    public String getCategory() {
        return courseCategory;
    }
}
