package com.jixiao.dao;

import com.jixiao.entity.TbRight;
import com.jixiao.entity.TbRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRightMapper {
    int countByExample(TbRightExample example);

    int deleteByExample(TbRightExample example);

    int deleteByPrimaryKey(Integer rightid);

    int insert(TbRight record);

    int insertSelective(TbRight record);

    List<TbRight> selectByExample(TbRightExample example);

    TbRight selectByPrimaryKey(Integer rightid);

    int updateByExampleSelective(@Param("record") TbRight record, @Param("example") TbRightExample example);

    int updateByExample(@Param("record") TbRight record, @Param("example") TbRightExample example);

    int updateByPrimaryKeySelective(TbRight record);

    int updateByPrimaryKey(TbRight record);
}