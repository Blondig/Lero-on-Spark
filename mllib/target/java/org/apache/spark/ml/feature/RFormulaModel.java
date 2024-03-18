package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link RFormula}. Fitting is required to determine the factor levels of
 * formula terms.
 * <p>
 * param:  resolvedFormula the fitted R formula.
 * param:  pipelineModel the fitted feature model, including factor to index mappings.
 */
public  class RFormulaModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link RFormulaModel} */
  static   class RFormulaModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   RFormulaModelWriter (org.apache.spark.ml.feature.RFormulaModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.RFormulaModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.RFormulaModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> formula ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam forceIndexLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringIndexerOrderType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    org.apache.spark.ml.feature.ResolvedRFormula resolvedFormula ()  { throw new RuntimeException(); }
    org.apache.spark.ml.PipelineModel pipelineModel ()  { throw new RuntimeException(); }
  // not preceding
     RFormulaModel (java.lang.String uid, org.apache.spark.ml.feature.ResolvedRFormula resolvedFormula, org.apache.spark.ml.PipelineModel pipelineModel)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
