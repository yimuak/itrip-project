package cn.itrip.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 酒店房间表
    */
@ApiModel(value="cn-itrip-pojo-ItripHotelRoom")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_room")
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店ID
     */
    @TableField(value = "hotel_Id")
    @ApiModelProperty(value="酒店ID")
    private Long hotelId;

    /**
     * 房间名称
     */
    @TableField(value = "room_Title")
    @ApiModelProperty(value="房间名称")
    private String roomTitle;

    /**
     * 房间价格
     */
    @TableField(value = "room_Price")
    @ApiModelProperty(value="房间价格")
    private BigDecimal roomPrice;

    /**
     * 酒店床型
     */
    @TableField(value = "room_BedTypeId")
    @ApiModelProperty(value="酒店床型")
    private Long roomBedtypeid;

    /**
     * 是否包含早餐
     */
    @TableField(value = "is_HavingBreakfast")
    @ApiModelProperty(value="是否包含早餐")
    private Integer isHavingbreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    @TableField(value = "pay_Type")
    @ApiModelProperty(value="1:在线付 2:到店付 3:不限")
    private Integer payType;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    @TableField(value = "satisfaction")
    @ApiModelProperty(value="满意度（冗余字段，在用户评论后更新）")
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    @TableField(value = "is_Book")
    @ApiModelProperty(value="是否可预订(0:不可以 1:可以)")
    private Integer isBook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    @TableField(value = "is_Cancel")
    @ApiModelProperty(value="是否可取消(0:不可 1:可以)")
    private Integer isCancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    @TableField(value = "is_TimelyResponse")
    @ApiModelProperty(value="是否及时响应(0:不及时 1:及时)")
    private Integer isTimelyresponse;

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