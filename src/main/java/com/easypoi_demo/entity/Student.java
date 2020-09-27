package com.easypoi_demo.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Excel(name = "ID", orderNum = "0", width = 15)
    private Integer uid;
    @Excel(name = "姓名", orderNum = "1", width = 15)
    private String username;
    @Excel(name = "手机号码", orderNum = "2", width = 15)
    private Integer phone;
    @Excel(name = "性别", orderNum = "3", width = 15)
    private String gender;

}
