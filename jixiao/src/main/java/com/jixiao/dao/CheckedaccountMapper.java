package com.jixiao.dao;

import com.jixiao.entity.Checkedaccount;
import com.jixiao.entity.CheckedaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckedaccountMapper {
    int countByExample(CheckedaccountExample example);

    int deleteByExample(CheckedaccountExample example);

    int deleteByPrimaryKey(Integer checkedid);

    int insert(Checkedaccount record);

    int insertSelective(Checkedaccount record);

    List<Checkedaccount> selectByExample(CheckedaccountExample example);

    Checkedaccount selectByPrimaryKey(Integer checkedid);

    int updateByExampleSelective(@Param("record") Checkedaccount record, @Param("example") CheckedaccountExample example);

    int updateByExample(@Param("record") Checkedaccount record, @Param("example") CheckedaccountExample example);

    int updateByPrimaryKeySelective(Checkedaccount record);

    int updateByPrimaryKey(Checkedaccount record);
}