package decorator;

import model.Course;
import model.CourseBuilder;

public abstract class CourseDecorator extends Course {
    protected Course course;

    public CourseDecorator(Course course) {
        super(new CourseBuilder(course.getTitle(), course.getInstructor()));
        this.course = course;
    }
    @Override
    public void deliverContent() {

        course.deliverContent();
    }

}
