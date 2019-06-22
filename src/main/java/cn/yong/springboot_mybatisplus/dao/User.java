package cn.yong.springboot_mybatisplus.dao;

import lombok.Data;

/**
 * @ClassName User
 * @Author Administrator
 * @Date 2019/6/22 11:50
 * @Version 1.0
 */
@Data
public class User {
  private Long id;
  private String name;
  private Integer age;
  private String email;
}
