package org.apache.spark.ml.classification;
/**
 * Single-label binary or multiclass classifier which can output class conditional probabilities.
 * <p>
 * @param <FeaturesType>   Type of input features.  E.g., <code>Vector</code>
 * @param <E>   Concrete Estimator type
 * @param <M>   Concrete Model type
 */
public abstract class ProbabilisticClassifier<FeaturesType extends java.lang.Object, E extends org.apache.spark.ml.classification.ProbabilisticClassifier<FeaturesType, E, M>, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.classification.Classifier<FeaturesType, E, M> implements org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  public   ProbabilisticClassifier ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  E setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  E setThresholds (double[] value)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassifier), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("E"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
}
