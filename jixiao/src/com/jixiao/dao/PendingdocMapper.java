package com.jixiao.dao;

import com.jixiao.entity.Pendingdoc;
import com.jixiao.entity.PendingdocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PendingdocMapper {
    int countByExample(PendingdocExample example);

    int deleteByExample(PendingdocExample example);

    int deleteByPrimaryKey(Integer pendingdocid);

    int insert(Pendingdoc record);

    int insertSelective(Pendingdoc record);

    List<Pendingdoc> selectByExample(PendingdocExample example);

    Pendingdoc selectByPrimaryKey(Integer pendingdocid);

    int updateByExampleSelective(@Param("record") Pendingdoc record, @Param("example") PendingdocExample example);

    int updateByExample(@Param("record") Pendingdoc record, @Param("example") PendingdocExample example);

    int updateByPrimaryKeySelective(Pendingdoc record);

    int updateByPrimaryKey(Pendingdoc record);
}