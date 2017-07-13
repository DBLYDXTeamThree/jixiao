package com.jixiao.dao;

import com.jixiao.entity.Checkvalue;
import com.jixiao.entity.CheckvalueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckvalueMapper {
    int countByExample(CheckvalueExample example);

    int deleteByExample(CheckvalueExample example);

    int deleteByPrimaryKey(Integer valueid);

    int insert(Checkvalue record);

    int insertSelective(Checkvalue record);

    List<Checkvalue> selectByExample(CheckvalueExample example);

    Checkvalue selectByPrimaryKey(Integer valueid);

    int updateByExampleSelective(@Param("record") Checkvalue record, @Param("example") CheckvalueExample example);

    int updateByExample(@Param("record") Checkvalue record, @Param("example") CheckvalueExample example);

    int updateByPrimaryKeySelective(Checkvalue record);

    int updateByPrimaryKey(Checkvalue record);
}