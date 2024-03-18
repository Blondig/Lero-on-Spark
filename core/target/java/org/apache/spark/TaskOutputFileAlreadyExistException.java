package org.apache.spark;
/**
 * Exception thrown when a task cannot write to output file due to the file already exists.
 */
  class TaskOutputFileAlreadyExistException extends java.lang.Exception {
  public   TaskOutputFileAlreadyExistException (java.lang.Throwable error)  { throw new RuntimeException(); }
}
