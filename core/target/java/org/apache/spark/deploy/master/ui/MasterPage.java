package org.apache.spark.deploy.master.ui;
  class MasterPage extends org.apache.spark.ui.WebUIPage {
  public   MasterPage (org.apache.spark.deploy.master.ui.MasterWebUI parent)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.DeployMessages.MasterStateResponse getMasterState ()  { throw new RuntimeException(); }
  public  void handleAppKillRequest (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  void handleDriverKillRequest (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  /** Index view listing applications and executors */
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
