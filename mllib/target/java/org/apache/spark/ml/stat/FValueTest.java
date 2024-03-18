package org.apache.spark.ml.stat;
/**
 * FValue test for continuous data.
 */
public  class FValueTest {
  /**
   * @param dataset  DataFrame of continuous labels and continuous features.
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
   * @param dataset     DataFrame of continuous labels and continuous features.
   * @param featuresCol Name of features column in dataset, of type <code>Vector</code> (<code>VectorUDT</code>)
   * @param labelCol    Name of label column in dataset, of any numerical type
   * @param flatten     If false, the returned DataFrame contains only a single Row, otherwise, one
   *                    row per feature.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.lang.String featuresCol, java.lang.String labelCol, boolean flatten)  { throw new RuntimeException(); }
  /**
   * @param dataset  DataFrame of continuous labels and continuous features.
   * @param featuresCol  Name of features column in dataset, of type <code>Vector</code> (<code>VectorUDT</code>)
   * @param labelCol  Name of label column in dataset, of any numerical type
   * @return RDD containing test result of each feature, one row per feature.
   */
  static   org.apache.spark.rdd.RDD<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>> testRegression (org.apache.spark.sql.Dataset<?> dataset, java.lang.String featuresCol, java.lang.String labelCol)  { throw new RuntimeException(); }
}
