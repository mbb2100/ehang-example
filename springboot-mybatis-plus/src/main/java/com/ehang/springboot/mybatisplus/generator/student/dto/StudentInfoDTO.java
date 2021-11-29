package com.ehang.springboot.mybatisplus.generator.student.dto;

import lombok.Data;

/**
 * @author LENOVO
 * @title: StudentInfoDTO
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/25 19:33
 */
@Data
public class StudentInfoDTO {
    // 学生id
    private Integer id;

    // 性名
    private String name;

    // 年龄
    private Integer age;

    // 班级名称
    private String className;

    // 学校名称
    private String schoolName;

    // 学校地址 用于测试别名
    private String scAddr;
}
