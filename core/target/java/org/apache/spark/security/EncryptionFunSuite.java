package org.apache.spark.security;
public  interface EncryptionFunSuite {
  /**
   * Runs a test twice, initializing a SparkConf object with encryption off, then on. It's ok
   * for the test to modify the provided SparkConf.
   * @param name (undocumented)
   * @param fn (undocumented)
   */
  public  void encryptionTest (java.lang.String name, scala.Function1<org.apache.spark.SparkConf, scala.runtime.BoxedUnit> fn)  ;
  public  void encryptionTestHelper (java.lang.String name, scala.Function2<java.lang.String, org.apache.spark.SparkConf, scala.runtime.BoxedUnit> fn)  ;
}
