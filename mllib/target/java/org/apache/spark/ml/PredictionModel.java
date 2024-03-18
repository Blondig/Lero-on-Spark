package org.apache.spark.ml;
/**
 * Abstraction for a model for prediction tasks (regression and classification).
 * <p>
 * @param <FeaturesType>   Type of features.
 *                       E.g., <code>VectorUDT</code> for vector features.
 * @param <M>   Specialization of {@link PredictionModel}.  If you subclass this type, use this type
 *            parameter to specify the concrete type for the corresponding model.
 */
public abstract class PredictionModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.PredictionModel<FeaturesType, M>> extends org.apache.spark.ml.Model<M> implements org.apache.spark.ml.PredictorParams {
  public   PredictionModel ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  /**
   * Returns the SQL DataType corresponding to the FeaturesType type parameter.
   * <p>
   * This is used by <code>validateAndTransformSchema()</code>.
   * This workaround is needed since SQL has different APIs for Scala and Java.
   * <p>
   * The default value is VectorUDT, but it may be overridden if FeaturesType is not Vector.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  /** Returns the number of features the model was trained on. If unknown, returns -1 */
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This method is used to implement <code>transform()</code> and output {@link predictionCol}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public abstract  double predict (FeaturesType features)  ;
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.PredictionModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, calling <code>predict</code>, and storing
   * the predictions as a new column {@link predictionCol}.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset with {@link predictionCol} of type <code>Double</code>
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
