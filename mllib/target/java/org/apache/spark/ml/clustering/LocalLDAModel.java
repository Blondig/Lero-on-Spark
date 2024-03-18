package org.apache.spark.ml.clustering;
/**
 * Local (non-distributed) model fitted by {@link LDA}.
 * <p>
 * This model stores the inferred topics only; it does not store info about the training dataset.
 */
public  class LocalLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  static   class LocalLDAModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   LocalLDAModelWriter (org.apache.spark.ml.clustering.LocalLDAModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LocalLDAModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LocalLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel ()  { throw new RuntimeException(); }
  // not preceding
     LocalLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LocalLDAModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LDAModel getModel ()  { throw new RuntimeException(); }
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
