package org.apache.spark.sql.hive.thriftserver;
  class SparkSQLSessionManager extends org.apache.hive.service.cli.session.SessionManager implements org.apache.spark.sql.hive.thriftserver.ReflectedCompositeService, org.apache.spark.internal.Logging {
  public   SparkSQLSessionManager (org.apache.hive.service.server.HiveServer2 hiveServer, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  public  void closeSession (org.apache.hive.service.cli.SessionHandle sessionHandle)  { throw new RuntimeException(); }
  public  void init (org.apache.hadoop.hive.conf.HiveConf hiveConf)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.SessionHandle openSession (org.apache.hive.service.rpc.thrift.TProtocolVersion protocol, java.lang.String username, java.lang.String passwd, java.lang.String ipAddress, java.util.Map<java.lang.String, java.lang.String> sessionConf, boolean withImpersonation, java.lang.String delegationToken)  { throw new RuntimeException(); }
  public  void setConfMap (org.apache.spark.sql.SQLContext conf, java.util.Map<java.lang.String, java.lang.String> confMap)  { throw new RuntimeException(); }
}
