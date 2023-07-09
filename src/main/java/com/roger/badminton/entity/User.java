package com.roger.badminton.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("users")
public class User {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("wx_openid")
    private String wxOpenid;

    @TableField("wx_nickname")
    private String wxNickname;

    @TableField("wx_avatar")
    private String wxAvatar;

    @TableField("contact_number")
    private String contactNumber;

    @TableField("created_at")
    private LocalDateTime createdAt;
}
