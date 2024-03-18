package org.apache.spark.ml.r;
public  class FMClassifierWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.FMClassifierWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FMClassifierWrapper$ MODULE$ = null;
  public   FMClassifierWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.FMClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int factorSize, boolean fitLinear, double regParam, double miniBatchFraction, double initStd, int maxIter, double stepSize, double tol, java.lang.String solver, java.lang.String seed, double[] thresholds, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FMClassifierWrapper> read ()  { throw new RuntimeException(); }
}
