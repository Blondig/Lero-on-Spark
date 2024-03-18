package org.apache.spark.deploy.rest;
/**
 * A request to launch a new application in the REST application submission protocol.
 */
  class CreateSubmissionRequest extends org.apache.spark.deploy.rest.SubmitRestProtocolRequest {
  public   CreateSubmissionRequest ()  { throw new RuntimeException(); }
  public  java.lang.String[] appArgs ()  { throw new RuntimeException(); }
  public  java.lang.String appResource ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> environmentVariables ()  { throw new RuntimeException(); }
  public  java.lang.String mainClass ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkProperties ()  { throw new RuntimeException(); }
}
