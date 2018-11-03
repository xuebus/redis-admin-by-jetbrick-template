package com.mauersu.service;

public interface ListService {

    void updateListValue(String serverName, int dbIndex, String key, String value);

    void delListValue(String serverName, int dbIndex, String key);

}
