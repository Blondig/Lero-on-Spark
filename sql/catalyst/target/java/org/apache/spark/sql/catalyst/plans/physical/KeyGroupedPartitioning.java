package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents a partitioning where rows are split across partitions based on transforms defined
 * by <code>expressions</code>. <code>partitionValuesOpt</code>, if defined, should contain value of partition key(s) in
 * ascending order, after evaluated by the transforms in <code>expressions</code>, for each input partition.
 * In addition, its length must be the same as the number of input partitions (and thus is a 1-1
 * mapping), and each row in <code>partitionValuesOpt</code> must be unique.
 * <p>
 * For example, if <code>expressions</code> is <code>[years(ts_col)]</code>, then a valid value of <code>partitionValuesOpt</code> is
 * <code>[0, 1, 2]</code>, which represents 3 input partitions with distinct partition values. All rows
 * in each partition have the same value for column <code>ts_col</code> (which is of timestamp type), after
 * being applied by the <code>years</code> transform.
 * <p>
 * On the other hand, <code>[0, 0, 1]</code> is not a valid value for <code>partitionValuesOpt</code> since <code>0</code> is
 * duplicated twice.
 * <p>
 * param:  expressions partition expressions for the partitioning.
 * param:  numPartitions the number of partitions
 * param:  partitionValuesOpt if set, the values for the cluster keys of the distribution, must be
 *                           in ascending order.
 */
public  class KeyGroupedPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.plans.physical.KeyGroupedPartitioning apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> partitionValues)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow>> partitionValuesOpt ()  { throw new RuntimeException(); }
  // not preceding
  public   KeyGroupedPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, int numPartitions, scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow>> partitionValuesOpt)  { throw new RuntimeException(); }
  public  boolean satisfies0 (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec createShuffleSpec (org.apache.spark.sql.catalyst.plans.physical.ClusteredDistribution distribution)  { throw new RuntimeException(); }
}
