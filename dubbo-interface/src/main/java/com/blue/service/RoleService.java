package com.blue.service;

import com.blue.domin.Role;
import com.blue.exception.ServiceException;

import java.util.List;
import java.util.Map;

public interface RoleService {
    public List<Role> find(Map<String, Object> map) throws ServiceException;                //带条件查询，条件可以为null，既没有条件；返回list对象集合

    public Role get(String id) throws ServiceException;                    //只查询一个，常用于修改

    public void insert(Role entity, String... pids) throws ServiceException;                    //插入，用实体作为参数

    public void update(Role entity, String... pids) throws ServiceException;                    //修改，用实体作为参数


    public void delete(String... ids) throws ServiceException;
}
