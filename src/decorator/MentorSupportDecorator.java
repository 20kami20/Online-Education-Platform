package decorator;

import model.Course;

public class MentorSupportDecorator extends CourseDecorator {
    private String mentorName;

    public MentorSupportDecorator(Course course, String mentorName) {
        super(course);
        this.mentorName = mentorName;
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        System.out.println("[Mentor] Hello! I'm " + mentorName + ", your mentor for this course.");
    }

    public void congratulate(String studentName) {
        System.out.println("[Mentor] " + mentorName + ": Congratulations " + studentName + " on completing " + getTitle() + "!");
    }
}
