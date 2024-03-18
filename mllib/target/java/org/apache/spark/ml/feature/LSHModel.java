package org.apache.spark.ml.feature;
/**
 * Model produced by {@link LSH}.
 */
 abstract class LSHModel<T extends org.apache.spark.ml.feature.LSHModel<T>> extends org.apache.spark.ml.Model<T> implements org.apache.spark.ml.feature.LSHParams, org.apache.spark.ml.util.MLWritable {
  public   LSHModel ()  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, boolean singleProbe, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Given a large dataset and an item, approximately find at most k items which have the closest
   * distance to the item. If the {@link outputCol} is missing, the method will transform the data; if
   * the {@link outputCol} exists, it will use the {@link outputCol}. This allows caching of the
   * transformed data when necessary.
   * <p>
   * @note This method is experimental and will likely change behavior in the next release.
   * <p>
   * @param dataset The dataset to search for nearest neighbors of the key.
   * @param key Feature vector representing the item to search for.
   * @param numNearestNeighbors The maximum number of nearest neighbors.
   * @param distCol Output column for storing the distance between each result row and the key.
   * @return A dataset containing at most k items closest to the key. A column "distCol" is added
   *         to show the distance between each row and the key.
   */
  public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Overloaded method for approxNearestNeighbors. Use "distCol" as default distCol.
   * @param dataset (undocumented)
   * @param key (undocumented)
   * @param numNearestNeighbors (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors)  { throw new RuntimeException(); }
  /**
   * Join two datasets to approximately find all pairs of rows whose distance are smaller than
   * the threshold. If the {@link outputCol} is missing, the method will transform the data; if the
   * {@link outputCol} exists, it will use the {@link outputCol}. This allows caching of the transformed
   * data when necessary.
   * <p>
   * @param datasetA One of the datasets to join.
   * @param datasetB Another dataset to join.
   * @param threshold The threshold for the distance of row pairs.
   * @param distCol Output column for storing the distance between each pair of rows.
   * @return A joined dataset containing pairs of rows. The original rows are in columns
   *         "datasetA" and "datasetB", and a column "distCol" is added to show the distance
   *         between each pair.
   */
  public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Overloaded method for approxSimilarityJoin. Use "distCol" as default distCol.
   * @param datasetA (undocumented)
   * @param datasetB (undocumented)
   * @param threshold (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold)  { throw new RuntimeException(); }
  /**
   * Calculate the distance between two different hash Vectors.
   * <p>
   * @param x One of the hash vector.
   * @param y Another hash vector.
   * @return The distance between hash vectors x and y.
   */
  protected abstract  double hashDistance (org.apache.spark.ml.linalg.Vector[] x, org.apache.spark.ml.linalg.Vector[] y)  ;
  /**
   * The hash function of LSH, mapping an input feature vector to multiple hash vectors.
   * @return The mapping of LSH function.
   * @param elems (undocumented)
   */
  protected abstract  org.apache.spark.ml.linalg.Vector[] hashFunction (org.apache.spark.ml.linalg.Vector elems)  ;
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  /**
   * Calculate the distance between two different keys using the distance metric corresponding
   * to the hashFunction.
   * @param x One input vector in the metric space.
   * @param y One input vector in the metric space.
   * @return The distance between x and y.
   */
  protected abstract  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  ;
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.LSHModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public final  org.apache.spark.ml.param.IntParam numHashTables ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSHModel<T> setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSHModel<T> setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
