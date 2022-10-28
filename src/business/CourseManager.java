package business;

import Entities.Course;
import Logger.Logger;
import dataAccess.CourseDao;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{

        courseDao.add(course);

        loggers.stream().forEach(s -> s.log(course.getCourseName()));

    }
}
