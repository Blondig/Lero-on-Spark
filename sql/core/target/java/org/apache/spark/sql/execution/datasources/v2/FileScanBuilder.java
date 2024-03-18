package org.apache.spark.sql.execution.datasources.v2;
public abstract class FileScanBuilder implements org.apache.spark.sql.connector.read.ScanBuilder, org.apache.spark.sql.connector.read.SupportsPushDownRequiredColumns, org.apache.spark.sql.internal.connector.SupportsPushDownCatalystFilters {
  public   FileScanBuilder (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> partitionNameSet ()  { throw new RuntimeException(); }
  public  void pruneColumns (org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.Filter[] pushDataFilters (org.apache.spark.sql.sources.Filter[] dataFilters)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> pushFilters (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.Filter[] pushedDataFilters ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.filter.Predicate[] pushedFilters ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType readDataSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readPartitionSchema ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType requiredSchema ()  { throw new RuntimeException(); }
  protected  boolean supportsNestedSchemaPruning ()  { throw new RuntimeException(); }
}
