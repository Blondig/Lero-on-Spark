package org.apache.spark.metrics.sink;
public  interface Sink {
  public  void report ()  ;
  public  void start ()  ;
  public  void stop ()  ;
}
