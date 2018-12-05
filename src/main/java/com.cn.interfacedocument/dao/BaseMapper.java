package com.cn.interfacedocument.dao;

import com.github.pagehelper.Page;
import org.apache.ibatis.session.SqlSession;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 基本dao层
 * Created by QSJ on 2018/12/5.
 */
public interface BaseMapper<T> {

    /**
     * 根据实体对象新增记录.
     *
     * @param entity
     *            .
     * @return id .
     */
    int insert(T entity);

    /**
     * 批量保存对象.
     *
     * @param entity
     *            .
     * @return id .
     */
    int insert(List<T> list);

    int insert(List<T> list, int batchSize);

    /**
     * 更新实体对应的记录.
     *
     * @param entity
     *            .
     * @return
     */
    int update(T entity);

    /**
     * 批量更新对象.
     *
     * @param entity
     *            .
     * @return int .
     */
    int update(List<T> list);

    int update(List<T> list, int batchSize);

    /**
     * 根据ID查找记录.
     *
     * @param id
     *            .
     * @return entity .
     */
    @Deprecated
    <E> E getById(String id);

    /**
     * 根据ID删除记录.
     *
     * @param id
     *            .
     * @return
     */
    @Deprecated
    int deleteById(String id);


    /**
     * 分页查询 .
     *
     * @param pageParam
     *            分页参数.
     * @param paramMap
     *            业务条件查询参数.
     * @return
     */
    public List<T> getPageList(Class<?> mapperClass, String sqlId, Object sqlParameter, Page page);

    public <E> List<E> getPageList(String sqlId, Object sqlParameter, Page page);

    /**
     * 根据条件查询 listBy: <br/>
     *
     * @param paramMap
     * @return 返回集合
     */
    public <E> List<E> listBy(Map<String, Object> paramMap);

    /**
     * 根据条件查询 listBy: <br/>
     *
     * @param paramMap
     * @return 返回实体
     */
    public <E> E getBy(Map<String, Object> paramMap);

    public SqlSession getSqlSession();

    int deleteByPk(Serializable pk);

    public T getByPk(Serializable pk);
}
