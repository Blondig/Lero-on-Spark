package org.apache.spark.graphx.util;
public  class PeriodicGraphCheckpointerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.graphx.LocalSparkContext {
  static public  class GraphToCheck implements scala.Product, scala.Serializable {
    public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph ()  { throw new RuntimeException(); }
    public  int gIndex ()  { throw new RuntimeException(); }
    // not preceding
    public   GraphToCheck (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph, int gIndex)  { throw new RuntimeException(); }
  }
  static public  class GraphToCheck$ extends scala.runtime.AbstractFunction2<org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object>, java.lang.Object, org.apache.spark.graphx.util.PeriodicGraphCheckpointerSuite.GraphToCheck> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GraphToCheck$ MODULE$ = null;
    public   GraphToCheck$ ()  { throw new RuntimeException(); }
  }
  static public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.graphx.Edge<java.lang.Object>> edges ()  { throw new RuntimeException(); }
  static public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> createGraph (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  static public  void checkPersistence (scala.collection.Seq<org.apache.spark.graphx.util.PeriodicGraphCheckpointerSuite.GraphToCheck> graphs, int iteration)  { throw new RuntimeException(); }
  /**
   * Check storage level of graph.
   * @param gIndex  Index of graph in order inserted into checkpointer (from 1).
   * @param iteration  Total number of graphs inserted into checkpointer.
   * @param graph (undocumented)
   */
  static public  void checkPersistence (org.apache.spark.graphx.Graph<?, ?> graph, int gIndex, int iteration)  { throw new RuntimeException(); }
  static public  void checkCheckpoint (scala.collection.Seq<org.apache.spark.graphx.util.PeriodicGraphCheckpointerSuite.GraphToCheck> graphs, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  static public  void confirmCheckpointRemoved (org.apache.spark.graphx.Graph<?, ?> graph)  { throw new RuntimeException(); }
  /**
   * Check checkpointed status of graph.
   * @param gIndex  Index of graph in order inserted into checkpointer (from 1).
   * @param iteration  Total number of graphs inserted into checkpointer.
   * @param graph (undocumented)
   * @param checkpointInterval (undocumented)
   */
  static public  void checkCheckpoint (org.apache.spark.graphx.Graph<?, ?> graph, int gIndex, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.scalactic.Equality<A> defaultEquality ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $eq$eq$eq (T right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $bang$eq$eq (T right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $eq$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $bang$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $eq$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $bang$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.Equalizer<T> convertToEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.CheckingEqualizer<T> convertToCheckingEqualizer (T left)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> unconstrainedEquality (org.scalactic.Equality<A> equalityOfA)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityTypeCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> typeCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityConversionCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConversionConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> conversionCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConversionConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> ev)  { throw new RuntimeException(); }
  static   java.lang.Throwable newAssertionFailedException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos, scala.collection.immutable.IndexedSeq<java.lang.String> analysis)  { throw new RuntimeException(); }
  static   java.lang.Throwable newTestCanceledException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, Object clue, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertTypeError (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertDoesNotCompile (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertCompiles (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T intercept (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalatest.compatible.Assertion assertThrows (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object clue, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withClue (Object clue, scala.Function0<T> fun)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pending ()  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pendingUntilFixed (scala.Function0<scala.runtime.BoxedUnit> f, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static protected abstract  void org$scalatest$Assertions$_setter_$succeed_$eq (org.scalatest.compatible.Assertion x$1)  ;
  public   PeriodicGraphCheckpointerSuite ()  { throw new RuntimeException(); }
}
