package org.apache.spark.ml.recommendation;
/**
 * Model fitted by ALS.
 * <p>
 * param:  rank rank of the matrix factorization model
 * param:  userFactors a DataFrame that stores user factors in two columns: <code>id</code> and <code>features</code>
 * param:  itemFactors a DataFrame that stores item factors in two columns: <code>id</code> and <code>features</code>
 */
public  class ALSModel extends org.apache.spark.ml.Model<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSModelParams, org.apache.spark.ml.util.MLWritable {
  static   class ALSModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ALSModelWriter (org.apache.spark.ml.recommendation.ALSModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static  final  java.lang.String[] supportedColdStartStrategies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.recommendation.ALSModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.recommendation.ALSModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> coldStartStrategy ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam blockSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int rank ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> userFactors ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> itemFactors ()  { throw new RuntimeException(); }
  // not preceding
     ALSModel (java.lang.String uid, int rank, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> userFactors, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> itemFactors)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setUserCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setItemCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALSModel setColdStartStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set block size for stacking input data in matrices.
   * Default is 4096.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALSModel setBlockSize (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Returns top <code>numItems</code> items recommended for each user, for all users.
   * @param numItems max number of recommendations for each user
   * @return a DataFrame of (userCol: Int, recommendations), where recommendations are
   *         stored as an array of (itemCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForAllUsers (int numItems)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numItems</code> items recommended for each user id in the input data set. Note that if
   * there are duplicate ids in the input dataset, only one set of recommendations per unique id
   * will be returned.
   * @param dataset a Dataset containing a column of user ids. The column name must match <code>userCol</code>.
   * @param numItems max number of recommendations for each user.
   * @return a DataFrame of (userCol: Int, recommendations), where recommendations are
   *         stored as an array of (itemCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForUserSubset (org.apache.spark.sql.Dataset<?> dataset, int numItems)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numUsers</code> users recommended for each item, for all items.
   * @param numUsers max number of recommendations for each item
   * @return a DataFrame of (itemCol: Int, recommendations), where recommendations are
   *         stored as an array of (userCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForAllItems (int numUsers)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numUsers</code> users recommended for each item id in the input data set. Note that if
   * there are duplicate ids in the input dataset, only one set of recommendations per unique id
   * will be returned.
   * @param dataset a Dataset containing a column of item ids. The column name must match <code>itemCol</code>.
   * @param numUsers max number of recommendations for each item.
   * @return a DataFrame of (itemCol: Int, recommendations), where recommendations are
   *         stored as an array of (userCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForItemSubset (org.apache.spark.sql.Dataset<?> dataset, int numUsers)  { throw new RuntimeException(); }
}
