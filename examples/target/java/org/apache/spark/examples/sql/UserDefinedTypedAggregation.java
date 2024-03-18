package org.apache.spark.examples.sql;
public  class UserDefinedTypedAggregation {
  static public  class Employee implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  long salary ()  { throw new RuntimeException(); }
    // not preceding
    public   Employee (java.lang.String name, long salary)  { throw new RuntimeException(); }
  }
  static public  class Employee$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.examples.sql.UserDefinedTypedAggregation.Employee> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Employee$ MODULE$ = null;
    public   Employee$ ()  { throw new RuntimeException(); }
  }
  static public  class Average implements scala.Product, scala.Serializable {
    public  long sum ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    // not preceding
    public   Average (long sum, long count)  { throw new RuntimeException(); }
  }
  static public  class Average$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Average$ MODULE$ = null;
    public   Average$ ()  { throw new RuntimeException(); }
  }
  static public  class MyAverage$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.examples.sql.UserDefinedTypedAggregation.Employee, org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MyAverage$ MODULE$ = null;
    public   MyAverage$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average zero ()  { throw new RuntimeException(); }
    public  org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average reduce (org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average buffer, org.apache.spark.examples.sql.UserDefinedTypedAggregation.Employee employee)  { throw new RuntimeException(); }
    public  org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average merge (org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average b1, org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average b2)  { throw new RuntimeException(); }
    public  double finish (org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average reduction)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<org.apache.spark.examples.sql.UserDefinedTypedAggregation.Average> bufferEncoder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
