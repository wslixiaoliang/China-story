package com.art.beans.famous;

import java.io.Serializable;
import java.util.List;

/**
 * 前台页面结果集对象
 * @author wslixiaoliang
 */
public class Result<T> implements Serializable{

    private List<T> beans;
    private int count;
    private String returnCode;
    private String returnMessage;

    //无参构造方法
    public Result() {
    }

    //有参构造方法
    public Result(List<T> beans, int count, String returnCode, String returnMessage) {
        this.beans = beans;
        this.count = count;
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }

    //getters and setters
    public List<T> getBeans() {
        return beans;
    }

    public void setBeans(List<T> beans) {
        this.beans = beans;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
