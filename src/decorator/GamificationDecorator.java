package decorator;

import model.Course;

public class GamificationDecorator extends CourseDecorator {
    private int points = 0;

    public GamificationDecorator(Course course) {
        super(course);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addPoints(10, "Started learning");
    }

    public void addPoints(int p, String reason) {
        points += p;
        System.out.println("[Gamification] +" + p + " points (" + reason + "). Total: " + points);
    }
}
