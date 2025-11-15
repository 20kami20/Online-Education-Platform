package model;

import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
    private final String title;
    private final String instructor;
    private final List<Module> modules = new ArrayList<>();
    private final List<Quiz> quizzes = new ArrayList<>();
    private double price = 0.0;

    public CourseBuilder(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public CourseBuilder addModules(List<Module> modules){
        this.modules.addAll(modules);
        return this;
    }
    public CourseBuilder addQuizzes(List<Quiz> quizzes){
        this.quizzes.addAll(quizzes);
        return this;
    }

    public CourseBuilder price(double p) {
        this.price = p;
        return this;
    }

    public Course build() {
        return new Course(this);
    }

    public String getTitle() { return title; }
    public String getInstructor() { return instructor; }
    public List<Module> getModules() { return modules; }
    public List<Quiz> getQuizzes() { return quizzes; }
    public double getPrice() { return price; }
}
