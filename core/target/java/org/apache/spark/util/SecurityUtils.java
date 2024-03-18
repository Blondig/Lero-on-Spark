package org.apache.spark.util;
/**
 * Various utility methods used by Spark Security.
 */
public  class SecurityUtils {
  static public  void setGlobalKrbDebug (boolean enabled)  { throw new RuntimeException(); }
  static public  boolean isGlobalKrbDebugEnabled ()  { throw new RuntimeException(); }
  /**
   * Krb5LoginModule package varies in different JVMs.
   * Please see Hadoop UserGroupInformation for further details.
   * @return (undocumented)
   */
  static public  java.lang.String getKrb5LoginModuleName ()  { throw new RuntimeException(); }
}
