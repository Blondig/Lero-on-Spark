package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Class having information on output operations.
 * param:  batchTime Time of the batch
 * param:  id Id of this output operation. Different output operations have different ids in a batch.
 * param:  name The name of this output operation.
 * param:  description The description of this output operation.
 * param:  startTime Clock time of when the output operation started processing
 * param:  endTime Clock time of when the output operation started processing
 * param:  failureReason Failure reason if this output operation fails
 */
public  class OutputOperationInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> endTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputOperationInfo (org.apache.spark.streaming.Time batchTime, int id, java.lang.String name, java.lang.String description, scala.Option<java.lang.Object> startTime, scala.Option<java.lang.Object> endTime, scala.Option<java.lang.String> failureReason)  { throw new RuntimeException(); }
  /**
   * Return the duration of this output operation.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> duration ()  { throw new RuntimeException(); }
}
