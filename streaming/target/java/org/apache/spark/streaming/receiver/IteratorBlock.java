package org.apache.spark.streaming.receiver;
/** class representing a block received as an Iterator */
  class IteratorBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<?> iterator ()  { throw new RuntimeException(); }
  // not preceding
  public   IteratorBlock (scala.collection.Iterator<?> iterator)  { throw new RuntimeException(); }
}
