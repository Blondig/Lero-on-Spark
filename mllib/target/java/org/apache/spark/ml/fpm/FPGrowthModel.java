package org.apache.spark.ml.fpm;
/**
 * Model fitted by FPGrowth.
 * <p>
 * param:  freqItemsets frequent itemsets in the format of DataFrame("items"[Array], "freq"[Long])
 */
public  class FPGrowthModel extends org.apache.spark.ml.Model<org.apache.spark.ml.fpm.FPGrowthModel> implements org.apache.spark.ml.fpm.FPGrowthParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link FPGrowthModel} */
  static   class FPGrowthModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   FPGrowthModelWriter (org.apache.spark.ml.fpm.FPGrowthModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.fpm.FPGrowthModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.fpm.FPGrowthModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> itemsCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minSupport ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam minConfidence ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> freqItemsets ()  { throw new RuntimeException(); }
  // not preceding
     FPGrowthModel (java.lang.String uid, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> freqItemsets, scala.collection.Map<java.lang.Object, java.lang.Object> itemSupport, long numTrainingRecords)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowthModel setMinConfidence (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowthModel setItemsCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowthModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Get association rules fitted using the minConfidence. Returns a dataframe with five fields,
   * "antecedent", "consequent", "confidence", "lift" and "support", where "antecedent" and
   *  "consequent" are Array[T], whereas "confidence", "lift" and "support" are Double.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> associationRules ()  { throw new RuntimeException(); }
  /**
   * The transform method first generates the association rules according to the frequent itemsets.
   * Then for each transaction in itemsCol, the transform method will compare its items against the
   * antecedents of each association rule. If the record contains all the antecedents of a
   * specific association rule, the rule will be considered as applicable and its consequents
   * will be added to the prediction result. The transform method will summarize the consequents
   * from all the applicable rules as prediction. The prediction column has the same data type as
   * the input column(Array[T]) and will not contain existing items in the input column. The null
   * values in the itemsCol columns are treated as empty sets.
   * WARNING: internally it collects association rules to the driver and uses broadcast for
   * efficiency. This may bring pressure to driver memory for large set of association rules.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowthModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
