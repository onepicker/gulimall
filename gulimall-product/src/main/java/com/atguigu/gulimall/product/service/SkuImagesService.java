package com.atguigu.gulimall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * sku图片
 *
 * @author pickerking
 * @email 445885852@qq.com
 * @date 2022-03-11 19:08:16
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

