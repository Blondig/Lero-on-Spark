package org.apache.spark.internal;
/**
 * Utility trait for classes that want to log data. Creates a SLF4J logger for the class and allows
 * logging messages at different levels using methods that only evaluate parameters lazily if the
 * log level is enabled.
 */
public  interface Logging {
  static   class SparkShellLoggingFilter extends org.apache.logging.log4j.core.filter.AbstractFilter {
    public   SparkShellLoggingFilter ()  { throw new RuntimeException(); }
    /**
     * If sparkShellThresholdLevel is not defined, this filter is a no-op.
     * If log level of event is not equal to root level, the event is allowed. Otherwise,
     * the decision is made based on whether the log came from root or some custom configuration
     * @param loggingEvent
     * @return decision for accept/deny log event
     * @param logEvent (undocumented)
     */
    public  org.apache.logging.log4j.core.Filter.Result filter (org.apache.logging.log4j.core.LogEvent logEvent)  { throw new RuntimeException(); }
    public  org.apache.logging.log4j.core.LifeCycle.State getState ()  { throw new RuntimeException(); }
    public  void initialize ()  { throw new RuntimeException(); }
    public  boolean isStarted ()  { throw new RuntimeException(); }
    public  boolean isStopped ()  { throw new RuntimeException(); }
    public  void start ()  { throw new RuntimeException(); }
    public  void stop ()  { throw new RuntimeException(); }
  }
  public  java.lang.String logName ()  ;
  public  org.slf4j.Logger log ()  ;
  public  void logInfo (scala.Function0<java.lang.String> msg)  ;
  public  void logDebug (scala.Function0<java.lang.String> msg)  ;
  public  void logTrace (scala.Function0<java.lang.String> msg)  ;
  public  void logWarning (scala.Function0<java.lang.String> msg)  ;
  public  void logError (scala.Function0<java.lang.String> msg)  ;
  public  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  boolean isTraceEnabled ()  ;
  public  void initializeLogIfNecessary (boolean isInterpreter)  ;
  public  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  ;
    void initializeForcefully (boolean isInterpreter, boolean silent)  ;
  public  void initializeLogging (boolean isInterpreter, boolean silent)  ;
}
