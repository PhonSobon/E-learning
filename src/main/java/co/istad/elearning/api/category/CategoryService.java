package co.istad.elearning.api.category;

import co.istad.elearning.api.category.web.Category;
import co.istad.elearning.api.category.web.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto createNew(CategoryDto categoryDto);
    List<CategoryDto> findAll();
    CategoryDto findById(Integer id);
    CategoryDto updateById(Integer id, CategoryDto categoryDto);
}
