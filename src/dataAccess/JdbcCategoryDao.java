package dataAccess;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Added with JDBC.");
    }
}
