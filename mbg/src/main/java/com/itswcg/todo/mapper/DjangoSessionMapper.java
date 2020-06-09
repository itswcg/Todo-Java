package com.itswcg.todo.mapper;

import com.itswcg.todo.model.DjangoSession;
import com.itswcg.todo.model.DjangoSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoSessionMapper {
    long countByExample(DjangoSessionExample example);

    int deleteByExample(DjangoSessionExample example);

    int deleteByPrimaryKey(String sessionKey);

    int insert(DjangoSession record);

    int insertSelective(DjangoSession record);

    List<DjangoSession> selectByExampleWithBLOBs(DjangoSessionExample example);

    List<DjangoSession> selectByExample(DjangoSessionExample example);

    DjangoSession selectByPrimaryKey(String sessionKey);

    int updateByExampleSelective(@Param("record") DjangoSession record, @Param("example") DjangoSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") DjangoSession record, @Param("example") DjangoSessionExample example);

    int updateByExample(@Param("record") DjangoSession record, @Param("example") DjangoSessionExample example);

    int updateByPrimaryKeySelective(DjangoSession record);

    int updateByPrimaryKeyWithBLOBs(DjangoSession record);

    int updateByPrimaryKey(DjangoSession record);
}