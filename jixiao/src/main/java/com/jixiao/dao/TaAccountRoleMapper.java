package com.jixiao.dao;

import com.jixiao.entity.TaAccountRoleExample;
import com.jixiao.entity.TaAccountRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaAccountRoleMapper {
    int countByExample(TaAccountRoleExample example);

    int deleteByExample(TaAccountRoleExample example);

    int deleteByPrimaryKey(TaAccountRoleKey key);

    int insert(TaAccountRoleKey record);

    int insertSelective(TaAccountRoleKey record);

    List<TaAccountRoleKey> selectByExample(TaAccountRoleExample example);

    int updateByExampleSelective(@Param("record") TaAccountRoleKey record, @Param("example") TaAccountRoleExample example);

    int updateByExample(@Param("record") TaAccountRoleKey record, @Param("example") TaAccountRoleExample example);
}