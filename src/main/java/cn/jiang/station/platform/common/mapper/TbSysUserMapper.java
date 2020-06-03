package cn.jiang.station.platform.common.mapper;


import cn.jiang.station.platform.common.domain.TbSysUser;
import cn.jiang.station.platform.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbSysUserMapper extends MyMapper<TbSysUser> {
}