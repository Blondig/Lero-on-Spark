package org.apache.spark.rpc.netty;
public  interface OutboxMessage {
  public  void onFailure (java.lang.Throwable e)  ;
  public  void sendWith (org.apache.spark.network.client.TransportClient client)  ;
}
