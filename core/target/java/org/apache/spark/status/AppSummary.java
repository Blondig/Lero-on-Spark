package org.apache.spark.status;
/**
 * A class with information about an app, to be used by the UI. There's only one instance of
 * this summary per application, so its ID in the store is the class name.
 */
  class AppSummary {
  // not preceding
  public   AppSummary (int numCompletedJobs, int numCompletedStages)  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  int numCompletedJobs ()  { throw new RuntimeException(); }
  public  int numCompletedStages ()  { throw new RuntimeException(); }
}
