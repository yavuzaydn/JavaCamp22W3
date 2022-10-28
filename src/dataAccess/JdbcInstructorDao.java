package dataAccess;

import Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("Added with JDBC.");
    }
}
