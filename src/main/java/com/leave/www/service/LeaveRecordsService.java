package com.leave.www.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.www.entity.LeaveRecords;

public interface LeaveRecordsService extends IService<LeaveRecords> {
    IPage<LeaveRecords> selAll(int pageIndex,int pageSize);
}
