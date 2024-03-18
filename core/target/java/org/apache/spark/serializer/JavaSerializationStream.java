package org.apache.spark.serializer;
  class JavaSerializationStream extends org.apache.spark.serializer.SerializationStream {
  public   JavaSerializationStream (java.io.OutputStream out, int counterReset, boolean extraDebugInfo)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  /**
   * Calling reset to avoid memory leak:
   * http://stackoverflow.com/questions/1281549/memory-leak-traps-in-the-java-standard-api
   * But only call it every 100th time to avoid bloated serialization streams (when
   * the stream 'resets' object class descriptions have to be re-written)
   * @param t (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeObject (T t, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
