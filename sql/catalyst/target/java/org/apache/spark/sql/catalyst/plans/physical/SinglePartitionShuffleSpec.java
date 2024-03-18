package org.apache.spark.sql.catalyst.plans.physical;
public  class SinglePartitionShuffleSpec {
  static public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  { throw new RuntimeException(); }
  static public  boolean canCreatePartitioning ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  { throw new RuntimeException(); }
  static public  int numPartitions ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
