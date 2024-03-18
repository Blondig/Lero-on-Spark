package org.apache.spark.streaming.receiver;
/** class representing a block received as an ArrayBuffer */
  class ArrayBufferBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<?> arrayBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ArrayBufferBlock (scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
}
