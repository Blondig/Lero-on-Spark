package org.apache.spark.security;
/**
 * ::DeveloperApi::
 * Hadoop delegation token provider.
 */
public  interface HadoopDelegationTokenProvider {
  /**
   * Returns true if delegation tokens are required for this service. By default, it is based on
   * whether Hadoop security is enabled.
   * @param sparkConf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  ;
  /**
   * Obtain delegation tokens for this service and get the time of the next renewal.
   * @param hadoopConf Configuration of current Hadoop Compatible system.
   * @param creds Credentials to add tokens and security keys to.
   * @return If the returned tokens are renewable and can be renewed, return the time of the next
   *         renewal, otherwise None should be returned.
   * @param sparkConf (undocumented)
   */
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  ;
  /**
   * Name of the service to provide delegation tokens. This name should be unique.  Spark will
   * internally use this name to differentiate delegation token providers.
   * @return (undocumented)
   */
  public  java.lang.String serviceName ()  ;
}
