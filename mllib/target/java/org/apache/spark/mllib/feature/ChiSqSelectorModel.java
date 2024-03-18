package org.apache.spark.mllib.feature;
/**
 * Chi Squared selector model.
 * <p>
 * param:  selectedFeatures list of indices to select (filter).
 */
public  class ChiSqSelectorModel implements org.apache.spark.mllib.feature.VectorTransformer, org.apache.spark.mllib.util.Saveable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    /** Model data for import/export */
    public  class Data implements scala.Product, scala.Serializable {
      static public abstract  R apply (T1 v1)  ;
      static public  java.lang.String toString ()  { throw new RuntimeException(); }
      public  int feature ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (int feature)  { throw new RuntimeException(); }
    }
    public  class Data$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.mllib.feature.ChiSqSelectorModel.SaveLoadV1_0.Data> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Data$ MODULE$ = null;
      public   Data$ ()  { throw new RuntimeException(); }
    }
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.feature.ChiSqSelectorModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.feature.ChiSqSelectorModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.feature.ChiSqSelectorModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelectorModel (int[] selectedFeatures)  { throw new RuntimeException(); }
  /**
   * Applies transformation on a vector.
   * <p>
   * @param vector vector to be transformed.
   * @return transformed vector.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
    scala.Tuple2<int[], double[]> compressSparse (int[] indices, double[] values)  { throw new RuntimeException(); }
    double[] compressDense (double[] values)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
