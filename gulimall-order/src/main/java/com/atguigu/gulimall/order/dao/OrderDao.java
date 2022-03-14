package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pickerking
 * @email 445885852@qq.com
 * @date 2022-03-11 20:50:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
