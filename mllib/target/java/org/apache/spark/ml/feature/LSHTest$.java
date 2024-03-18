package org.apache.spark.ml.feature;
public  class LSHTest$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LSHTest$ MODULE$ = null;
  public   LSHTest$ ()  { throw new RuntimeException(); }
  /**
   * For any locality sensitive function h in a metric space, we need to verify whether
   * the following property is satisfied.
   * <p>
   * There exist dist1, dist2, p1, p2, so that for any two elements e1 and e2,
   * If dist(e1, e2) is less than or equal to dist1, then Pr{h(x) == h(y)} is greater than
   * or equal to p1
   * If dist(e1, e2) is greater than or equal to dist2, then Pr{h(x) == h(y)} is less than
   * or equal to p2
   * <p>
   * This is called locality sensitive property. This method checks the property on an
   * existing dataset and calculate the probabilities.
   * (https://en.wikipedia.org/wiki/Locality-sensitive_hashing#Definition)
   * <p>
   * This method hashes each elements to hash buckets using LSH, and calculate the false positive
   * and false negative:
   * False positive: Of all (e1, e2) sharing any bucket, the probability of dist(e1, e2) is greater
   * than distFP
   * False negative: Of all (e1, e2) not sharing buckets, the probability of dist(e1, e2) is less
   * than distFN
   * <p>
   * @param dataset The dataset to verify the locality sensitive hashing property.
   * @param lsh The lsh instance to perform the hashing
   * @param distFP Distance threshold for false positive
   * @param distFN Distance threshold for false negative
   * @tparam T The class type of lsh
   * @return A tuple of two doubles, representing the false positive and false negative rate
   */
  public <T extends org.apache.spark.ml.feature.LSHModel<T>> scala.Tuple2<java.lang.Object, java.lang.Object> calculateLSHProperty (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.feature.LSH<T> lsh, double distFP, double distFN)  { throw new RuntimeException(); }
  /**
   * Compute the precision and recall of approximate nearest neighbors
   * @param lsh The lsh instance
   * @param dataset the dataset to look for the key
   * @param key The key to hash for the item
   * @param k The maximum number of items closest to the key
   * @param singleProbe True for using single-probe; false for multi-probe
   * @tparam T The class type of lsh
   * @return A tuple of two doubles, representing precision and recall rate
   */
  public <T extends org.apache.spark.ml.feature.LSHModel<T>> scala.Tuple2<java.lang.Object, java.lang.Object> calculateApproxNearestNeighbors (org.apache.spark.ml.feature.LSH<T> lsh, org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int k, boolean singleProbe)  { throw new RuntimeException(); }
  /**
   * Compute the precision and recall of approximate similarity join
   * @param lsh The lsh instance
   * @param datasetA One of the datasets to join
   * @param datasetB Another dataset to join
   * @param threshold The threshold for the distance of record pairs
   * @tparam T The class type of lsh
   * @return A tuple of two doubles, representing precision and recall rate
   */
  public <T extends org.apache.spark.ml.feature.LSHModel<T>> scala.Tuple2<java.lang.Object, java.lang.Object> calculateApproxSimilarityJoin (org.apache.spark.ml.feature.LSH<T> lsh, org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold)  { throw new RuntimeException(); }
}
