package co.istad.elearning.api.category;

import co.istad.elearning.api.category.web.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface CategoryMapper {
    @InsertProvider(type = CategoryProvider.class, method = "buildInsertSql")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(@Param("ca") Category category);

    @SelectProvider(type = CategoryProvider.class, method = "buildSelectSql")
    List<Category> select();

    @SelectProvider(type = CategoryProvider.class,method = "buildSelectByIdSql")
    Optional<Category> selectById(@Param("id") Integer id);

    @UpdateProvider(type = CategoryProvider.class,method = "buildUpdateSql")
    void update(@Param("ca") Category category);
}
