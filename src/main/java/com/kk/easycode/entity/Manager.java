package com.kk.easycode.entity;

import java.io.Serializable;

/**
 * (Manager)实体类
 *
 * @author makejava
 * @since 2020-03-22 10:26:42
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = -31098610811990482L;
    
    private Integer id;
    
    private String name;
    
    private String password;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                "name=" + name +
                "password=" + password +
                 '}';      
    }
}