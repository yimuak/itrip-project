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

@ApiModel(value="cn-itrip-pojo-ItripUserLinkUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_user_link_user")
public class ItripUserLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 常用联系人姓名
     */
    @TableField(value = "link_User_Name")
    @ApiModelProperty(value="常用联系人姓名")
    private String linkUserName;

    /**
     * 证件号码
     */
    @TableField(value = "link_Id_Card")
    @ApiModelProperty(value="证件号码")
    private String linkIdCard;

    /**
     * 常用联系人电话
     */
    @TableField(value = "link_Phone")
    @ApiModelProperty(value="常用联系人电话")
    private String linkPhone;

    /**
     * 用户id
     */
    @TableField(value = "user_Id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

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

    /**
     * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     */
    @TableField(value = "link_Id_Card_Type")
    @ApiModelProperty(value="证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkIdCardType;

    private static final long serialVersionUID = 1L;
}