package com.itswcg.todo.mapper;

import com.itswcg.todo.model.DjangoMigrations;
import com.itswcg.todo.model.DjangoMigrationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoMigrationsMapper {
    long countByExample(DjangoMigrationsExample example);

    int deleteByExample(DjangoMigrationsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoMigrations record);

    int insertSelective(DjangoMigrations record);

    List<DjangoMigrations> selectByExample(DjangoMigrationsExample example);

    DjangoMigrations selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoMigrations record, @Param("example") DjangoMigrationsExample example);

    int updateByExample(@Param("record") DjangoMigrations record, @Param("example") DjangoMigrationsExample example);

    int updateByPrimaryKeySelective(DjangoMigrations record);

    int updateByPrimaryKey(DjangoMigrations record);
}