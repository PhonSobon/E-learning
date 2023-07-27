package co.istad.elearning.api.category.web;

import co.istad.elearning.api.category.CategoryService;
import co.istad.elearning.base.BaseRest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryRestController {
    private final CategoryService categoryService;
    @PostMapping
    public BaseRest<?> createNew(@Valid @RequestBody CategoryDto body) {
        CategoryDto categoryDto =categoryService.createNew(body);
        return BaseRest.builder()
                .status(true)
                .code(HttpStatus.OK.value())
                .message("Category has been created")
                .timestamp(LocalDateTime.now())
                .data(categoryDto)
                .build();
    }
    @GetMapping
    public BaseRest<?> findAll(){
        return null;
    }


}
