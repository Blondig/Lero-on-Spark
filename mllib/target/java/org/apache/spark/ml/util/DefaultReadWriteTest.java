package org.apache.spark.ml.util;
public  interface DefaultReadWriteTest extends org.apache.spark.ml.util.TempDirectory {
  /**
   * Checks "overwrite" option and params.
   * This saves to and loads from {@link tempDir}, but creates a subdirectory with a random name
   * in order to avoid conflicts from multiple calls to this method.
   * <p>
   * @param instance ML instance to test saving/loading
   * @param testParams  If true, then test values of Params.  Otherwise, just test overwrite option.
   * @tparam T ML instance type
   * @return  Instance loaded from file
   */
  public <T extends org.apache.spark.ml.param.Params> T testDefaultReadWrite (T instance, boolean testParams)  ;
  /**
   * Default test for Estimator, Model pairs:
   *  - Explicitly set Params, and train model
   *  - Test save/load using <code>testDefaultReadWrite</code> on Estimator and Model
   *  - Check Params on Estimator and Model
   *  - Compare model data
   * <p>
   * This requires that <code>Model</code>'s <code>Param</code>s should be a subset of <code>Estimator</code>'s <code>Param</code>s.
   * <p>
   * @param estimator  Estimator to test
   * @param dataset  Dataset to pass to <code>Estimator.fit()</code>
   * @param testEstimatorParams  Set of <code>Param</code> values to set in estimator
   * @param testModelParams Set of <code>Param</code> values to set in model
   * @param checkModelData  Method which takes the original and loaded <code>Model</code> and compares their
   *                        data.  This method does not need to check <code>Param</code> values.
   * @tparam E  Type of <code>Estimator</code>
   * @tparam M  Type of <code>Model</code> produced by estimator
   */
  public <E extends org.apache.spark.ml.Estimator<M>, M extends org.apache.spark.ml.Model<M>> void testEstimatorAndModelReadWrite (E estimator, org.apache.spark.sql.Dataset<?> dataset, scala.collection.immutable.Map<java.lang.String, java.lang.Object> testEstimatorParams, scala.collection.immutable.Map<java.lang.String, java.lang.Object> testModelParams, scala.Function2<M, M, scala.runtime.BoxedUnit> checkModelData)  ;
}
