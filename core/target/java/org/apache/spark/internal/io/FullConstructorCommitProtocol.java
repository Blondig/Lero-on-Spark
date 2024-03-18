package org.apache.spark.internal.io;
/**
 * This protocol implementation does have the new three-arg constructor
 * alongside the original, and a 4 arg one for completeness.
 * The final value of the real constructor is the number of arguments
 * used in the 2- and 3- constructor, for test assertions.
 */
public  class FullConstructorCommitProtocol extends org.apache.spark.internal.io.HadoopMapReduceCommitProtocol {
  // not preceding
  public   FullConstructorCommitProtocol (java.lang.String arg1, java.lang.String arg2, boolean b, int argCount)  { throw new RuntimeException(); }
  public   FullConstructorCommitProtocol (java.lang.String arg1, java.lang.String arg2)  { throw new RuntimeException(); }
  public   FullConstructorCommitProtocol (java.lang.String arg1, java.lang.String arg2, boolean b)  { throw new RuntimeException(); }
  public  int argCount ()  { throw new RuntimeException(); }
}
