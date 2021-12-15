package MVC;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Course model = new Course("Algorithm", "SWE123", "Major");

        CourseView view = new CourseView();

        CourseController controller = new CourseController(model, view);

        controller.updateView();

        // update model data
        controller.setCourseCategory("Minor");

        controller.updateView();
    }
}
