package dataAccess;

import Entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Added with Hibernate.");
    }
}
