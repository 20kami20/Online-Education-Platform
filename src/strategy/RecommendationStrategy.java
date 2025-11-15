package strategy;

import model.Course;
import model.User;
import java.util.List;

public interface RecommendationStrategy {
    List<Course> recommend(User user, List<Course> allCourses);

    ;
}
