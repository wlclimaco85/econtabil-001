package com.econtabil.integration.service;

import java.util.List;

import com.econtabil.exception.NotFoundException;
import com.econtabil.integration.data.BaseService;
import com.econtabil.integration.domain.Category;

/**
 * Brings in the basic CRUD service ops from BaseService. Insert additional ops here.
 *
 * Created by Y.Kamesh on 8/2/2015.
 */
public interface CategoryService extends BaseService<Category, Long> {
    /**
     * Validates whether the given category already
     * exists in the system.
     *
     * @param categoryName
     *
     * @return
     */
    public boolean isCategoryPresent(String categoryName);

    /**
     * Validates whether the given category priority already
     * exists in the system.
     *
     * @param priorityId
     *
     * @return
     */
    public boolean isPriorityPresent(Integer priorityId);

    /**
     * Find category by name
     *
     * @param categoryName
     * @return
     */
    public Category findByCategoryName(String categoryName) throws NotFoundException;

    /**
     * Find sub categories by parent category
     *
     * @param parentCategory
     * @return
     */
    public List<Category> findSubCategories(Category parentCategory) throws NotFoundException;
}
