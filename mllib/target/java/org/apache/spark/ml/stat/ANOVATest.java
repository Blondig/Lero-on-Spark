package org.apache.spark.ml.stat;
/**
 * ANOVA Test for continuous data.
 * <p>
 * See <a href="https://en.wikipedia.org/wiki/Analysis_of_variance">Wikipedia</a> for more
 * information on ANOVA test.
 */
public  class ANOVATest {
  /**
   * @param dataset  DataFrame of categorical labels and continuous features.
   * @param featuresCol  Name of features column in dataset, of type <code>Vector</code> (<code>VectorUDT</code>)
   * @param labelCol  Name of label column in dataset, of any numerical type
   * @return DataFrame containing the test result for every feature against the label.
   *         This DataFrame will contain a single Row with the following fields:
   *          - <code>pValues: Vector</code>
   *          - <code>degreesOfFreedom: Array[Long]</code>
   *          - <code>fValues: Vector</code>
   *         Each of these fields has one value per feature.
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.lang.String featuresCol, java.lang.String labelCol)  { throw new RuntimeException(); }
  /**
   * @param dataset  DataFrame of categorical labels and continuous features.
   * @param featuresCol  Name of features column in dataset, of type <code>Vector</code> (<code>VectorUDT</code>)
   * @param labelCol  Name of label column in dataset, of any numerical type
   * @param flatten  If false, the returned DataFrame contains only a single Row, otherwise, one
   *                 row per feature.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.lang.String featuresCol, java.lang.String labelCol, boolean flatten)  { throw new RuntimeException(); }
  /**
   * @param dataset  DataFrame of categorical labels and continuous features.
   * @param featuresCol  Name of features column in dataset, of type <code>Vector</code> (<code>VectorUDT</code>)
   * @param labelCol  Name of label column in dataset, of any numerical type
   * @return (undocumented)
   */
  static   org.apache.spark.rdd.RDD<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>> testClassification (org.apache.spark.sql.Dataset<?> dataset, java.lang.String featuresCol, java.lang.String labelCol)  { throw new RuntimeException(); }
}
