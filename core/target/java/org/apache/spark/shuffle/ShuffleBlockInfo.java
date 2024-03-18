package org.apache.spark.shuffle;
/**
 * :: Experimental ::
 * An experimental case class used by MigratableResolver to return the shuffleId and mapId in a
 * type safe way.
 */
public  class ShuffleBlockInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  long mapId ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleBlockInfo (int shuffleId, long mapId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
