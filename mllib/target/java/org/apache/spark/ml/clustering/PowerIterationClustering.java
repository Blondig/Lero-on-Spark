package org.apache.spark.ml.clustering;
/**
 * Power Iteration Clustering (PIC), a scalable graph clustering algorithm developed by
 * <a href=http://www.cs.cmu.edu/~frank/papers/icml2010-pic-final.pdf>Lin and Cohen</a>. From
 * the abstract: PIC finds a very low-dimensional embedding of a dataset using truncated power
 * iteration on a normalized pair-wise similarity matrix of the data.
 * <p>
 * This class is not yet an Estimator/Transformer, use <code>assignClusters</code> method to run the
 * PowerIterationClustering algorithm.
 * <p>
 * @see <a href=http://en.wikipedia.org/wiki/Spectral_clustering>
 * Spectral clustering (Wikipedia)</a>
 */
public  class PowerIterationClustering implements org.apache.spark.ml.clustering.PowerIterationClusteringParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.clustering.PowerIterationClustering load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> initMode ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> srcCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> dstCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     PowerIterationClustering (java.lang.String uid)  { throw new RuntimeException(); }
  public   PowerIterationClustering ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setK (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setInitMode (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setSrcCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setDstCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.PowerIterationClustering setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Run the PIC algorithm and returns a cluster assignment for each input vertex.
   * <p>
   * @param dataset A dataset with columns src, dst, weight representing the affinity matrix,
   *                which is the matrix A in the PIC paper. Suppose the src column value is i,
   *                the dst column value is j, the weight column value is similarity s,,ij,,
   *                which must be nonnegative. This is a symmetric matrix and hence
   *                s,,ij,, = s,,ji,,. For any (i, j) with nonzero similarity, there should be
   *                either (i, j, s,,ij,,) or (j, i, s,,ji,,) in the input. Rows with i = j are
   *                ignored, because we assume s,,ij,, = 0.0.
   * <p>
   * @return A dataset that contains columns of vertex id and the corresponding cluster for the id.
   *         The schema of it will be:
   *          - id: Long
   *          - cluster: Int
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> assignClusters (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.PowerIterationClustering copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
