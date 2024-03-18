package org.apache.spark.ml.feature;
/**
 * param:  categorySizes  Original number of categories for each feature being encoded.
 *                       The array contains one value for each input column, in order.
 */
public  class OneHotEncoderModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.OneHotEncoderModel> implements org.apache.spark.ml.feature.OneHotEncoderBase, org.apache.spark.ml.util.MLWritable {
  static   class OneHotEncoderModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   OneHotEncoderModelWriter (org.apache.spark.ml.feature.OneHotEncoderModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.OneHotEncoderModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.OneHotEncoderModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam dropLast ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] categorySizes ()  { throw new RuntimeException(); }
  // not preceding
     OneHotEncoderModel (java.lang.String uid, int[] categorySizes)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setInputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setOutputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setDropLast (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoderModel setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.OneHotEncoderModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
