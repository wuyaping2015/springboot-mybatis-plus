package cn.wyp.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.baomidou.mybatisplus.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

@EnableTransactionManagement
@Configuration
@MapperScan("cn.wyp.mapper")
public class MybatisPlusConfig {

	@Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
        
    }
	
	@Bean	//乐观锁
	public OptimisticLockerInterceptor optimisticLockerInterceptor() {
		return new OptimisticLockerInterceptor();
	}
	
}
