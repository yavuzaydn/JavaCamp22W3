package dataAccess;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added with Hibernate.");
    }
}
