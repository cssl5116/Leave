package com.leave.www.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leave.www.entity.LeaveRecords;
import com.leave.www.mapper.LeaveRecordsMapper;
import com.leave.www.service.LeaveRecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LeaveRecordsServiceImpl
    extends ServiceImpl<LeaveRecordsMapper, LeaveRecords>
    implements LeaveRecordsService {
    @Resource
    LeaveRecordsMapper leaveRecordsMapper;
    @Override
    public IPage<LeaveRecords> selAll(int pageIndex, int pageSize) {
        Page<LeaveRecords> page = new Page<>(pageIndex, pageSize);
        return leaveRecordsMapper.selAll(page);
    }
}
