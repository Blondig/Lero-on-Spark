package org.apache.spark.status.api.v1.streaming;
/**
 * Base class for streaming API handlers, provides easy access to the streaming listener that
 * holds the app's information.
 */
public  interface BaseStreamingAppResource extends org.apache.spark.status.api.v1.BaseAppResource {
  public <T extends java.lang.Object> T withListener (scala.Function1<org.apache.spark.streaming.ui.StreamingJobProgressListener, T> fn)  ;
}
