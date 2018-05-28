package cn.web.ajdatasynweb.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver; 

import javax.sql.DataSource;

/**
 * zhujian数据源
 * 
 * @author liangming.deng
 * @date 2017年6月30日
 *
 */ 
@Configuration
@MapperScan(basePackages = {"cn.web.ajdatasynweb.zhujian.mapper"}, sqlSessionTemplateRef = "autoTestSqlSessionTemplate")
public class DataSourceZhuJianConfig {

	@Bean
    @ConfigurationProperties(prefix = "spring.datasource.zhujian") 
    public DataSource autoTestDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean("autoTestSqlSessionTemplate")
    public SqlSessionTemplate autoTestSqlSessionTemplate(@Qualifier("autoTestSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
        return template;
    }

    @Bean
    public SqlSessionFactory autoTestSqlSessionFactory(@Qualifier("autoTestDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource); 
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:cn/web/ajdatasynweb/zhujian/mapper/xml/*Mapper.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
