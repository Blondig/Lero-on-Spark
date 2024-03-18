package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Exception thrown when a task is explicitly killed (i.e., task failure is expected).
 */
public  class TaskKilledException extends java.lang.RuntimeException {
  // not preceding
  public   TaskKilledException (java.lang.String reason)  { throw new RuntimeException(); }
  public   TaskKilledException ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
}
