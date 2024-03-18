package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Information about an {@link org.apache.spark.util.AccumulatorV2} modified during a task or stage.
 * <p>
 * param:  id accumulator ID
 * param:  name accumulator name
 * param:  update partial value from a task, may be None if used on driver to describe a stage
 * param:  value total accumulated value so far, maybe None if used on executors to describe a task
 * param:  internal whether this accumulator was internal
 * param:  countFailedValues whether to count this accumulator's partial value if the task failed
 * param:  metadata internal metadata associated with this accumulator, if any
 * <p>
 * @note Once this is JSON serialized the types of <code>update</code> and <code>value</code> will be lost and be
 * cast to strings. This is because the user can define an accumulator of any type and it will
 * be difficult to preserve the type in consumers of the event log. This does not apply to
 * internal accumulators that represent task level metrics.
 */
public  class AccumulableInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  long id ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> update ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> value ()  { throw new RuntimeException(); }
    boolean internal ()  { throw new RuntimeException(); }
    boolean countFailedValues ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> metadata ()  { throw new RuntimeException(); }
  // not preceding
     AccumulableInfo (long id, scala.Option<java.lang.String> name, scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value, boolean internal, boolean countFailedValues, scala.Option<java.lang.String> metadata)  { throw new RuntimeException(); }
}
