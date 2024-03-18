package org.apache.spark.util;
/**
 * A wrapper around a java.nio.ByteBuffer that is serializable through Java serialization, to make
 * it easier to pass ByteBuffers in case class messages.
 */
  class SerializableBuffer implements scala.Serializable {
  // not preceding
  public   SerializableBuffer (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer buffer ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer value ()  { throw new RuntimeException(); }
}
