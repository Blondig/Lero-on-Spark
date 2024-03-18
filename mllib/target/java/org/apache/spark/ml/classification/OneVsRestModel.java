package org.apache.spark.ml.classification;
/**
 * Model produced by {@link OneVsRest}.
 * This stores the models resulting from training k binary classifiers: one for each class.
 * Each example is scored against all k models, and the model with the highest score
 * is picked to label the example.
 * <p>
 * param:  labelMetadata Metadata of label column if it exists, or Nominal attribute
 *                      representing the number of classes in training dataset otherwise.
 * param:  models The binary classification models for the reduction.
 *               The i-th model is produced by testing the i-th class (taking label 1) vs the rest
 *               (taking label 0).
 */
public final class OneVsRestModel extends org.apache.spark.ml.Model<org.apache.spark.ml.classification.OneVsRestModel> implements org.apache.spark.ml.classification.OneVsRestParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link OneVsRestModel} */
  static   class OneVsRestModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   OneVsRestModelWriter (org.apache.spark.ml.classification.OneVsRestModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.OneVsRestModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.OneVsRestModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.classification.Classifier<?, ? extends org.apache.spark.ml.classification.Classifier<java.lang.Object, org.apache.spark.ml.classification.Classifier, org.apache.spark.ml.classification.ClassificationModel>, ? extends org.apache.spark.ml.classification.ClassificationModel<java.lang.Object, org.apache.spark.ml.classification.ClassificationModel>>> classifier ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.Metadata labelMetadata ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.ClassificationModel[] models ()  { throw new RuntimeException(); }
  // not preceding
     OneVsRestModel (java.lang.String uid, org.apache.spark.sql.types.Metadata labelMetadata, org.apache.spark.ml.classification.ClassificationModel[] models)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRestModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
