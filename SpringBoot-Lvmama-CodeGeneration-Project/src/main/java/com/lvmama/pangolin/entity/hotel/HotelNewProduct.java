package com.lvmama.pangolin.entity.hotel;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hotel_new_product")
public class HotelNewProduct {
    /**
     * 详情编号
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 任务编号
     */
    @Column(name = "task_id")
    private String taskId;

    /**
     * 最新抓取时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 公司类别
     */
    @Column(name = "company_type")
    private String companyType;

    /**
     * 城市编码
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 获取详情编号
     *
     * @return id - 详情编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置详情编号
     *
     * @param id 详情编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取任务编号
     *
     * @return task_id - 任务编号
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置任务编号
     *
     * @param taskId 任务编号
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取最新抓取时间
     *
     * @return create_time - 最新抓取时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置最新抓取时间
     *
     * @param createTime 最新抓取时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取公司类别
     *
     * @return company_type - 公司类别
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类别
     *
     * @param companyType 公司类别
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    /**
     * 获取城市编码
     *
     * @return city_code - 城市编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置城市编码
     *
     * @param cityCode 城市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}