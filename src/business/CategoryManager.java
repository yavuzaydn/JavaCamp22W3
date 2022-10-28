package business;

import Entities.Category;
import Logger.Logger;
import dataAccess.CategoryDao;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {


        categoryDao.add(category);

        loggers.stream().forEach(s -> s.log(category.getCategoryName()));

    }
}
