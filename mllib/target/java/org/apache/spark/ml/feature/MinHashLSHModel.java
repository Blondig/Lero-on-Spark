package org.apache.spark.ml.feature;
/**
 * Model produced by {@link MinHashLSH}, where multiple hash functions are stored. Each hash function
 * is picked from the following family of hash functions, where a_i and b_i are randomly chosen
 * integers less than prime:
 *    <code>h_i(x) = ((x \cdot a_i + b_i) \mod prime)</code>
 * <p>
 * This hash family is approximately min-wise independent according to the reference.
 * <p>
 * Reference:
 * Tom Bohman, Colin Cooper, and Alan Frieze. "Min-wise independent linear permutations."
 * Electronic Journal of Combinatorics 7 (2000): R26.
 * <p>
 * param:  randCoefficients Pairs of random coefficients. Each pair is used by one hash function.
 */
public  class MinHashLSHModel extends org.apache.spark.ml.feature.LSHModel<org.apache.spark.ml.feature.MinHashLSHModel> {
  static   class MinHashLSHModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   MinHashLSHModelWriter (org.apache.spark.ml.feature.MinHashLSHModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MinHashLSHModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinHashLSHModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.Object, java.lang.Object>[] randCoefficients ()  { throw new RuntimeException(); }
  // not preceding
     MinHashLSHModel (java.lang.String uid, scala.Tuple2<java.lang.Object, java.lang.Object>[] randCoefficients)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinHashLSHModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinHashLSHModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector[] hashFunction (org.apache.spark.ml.linalg.Vector elems)  { throw new RuntimeException(); }
  protected  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  protected  double hashDistance (org.apache.spark.ml.linalg.Vector[] x, org.apache.spark.ml.linalg.Vector[] y)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSHModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
