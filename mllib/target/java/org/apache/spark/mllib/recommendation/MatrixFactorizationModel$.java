package org.apache.spark.mllib.recommendation;
public  class MatrixFactorizationModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.recommendation.MatrixFactorizationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MatrixFactorizationModel$ MODULE$ = null;
  public   MatrixFactorizationModel$ ()  { throw new RuntimeException(); }
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by <code>Saveable.save</code>.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
