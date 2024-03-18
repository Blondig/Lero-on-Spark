package org.apache.spark.examples.sql;
public  class TypedMin<IN extends java.lang.Object> extends org.apache.spark.sql.expressions.Aggregator<IN, org.apache.spark.examples.sql.MutableDouble, scala.Option<java.lang.Object>> {
  // not preceding
  public   TypedMin (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.examples.sql.MutableDouble> bufferEncoder ()  { throw new RuntimeException(); }
  public  scala.Function1<IN, java.lang.Object> f ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> finish (org.apache.spark.examples.sql.MutableDouble reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableDouble merge (org.apache.spark.examples.sql.MutableDouble b1, org.apache.spark.examples.sql.MutableDouble b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Option<java.lang.Object>> outputEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableDouble reduce (org.apache.spark.examples.sql.MutableDouble b, IN a)  { throw new RuntimeException(); }
  public  org.apache.spark.examples.sql.MutableDouble zero ()  { throw new RuntimeException(); }
}
