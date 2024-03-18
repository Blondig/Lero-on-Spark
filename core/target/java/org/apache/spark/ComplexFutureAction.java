package org.apache.spark;
/**
 * A {@link FutureAction} for actions that could trigger multiple Spark jobs. Examples include take,
 * takeSample. Cancellation works by setting the cancelled flag to true and cancelling any pending
 * jobs.
 */
public  class ComplexFutureAction<T extends java.lang.Object> implements org.apache.spark.FutureAction<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ComplexFutureAction (scala.Function1<org.apache.spark.JobSubmitter, scala.concurrent.Future<T>> run)  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
  public  boolean isCancelled ()  { throw new RuntimeException(); }
  public  boolean isCompleted ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> jobIds ()  { throw new RuntimeException(); }
  public <U extends java.lang.Object> void onComplete (scala.Function1<scala.util.Try<T>, U> func, scala.concurrent.ExecutionContext executor)  { throw new RuntimeException(); }
  public  org.apache.spark.ComplexFutureAction<T> ready (scala.concurrent.duration.Duration atMost, scala.concurrent.CanAwait permit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException { throw new RuntimeException(); }
  public  T result (scala.concurrent.duration.Duration atMost, scala.concurrent.CanAwait permit) throws java.lang.Exception { throw new RuntimeException(); }
  public <S extends java.lang.Object> scala.concurrent.Future<S> transform (scala.Function1<scala.util.Try<T>, scala.util.Try<S>> f, scala.concurrent.ExecutionContext e)  { throw new RuntimeException(); }
  public <S extends java.lang.Object> scala.concurrent.Future<S> transformWith (scala.Function1<scala.util.Try<T>, scala.concurrent.Future<S>> f, scala.concurrent.ExecutionContext e)  { throw new RuntimeException(); }
  public  scala.Option<scala.util.Try<T>> value ()  { throw new RuntimeException(); }
}
