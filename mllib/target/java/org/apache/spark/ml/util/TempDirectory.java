package org.apache.spark.ml.util;
/**
 * Trait that creates a temporary directory before all tests and deletes it after all.
 */
public  interface TempDirectory extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  /**
   * Returns the temporary directory as a <code>File</code> instance.
   * @return (undocumented)
   */
  public  java.io.File tempDir ()  ;
}
