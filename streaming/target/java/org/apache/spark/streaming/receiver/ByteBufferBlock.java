package org.apache.spark.streaming.receiver;
/** class representing a block received as a ByteBuffer */
  class ByteBufferBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer byteBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ByteBufferBlock (java.nio.ByteBuffer byteBuffer)  { throw new RuntimeException(); }
}
