package org.apache.spark.deploy.rest;
/**
 * A {@link StandaloneRestServer} that is faulty in many ways.
 * <p>
 * When handling a submit request, the server returns a malformed JSON.
 * When handling a kill request, the server returns an invalid JSON.
 * When handling a status request, the server throws an internal exception.
 * The purpose of this class is to test that client handles these cases gracefully.
 */
public  class FaultyStandaloneRestServer extends org.apache.spark.deploy.rest.RestSubmissionServer {
  /** A faulty servlet that produces malformed responses. */
  public  class MalformedSubmitServlet extends org.apache.spark.deploy.rest.StandaloneSubmitRequestServlet {
    public   MalformedSubmitServlet ()  { throw new RuntimeException(); }
    protected  void sendResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse responseMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
  }
  /** A faulty servlet that produces invalid responses. */
  public  class InvalidKillServlet extends org.apache.spark.deploy.rest.StandaloneKillRequestServlet {
    public   InvalidKillServlet ()  { throw new RuntimeException(); }
    protected  org.apache.spark.deploy.rest.KillSubmissionResponse handleKill (java.lang.String submissionId)  { throw new RuntimeException(); }
  }
  /** A faulty status servlet that explodes. */
  public  class ExplodingStatusServlet extends org.apache.spark.deploy.rest.StandaloneStatusRequestServlet {
    public   ExplodingStatusServlet ()  { throw new RuntimeException(); }
    protected  org.apache.spark.deploy.rest.SubmissionStatusResponse handleStatus (java.lang.String submissionId)  { throw new RuntimeException(); }
  }
  // not preceding
  public   FaultyStandaloneRestServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf, org.apache.spark.rpc.RpcEndpointRef masterEndpoint, java.lang.String masterUrl)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.InvalidKillServlet killRequestServlet ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.ExplodingStatusServlet statusRequestServlet ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.MalformedSubmitServlet submitRequestServlet ()  { throw new RuntimeException(); }
}
