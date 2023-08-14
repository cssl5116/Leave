package com.leave.www.entity;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@TableName("leaveRecords")
@Data
public class LeaveRecords implements Serializable {
  @TableId(type = IdType.AUTO)
  private Long id;

  private String name;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date leaveTime;
  /**
   * 请假原因
   */
  private String reason;
}
