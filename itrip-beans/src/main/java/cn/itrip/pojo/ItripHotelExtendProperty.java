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

@ApiModel(value="cn-itrip-pojo-ItripHotelExtendProperty")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_extend_property")
public class ItripHotelExtendProperty implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 酒店id
     */
    @TableField(value = "hotel_Id")
    @ApiModelProperty(value="酒店id")
    private Long hotelId;

    /**
     * 推广属性
     */
    @TableField(value = "extend_Property_Id")
    @ApiModelProperty(value="推广属性")
    private Long extendPropertyId;

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