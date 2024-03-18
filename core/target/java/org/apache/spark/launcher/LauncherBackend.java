package org.apache.spark.launcher;
/**
 * A class that can be used to talk to a launcher server. Users should extend this class to
 * provide implementation for the abstract methods.
 * <p>
 * See <code>LauncherServer</code> for an explanation of how launcher communication works.
 */
 abstract class LauncherBackend {
  static public  java.util.concurrent.ThreadFactory threadFactory ()  { throw new RuntimeException(); }
  public   LauncherBackend ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.SparkConf conf ()  ;
  public  void connect ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void setAppId (java.lang.String appId)  { throw new RuntimeException(); }
  public  void setState (org.apache.spark.launcher.SparkAppHandle.State state)  { throw new RuntimeException(); }
  /** Return whether the launcher handle is still connected to this backend. */
  public  boolean isConnected ()  { throw new RuntimeException(); }
  /**
   * Implementations should provide this method, which should try to stop the application
   * as gracefully as possible.
   */
  protected abstract  void onStopRequest ()  ;
  /**
   * Callback for when the launcher handle disconnects from this backend.
   */
  protected  void onDisconnected ()  { throw new RuntimeException(); }
}
