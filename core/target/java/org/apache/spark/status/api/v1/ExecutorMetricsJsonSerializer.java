package org.apache.spark.status.api.v1;
/** serializer for peakMemoryMetrics: convert ExecutorMetrics to map with metric name as key */
  class ExecutorMetricsJsonSerializer extends com.fasterxml.jackson.databind.JsonSerializer<scala.Option<org.apache.spark.executor.ExecutorMetrics>> {
  public   ExecutorMetricsJsonSerializer ()  { throw new RuntimeException(); }
  public  boolean isEmpty (com.fasterxml.jackson.databind.SerializerProvider provider, scala.Option<org.apache.spark.executor.ExecutorMetrics> value)  { throw new RuntimeException(); }
  public  void serialize (scala.Option<org.apache.spark.executor.ExecutorMetrics> metrics, com.fasterxml.jackson.core.JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.SerializerProvider serializerProvider)  { throw new RuntimeException(); }
}
