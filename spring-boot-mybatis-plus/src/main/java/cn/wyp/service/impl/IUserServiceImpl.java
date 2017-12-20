package cn.wyp.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.wyp.mapper.UserMapper;
import cn.wyp.pojo.User;
import cn.wyp.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 吴雅平
 * @since 2017-12-16
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
