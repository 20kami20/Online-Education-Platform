package Strategy;

import model.Course;
import model.User;
import java.util.List;

public interface RecommendationStrategy {
    static List<Course> recommend(User user, List<Course> allCourses){};
}
