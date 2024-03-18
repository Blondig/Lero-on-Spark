package org.apache.spark.rdd;
/**
 * The deterministic level of RDD's output (i.e. what <code>RDD#compute</code> returns). This explains how
 * the output will diff when Spark reruns the tasks for the RDD. There are 3 deterministic levels:
 * 1. DETERMINATE: The RDD output is always the same data set in the same order after a rerun.
 * 2. UNORDERED: The RDD output is always the same data set but the order can be different
 *               after a rerun.
 * 3. INDETERMINATE. The RDD output can be different after a rerun.
 * <p>
 * Note that, the output of an RDD usually relies on the parent RDDs. When the parent RDD's output
 * is INDETERMINATE, it's very likely the RDD's output is also INDETERMINATE.
 */
public  class DeterministicLevel {
  static public  scala.Enumeration.Value DETERMINATE ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value UNORDERED ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value INDETERMINATE ()  { throw new RuntimeException(); }
  static protected  java.lang.Object readResolve ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.ValueSet values ()  { throw new RuntimeException(); }
  static protected  int nextId ()  { throw new RuntimeException(); }
  static protected  void nextId_$eq (int x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.String> nextName ()  { throw new RuntimeException(); }
  static protected  void nextName_$eq (scala.collection.Iterator<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public final  int maxId ()  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value apply (int x)  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value withName (java.lang.String s)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value ()  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (java.lang.String name)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i, java.lang.String name)  { throw new RuntimeException(); }
}
