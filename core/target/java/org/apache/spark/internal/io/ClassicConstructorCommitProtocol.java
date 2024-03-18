package org.apache.spark.internal.io;
/**
 * This protocol implementation does not have the new three-arg
 * constructor.
 */
public  class ClassicConstructorCommitProtocol extends org.apache.spark.internal.io.HadoopMapReduceCommitProtocol {
  public   ClassicConstructorCommitProtocol (java.lang.String arg1, java.lang.String arg2)  { throw new RuntimeException(); }
}
