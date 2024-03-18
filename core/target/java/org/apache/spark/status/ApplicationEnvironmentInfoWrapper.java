package org.apache.spark.status;
  class ApplicationEnvironmentInfoWrapper {
  // not preceding
  public   ApplicationEnvironmentInfoWrapper (org.apache.spark.status.api.v1.ApplicationEnvironmentInfo info)  { throw new RuntimeException(); }
  /**
   * There's always a single ApplicationEnvironmentInfo object per application, so this
   * ID doesn't need to be dynamic. But the KVStore API requires an ID.
   * @return (undocumented)
   */
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationEnvironmentInfo info ()  { throw new RuntimeException(); }
}
