package decorator;

import model.Course;

public abstract class CourseDecorator extends Course {
    protected Course course;

    public CourseDecorator(Course course) {
        super(course.title);
        this.course = course;
    }
    @Override
    public void deliverContent() {

        course.deliverContent();
    }

}
