package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * <p>
 * The extended version of {@link GroupState} interface with extra getters of state machine fields
 * to improve testability of the {@link GroupState} implementations
 * which inherit from the extended interface.
 * <p>
 * Scala example of using <code>TestGroupState</code>:
 * <pre><code>
 * // Please refer to ScalaDoc of `GroupState` for the Scala definition of `mappingFunction()`
 *
 * import org.apache.spark.api.java.Optional
 * import org.apache.spark.sql.streaming.GroupStateTimeout
 * import org.apache.spark.sql.streaming.TestGroupState
 * // other imports
 *
 * // test class setups
 *
 * test("MapGroupsWithState state transition function") {
 *   // Creates the prevState input for the state transition function
 *   // with desired configs. The `create()` API would guarantee that
 *   // the generated instance has the same behavior as the one built by
 *   // engine with the same configs.
 *   val prevState = TestGroupState.create[Int](
 *     optionalState = Optional.empty[Int],
 *     timeoutConf = NoTimeout,
 *     batchProcessingTimeMs = 1L,
 *     eventTimeWatermarkMs = Optional.of(1L),
 *     hasTimedOut = false)
 *
 *   val key: String = ...
 *   val values: Iterator[Int] = ...
 *
 *   // Asserts the prevState is in init state without updates.
 *   assert(!prevState.isUpdated)
 *
 *   // Calls the state transition function with the test previous state
 *   // with desired configs.
 *   mappingFunction(key, values, prevState)
 *
 *   // Asserts the test GroupState object has been updated but not removed
 *   // after calling the state transition function
 *   assert(prevState.isUpdated)
 *   assert(!prevState.isRemoved)
 * }
 * </code></pre>
 * <p>
 * Java example of using <code>TestGroupSate</code>:
 * <pre><code>
 * // Please refer to ScalaDoc of `GroupState` for the Java definition of `mappingFunction()`
 *
 * import org.apache.spark.api.java.Optional;
 * import org.apache.spark.sql.streaming.GroupStateTimeout;
 * import org.apache.spark.sql.streaming.TestGroupState;
 * // other imports
 *
 * // test class setups
 *
 * // test `MapGroupsWithState` state transition function `mappingFunction()`
 * public void testMappingFunctionWithTestGroupState() {
 *   // Creates the prevState input for the state transition function
 *   // with desired configs. The `create()` API would guarantee that
 *   // the generated instance has the same behavior as the one built by
 *   // engine with the same configs.
 *   TestGroupState&lt;Int&gt; prevState = TestGroupState.create(
 *     Optional.empty(),
 *     GroupStateTimeout.NoTimeout(),
 *     1L,
 *     Optional.of(1L),
 *     false);
 *
 *   String key = ...;
 *   Integer[] values = ...;
 *
 *   // Asserts the prevState is in init state without updates.
 *   Assert.assertFalse(prevState.isUpdated());
 *
 *   // Calls the state transition function with the test previous state
 *   // with desired configs.
 *   mappingFunction.call(key, Arrays.asList(values).iterator(), prevState);
 *
 *   // Asserts the test GroupState object has been updated but not removed
 *   // after calling the state transition function
 *   Assert.assertTrue(prevState.isUpdated());
 *   Assert.assertFalse(prevState.isRemoved());
 * }
 * </code></pre>
 * <p>
 * @param <S>  User-defined type of the state to be stored for each group. Must be encodable into
 *           Spark SQL types (see <code>Encoder</code> for more details).
 * @since 3.2.0
 */
public  interface TestGroupState<S extends java.lang.Object> extends org.apache.spark.sql.streaming.GroupState<S> {
  /** Whether the state has been marked for removing */
  public  boolean isRemoved ()  ;
  /** Whether the state has been updated but not removed */
  public  boolean isUpdated ()  ;
  /**
   * Returns the timestamp if <code>setTimeoutTimestamp()</code> is called.
   * Or, returns batch processing time + the duration when
   * <code>setTimeoutDuration()</code> is called.
   * <p>
   * Otherwise, returns <code>Optional.empty</code> if not set.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.Optional<java.lang.Object> getTimeoutTimestampMs ()  ;
}
