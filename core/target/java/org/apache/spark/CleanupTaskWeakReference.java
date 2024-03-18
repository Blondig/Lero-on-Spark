package org.apache.spark;
/**
 * A WeakReference associated with a CleanupTask.
 * <p>
 * When the referent object becomes only weakly reachable, the corresponding
 * CleanupTaskWeakReference is automatically added to the given reference queue.
 */
public  class CleanupTaskWeakReference extends java.lang.ref.WeakReference<java.lang.Object> {
  // not preceding
  public   CleanupTaskWeakReference (org.apache.spark.CleanupTask task, java.lang.Object referent, java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue)  { throw new RuntimeException(); }
  public  org.apache.spark.CleanupTask task ()  { throw new RuntimeException(); }
}
