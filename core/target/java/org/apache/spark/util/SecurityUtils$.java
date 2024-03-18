package org.apache.spark.util;
/**
 * Various utility methods used by Spark Security.
 */
public  class SecurityUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SecurityUtils$ MODULE$ = null;
  public   SecurityUtils$ ()  { throw new RuntimeException(); }
  public  void setGlobalKrbDebug (boolean enabled)  { throw new RuntimeException(); }
  public  boolean isGlobalKrbDebugEnabled ()  { throw new RuntimeException(); }
  /**
   * Krb5LoginModule package varies in different JVMs.
   * Please see Hadoop UserGroupInformation for further details.
   * @return (undocumented)
   */
  public  java.lang.String getKrb5LoginModuleName ()  { throw new RuntimeException(); }
}
