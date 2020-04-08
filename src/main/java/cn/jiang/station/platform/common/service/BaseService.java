package cn.jiang.station.platform.common.service;

import cn.jiang.station.platform.common.domain.BaseDomain;
import com.github.pagehelper.PageInfo;

public interface BaseService<T extends BaseDomain> {
    int insert(T t, String createBy);

    int delete(T t);

    int update(T t, String updateBy);

    T selectOne(T t);

    int count(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);

}
