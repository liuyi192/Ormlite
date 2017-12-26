package com.xiaozhu.ormlite;

/**
 * @说明 数据库基础类
 * @作者 LY
 * @时间 16/6/16 下午1:41
 * @邮箱 2743569843@qq.com
 * @版权 Copyright(c) 2016 LY-版权所有
 * @备注
 */
public class ColumnStruct {
    private String columnName;
    private String columnLimit;

    public ColumnStruct() {
    }

    public ColumnStruct(String columnName, String columnLimit) {
        this.columnName = columnName;
        this.columnLimit = columnLimit;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnLimit() {
        return columnLimit;
    }

    public void setColumnLimit(String columnLimit) {
        this.columnLimit = columnLimit;
    }

    @Override
    public String toString() {
        return "ColumnStruct{" +
                "columnName='" + columnName + '\'' +
                ", columnLimit='" + columnLimit + '\'' +
                '}';
    }
}
