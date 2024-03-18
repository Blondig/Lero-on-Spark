package org.apache.spark.util;
/**
 * Test whether closures passed in through public APIs are actually cleaned.
 * <p>
 * We put a return statement in each of these closures as a mechanism to detect whether the
 * ClosureCleaner actually cleaned our closure. If it did, then it would throw an appropriate
 * exception explicitly complaining about the return statement. Otherwise, we know the
 * ClosureCleaner did not actually clean our closure, in which case we should fail the test.
 */
public  class TestUserClosuresActuallyCleaned$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TestUserClosuresActuallyCleaned$ MODULE$ = null;
  public   TestUserClosuresActuallyCleaned$ ()  { throw new RuntimeException(); }
  public  void testMap (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testFlatMap (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testFilter (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testSortBy (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testKeyBy (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testGroupBy (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testMapPartitions (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testMapPartitionsWithIndex (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testZipPartitions2 (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testZipPartitions3 (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testZipPartitions4 (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testForeach (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testForeachPartition (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testReduce (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testTreeReduce (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testFold (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testAggregate (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testTreeAggregate (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testCombineByKey (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testAggregateByKey (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testFoldByKey (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testReduceByKey (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testReduceByKeyLocally (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testMapValues (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testFlatMapValues (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  public  void testForeachAsync (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testForeachPartitionAsync (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  public  void testRunJob1 (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void testRunJob2 (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void testRunApproximateJob (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void testSubmitJob (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
