package org.apache.spark.ml.classification;
/**
 * Naive Bayes Classifiers.
 * It supports Multinomial NB
 * (see <a href="http://nlp.stanford.edu/IR-book/html/htmledition/naive-bayes-text-classification-1.html">
 * here</a>)
 * which can handle finitely supported discrete data. For example, by converting documents into
 * TF-IDF vectors, it can be used for document classification. By making every vector a
 * binary (0/1) data, it can also be used as Bernoulli NB
 * (see <a href="http://nlp.stanford.edu/IR-book/html/htmledition/the-bernoulli-model-1.html">
 * here</a>).
 * The input feature values for Multinomial NB and Bernoulli NB must be nonnegative.
 * Since 3.0.0, it supports Complement NB which is an adaptation of the Multinomial NB. Specifically,
 * Complement NB uses statistics from the complement of each class to compute the model's coefficients
 * The inventors of Complement NB show empirically that the parameter estimates for CNB are more stable
 * than those for Multinomial NB. Like Multinomial NB, the input feature values for Complement NB must
 * be nonnegative.
 * Since 3.0.0, it also supports Gaussian NB
 * (see <a href="https://en.wikipedia.org/wiki/Naive_Bayes_classifier#Gaussian_naive_Bayes">
 * here</a>)
 * which can handle continuous data.
 */
public  class NaiveBayes extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.NaiveBayes, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** String name for multinomial model type. */
  static   java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
  static   java.lang.String Bernoulli ()  { throw new RuntimeException(); }
  /** String name for Gaussian model type. */
  static   java.lang.String Gaussian ()  { throw new RuntimeException(); }
  /** String name for Complement model type. */
  static   java.lang.String Complement ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
  static   void requireNonnegativeValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static   void requireZeroOneBernoulliValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayes load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam smoothing ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayes (java.lang.String uid)  { throw new RuntimeException(); }
  public   NaiveBayes ()  { throw new RuntimeException(); }
  /**
   * Set the smoothing parameter.
   * Default is 1.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setSmoothing (double value)  { throw new RuntimeException(); }
  /**
   * Set the model type using a string (case-sensitive).
   * Supported options: "multinomial", "complement", "bernoulli", and "gaussian".
   * Default is "multinomial"
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setModelType (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.NaiveBayesModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * ml assumes input labels in range [0, numClasses). But this implementation
   * is also called by mllib NaiveBayes which allows other kinds of input labels
   * such as {-1, +1}. <code>positiveLabel</code> is used to determine whether the label
   * should be checked and it should be removed when we remove mllib NaiveBayes.
   * @param dataset (undocumented)
   * @param positiveLabel (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.classification.NaiveBayesModel trainWithLabelCheck (org.apache.spark.sql.Dataset<?> dataset, boolean positiveLabel)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayes copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
