package com.blue.dao;


import com.blue.domin.Role;
import com.blue.exception.MapperException;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    public List<Role> find(Map<String, Object> map) throws MapperException;                //带条件查询，条件可以为null，既没有条件；返回list对象集合

    public Role get(String id) throws MapperException;                    //只查询一个，常用于修改

    public void insert(Role role) throws MapperException;

    /**
     * role,pid
     *
     * @param map
     * @throws Exception
     */
    public void insertRolePrivilege(Map<String, Object> map) throws MapperException;


    /**
     * param ids
     *
     * @throws MapperException
     */
    public void delete(Map<String, Object> map) throws MapperException;

    /**
     * ids
     *
     * @param map
     * @throws MapperException
     */

    public void deletePrivilege_role(Map<String, Object> map) throws MapperException;

    public void update(Role role) throws MapperException;

}
