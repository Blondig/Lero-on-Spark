package org.apache.spark.api.python;
public  class PythonRDDSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public  class ExceptionPythonServer extends org.apache.spark.security.SocketAuthServer<scala.runtime.BoxedUnit> {
    public   ExceptionPythonServer (org.apache.spark.security.SocketAuthHelper authHelper)  { throw new RuntimeException(); }
    public  void handleConnection (java.net.Socket sock)  { throw new RuntimeException(); }
  }
  public   PythonRDDSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.io.File tempDir ()  { throw new RuntimeException(); }
}
