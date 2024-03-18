package org.apache.spark.scheduler;
public  class MockRDD extends org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> implements scala.Serializable {
  static public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  /**
   * make sure all the shuffle dependencies have a consistent number of output partitions
   * and that one-to-one dependencies have the same partition counts as their parents
   * (mostly to make sure the test setup makes sense, not that Spark itself would get this wrong)
   * @param numPartitions (undocumented)
   * @param shuffleDependencies (undocumented)
   * @param oneToOneDependencies (undocumented)
   */
  static public  void validate (int numPartitions, scala.collection.Seq<org.apache.spark.ShuffleDependency<?, ?, ?>> shuffleDependencies, scala.collection.Seq<org.apache.spark.OneToOneDependency<?>> oneToOneDependencies)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion macroAssert (org.scalactic.Bool bool, Object clue, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion macroAssume (org.scalactic.Bool bool, Object clue, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
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
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, scala.runtime.Nothing$>> shuffleDeps ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.OneToOneDependency<scala.Tuple2<java.lang.Object, java.lang.Object>>> oneToOneDeps ()  { throw new RuntimeException(); }
  // not preceding
  public   MockRDD (org.apache.spark.SparkContext sc, int numPartitions, scala.collection.Seq<org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, scala.runtime.Nothing$>> shuffleDeps, scala.collection.Seq<org.apache.spark.OneToOneDependency<scala.Tuple2<java.lang.Object, java.lang.Object>>> oneToOneDeps)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
