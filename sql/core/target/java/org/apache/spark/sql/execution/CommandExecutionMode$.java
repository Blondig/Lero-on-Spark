package org.apache.spark.sql.execution;
/**
 * SPARK-35378: Commands should be executed eagerly so that something like <code>sql("INSERT ...")</code>
 * can trigger the table insertion immediately without a <code>.collect()</code>. To avoid end-less recursion
 * we should use <code>NON_ROOT</code> when recursively executing commands. Note that we can't execute
 * a query plan with leaf command nodes, because many commands return <code>GenericInternalRow</code>
 * and can't be put in a query plan directly, otherwise the query engine may cast
 * <code>GenericInternalRow</code> to <code>UnsafeRow</code> and fail. When running EXPLAIN, or commands inside other
 * command, we should use <code>SKIP</code> to not eagerly trigger the command execution.
 */
public  class CommandExecutionMode$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CommandExecutionMode$ MODULE$ = null;
  public   CommandExecutionMode$ ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value SKIP ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value NON_ROOT ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value ALL ()  { throw new RuntimeException(); }
}
