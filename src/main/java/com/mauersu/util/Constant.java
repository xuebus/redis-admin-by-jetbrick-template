package com.mauersu.util;

import com.mauersu.util.ztree.ZNode;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressWarnings("rawtypes")
public interface Constant {

    Map<String, RedisTemplate> redisTemplatesMap = new HashMap<>();
    Map<String, CopyOnWriteArrayList<RKey>> redisKeysListMap = new HashMap<String, CopyOnWriteArrayList<RKey>>();
    Map<RKey, Object> redisVMCache = new ConcurrentHashMap<RKey, Object>();
    CopyOnWriteArrayList<ZNode> redisNavigateZtree = new CopyOnWriteArrayList<ZNode>();
    CopyOnWriteArrayList<Map<String, Object>> redisServerCache = new CopyOnWriteArrayList<Map<String, Object>>();

    int DEFAULT_ITEMS_PER_PAGE = 10;
    String DEFAULT_REDISKEY_SEPARATOR = ":";
    int REDIS_DEFAULT_DB_SIZE = 15;
    String DEFAULT_SEPARATOR = "_";
    String UTF_8 = "utf-8";

    /**
     * redis properties key
     **/
    String REDISPROPERTIES_SERVER_NUM_KEY = "redis.server.num";
    String REDISPROPERTIES_LANGUAGE_KEY = "redis.language";

    String REDISPROPERTIES_HOST_PROFIXKEY = "redis.host.";
    String REDISPROPERTIES_NAME_PROFIXKEY = "redis.name.";
    String REDISPROPERTIES_PORT_PROFIXKEY = "redis.port.";
    String REDISPROPERTIES_PASSWORD_PROFIXKEY = "redis.password.";


    /**
     * default
     **/
    //public static final String DEFAULT_REDISSERVERNAME 										= "default";
    int DEFAULT_DBINDEX = 0;

    /**
     * query key
     **/
    String MIDDLE_KEY = "middle";
    String HEAD_KEY = "head";
    String TAIL_KEY = "tail";
    String EMPTY_STRING = "";

    /**
     * operator for log
     **/
    String GETKV = "GETKV";
}
