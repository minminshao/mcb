package com.xingzhe.mcb.mapper;

import com.xingzhe.framework.mapper.SqlMapper;
import com.xingzhe.mcb.domain.Order;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.mybatis.caches.ehcache.LoggingEhcache;

import java.util.List;
import java.util.Map;

//@CacheNamespace(size = 1024, implementation = LoggingEhcache.class)
public interface OrderMapper extends SqlMapper {
	void addOrder(@Param(value = "customerId") int customerId, @Param(value = "productList") String productList);

	List<Order> selectOrderList(Map<String, Object> map);

	int selectOrderCount(Map<String, Object> map);
}
