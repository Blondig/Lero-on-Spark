package org.apache.spark.internal.io;
/**
 * The specification for Spark output file name.
 * This is used by {@link FileCommitProtocol} to create full path of file.
 * <p>
 * param:  prefix Prefix of file.
 * param:  suffix Suffix of file.
 */
public final class FileNameSpec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String prefix ()  { throw new RuntimeException(); }
  public  java.lang.String suffix ()  { throw new RuntimeException(); }
  // not preceding
  public   FileNameSpec (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
}
