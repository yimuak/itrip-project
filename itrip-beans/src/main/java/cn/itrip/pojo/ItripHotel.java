package cn.itrip.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 酒店表
    */
@ApiModel(value="cn-itrip-pojo-ItripHotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel")
public class ItripHotel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店名称
     */
    @TableField(value = "hotel_Name")
    @ApiModelProperty(value="酒店名称")
    private String hotelName;

    /**
     * 所在国家id
     */
    @TableField(value = "country_Id")
    @ApiModelProperty(value="所在国家id")
    private Long countryId;

    /**
     * 所在省份id
     */
    @TableField(value = "province_Id")
    @ApiModelProperty(value="所在省份id")
    private Long provinceId;

    /**
     * 所在城市id
     */
    @TableField(value = "city_Id")
    @ApiModelProperty(value="所在城市id")
    private Long cityId;

    /**
     * 酒店所在地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="酒店所在地址")
    private String address;

    /**
     * 酒店介绍（保存附文本）
     */
    @TableField(value = "details")
    @ApiModelProperty(value="酒店介绍（保存附文本）")
    private String details;

    /**
     * 酒店设施
     */
    @TableField(value = "facilities")
    @ApiModelProperty(value="酒店设施")
    private String facilities;

    /**
     * 酒店政策
     */
    @TableField(value = "hotel_Policy")
    @ApiModelProperty(value="酒店政策")
    private String hotelPolicy;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    @TableField(value = "hotel_Type")
    @ApiModelProperty(value="酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hotelType;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    @TableField(value = "hotel_Level")
    @ApiModelProperty(value="(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotelLevel;

    /**
     * 是否是团购酒店
     */
    @TableField(value = "is_GroupPurchase")
    @ApiModelProperty(value="是否是团购酒店")
    private Integer isGrouppurchase;

    /**
     * 城市名称 冗余字段
     */
    @TableField(value = "redundant_City_Name")
    @ApiModelProperty(value="城市名称 冗余字段")
    private String redundantCityName;

    /**
     * 省名称 冗余字段
     */
    @TableField(value = "redundant_Province_Name")
    @ApiModelProperty(value="省名称 冗余字段")
    private String redundantProvinceName;

    /**
     * 国家名称 冗余字段
     */
    @TableField(value = "redundant_Country_Name")
    @ApiModelProperty(value="国家名称 冗余字段")
    private String redundantCountryName;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    @TableField(value = "redundant_Hotel_Store")
    @ApiModelProperty(value="酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundantHotelStore;

    @TableField(value = "creation_Date")
    @ApiModelProperty(value="")
    private Date creationDate;

    @TableField(value = "created_By")
    @ApiModelProperty(value="")
    private Long createdBy;

    @TableField(value = "modify_Date")
    @ApiModelProperty(value="")
    private Date modifyDate;

    @TableField(value = "modified_By")
    @ApiModelProperty(value="")
    private Long modifiedBy;

    private static final long serialVersionUID = 1L;
}