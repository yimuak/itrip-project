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
    * 订单表
    */
@ApiModel(value="cn-itrip-pojo-ItripHotelOrder")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_order")
public class ItripHotelOrder implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_Id")
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    @TableField(value = "order_Type")
    @ApiModelProperty(value="订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer orderType;

    /**
     * 订单号
     */
    @TableField(value = "order_No")
    @ApiModelProperty(value="订单号")
    private String orderNo;

    /**
     * 交易编号
     */
    @TableField(value = "trade_No")
    @ApiModelProperty(value="交易编号")
    private String tradeNo;

    /**
     * 冗余字段 酒店id
     */
    @TableField(value = "hotel_Id")
    @ApiModelProperty(value="冗余字段 酒店id")
    private Long hotelId;

    /**
     * 冗余字段 酒店名称
     */
    @TableField(value = "hotel_Name")
    @ApiModelProperty(value="冗余字段 酒店名称")
    private String hotelName;

    /**
     * 房间id
     */
    @TableField(value = "room_Id")
    @ApiModelProperty(value="房间id")
    private Long roomId;

    /**
     * 消耗数量
     */
    @TableField(value = "count")
    @ApiModelProperty(value="消耗数量")
    private Integer count;

    /**
     * 预订天数
     */
    @TableField(value = "booking_Days")
    @ApiModelProperty(value="预订天数")
    private Integer bookingDays;

    /**
     * 入住时间
     */
    @TableField(value = "checkIn_Date")
    @ApiModelProperty(value="入住时间")
    private Date checkinDate;

    /**
     * 退房时间
     */
    @TableField(value = "check_Out_Date")
    @ApiModelProperty(value="退房时间")
    private Date checkOutDate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    @TableField(value = "order_Status")
    @ApiModelProperty(value="订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderStatus;

    /**
     * 支付金额
     */
    @TableField(value = "pay_Amount")
    @ApiModelProperty(value="支付金额")
    private BigDecimal payAmount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    @TableField(value = "pay_Type")
    @ApiModelProperty(value="支付方式:1:支付宝 2:微信 3:到店付")
    private Integer payType;

    /**
     * 联系手机号
     */
    @TableField(value = "notice_Phone")
    @ApiModelProperty(value="联系手机号")
    private String noticePhone;

    /**
     * 联系邮箱
     */
    @TableField(value = "notice_Email")
    @ApiModelProperty(value="联系邮箱")
    private String noticeEmail;

    /**
     * 特殊需求
     */
    @TableField(value = "special_Requirement")
    @ApiModelProperty(value="特殊需求")
    private String specialRequirement;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    @TableField(value = "is_NeedInvoice")
    @ApiModelProperty(value="是否需要发票（0：不需要 1：需要）")
    private Integer isNeedinvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    @TableField(value = "invoice_Type")
    @ApiModelProperty(value="发票类型（0：个人 1：公司）")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @TableField(value = "invoice_Head")
    @ApiModelProperty(value="发票抬头")
    private String invoiceHead;

    /**
     * 入住人名称
     */
    @TableField(value = "link_UserName")
    @ApiModelProperty(value="入住人名称")
    private String linkUsername;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    @TableField(value = "book_Type")
    @ApiModelProperty(value="0:WEB端 1:手机端 2:其他客户端")
    private Integer bookType;

    /**
     * 预定时间
     */
    @TableField(value = "creation_Date")
    @ApiModelProperty(value="预定时间")
    private Date creationDate;

    @TableField(value = "created_By")
    @ApiModelProperty(value="")
    private Long createdBy;

    /**
     * 支付完成时间
     */
    @TableField(value = "modify_Date")
    @ApiModelProperty(value="支付完成时间")
    private Date modifyDate;

    @TableField(value = "modified_By")
    @ApiModelProperty(value="")
    private Long modifiedBy;

    private static final long serialVersionUID = 1L;
}