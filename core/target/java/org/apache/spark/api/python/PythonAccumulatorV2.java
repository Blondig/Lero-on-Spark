package org.apache.spark.api.python;
/**
 * Internal class that acts as an <code>AccumulatorV2</code> for Python accumulators. Inside, it
 * collects a list of pickled strings that we pass to Python through a socket.
 */
  class PythonAccumulatorV2 extends org.apache.spark.util.CollectionAccumulator<byte[]> implements org.apache.spark.internal.Logging {
  // not preceding
  public   PythonAccumulatorV2 (java.lang.String serverHost, int serverPort, java.lang.String secretToken)  { throw new RuntimeException(); }
  public  int bufferSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.python.PythonAccumulatorV2 copyAndReset ()  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<byte[], java.util.List<byte[]>> other)  { throw new RuntimeException(); }
}
