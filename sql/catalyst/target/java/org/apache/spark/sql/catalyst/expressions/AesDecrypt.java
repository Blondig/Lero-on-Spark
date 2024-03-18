package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that decrypts input using AES. Key lengths of 128, 192 or 256 bits can be used.
 * For versions prior to JDK 8u161, 192 and 256 bits keys can be used
 * if Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files are installed.
 * If either argument is NULL or the key length is not one of the permitted values,
 * the return value is NULL.
 */
public  class AesDecrypt extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression input ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression key ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression mode ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression padding ()  { throw new RuntimeException(); }
  // not preceding
  public   AesDecrypt (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.catalyst.expressions.Expression key, org.apache.spark.sql.catalyst.expressions.Expression mode, org.apache.spark.sql.catalyst.expressions.Expression padding)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public   AesDecrypt (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.catalyst.expressions.Expression key, org.apache.spark.sql.catalyst.expressions.Expression mode)  { throw new RuntimeException(); }
  public   AesDecrypt (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.catalyst.expressions.Expression key)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
