package org.apache.spark.ml.feature;
public  class StandardScalerModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.feature.StandardScalerModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StandardScalerModel$ MODULE$ = null;
  public   StandardScalerModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StandardScalerModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel load (java.lang.String path)  { throw new RuntimeException(); }
    double[] transformWithBoth (double[] shift, double[] scale, double[] values)  { throw new RuntimeException(); }
    double[] transformWithShift (double[] shift, double[] values)  { throw new RuntimeException(); }
    double[] transformDenseWithScale (double[] scale, double[] values)  { throw new RuntimeException(); }
    double[] transformSparseWithScale (double[] scale, int[] indices, double[] values)  { throw new RuntimeException(); }
    scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> getTransformFunc (double[] shift, double[] scale, boolean withShift, boolean withScale)  { throw new RuntimeException(); }
}
