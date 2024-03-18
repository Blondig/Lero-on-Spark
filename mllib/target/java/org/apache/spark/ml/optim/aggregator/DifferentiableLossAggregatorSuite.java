package org.apache.spark.ml.optim.aggregator;
public  class DifferentiableLossAggregatorSuite extends org.apache.spark.SparkFunSuite {
  /**
   * Dummy aggregator that represents least squares cost with no intercept.
   */
  static public  class TestAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregatorSuite.TestAggregator> {
    public   TestAggregator (int numFeatures, org.apache.spark.ml.linalg.Vector coefficients)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregatorSuite.TestAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
    protected  int dim ()  { throw new RuntimeException(); }
    protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
    protected  double lossSum ()  { throw new RuntimeException(); }
    protected  double weightSum ()  { throw new RuntimeException(); }
  }
  public   DifferentiableLossAggregatorSuite ()  { throw new RuntimeException(); }
}
