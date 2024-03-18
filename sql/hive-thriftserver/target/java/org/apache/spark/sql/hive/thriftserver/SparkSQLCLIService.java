package org.apache.spark.sql.hive.thriftserver;
  class SparkSQLCLIService extends org.apache.hive.service.cli.CLIService implements org.apache.spark.sql.hive.thriftserver.ReflectedCompositeService {
  public   SparkSQLCLIService (org.apache.hive.service.server.HiveServer2 hiveServer, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.GetInfoValue getInfo (org.apache.hive.service.cli.SessionHandle sessionHandle, org.apache.hive.service.cli.GetInfoType getInfoType)  { throw new RuntimeException(); }
  public  void init (org.apache.hadoop.hive.conf.HiveConf hiveConf)  { throw new RuntimeException(); }
  /**
   * the super class {@link CLIService#start} starts a useless dummy metastore client, skip it and call
   * the ancestor {@link CompositeService#start} directly.
   */
  public  void start ()  { throw new RuntimeException(); }
}
