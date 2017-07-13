package com.jixiao.dao;

import com.jixiao.entity.Checkdoc;
import com.jixiao.entity.CheckdocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckdocMapper {
    int countByExample(CheckdocExample example);

    int deleteByExample(CheckdocExample example);

    int deleteByPrimaryKey(Integer docid);

    int insert(Checkdoc record);

    int insertSelective(Checkdoc record);

    List<Checkdoc> selectByExample(CheckdocExample example);

    Checkdoc selectByPrimaryKey(Integer docid);

    int updateByExampleSelective(@Param("record") Checkdoc record, @Param("example") CheckdocExample example);

    int updateByExample(@Param("record") Checkdoc record, @Param("example") CheckdocExample example);

    int updateByPrimaryKeySelective(Checkdoc record);

    int updateByPrimaryKey(Checkdoc record);
}