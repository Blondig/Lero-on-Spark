package org.apache.spark;
/**
 * An abstract base class for context cleaner tests, which sets up a context with a config
 * suitable for cleaner tests and provides some utility functions. Subclasses can use different
 * config options, in particular, a different shuffle manager class
 */
public abstract class ContextCleanerSuiteBase extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> shuffleManager ()  { throw new RuntimeException(); }
  // not preceding
  public   ContextCleanerSuiteBase (java.lang.Class<?> shuffleManager)  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout defaultTimeout ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.Object> newRDD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> newPairRDD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> newShuffleRDD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Range.Inclusive> newBroadcast ()  { throw new RuntimeException(); }
  protected  scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>>, scala.collection.Seq<org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, java.lang.Object>>> newRDDWithShuffleDependencies ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<?> randomRdd ()  { throw new RuntimeException(); }
  /** Run GC and make sure it actually has run */
  protected  void runGC ()  { throw new RuntimeException(); }
  protected  org.apache.spark.ContextCleaner cleaner ()  { throw new RuntimeException(); }
}
