package org.apache.spark.util;
/**
 * An {@link OutputStream} that will store the last 10 kilobytes (by default) written to it
 * in a circular buffer. The current contents of the buffer can be accessed using
 * the toString method.
 */
  class CircularBuffer extends java.io.OutputStream {
  public   CircularBuffer (int sizeInBytes)  { throw new RuntimeException(); }
  public  void write (int input)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
