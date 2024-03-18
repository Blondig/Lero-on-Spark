package org.apache.spark.sql.hive.thriftserver;
  class HiveThriftServer2 extends org.apache.hive.service.server.HiveServer2 implements org.apache.spark.sql.hive.thriftserver.ReflectedCompositeService {
  static public  class ExecutionState$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutionState$ MODULE$ = null;
    public   ExecutionState$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value STARTED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value COMPILED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value CANCELED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value TIMEDOUT ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value FAILED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value FINISHED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value CLOSED ()  { throw new RuntimeException(); }
  }
  static public  scala.Option<org.apache.spark.sql.hive.thriftserver.ui.ThriftServerTab> uiTab ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2Listener listener ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2EventManager eventManager ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Starts a new thrift server with the given context.
   * @param sqlContext (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.hive.thriftserver.HiveThriftServer2 startWithContext (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   HiveThriftServer2 (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  public  void init (org.apache.hadoop.hive.conf.HiveConf hiveConf)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
