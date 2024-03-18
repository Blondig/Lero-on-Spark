package org.apache.spark.deploy.rest;
/**
 * A server that responds to requests submitted by the {@link RestSubmissionClient}.
 * <p>
 * This server responds with different HTTP codes depending on the situation:
 *   200 OK - Request was processed successfully
 *   400 BAD REQUEST - Request was malformed, not successfully validated, or of unexpected type
 *   468 UNKNOWN PROTOCOL VERSION - Request specified a protocol this server does not understand
 *   500 INTERNAL SERVER ERROR - Server throws an exception internally while processing the request
 * <p>
 * The server always includes a JSON representation of the relevant {@link SubmitRestProtocolResponse}
 * in the HTTP body. If an error occurs, however, the server will include an {@link ErrorResponse}
 * instead of the one expected by the client. If the construction of this error response itself
 * fails, the response will consist of an empty body with a response code that indicates internal
 * server error.
 */
 abstract class RestSubmissionServer implements org.apache.spark.internal.Logging {
  static public  java.lang.String PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  static public  int SC_UNKNOWN_PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int requestedPort ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf masterConf ()  { throw new RuntimeException(); }
  // not preceding
  public   RestSubmissionServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.deploy.rest.SubmitRequestServlet submitRequestServlet ()  ;
  protected abstract  org.apache.spark.deploy.rest.KillRequestServlet killRequestServlet ()  ;
  protected abstract  org.apache.spark.deploy.rest.StatusRequestServlet statusRequestServlet ()  ;
  protected  java.lang.String baseContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.rest.RestServlet> contextToServlet ()  { throw new RuntimeException(); }
  /** Start the server and return the bound port. */
  public  int start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
