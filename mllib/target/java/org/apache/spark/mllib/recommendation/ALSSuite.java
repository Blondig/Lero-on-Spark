package org.apache.spark.mllib.recommendation;
public  class ALSSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  scala.Tuple3<java.util.List<org.apache.spark.mllib.recommendation.Rating>, double[], double[]> generateRatingsAsJava (int users, int products, int features, double samplingRate, boolean implicitPrefs, boolean negativeWeights)  { throw new RuntimeException(); }
  static public  scala.Tuple3<scala.collection.Seq<org.apache.spark.mllib.recommendation.Rating>, breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>> generateRatings (int users, int products, int features, double samplingRate, boolean implicitPrefs, boolean negativeWeights, boolean negativeFactors)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   ALSSuite ()  { throw new RuntimeException(); }
  /**
   * Test if we can correctly factorize R = U * P where U and P are of known rank.
   * <p>
   * @param users number of users
   * @param products number of products
   * @param features number of features (rank of problem)
   * @param iterations number of iterations to run
   * @param samplingRate what fraction of the user-product pairs are known
   * @param matchThreshold max difference allowed to consider a predicted rating correct
   * @param implicitPrefs flag to test implicit feedback
   * @param bulkPredict flag to test bulk prediction
   * @param negativeWeights whether the generated data can contain negative values
   * @param numUserBlocks number of user blocks to partition users into
   * @param numProductBlocks number of product blocks to partition products into
   * @param negativeFactors whether the generated user/product factors can have negative entries
   */
  public  void testALS (int users, int products, int features, int iterations, double samplingRate, double matchThreshold, boolean implicitPrefs, boolean bulkPredict, boolean negativeWeights, int numUserBlocks, int numProductBlocks, boolean negativeFactors)  { throw new RuntimeException(); }
}
