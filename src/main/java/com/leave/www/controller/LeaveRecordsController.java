package com.leave.www.controller;

import com.leave.www.entity.LeaveRecords;
import com.leave.www.service.LeaveRecordsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
  public String index() {
    return "首頁";
  }

  @RequestMapping("add")
  public String add(LeaveRecords leaveRecords) {
    log.info("leaveRecords：{}", leaveRecords);
    if (leaveRecordsService.save(leaveRecords)) {
      return "redirect:/";
    } else {
      return "redirect:/add";
    }
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable Integer id, HttpServletRequest request) {
    String msg = leaveRecordsService.removeById(id) ? "删除成功" : "删除失败";
    request.getSession().setAttribute("msg", msg);
    return "redirect:/result"; // 浏览器访问 不带就是相对于当前路径
  }

  @GetMapping("/result")
  public String toResult() {
    return "result";
  }
}
