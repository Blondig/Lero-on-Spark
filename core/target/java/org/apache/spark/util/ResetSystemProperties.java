package org.apache.spark.util;
/**
 * Mixin for automatically resetting system properties that are modified in ScalaTest tests.
 * This resets the properties after each individual test.
 * <p>
 * The order in which fixtures are mixed in affects the order in which they are invoked by tests.
 * If we have a suite <code>MySuite extends SparkFunSuite with Foo with Bar</code>, then
 * Bar's <code>super</code> is Foo, so Bar's beforeEach() will and afterEach() methods will be invoked first
 * by the rest runner.
 * <p>
 * This means that ResetSystemProperties should appear as the last trait in test suites that it's
 * mixed into in order to ensure that the system properties snapshot occurs as early as possible.
 * ResetSystemProperties calls super.afterEach() before performing its own cleanup, ensuring that
 * the old properties are restored as late as possible.
 * <p>
 * See the "Composing fixtures by stacking traits" section at
 * http://www.scalatest.org/user_guide/sharing_fixtures for more details about this pattern.
 */
public  interface ResetSystemProperties extends org.scalatest.BeforeAndAfterEach {
  public  void afterEach ()  ;
  public  void beforeEach ()  ;
  public  java.util.Properties oldProperties ()  ;
}
