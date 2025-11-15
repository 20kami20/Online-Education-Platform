package strategy;
import model.*;
import java.util.*;

public class RecommendationService {
    private RecommendationStrategy recommendationStrategy;
    public void setStrategy(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public List<Course> recommend(User user, List<Course> courses) {
        if (recommendationStrategy == null) {
            System.out.println("RecommendationStrategy is null");
            return null;
        }
        return recommendationStrategy.recommend(user, courses);
    }
}
