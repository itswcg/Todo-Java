package com.itswcg.todo.mapper;

import com.itswcg.todo.model.DjangoAdminLog;
import com.itswcg.todo.model.DjangoAdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoAdminLogMapper {
    long countByExample(DjangoAdminLogExample example);

    int deleteByExample(DjangoAdminLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoAdminLog record);

    int insertSelective(DjangoAdminLog record);

    List<DjangoAdminLog> selectByExampleWithBLOBs(DjangoAdminLogExample example);

    List<DjangoAdminLog> selectByExample(DjangoAdminLogExample example);

    DjangoAdminLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoAdminLog record, @Param("example") DjangoAdminLogExample example);

    int updateByExampleWithBLOBs(@Param("record") DjangoAdminLog record, @Param("example") DjangoAdminLogExample example);

    int updateByExample(@Param("record") DjangoAdminLog record, @Param("example") DjangoAdminLogExample example);

    int updateByPrimaryKeySelective(DjangoAdminLog record);

    int updateByPrimaryKeyWithBLOBs(DjangoAdminLog record);

    int updateByPrimaryKey(DjangoAdminLog record);
}