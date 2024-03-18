package org.apache.spark.ml.feature;
/**
 * A SQL <code>Aggregator</code> used by <code>StringIndexer</code> to count labels in string columns during fitting.
 */
public  class StringIndexerAggregator extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.Row, org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[], org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[]> {
  public   StringIndexerAggregator (int numColumns)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[]> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] finish (org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] array)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] merge (org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] array1, org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] array2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[]> outputEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] reduce (org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] array, org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object>[] zero ()  { throw new RuntimeException(); }
}
