//package com.xmy.springboot_demo;
//
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
//import org.yaml.snakeyaml.Yaml;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
///**
// * <p>mybatis 自动生成</p>
// *
// */
//public class Generator {
//
//    public static String LINK;
//    public static String ACCOUNT;
//    public static String PASSWORD;
//
//    // 数据库表
//    public static String[] tables = {
//            "order",
////            "aa",
//    };
//
//    public static void main(String[] args) {
//        init();
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//        String projectPath = System.getProperty("user.dir");
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        gc.setOutputDir(projectPath + "/springboot_demo/src/main/java/")
//                .setAuthor("Generator")
//                .setOpen(false)
//                .setFileOverride(false)
//                // 不需要ActiveRecord特性的请改为false
//                .setActiveRecord(true)
//                // XML 二级缓存
//                .setEnableCache(false)
//                // XML ResultMap
//                .setBaseResultMap(true)
//                // XML columList
//                .setBaseColumnList(true)
//                .setMapperName("%sDao")
//                .setServiceName("%sManager")
//                .setServiceImplName("%sManagerImpl");
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl(LINK);
//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUsername(ACCOUNT);
//        dsc.setPassword(PASSWORD);
//        mpg.setDataSource(dsc);
//
//        // 包配置
//        PackageConfig packageConfig = new PackageConfig()
//                .setParent("com.xmy.springboot_demo")
//                .setEntity("domain")
//                .setMapper("dao")
//                .setService("manager")
//                .setServiceImpl("manager.impl");
//
//        mpg.setPackageInfo(packageConfig);
//
//        // 自定义配置
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                // to do nothing
//            }
//        };
//        List<FileOutConfig> focList = new ArrayList<>();
//        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath + "/springboot_demo/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
//            }
//        });
//
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//
//        //模板设置
//        TemplateConfig templateConfig = new TemplateConfig()
//                .setController(null)
//                .setXml(null);
////                .setEntity("/mtemplates/entity.java.vm");
//        mpg.setTemplate(templateConfig);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel)
//                .setColumnNaming(NamingStrategy.underline_to_camel)
////        setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
//                .setEntityLombokModel(true)
//                .setEntityBuilderModel(true)
//                //字段生成注释
//                .setEntityTableFieldAnnotationEnable(true)
//                .setInclude(tables)
//                .setLogicDeleteFieldName("isDelete")
////        .setSuperEntityColumns("id");
//                .setTablePrefix(packageConfig.getModuleName() + "_");
//        strategy.setEntityBuilderModel(true);
//        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new VelocityTemplateEngine());
//        mpg.execute();
//    }
//
//    /**
//     * 从yaml文件中读取数据库信息
//     */
//    public static void init() {
//        URL url = Generator.class.getClassLoader().getResource("application.yml");
//        try {
//            FileInputStream file = new FileInputStream(url.getFile());
//            Map<String, Map<String, Map>> map = new Yaml().load(file);
//            Map<String, String> datasourceMap = map.get("spring").get("datasource");
//            LINK = datasourceMap.get("url");
//            ACCOUNT = datasourceMap.get("username");
//            PASSWORD = datasourceMap.get("password");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
