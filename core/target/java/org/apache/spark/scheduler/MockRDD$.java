package org.apache.spark.scheduler;
public  class MockRDD$ extends org.scalatest.Assertions.AssertionsHelper implements org.scalactic.TripleEquals, org.scalatest.Assertions, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MockRDD$ MODULE$ = null;
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  public   MockRDD$ ()  { throw new RuntimeException(); }
  /**
   * make sure all the shuffle dependencies have a consistent number of output partitions
   * and that one-to-one dependencies have the same partition counts as their parents
   * (mostly to make sure the test setup makes sense, not that Spark itself would get this wrong)
   * @param numPartitions (undocumented)
   * @param shuffleDependencies (undocumented)
   * @param oneToOneDependencies (undocumented)
   */
  public  void validate (int numPartitions, scala.collection.Seq<org.apache.spark.ShuffleDependency<?, ?, ?>> shuffleDependencies, scala.collection.Seq<org.apache.spark.OneToOneDependency<?>> oneToOneDependencies)  { throw new RuntimeException(); }
}
