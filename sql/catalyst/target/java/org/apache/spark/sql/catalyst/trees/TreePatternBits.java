package org.apache.spark.sql.catalyst.trees;
public  interface TreePatternBits {
  /**
   * @param patterns, a sequence of tree pattern enums to be tested.
   * @return true if every bit for <code>patterns</code> is set; false otherwise.
   */
  public  boolean containsAllPatterns (scala.collection.Seq<scala.Enumeration.Value> patterns)  ;
  /**
   * @param patterns, a sequence of tree pattern enums to be tested.
   * @return true if at least one bit for <code>patterns</code> is set; false otherwise.
   */
  public  boolean containsAnyPattern (scala.collection.Seq<scala.Enumeration.Value> patterns)  ;
  /**
   * @param t, the tree pattern enum to be tested.
   * @return true if the bit for <code>t</code> is set; false otherwise.
   */
  public  boolean containsPattern (scala.Enumeration.Value t)  ;
  public  org.apache.spark.util.collection.BitSet treePatternBits ()  ;
}
