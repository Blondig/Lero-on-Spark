package org.apache.spark.ml;
/**
 * Used to test {@link Pipeline} with non-<code>MLWritable</code> stages
 */
public  class UnWritableStage extends org.apache.spark.ml.Transformer {
  // not preceding
  public   UnWritableStage (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.UnWritableStage copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam intParam ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
}
