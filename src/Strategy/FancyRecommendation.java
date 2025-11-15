package Strategy;

import model.Course;
import model.User;

import java.util.List;
import java.util.stream.Collectors;

public class FancyRecommendation implements RecommendationStrategy {

    @Override
    public List<Course> recommend(User user, List<Course> allCourses) {
        return allCourses.stream().filter(c -> c.getPrice() <50).collect(Collectors.toList());
    }
}
