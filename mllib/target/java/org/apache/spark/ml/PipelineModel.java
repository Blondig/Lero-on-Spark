package org.apache.spark.ml;
/**
 * Represents a fitted pipeline.
 */
public  class PipelineModel extends org.apache.spark.ml.Model<org.apache.spark.ml.PipelineModel> implements org.apache.spark.ml.util.MLWritable, org.apache.spark.internal.Logging {
  static   class PipelineModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   PipelineModelWriter (org.apache.spark.ml.PipelineModel instance)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.PipelineModel instance ()  { throw new RuntimeException(); }
    public  void save (java.lang.String path)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.PipelineModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.PipelineModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Transformer[] stages ()  { throw new RuntimeException(); }
  // not preceding
     PipelineModel (java.lang.String uid, org.apache.spark.ml.Transformer[] stages)  { throw new RuntimeException(); }
  /** A Java/Python-friendly auxiliary constructor. */
     PipelineModel (java.lang.String uid, java.util.List<org.apache.spark.ml.Transformer> stages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
