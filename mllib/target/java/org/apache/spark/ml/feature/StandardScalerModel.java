package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link StandardScaler}.
 * <p>
 * param:  std Standard deviation of the StandardScalerModel
 * param:  mean Mean of the StandardScalerModel
 */
public  class StandardScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams, org.apache.spark.ml.util.MLWritable {
  static   class StandardScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   StandardScalerModelWriter (org.apache.spark.ml.feature.StandardScalerModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StandardScalerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StandardScalerModel load (java.lang.String path)  { throw new RuntimeException(); }
  static   double[] transformWithBoth (double[] shift, double[] scale, double[] values)  { throw new RuntimeException(); }
  static   double[] transformWithShift (double[] shift, double[] values)  { throw new RuntimeException(); }
  static   double[] transformDenseWithScale (double[] scale, double[] values)  { throw new RuntimeException(); }
  static   double[] transformSparseWithScale (double[] scale, int[] indices, double[] values)  { throw new RuntimeException(); }
  static   scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> getTransformFunc (double[] shift, double[] scale, boolean withShift, boolean withScale)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withMean ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withStd ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector std ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
  // not preceding
     StandardScalerModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector std, org.apache.spark.ml.linalg.Vector mean)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScalerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScalerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
