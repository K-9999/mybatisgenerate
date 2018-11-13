package com.orange.servicechannel.mapper;

import com.orange.servicechannel.entity.ChaChannel;

public interface ChaChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChaChannel record);

    int insertSelective(ChaChannel record);

    ChaChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChaChannel record);

    int updateByPrimaryKeyWithBLOBs(ChaChannel record);

    int updateByPrimaryKey(ChaChannel record);
}