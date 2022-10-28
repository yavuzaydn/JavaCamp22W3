package business;

import Entities.Instructor;
import Logger.Logger;
import dataAccess.InstructorDao;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception{

        instructorDao.add(instructor);

        loggers.stream().forEach(s -> s.log(instructor.getName()));
        loggers.stream().forEach(s -> s.log(instructor.getSurname()));

    }
}
