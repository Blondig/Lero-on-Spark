package org.apache.spark.streaming.scheduler;
  class RegisterReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String typ ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef receiverEndpoint ()  { throw new RuntimeException(); }
  // not preceding
  public   RegisterReceiver (int streamId, java.lang.String typ, java.lang.String host, java.lang.String executorId, org.apache.spark.rpc.RpcEndpointRef receiverEndpoint)  { throw new RuntimeException(); }
}
