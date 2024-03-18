package org.apache.spark;
public  class NonSerializableUserException extends java.lang.RuntimeException {
  public   NonSerializableUserException ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.NonSerializable nonSerializableInstanceVariable ()  { throw new RuntimeException(); }
}
