package com.chenhao.dto;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 容器对象：存放配置文件读取信息
 * @author chenhao
 * @date 2020/11/13 21:14
 **/
public class Configuration {
    /**
     * 数据库连接配置信息
     */
    private DataSource dataSource;

    /**
     * key:statementId(即sql配置文件中namespace.id)
     * value:封装好的sql配置文件容器对象
     */
    private Map<String, MappedStatement> mappedStatementMap = new HashMap<String, MappedStatement>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MappedStatement> getMappedStatementMap() {
        return mappedStatementMap;
    }

    public void setMappedStatementMap(Map<String, MappedStatement> mappedStatementMap) {
        this.mappedStatementMap = mappedStatementMap;
    }
}
