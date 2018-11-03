# redis-admin [![Build Status](https://travis-ci.org/mauersu/redis-admin.svg?branch=master)](https://travis-ci.org/mauersu/redis-admin)
[![GitHub release](https://img.shields.io/badge/release-download-orange.svg)](https://github.com/mauersu/redis-admin/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

这是一个基于Java EE和Jedis编写的redis客户端Web工具。我的目标是构建世界上最方便的redis客户端Web工具。首先，它将有助于编辑redis数据，例如：添加，更新，删除，搜索，剪切，复制，粘贴等。

![](https://www.google.com/logos/2012/halloween-2012-hp.jpg)

## 特征

**多个Redis版本自适应**

 1. 管理redis服务器，支持服务器密码验证
 2. 管理redis数据
 	* 创建：字符串，列表，哈希，集合，有序集
 	* 删除
 	* 更新
 	* 根据key搜索
 	* 支持分页查询
 	* 支持多种语言，现支持英语

##  截图

![Showcase](http://mauersu.github.io/img/redis-admin/0.0.2alpha2.02.png)

![Showcase](http://mauersu.github.io/img/redis-admin/0.0.2alpha2.01.png)

##  快速开始

`第一步`: 修改文件:'redis.properties' :

**注意**: redis.server.num 必须设置

```
redis.server.num=1
redis.language=English

#必须设置一个默认的redis
redis.host.1=10.100.142.9
redis.name.1=10.100.142.9
redis.port.1=6379
redis.password.1=SH89qwIO

redis.host.2=yours
redis.name.2=yours
redis.port.2=yours
redis.password.2=yours
```

`第二步`: 修改文件:'application.properties' :

```
####安全管理
manager.username=admin
manager.password=admin
```

`第三步`: 部署项目

执行maven命令 : mvn clean package
在该目录下会生成war包 'target/redis-admin.war'
将war包放到该目录下并启动tomcat服务器 '../tomcat/wabapps/.'  

`最后一步`: 浏览器访问 redis-admin

打开你的浏览器并访问: http://localhost:8080/redis-admin/redis

然后输入你在 'application.properties'文件中配置的用户名和密码登陆


##  发布说明

**请注意：trunk是当前的开发分支**

* [**Releases-Notes**](https://github.com/mauersu/redis-admin/wiki/Recent-Releases-Notes)

##  问题

* [**FAQ**](https://github.com/mauersu/redis-admin/wiki/FAQ)

![img-source-from-https://github.com/docker/dockercraft](https://github.com/docker/dockercraft/raw/master/docs/img/contribute.png?raw=true)
