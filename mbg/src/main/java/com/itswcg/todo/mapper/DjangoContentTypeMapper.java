package com.itswcg.todo.mapper;

import com.itswcg.todo.model.DjangoContentType;
import com.itswcg.todo.model.DjangoContentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoContentTypeMapper {
    long countByExample(DjangoContentTypeExample example);

    int deleteByExample(DjangoContentTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoContentType record);

    int insertSelective(DjangoContentType record);

    List<DjangoContentType> selectByExample(DjangoContentTypeExample example);

    DjangoContentType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoContentType record, @Param("example") DjangoContentTypeExample example);

    int updateByExample(@Param("record") DjangoContentType record, @Param("example") DjangoContentTypeExample example);

    int updateByPrimaryKeySelective(DjangoContentType record);

    int updateByPrimaryKey(DjangoContentType record);
}