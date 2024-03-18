package org.apache.spark.sql.catalyst.plans.physical;
/**
 * This is used in the scenario where an operator has multiple children (e.g., join) and one or more
 * of which have their own requirement regarding whether its data can be considered as
 * co-partitioned from others. This offers APIs for:
 * <p>
 *   - Comparing with specs from other children of the operator and check if they are compatible.
 *      When two specs are compatible, we can say their data are co-partitioned, and Spark will
 *      potentially be able to eliminate shuffle if necessary.
 *   - Creating a partitioning that can be used to re-partition another child, so that to make it
 *      having a compatible partitioning as this node.
 */
public  interface ShuffleSpec {
  /**
   * Whether this shuffle spec can be used to create partitionings for the other children.
   * @return (undocumented)
   */
  public  boolean canCreatePartitioning ()  ;
  /**
   * Creates a partitioning that can be used to re-partition the other side with the given
   * clustering expressions.
   * <p>
   * This will only be called when:
   *  - {@link canCreatePartitioning} returns true.
   *  - {@link isCompatibleWith} returns false on the side where the <code>clustering</code> is from.
   * @param clustering (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  ;
  /**
   * Returns true iff this spec is compatible with the provided shuffle spec.
   * <p>
   * A true return value means that the data partitioning from this spec can be seen as
   * co-partitioned with the <code>other</code>, and therefore no shuffle is required when joining the two
   * sides.
   * <p>
   * Note that Spark assumes this to be reflexive, symmetric and transitive.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  ;
  /**
   * Returns the number of partitions of this shuffle spec
   * @return (undocumented)
   */
  public  int numPartitions ()  ;
}
