import facade.Facade;
import model.*;
import model.Module;
import observer.EmailNotification;
import observer.NotificationService;
import observer.SMSNotification;
import strategy.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Course SDP = new CourseBuilder("Design Pattern", "Cool Guy")
                .addModules(List.of(
                        new Module("Builder", "Builder Pattern"),
                        new Module("Factory", "Factory Pattern")
                ))
                .addQuizzes(List.of(
                        new Quiz("Midterm", 5)
                ))
                .price(30)
                .build();

        Course DAA = new CourseBuilder("Analysis of Algorithms", "Nursultan")
                .addModules(List.of(
                        new Module("Hashing", "What is Hashing"),
                        new Module("Fibonacci", "Number of Fibonacci")
                ))
                .addQuizzes(List.of(
                        new Quiz("Endterm", 10)
                ))
                .price(25)
                .build();

        List<Course> allCourses = List.of(SDP, DAA);

        User student = UserFactory.createUser(UserType.STUDENT, "Ruslan");
        User instructor = UserFactory.createUser(UserType.INSTRUCTOR, "Temirlan");


        NotificationService ns = new NotificationService();
        ns.setStrategy(new EmailNotification());

        RecommendationService rs = new RecommendationService();



        Facade facade = new Facade(rs, ns);

        facade.publishCourse(SDP);
        facade.publishCourse(DAA);

        facade.register(student);
        facade.register(instructor);



        facade.sendAnnouncement("Platform updated with new features");


        rs.setStrategy(new CheapRecommendation());
        facade.recommendCourses(student,allCourses);

        rs.setStrategy(new SmallRecommendation());
        facade.recommendCourses(student,allCourses);

        System.out.println();


        Course decorated = SDP;

        decorated = facade.Gamify(decorated);
        decorated = facade.Mentor(decorated, "Ramazan");
        decorated = facade.CreateCertificate(decorated);

        facade.StartCourse(decorated);


    }
}
