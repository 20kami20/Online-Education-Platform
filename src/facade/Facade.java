package facade;
import model.Course;
import model.User;
import strategy.RecommendationService;
import observer.Notification;
import observer.NotificationService;
import decorator.CertificateDecorator;
import decorator.GamificationDecorator;
import decorator.MentorSupportDecorator;

import java.util.List;

public class Facade {
    private final NotificationService notificationService;
    private final RecommendationService recommendationService;

    public Facade(RecommendationService recommendationService, NotificationService notificationService) {
        this.recommendationService = recommendationService;
        this.notificationService = notificationService;
    }
    public void publishCourse(Course course) {
        System.out.println("Published course: " + course.getTitle());
    }
    public void register(User user) {
        notificationService.register(user);
        System.out.println("Registered user: " + user.getName());
    }
    public void sendAnnouncement(String message) {
        notificationService.notifyAll(new Notification("Announcement" + message));
    }
    public List<Course> recommendCourses(User user, List<Course> courses) {
        return recommendationService.recommend(user, courses );
    }

    public Course Gamify(Course course) {
        System.out.println("Gamify course: " + course.getTitle());
        return new GamificationDecorator(course);
    }
    public Course Mentor(Course course, String mentor) {
        System.out.println("Mentor course: " + course.getTitle());
        return new MentorSupportDecorator(course, mentor);
    }
    public Course CreateCertificate(Course course) {
        System.out.println("Create certificate course: " + course.getTitle());
        return new CertificateDecorator(course);
    }
    public void StartCourse(Course course) {
        System.out.println("Starting course: " + course.getTitle());
        course.deliverContent();
    }
}
