package org.apache.spark.util;
/**
 * Utilities for working with Spark version strings
 */
public  class VersionUtils {
  /**
   * Whether the Hadoop version used by Spark is 3.x
   * @return (undocumented)
   */
  static public  boolean isHadoop3 ()  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the major version number.
   * E.g., for 2.0.1-SNAPSHOT, return 2.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int majorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the minor version number.
   * E.g., for 2.0.1-SNAPSHOT, return 0.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int minorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the short version string.
   * E.g., for 3.0.0-SNAPSHOT, return '3.0.0'.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String shortVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the (major version number, minor version number).
   * E.g., for 2.0.1-SNAPSHOT, return (2, 0).
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> majorMinorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Extracts the major, minor and patch parts from the input <code>version</code>. Note that if minor or patch
   * version is missing from the input, this will return 0 for these parts. Returns <code>None</code> if the
   * input is not of a valid format.
   * <p>
   * Examples of valid version:
   *  - 1   (extracts to (1, 0, 0))
   *  - 2.4   (extracts to (2, 4, 0))
   *  - 3.2.2   (extracts to (3, 2, 2))
   *  - 3.2.2.4   (extracts to 3, 2, 2))
   *  - 3.3.1-SNAPSHOT   (extracts to (3, 3, 1))
   *  - 3.2.2.4SNAPSHOT   (extracts to (3, 2, 2), only the first 3 components)
   * <p>
   * Examples of invalid version:
   *  - ABC
   *  - 1X
   *  - 2.4XYZ
   *  - 2.4-SNAPSHOT
   *  - 3.4.5ABC
   * <p>
   *  @return A non-empty option containing a 3-value tuple (major, minor, patch) iff the
   *          input is a valid version. <code>None</code> otherwise.
   * @param version (undocumented)
   */
  static public  scala.Option<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> majorMinorPatchVersion (java.lang.String version)  { throw new RuntimeException(); }
}
