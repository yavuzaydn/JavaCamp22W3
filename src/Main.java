import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logger.FileLogger;
import Logger.Logger;
import Logger.DatabaseLogger;
import Logger.MailLogger;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());

        Category category = new Category(1,"Programming");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category);

        Course course = new Course(1,"JAVA","31",20);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);

        Instructor instructor = new Instructor(1,"JRR","Tolkien");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);

    }
}
