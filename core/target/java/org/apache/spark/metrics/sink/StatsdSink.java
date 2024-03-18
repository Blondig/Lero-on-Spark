package org.apache.spark.metrics.sink;
  class StatsdSink implements org.apache.spark.metrics.sink.Sink, org.apache.spark.internal.Logging {
  static public  java.lang.String STATSD_KEY_HOST ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_KEY_PORT ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_KEY_PERIOD ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_KEY_UNIT ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_KEY_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_DEFAULT_HOST ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_DEFAULT_PORT ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_DEFAULT_PERIOD ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_DEFAULT_UNIT ()  { throw new RuntimeException(); }
  static public  java.lang.String STATSD_DEFAULT_PREFIX ()  { throw new RuntimeException(); }
  public  java.util.Properties property ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry registry ()  { throw new RuntimeException(); }
  // not preceding
  public   StatsdSink (java.util.Properties property, com.codahale.metrics.MetricRegistry registry)  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  int pollPeriod ()  { throw new RuntimeException(); }
  public  java.util.concurrent.TimeUnit pollUnit ()  { throw new RuntimeException(); }
  public  java.lang.String prefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.metrics.sink.StatsdReporter reporter ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void report ()  { throw new RuntimeException(); }
}
