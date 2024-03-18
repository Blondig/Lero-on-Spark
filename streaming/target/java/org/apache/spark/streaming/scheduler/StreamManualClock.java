package org.apache.spark.streaming.scheduler;
/**
 * A special manual clock that provide <code>isStreamWaitingAt</code> to allow the user to check if the clock
 * is blocking.
 */
public  class StreamManualClock extends org.apache.spark.util.ManualClock implements scala.Serializable {
  public   StreamManualClock (long time)  { throw new RuntimeException(); }
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
  /**
   * Returns if the clock is blocking and the time it started to block is the parameter <code>time</code>.
   * @param time (undocumented)
   * @return (undocumented)
   */
  public  boolean isStreamWaitingAt (long time)  { throw new RuntimeException(); }
}
