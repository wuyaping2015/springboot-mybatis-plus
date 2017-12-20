package cn.wyp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import cn.wyp.pojo.User;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 吴雅平
 * @since 2017-12-16
 */
public interface UserMapper extends BaseMapper<User> {

	public List<User> getYong(Pagination page , Integer age);
	
}