package org.apache.spark.deploy;
public  class ExecutorState$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorState$ MODULE$ = null;
  public   ExecutorState$ ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value LAUNCHING ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value RUNNING ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value KILLED ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value FAILED ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value LOST ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value EXITED ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value DECOMMISSIONED ()  { throw new RuntimeException(); }
  public  boolean isFinished (scala.Enumeration.Value state)  { throw new RuntimeException(); }
}
