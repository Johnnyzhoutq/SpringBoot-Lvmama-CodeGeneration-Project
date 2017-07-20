package com.lvmama.pangolin.web;
import com.lvmama.pangolin.core.Result;
import com.lvmama.pangolin.core.ResultGenerator;
import com.lvmama.pangolin.entity.hotel.HotelNewProduct;
import com.lvmama.pangolin.hotel.service.HotelNewProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* Created by zhoutianqi on 2017/07/20.
*/
@RestController
@RequestMapping("/hotel/new/product")
public class HotelNewProductController {
    @Autowired
    private HotelNewProductService hotelNewProductService;

    @PostMapping("/add")
    public Result add(HotelNewProduct hotelNewProduct) {
        hotelNewProductService.save(hotelNewProduct);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        hotelNewProductService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(HotelNewProduct hotelNewProduct) {
        hotelNewProductService.update(hotelNewProduct);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        HotelNewProduct hotelNewProduct = hotelNewProductService.findById(id);
        return ResultGenerator.genSuccessResult(hotelNewProduct);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HotelNewProduct> list = hotelNewProductService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
