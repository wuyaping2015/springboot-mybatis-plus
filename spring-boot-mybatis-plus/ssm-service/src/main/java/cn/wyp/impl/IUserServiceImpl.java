package cn.wyp.impl;

import cn.wyp.entity.User;
import cn.wyp.mapper.UserMapper;
import cn.wyp.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
