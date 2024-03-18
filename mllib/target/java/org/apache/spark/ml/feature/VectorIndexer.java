package org.apache.spark.ml.feature;
/**
 * Class for indexing categorical feature columns in a dataset of <code>Vector</code>.
 * <p>
 * This has 2 usage modes:
 *  - Automatically identify categorical features (default behavior)
 *     - This helps process a dataset of unknown vectors into a dataset with some continuous
 *       features and some categorical features. The choice between continuous and categorical
 *       is based upon a maxCategories parameter.
 *     - Set maxCategories to the maximum number of categorical any categorical feature should have.
 *     - E.g.: Feature 0 has unique values {-1.0, 0.0}, and feature 1 values {1.0, 3.0, 5.0}.
 *       If maxCategories = 2, then feature 0 will be declared categorical and use indices {0, 1},
 *       and feature 1 will be declared continuous.
 *  - Index all features, if all features are categorical
 *     - If maxCategories is set to be very large, then this will build an index of unique
 *       values for all features.
 *     - Warning: This can cause problems if features are continuous since this will collect ALL
 *       unique values to the driver.
 *     - E.g.: Feature 0 has unique values {-1.0, 0.0}, and feature 1 values {1.0, 3.0, 5.0}.
 *       If maxCategories is greater than or equal to 3, then both features will be declared
 *       categorical.
 * <p>
 * This returns a model which can transform categorical features to use 0-based indices.
 * <p>
 * Index stability:
 *  - This is not guaranteed to choose the same category index across multiple runs.
 *  - If a categorical feature includes value 0, then this is guaranteed to map value 0 to index 0.
 *    This maintains vector sparsity.
 *  - More stability may be added in the future.
 * <p>
 * TODO: Future extensions: The following functionality is planned for the future:
 *  - Preserve metadata in transform; if a feature's metadata is already present, do not recompute.
 *  - Specify certain features to not index, either via a parameter or via existing metadata.
 *  - Add warning if a categorical feature has only 1 category.
 */
public  class VectorIndexer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.VectorIndexerModel> implements org.apache.spark.ml.feature.VectorIndexerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorIndexer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam maxCategories ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorIndexer (java.lang.String uid)  { throw new RuntimeException(); }
  public   VectorIndexer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setMaxCategories (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
