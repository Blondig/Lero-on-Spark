package org.apache.spark.executor;
public  class NonDeserializableTask extends org.apache.spark.scheduler.FakeTask implements java.io.Externalizable {
  static public  java.lang.String errorMsg ()  { throw new RuntimeException(); }
  public   NonDeserializableTask ()  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
}
