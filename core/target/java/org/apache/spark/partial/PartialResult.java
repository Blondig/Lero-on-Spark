package org.apache.spark.partial;
public  class PartialResult<R extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PartialResult (R initialVal, boolean isFinal)  { throw new RuntimeException(); }
  /**
   * Blocking method to wait for and return the final value.
   * @return (undocumented)
   */
  public  R getFinalValue ()  { throw new RuntimeException(); }
  public  R initialValue ()  { throw new RuntimeException(); }
  public  boolean isInitialValueFinal ()  { throw new RuntimeException(); }
  /**
   * Transform this PartialResult into a PartialResult of type T.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.partial.PartialResult<T> map (scala.Function1<R, T> f)  { throw new RuntimeException(); }
  /**
   * Set a handler to be called when this PartialResult completes. Only one completion handler
   * is supported per PartialResult.
   * @param handler (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<R> onComplete (scala.Function1<R, scala.runtime.BoxedUnit> handler)  { throw new RuntimeException(); }
  /**
   * Set a handler to be called if this PartialResult's job fails. Only one failure handler
   * is supported per PartialResult.
   * @param handler (undocumented)
   */
  public  void onFail (scala.Function1<java.lang.Exception, scala.runtime.BoxedUnit> handler)  { throw new RuntimeException(); }
    void setFailure (java.lang.Exception exception)  { throw new RuntimeException(); }
    void setFinalValue (R value)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
