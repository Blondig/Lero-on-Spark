package org.apache.spark.ml;
/**
 * Used to test {@link Pipeline} with <code>MLWritable</code> stages
 */
public  class WritableStage extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.util.MLWritable {
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.WritableStage> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.WritableStage load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   WritableStage (java.lang.String uid)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam intParam ()  { throw new RuntimeException(); }
  public  int getIntParam ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.WritableStage setIntParam (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.WritableStage copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
