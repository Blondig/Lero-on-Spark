package org.apache.spark.input;
/**
 * A trait to implement {@link org.apache.hadoop.conf.Configurable Configurable} interface.
 */
public  interface Configurable extends org.apache.hadoop.conf.Configurable {
  public  org.apache.hadoop.conf.Configuration getConf ()  ;
  public  void setConf (org.apache.hadoop.conf.Configuration c)  ;
}
