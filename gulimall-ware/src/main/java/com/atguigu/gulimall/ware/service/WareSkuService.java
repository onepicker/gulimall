package com.atguigu.gulimall.ware.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pickerking
 * @email 445885852@qq.com
 * @date 2022-03-11 20:47:00
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

