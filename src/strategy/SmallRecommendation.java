package strategy;

import java.util.List;
import java.util.stream.Collectors;

import model.User;
import model.Course;

public class SmallRecommendation implements  RecommendationStrategy{
    @Override
    public List<Course> recommend(User user, List<Course> allCourses) {
        return allCourses.stream()
                .filter(c -> c.getModules().size() <= 3)
                .collect(Collectors.toList());
    }
