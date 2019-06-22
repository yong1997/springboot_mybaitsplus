package cn.yong.springboot_mybatisplus.mapper;

import cn.yong.springboot_mybatisplus.dao.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Author Administrator
 * @Date 2019/6/22 11:51
 * @Version 1.0
 */

/**
 * 必须使用@Mapper指定mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
