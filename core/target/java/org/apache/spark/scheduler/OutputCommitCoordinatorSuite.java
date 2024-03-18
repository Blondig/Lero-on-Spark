package org.apache.spark.scheduler;
/**
 * Unit tests for the output commit coordination functionality.
 * <p>
 * The unit test makes both the original task and the speculated task
 * attempt to commit, where committing is emulated by creating a
 * directory. If both tasks create directories then the end result is
 * a failure.
 * <p>
 * Note that there are some aspects of this test that are less than ideal.
 * In particular, the test mocks the speculation-dequeuing logic to always
 * dequeue a task and consider it as speculated. Immediately after initially
 * submitting the tasks and calling reviveOffers(), reviveOffers() is invoked
 * again to pick up the speculated task. This may be hacking the original
 * behavior in too much of an unrealistic fashion.
 * <p>
 * Also, the validation is done by checking the number of files in a directory.
 * Ideally, an accumulator would be used for this, where we could increment
 * the accumulator in the output committer's commitTask() call. If the call to
 * commitTask() was called twice erroneously then the test would ideally fail because
 * the accumulator would be incremented twice.
 * <p>
 * The problem with this test implementation is that when both a speculated task and
 * its original counterpart complete, only one of the accumulator's increments is
 * captured. This results in a paradox where if the OutputCommitCoordinator logic
 * was not in SparkHadoopWriter, the tests would still pass because only one of the
 * increments would be captured even though the commit in both tasks was executed
 * erroneously.
 * <p>
 * See also: {@link OutputCommitCoordinatorIntegrationSuite} for integration tests that do
 * not use mocks.
 */
public  class OutputCommitCoordinatorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   OutputCommitCoordinatorSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.io.File tempDir ()  { throw new RuntimeException(); }
}
