package com.chenhao.dto;
/**
 * 容器对象：存放sql语句配置信息
 * @author chenhao
 * @date 2020/11/13 21:16
 **/
public class MappedStatement {
    /**
     * id标识
     */
    private String id;
    /**
     * 参数值类型
     */
    private String parameterType;
    /**
     * 返回值类型
     */
    private String resultType;
    /**
     * sql语句
     */
    private String sql;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
