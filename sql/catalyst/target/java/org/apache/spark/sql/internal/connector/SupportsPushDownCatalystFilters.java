package org.apache.spark.sql.internal.connector;
/**
 * A mix-in interface for {@link FileScanBuilder}. File sources can implement this interface to
 * push down filters to the file source. The pushed down filters will be separated into partition
 * filters and data filters. Partition filters are used for partition pruning and data filters are
 * used to reduce the size of the data to be read.
 */
public  interface SupportsPushDownCatalystFilters {
  /**
   * Pushes down catalyst Expression filters (which will be separated into partition filters and
   * data filters), and returns data filters that need to be evaluated after scanning.
   * @param filters (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> pushFilters (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  ;
  /**
   * Returns the data filters that are pushed to the data source via
   * {@link #pushFilters(Seq[Expression])}.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.expressions.filter.Predicate[] pushedFilters ()  ;
}
