package org.apache.spark.ml.classification;
/**
 * Model produced by {@link NaiveBayes}
 * <p>
 * param:  pi    log of class priors, whose dimension is C (number of classes)
 * param:  theta log of class conditional probabilities, whose dimension is C (number of classes)
 *              by D (number of features)
 * param:  sigma variance of each feature, whose dimension is C (number of classes)
 *              by D (number of features). This matrix is only available when modelType
 *              is set Gaussian.
 */
public  class NaiveBayesModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link NaiveBayesModel} */
  static   class NaiveBayesModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   NaiveBayesModelWriter (org.apache.spark.ml.classification.NaiveBayesModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.NaiveBayesModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayesModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam smoothing ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector pi ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix theta ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix sigma ()  { throw new RuntimeException(); }
  // not preceding
     NaiveBayesModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector pi, org.apache.spark.ml.linalg.Matrix theta, org.apache.spark.ml.linalg.Matrix sigma)  { throw new RuntimeException(); }
  /**
   * mllib NaiveBayes is a wrapper of ml implementation currently.
   * Input labels of mllib could be {-1, +1} and mllib NaiveBayesModel exposes labels,
   * both of which are different from ml, so we should store the labels sequentially
   * to be called by mllib. This should be removed when we remove mllib NaiveBayes.
   * @return (undocumented)
   */
    double[] oldLabels ()  { throw new RuntimeException(); }
    org.apache.spark.ml.classification.NaiveBayesModel setOldLabels (double[] labels)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayesModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
