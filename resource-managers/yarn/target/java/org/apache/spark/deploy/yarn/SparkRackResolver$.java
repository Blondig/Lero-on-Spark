package org.apache.spark.deploy.yarn;
/**
 * Utility to resolve the rack for hosts in an efficient manner.
 * It will cache the rack for individual hosts to avoid
 * repeatedly performing the same expensive lookup.
 */
public  class SparkRackResolver$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkRackResolver$ MODULE$ = null;
  public   SparkRackResolver$ ()  { throw new RuntimeException(); }
  /**
   * It will return the static resolver instance.  If there is already an instance, the passed
   * conf is entirely ignored.  If there is not a shared instance, it will create one with the
   * given conf.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.yarn.SparkRackResolver get (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
