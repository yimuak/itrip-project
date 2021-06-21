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
    * 实时库存表
    */
@ApiModel(value="cn-itrip-pojo-ItripHotelTempStore")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_temp_store")
public class ItripHotelTempStore implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "hotel_Id")
    @ApiModelProperty(value="")
    private Integer hotelId;

    /**
     * 商品id
     */
    @TableField(value = "room_Id")
    @ApiModelProperty(value="商品id")
    private Long roomId;

    /**
     * 记录时间
     */
    @TableField(value = "record_Date")
    @ApiModelProperty(value="记录时间")
    private Date recordDate;

    /**
     * 库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="库存")
    private Integer store;

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