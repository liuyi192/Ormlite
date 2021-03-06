package com.xiaozhu.ormlite;

import android.content.Context;

/**
 * @说明 数据库初始化Manager
 * @作者 LY
 * @时间 16/6/16 下午1:41
 * @邮箱 2743569843@qq.com
 * @版权 Copyright(c) 2016 LY-版权所有
 * @备注
 */
public abstract class DatabaseManagerWrapper {

    private DatabaseHelper helper;

    /**
     * 初始化数据库
     *
     * @param context
     */
    public void init(Context context, String databaseName, int databaseVersion) {
        // 数据库名与数据库版本号必须首先设置
        setDbName(databaseName);
        setDbVersion(databaseVersion);
        initDatabaseHelper(context);
        registerTable();
    }

    private void initDatabaseHelper(Context context) {
        helper = DatabaseHelper.getInstance(context);
    }

    public DatabaseHelper getHelper() {
        return helper;
    }

    /**
     * 设置数据库名称
     *
     * @param databaseName 数据库名称
     */
    private void setDbName(String databaseName) {
        DatabaseHelper.setDbName(databaseName);
    }

    /**
     * 设置数据库版本号
     *
     * @param databaseVersion 数据库版本号
     */
    private void setDbVersion(int databaseVersion) {
        DatabaseHelper.setDbVersion(databaseVersion);
    }

    /**
     * 添加数据表
     */
    protected <T> void addTable(Class<T> clazz) {
        helper.registerTable(clazz);
    }

    /**
     * 注册数据表
     */
    protected abstract void registerTable();
}
