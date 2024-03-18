package org.apache.spark.ml;
public  class PipelineSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext, org.apache.spark.ml.util.DefaultReadWriteTest {
  public abstract class MyModel extends org.apache.spark.ml.Model<org.apache.spark.ml.PipelineSuite.MyModel> {
    public   MyModel ()  { throw new RuntimeException(); }
  }
  public   PipelineSuite ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
}
