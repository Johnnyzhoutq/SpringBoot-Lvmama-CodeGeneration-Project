package com.lvmama.pangolin.hotel.service.impl;

import com.lvmama.pangolin.mybatis.hotel.HotelNewProductMapper;
import com.lvmama.pangolin.entity.hotel.HotelNewProduct;
import com.lvmama.pangolin.hotel.service.HotelNewProductService;
import com.lvmama.pangolin.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by zhoutianqi on 2017/07/20.
 */
@Service
@Transactional
public class HotelNewProductServiceImpl extends AbstractService<HotelNewProduct> implements HotelNewProductService {
    @Autowired
    private HotelNewProductMapper hotelNewProductMapper;

}
