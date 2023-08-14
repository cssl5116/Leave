package com.leave.www.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leave.www.entity.LeaveRecords;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveRecordsMapper extends BaseMapper<LeaveRecords> {
    IPage<LeaveRecords> selAll(IPage<LeaveRecords> page);
}
