package co.istad.elearning.api.category;

import co.istad.elearning.api.category.web.Category;
import co.istad.elearning.api.category.web.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryMapper categoryMapper;
    private final CategoryMapStruct categoryMapStruct;
    @Override
    public CategoryDto createNew(CategoryDto categoryDto) {
        Category category = categoryMapStruct.fromCategoryDto(categoryDto);
        categoryMapper.insert(category);
        return categoryMapStruct.toCategoryDto(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = categoryMapper.select();
        return categoryMapStruct.toListCategoryDto(categories);
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public CategoryDto updateById(Integer id, CategoryDto categoryDto) {
        return null;
    }
}
