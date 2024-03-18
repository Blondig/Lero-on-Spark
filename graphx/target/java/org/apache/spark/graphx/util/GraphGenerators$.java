package org.apache.spark.graphx.util;
/** A collection of graph generating functions. */
public  class GraphGenerators$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GraphGenerators$ MODULE$ = null;
  public   GraphGenerators$ ()  { throw new RuntimeException(); }
  public  double RMATa ()  { throw new RuntimeException(); }
  public  double RMATb ()  { throw new RuntimeException(); }
  public  double RMATd ()  { throw new RuntimeException(); }
  /**
   * Generate a graph whose vertex out degree distribution is log normal.
   * <p>
   * The default values for mu and sigma are taken from the Pregel paper:
   * <p>
   * Grzegorz Malewicz, Matthew H. Austern, Aart J.C Bik, James C. Dehnert,
   * Ilan Horn, Naty Leiser, and Grzegorz Czajkowski. 2010.
   * Pregel: a system for large-scale graph processing. SIGMOD '10.
   * <p>
   * If the seed is -1 (default), a random seed is chosen. Otherwise, use
   * the user-specified seed.
   * <p>
   * @param sc Spark Context
   * @param numVertices number of vertices in generated graph
   * @param numEParts (optional) number of partitions
   * @param mu (optional, default: 4.0) mean of out-degree distribution
   * @param sigma (optional, default: 1.3) standard deviation of out-degree distribution
   * @param seed (optional, default: -1) seed for RNGs, -1 causes a random seed to be chosen
   * @return Graph object
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> logNormalGraph (org.apache.spark.SparkContext sc, int numVertices, int numEParts, double mu, double sigma, long seed)  { throw new RuntimeException(); }
  public  double RMATc ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Edge<java.lang.Object>[] generateRandomEdges (int src, int numEdges, int maxVertexId, long seed)  { throw new RuntimeException(); }
  /**
   * Randomly samples from the given mean and standard deviation of the normal distribution.
   * It uses the formula <code>X = exp(mu+sigma*Z)</code> where <code>mu</code>,
   * <code>sigma</code> are the mean, standard deviation of the normal distribution and
   * <code>Z ~ N(0, 1)</code>.
   * <p>
   * @param mu the mean of the normal distribution
   * @param sigma the standard deviation of the normal distribution
   * @param maxVal exclusive upper bound on the value of the sample
   * @param seed optional seed
   * @return (undocumented)
   */
    int sampleLogNormal (double mu, double sigma, int maxVal, long seed)  { throw new RuntimeException(); }
  /**
   * A random graph generator using the R-MAT model, proposed in
   * "R-MAT: A Recursive Model for Graph Mining" by Chakrabarti et al.
   * <p>
   * See http://www.cs.cmu.edu/~christos/PUBLICATIONS/siam04.pdf.
   * @param sc (undocumented)
   * @param requestedNumVertices (undocumented)
   * @param numEdges (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> rmatGraph (org.apache.spark.SparkContext sc, int requestedNumVertices, int numEdges)  { throw new RuntimeException(); }
  /**
   * Create <code>rows</code> by <code>cols</code> grid graph with each vertex connected to its
   * row+1 and col+1 neighbors.  Vertex ids are assigned in row major
   * order.
   * <p>
   * @param sc the spark context in which to construct the graph
   * @param rows the number of rows
   * @param cols the number of columns
   * <p>
   * @return A graph containing vertices with the row and column ids
   * as their attributes and edge values as 1.0.
   */
  public  org.apache.spark.graphx.Graph<scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Object> gridGraph (org.apache.spark.SparkContext sc, int rows, int cols)  { throw new RuntimeException(); }
  /**
   * Create a star graph with vertex 0 being the center.
   * <p>
   * @param sc the spark context in which to construct the graph
   * @param nverts the number of vertices in the star
   * <p>
   * @return A star graph containing <code>nverts</code> vertices with vertex 0
   * being the center vertex.
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> starGraph (org.apache.spark.SparkContext sc, int nverts)  { throw new RuntimeException(); }
}
