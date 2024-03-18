package org.apache.spark.deploy.history;
/**
 * Describes the result of compaction.
 * <p>
 * param:  code The result of compaction.
 * param:  compactIndex The index of compact file if the compaction is successful.
 *                     Otherwise it will be None.
 */
public  class CompactionResult implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value code ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> compactIndex ()  { throw new RuntimeException(); }
  // not preceding
  public   CompactionResult (scala.Enumeration.Value code, scala.Option<java.lang.Object> compactIndex)  { throw new RuntimeException(); }
}
