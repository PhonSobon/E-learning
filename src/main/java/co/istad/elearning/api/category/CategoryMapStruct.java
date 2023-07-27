package co.istad.elearning.api.category;

import co.istad.elearning.api.category.web.Category;
import co.istad.elearning.api.category.web.CategoryDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapStruct {
    List<CategoryDto> toListCategoryDto(List<Category> model);
    CategoryDto toCategoryDto(Category model);
    Category fromCategoryDto(CategoryDto categoryDto);
}
