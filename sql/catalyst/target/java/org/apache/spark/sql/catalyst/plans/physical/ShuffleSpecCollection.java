package org.apache.spark.sql.catalyst.plans.physical;
public  class ShuffleSpecCollection implements org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec> specs ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleSpecCollection (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec> specs)  { throw new RuntimeException(); }
  public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  { throw new RuntimeException(); }
  public  boolean canCreatePartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
}
