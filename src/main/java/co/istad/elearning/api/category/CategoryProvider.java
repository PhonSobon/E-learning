package co.istad.elearning.api.category;

import org.apache.ibatis.jdbc.SQL;

public class CategoryProvider {
    public String buildInsertSql() {
        return new SQL() {{
            INSERT_INTO("category");
            VALUES("name", "#{ca.name}");
        }}.toString();
    }
    public String buildSelectSql(){
        return new SQL(){{
            SELECT("*");
            FROM("category");
        }}.toString();
    }
    public String buildSelectByIdSql(){
        return new SQL(){{

        }}.toString();
    }
    public String buildUpdateSql(){
        return new SQL(){{

        }}.toString();
    }

}
