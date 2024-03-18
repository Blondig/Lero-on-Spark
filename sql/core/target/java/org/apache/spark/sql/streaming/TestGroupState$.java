package org.apache.spark.sql.streaming;
public  class TestGroupState$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TestGroupState$ MODULE$ = null;
  public   TestGroupState$ ()  { throw new RuntimeException(); }
  /**
   * Creates TestGroupState instances for general testing purposes.
   * <p>
   * @param optionalState         Optional value of the state.
   * @param timeoutConf           Type of timeout configured. Based on this, different operations
   *                              will be supported.
   * @param batchProcessingTimeMs Processing time of current batch, used to calculate timestamp
   *                              for processing time timeouts.
   * @param eventTimeWatermarkMs  Optional value of event time watermark in ms. Set as
   *                              <code>Optional.empty</code> if watermark is not present.
   *                              Otherwise, event time watermark should be a positive long
   *                              and the timestampMs set through <code>setTimeoutTimestamp()</code>
   *                              cannot be less than <code>eventTimeWatermarkMs</code>.
   * @param hasTimedOut           Whether the key for which this state wrapped is being created is
   *                              getting timed out or not.
   * @return a {@link TestGroupState} instance built with the user specified configs.
   */
  public <S extends java.lang.Object> org.apache.spark.sql.streaming.TestGroupState<S> create (org.apache.spark.api.java.Optional<S> optionalState, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, long batchProcessingTimeMs, org.apache.spark.api.java.Optional<java.lang.Object> eventTimeWatermarkMs, boolean hasTimedOut) throws java.lang.IllegalArgumentException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException(); }
}
