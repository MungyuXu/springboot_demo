package com.xmy.springboot_demo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @author: 徐梦雨
 * @date: 2021/2/8 16:39
 * @description:可用于generator生成，测试通过
 */
public class Generator {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("xmy_generator");
        gc.setOutputDir("C:\\Users\\Administrator\\IdeaProjects\\springboot_demo\\src\\main\\java");
        gc.setFileOverride(false);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert() {
//            // 自定义数据库表字段类型转换【可选】
////            @Override
////            public DbColumnType processTypeConvert(String fieldType) {
////                System.out.println("转换类型：" + fieldType);
////                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
////                return (DbColumnType) super.processTypeConvert(fieldType);
////            }
//        });
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("sunjie");
        dsc.setPassword("970306");
        dsc.setUrl("jdbc:mysql://47.106.8.7:3306/db_test?useUnicode=true&characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
//        strategy.setTablePrefix(new String[] { "user_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.nochange);// 表名生成策略
        strategy.setInclude(new String[] { "user","shiwu" }); // 需要生成的表

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.xmy.springboot_demo");
//        pc.setModuleName("test");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();

    }

}
