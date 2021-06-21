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
    * 用户表
    */
@ApiModel(value="cn-itrip-pojo-ItripUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_user")
public class ItripUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    @TableField(value = "user_Code")
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号")
    private String userCode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    @TableField(value = "user_Password")
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码")
    private String userPassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    @TableField(value = "user_Type")
    @ApiModelProperty(value="用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）")
    private Integer userType;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    @TableField(value = "flat_ID")
    @ApiModelProperty(value="平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）")
    private Long flatId;

    /**
     * 用户昵称
     */
    @TableField(value = "user_Name")
    @ApiModelProperty(value="用户昵称")
    private String userName;

    /**
     * 微信号
     */
    @TableField(value = "we_Chat")
    @ApiModelProperty(value="微信号")
    private String weChat;

    /**
     * qq账号
     */
    @TableField(value = "QQ")
    @ApiModelProperty(value="qq账号")
    private String qq;

    /**
     * 微博账号
     */
    @TableField(value = "weibo")
    @ApiModelProperty(value="微博账号")
    private String weibo;

    /**
     * 百度账号
     */
    @TableField(value = "baidu")
    @ApiModelProperty(value="百度账号")
    private String baidu;

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
     * 是否激活,(0 false，1 true,默认是0)
     */
    @TableField(value = "activated")
    @ApiModelProperty(value="是否激活,(0 false，1 true,默认是0)")
    private Integer activated;

    private static final long serialVersionUID = 1L;
}