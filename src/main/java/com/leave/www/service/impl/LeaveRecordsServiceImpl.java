package com.leave.www.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leave.www.entity.LeaveRecords;
import com.leave.www.mapper.LeaveRecordsMapper;
import com.leave.www.service.LeaveRecordsService;
import org.springframework.stereotype.Service;

@Service
public class LeaveRecordsServiceImpl
    extends ServiceImpl<LeaveRecordsMapper, LeaveRecords>
    implements LeaveRecordsService {
}
