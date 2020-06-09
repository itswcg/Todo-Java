package com.itswcg.todo.mapper;

import com.itswcg.todo.model.CaptchaCaptchastore;
import com.itswcg.todo.model.CaptchaCaptchastoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaptchaCaptchastoreMapper {
    long countByExample(CaptchaCaptchastoreExample example);

    int deleteByExample(CaptchaCaptchastoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaptchaCaptchastore record);

    int insertSelective(CaptchaCaptchastore record);

    List<CaptchaCaptchastore> selectByExample(CaptchaCaptchastoreExample example);

    CaptchaCaptchastore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaptchaCaptchastore record, @Param("example") CaptchaCaptchastoreExample example);

    int updateByExample(@Param("record") CaptchaCaptchastore record, @Param("example") CaptchaCaptchastoreExample example);

    int updateByPrimaryKeySelective(CaptchaCaptchastore record);

    int updateByPrimaryKey(CaptchaCaptchastore record);
}