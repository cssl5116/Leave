package com.leave.www.controller;

import com.leave.www.entity.LeaveRecords;
import com.leave.www.service.LeaveRecordsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author lwf
 * &#064;date 2023/8/14 9:44
 */
@Controller
@Slf4j
public class LeaveRecordsController {

    @Resource
    LeaveRecordsService leaveRecordsService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "首頁";
    }

    @RequestMapping("add")
    public String add(LeaveRecords leaveRecords){
        log.info("leaveRecords：{}",leaveRecords);
        if (leaveRecordsService.save(leaveRecords)) {
            return "redirect:/";
        } else {
            return "redirect:/add";
        }
    }
}
