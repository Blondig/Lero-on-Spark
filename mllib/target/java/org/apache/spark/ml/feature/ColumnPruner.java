package org.apache.spark.ml.feature;
/**
 * Utility transformer for removing temporary columns from a DataFrame.
 * TODO(ekl) make this a public transformer
 */
public  class ColumnPruner extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link ColumnPruner} */
  static   class ColumnPrunerWriter extends org.apache.spark.ml.util.MLWriter {
    public   ColumnPrunerWriter (org.apache.spark.ml.feature.ColumnPruner instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ColumnPruner> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ColumnPruner load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> columnsToPrune ()  { throw new RuntimeException(); }
  // not preceding
  public   ColumnPruner (java.lang.String uid, scala.collection.immutable.Set<java.lang.String> columnsToPrune)  { throw new RuntimeException(); }
  public   ColumnPruner (scala.collection.immutable.Set<java.lang.String> columnsToPrune)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ColumnPruner copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
