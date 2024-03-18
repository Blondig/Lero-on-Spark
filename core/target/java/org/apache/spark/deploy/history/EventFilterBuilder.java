package org.apache.spark.deploy.history;
/**
 * EventFilterBuilder provides the interface to gather the information from events being received
 * by {@link SparkListenerInterface}, and create a new {@link EventFilter} instance which leverages
 * information gathered to decide whether the event should be accepted or not.
 */
public  interface EventFilterBuilder extends org.apache.spark.scheduler.SparkListenerInterface {
  public  org.apache.spark.deploy.history.EventFilter createFilter ()  ;
}
