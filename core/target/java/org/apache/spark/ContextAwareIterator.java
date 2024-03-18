package org.apache.spark;
/**
 * :: DeveloperApi ::
 * A TaskContext aware iterator.
 * <p>
 * As the Python evaluation consumes the parent iterator in a separate thread,
 * it could consume more data from the parent even after the task ends and the parent is closed.
 * If an off-heap access exists in the parent iterator, it could cause segmentation fault
 * which crashes the executor.
 * Thus, we should use {@link ContextAwareIterator} to stop consuming after the task ends.
 * <p>
 * @since 3.1.0
 */
public  class ContextAwareIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  // not preceding
  public   ContextAwareIterator (org.apache.spark.TaskContext context, scala.collection.Iterator<T> delegate)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContext context ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> delegate ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  T next ()  { throw new RuntimeException(); }
}
