package org.apache.spark;
public  class DummyGroupMappingServiceProvider implements org.apache.spark.security.GroupMappingServiceProvider {
  public   DummyGroupMappingServiceProvider ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String username)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> userGroups ()  { throw new RuntimeException(); }
}
