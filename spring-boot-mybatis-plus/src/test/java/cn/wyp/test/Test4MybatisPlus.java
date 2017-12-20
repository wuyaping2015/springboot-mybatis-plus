package cn.wyp.test;

import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import cn.wyp.Application;
import cn.wyp.mapper.UserMapper;
import cn.wyp.pojo.User;
import cn.wyp.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class Test4MybatisPlus {

	@Autowired(required=false)
	private UserMapper userMapper;

	@Autowired(required=false)
	private IUserService userService;
	
	private String[] lastnames = {"艳","兵","国","庆","晓","平","新","杰","伟","斌","洪","文","成","忠"};
	
	private String[] firstName = {"赵","钱","孙","李","周","吴","郑","王"};
	@Test
	public void test() {
		for(int i = 0; i <= 100; i ++) {
			Random r = new Random();
			int age = r.nextInt(60)+20;
			User u = new User(firstName[r.nextInt(firstName.length)]+lastnames[r.nextInt(lastnames.length)],age);
			u.setVersion(0);
			userMapper.insert(u);
		}
	}
	@Test
	public void testQuery() throws Exception {
		EntityWrapper<User> wrapper = new EntityWrapper<>();
		wrapper.like("name", "李%").orderBy("age",false);
		List<User> list = userMapper.selectPage(new RowBounds(1,2), wrapper);
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	@Test
	public void test1() throws Exception {
		Pagination p = new Pagination(1,2);
		List<User> yong = userMapper.getYong(p, 30);
		for (User user : yong) {
			System.out.println(user);
		}
	}
	

	@Test
	public void test2() throws Exception {
		User u = new User();
		u.setId(1);
		u.setName("酱饼1");
		u.setAge(18);
		u.setVersion(0);
		if (userService.updateById(u)) {
			System.out.println("非常成功。。。");
		} else {
			System.out.println("更新失败。。。");
		}
	}
}
