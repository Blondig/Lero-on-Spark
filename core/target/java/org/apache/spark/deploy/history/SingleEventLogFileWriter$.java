package org.apache.spark.deploy.history;
public  class SingleEventLogFileWriter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SingleEventLogFileWriter$ MODULE$ = null;
  public   SingleEventLogFileWriter$ ()  { throw new RuntimeException(); }
  /**
   * Return a file-system-safe path to the log file for the given application.
   * <p>
   * Note that because we currently only create a single log file for each application,
   * we must encode all the information needed to parse this event log in the file name
   * instead of within the file itself. Otherwise, if the file is compressed, for instance,
   * we won't know which codec to use to decompress the metadata needed to open the file in
   * the first place.
   * <p>
   * The log file name will identify the compression codec used for the contents, if any.
   * For example, app_123 for an uncompressed log, app_123.lzf for an LZF-compressed log.
   * <p>
   * @param logBaseDir Directory where the log file will be written.
   * @param appId A unique app ID.
   * @param appAttemptId A unique attempt id of appId. May be the empty string.
   * @param compressionCodecName Name to identify the codec used to compress the contents
   *                             of the log, or None if compression is not enabled.
   * @return A path which consists of file-system-safe characters.
   */
  public  java.lang.String getLogPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, scala.Option<java.lang.String> compressionCodecName)  { throw new RuntimeException(); }
}
