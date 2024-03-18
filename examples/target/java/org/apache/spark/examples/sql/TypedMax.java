package org.apache.spark.examples.sql;
public  class TypedMax<IN extends java.lang.Object> extends org.apache.spark.sql.expressions.Aggregator<IN, org.apache.spark.examples.sql.MutableLong, scala.Option<java.lang.Object>> {
  // not preceding
  public   TypedMax (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.examples.sql.MutableLong> bufferEncoder ()  { throw new RuntimeException(); }
  public  scala.Function1<IN, java.lang.Object> f ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> finish (org.apache.spark.examples.sql.MutableLong reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableLong merge (org.apache.spark.examples.sql.MutableLong b1, org.apache.spark.examples.sql.MutableLong b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Option<java.lang.Object>> outputEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableLong reduce (org.apache.spark.examples.sql.MutableLong b, IN a)  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableLong zero ()  { throw new RuntimeException(); }
}
