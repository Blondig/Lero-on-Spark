package org.apache.spark.deploy.rest;
public  class RestSubmissionClient$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RestSubmissionClient$ MODULE$ = null;
  public   RestSubmissionClient$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> supportedMasterPrefixes ()  { throw new RuntimeException(); }
  public  java.lang.String PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  /**
   * Filter non-spark environment variables from any environment.
   * @param env (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.String, java.lang.String> filterSystemEnvironment (scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
    boolean supportsRestClient (java.lang.String master)  { throw new RuntimeException(); }
}
