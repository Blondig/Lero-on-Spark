package org.apache.spark.deploy.rest;
/**
 * A servlet for handling submit requests passed to the {@link StandaloneRestServer}.
 */
  class StandaloneSubmitRequestServlet extends org.apache.spark.deploy.rest.SubmitRequestServlet {
  public   StandaloneSubmitRequestServlet (org.apache.spark.rpc.RpcEndpointRef masterEndpoint, java.lang.String masterUrl, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Handle the submit request and construct an appropriate response to return to the client.
   * <p>
   * This assumes that the request message is already successfully validated.
   * If the request message is not of the expected type, return error to the client.
   * @param requestMessageJson (undocumented)
   * @param requestMessage (undocumented)
   * @param responseServlet (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.deploy.rest.SubmitRestProtocolResponse handleSubmit (java.lang.String requestMessageJson, org.apache.spark.deploy.rest.SubmitRestProtocolMessage requestMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
}
