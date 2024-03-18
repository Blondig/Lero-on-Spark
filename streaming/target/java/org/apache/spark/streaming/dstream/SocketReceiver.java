package org.apache.spark.streaming.dstream;
  class SocketReceiver<T extends java.lang.Object> extends org.apache.spark.streaming.receiver.Receiver<T> implements org.apache.spark.internal.Logging {
  /**
   * This methods translates the data from an inputstream (say, from a socket)
   * to '\n' delimited strings and returns an iterator to access the strings.
   * @param inputStream (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<java.lang.String> bytesToLines (java.io.InputStream inputStream)  { throw new RuntimeException(); }
  public   SocketReceiver (java.lang.String host, int port, scala.Function1<java.io.InputStream, scala.collection.Iterator<T>> bytesToObjects, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  /** Create a socket connection and receive data until receiver is stopped */
  public  void receive ()  { throw new RuntimeException(); }
}
