package org.apache.spark.sql.hive.thriftserver;
public  interface FetchIterator<A extends java.lang.Object> extends scala.collection.Iterator<A> {
  /**
   * Begin a fetch block, moving the iterator to the given position.
   * Resets the fetch start offset.
   * <p>
   * @param pos index to move a position of iterator.
   */
  public  void fetchAbsolute (long pos)  ;
  /**
   * Begin a fetch block, forward from the current position.
   * Resets the fetch start offset.
   */
  public  void fetchNext ()  ;
  /**
   * Begin a fetch block, moving the iterator back by offset from the start of the previous fetch
   * block start.
   * Resets the fetch start offset.
   * <p>
   * @param offset the amount to move a fetch start position toward the prior direction.
   */
  public  void fetchPrior (long offset)  ;
  public  long getFetchStart ()  ;
  public  long getPosition ()  ;
}
