package org.apache.spark.ui;
/**
 * ConsoleProgressBar shows the progress of stages in the next line of the console. It poll the
 * status of active stages from the app state store periodically, the progress bar will be showed
 * up after the stage has ran at least 500ms. If multiple stages run in the same time, the status
 * of them will be combined together, showed in one line.
 */
  class ConsoleProgressBar implements org.apache.spark.internal.Logging {
  public   ConsoleProgressBar (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Mark all the stages as finished, clear the progress bar if showed, then the progress will not
   * interweave with output of jobs.
   */
  public  void finishAll ()  { throw new RuntimeException(); }
  /**
   * Tear down the timer thread.  The timer thread is a GC root, and it retains the entire
   * SparkContext if it's not terminated.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
