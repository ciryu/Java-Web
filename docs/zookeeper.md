# zookeeper

## zookeeper功能

### 配置维护：发布/订阅

如果多个服务需要修改文件，逐个修改很麻烦：只要将配置文件管理到zookeeper上，其他的主机将配置文件同步到自己机子上。

### 域名服务

（为了解决什么问题）

提供者：将 提供服务名称，主机信息（端口号...） 注册到zookeeper的服务映射表上。

消费者：根据服务名称，从 zookeeper中取到主机信息

### 分布式同步

如果三个服务的步骤是串行的，为了让zookeeper按顺序调用（同步处理）三个服务：zookeeper中引入znode状态变量，三个服务会一直watch监听zookeeper的znode状态，只有符合当前服务的状态，该服务才会接收zookeeper的请求。

### 集群管理

故障管理：能修复就修复，不能修复就上报管理员。

## 一致性要求

顺序一致性：顺序一致性zookeeper会严格按照 客户端发起的顺序 返回结果。

原子性：在集群中，只要应用事务，每一个主机都会应用该事务。

单一视图：所有从zookeeper中看到的数据都是一样的

可靠性：服务写入到zookeeper中的数据不会丢失

实时性：再某一个时间段内完成数据更新（而不是马上）

## Session

客户端启动时和zookeeper建立TCP长连接。

02-2min

