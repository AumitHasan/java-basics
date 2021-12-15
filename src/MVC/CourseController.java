package MVC;

//    Model – Represents the business layer of the application
//    View – Defines the presentation of the application
//    Controller – Manages the flow of the application

public class CourseController {
    private Course model;
    private CourseView view;

    CourseController(Course m, CourseView view) {
//        this.model = model; // why it's giving error?
        model = m;
        this.view = view;
    }

    public void setCourseName(String name){
        model.setName(name);
    }

    public String getCourseName(){
        return model.getName();
    }

    public void setCourseId(String id){
        model.setId(id);
    }

    public String getCourseId(){
        return model.getId();
    }

    public void setCourseCategory(String category){
        model.setCategory(category);
    }

    public String getCourseCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.showCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}

//    1. Model: The Model contains only the pure application data, it contains no logic describing how to present the data to a user.
//    2. View: The View presents the model’s data to the user. The view knows how to access the model’s data, but it does not know what
//        this data means or what the user can do to manipulate it.
//    3. Controller: The Controller exists between the view and the model. It listens to events triggered by the view (or another external source)
//        and executes the appropriate reaction to these events. In most cases, the reaction is to call a method on the model. Since the view and the
//        model are connected through a notification mechanism, the result of this action is then automatically reflected in the view.
