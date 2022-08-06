package com.people.entity;

import lombok.Data;

/**
 * @author chengdali
 * @description: 创建用户实体类
 * @datetime 2022/8/6
 * @version: 1.0
 */
@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String email;
}
