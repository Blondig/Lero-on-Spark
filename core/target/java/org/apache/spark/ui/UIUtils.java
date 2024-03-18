package org.apache.spark.ui;
/** Utility functions for generating XML pages with spark content. */
public  class UIUtils {
  static public  java.lang.String TABLE_CLASS_NOT_STRIPED ()  { throw new RuntimeException(); }
  static public  java.lang.String TABLE_CLASS_STRIPED ()  { throw new RuntimeException(); }
  static public  java.lang.String TABLE_CLASS_STRIPED_SORTABLE ()  { throw new RuntimeException(); }
  static public  java.lang.String formatDate (java.util.Date date)  { throw new RuntimeException(); }
  static public  java.lang.String formatDate (long timestamp)  { throw new RuntimeException(); }
  static public  java.lang.String formatDuration (long milliseconds)  { throw new RuntimeException(); }
  /** Generate a verbose human-readable string representing a duration such as "5 second 35 ms" */
  static public  java.lang.String formatDurationVerbose (long ms)  { throw new RuntimeException(); }
  /**
   * If <code>batchInterval</code> is less than 1 second, format <code>batchTime</code> with milliseconds. Otherwise,
   * format <code>batchTime</code> without milliseconds.
   * <p>
   * @param batchTime the batch time to be formatted
   * @param batchInterval the batch interval
   * @param showYYYYMMSS if showing the <code>yyyy/MM/dd</code> part. If it's false, the return value wll be
   *                     only <code>HH:mm:ss</code> or <code>HH:mm:ss.SSS</code> depending on <code>batchInterval</code>
   * @param timezone only for test
   * @return (undocumented)
   */
  static public  java.lang.String formatBatchTime (long batchTime, long batchInterval, boolean showYYYYMMSS, java.util.TimeZone timezone)  { throw new RuntimeException(); }
  /** Generate a human-readable string representing a number (e.g. 100 K) */
  static public  java.lang.String formatNumber (double records)  { throw new RuntimeException(); }
  static public  java.lang.String uiRoot (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  static public  java.lang.String prependBaseUri (javax.servlet.http.HttpServletRequest request, java.lang.String basePath, java.lang.String resource)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> commonHeaderNodes (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> vizHeaderNodes (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> dataTablesHeaderNodes (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  /** Returns a spark page with correctly formatted headers */
  static public  scala.collection.Seq<scala.xml.Node> headerSparkPage (javax.servlet.http.HttpServletRequest request, java.lang.String title, scala.Function0<scala.collection.Seq<scala.xml.Node>> content, org.apache.spark.ui.SparkUITab activeTab, scala.Option<java.lang.String> helpText, boolean showVisualization, boolean useDataTables)  { throw new RuntimeException(); }
  /** Returns a page with the spark css/js and a simple format. Used for scheduler UI. */
  static public  scala.collection.Seq<scala.xml.Node> basicSparkPage (javax.servlet.http.HttpServletRequest request, scala.Function0<scala.collection.Seq<scala.xml.Node>> content, java.lang.String title, boolean useDataTables)  { throw new RuntimeException(); }
  /** Returns an HTML table constructed by generating a row for each object in a sequence. */
  static public <T extends java.lang.Object> scala.collection.Seq<scala.xml.Node> listingTable (scala.collection.Seq<java.lang.String> headers, scala.Function1<T, scala.collection.Seq<scala.xml.Node>> generateDataRow, scala.collection.Iterable<T> data, boolean fixedWidth, scala.Option<java.lang.String> id, scala.collection.Seq<java.lang.String> headerClasses, boolean stripeRowsWithCss, boolean sortable, scala.collection.Seq<scala.Option<java.lang.String>> tooltipHeaders)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> makeProgressBar (int started, int completed, int failed, int skipped, scala.collection.immutable.Map<java.lang.String, java.lang.Object> reasonToNumKilled, int total)  { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a stage. */
  static public  scala.collection.Seq<scala.xml.Node> showDagVizForStage (int stageId, scala.Option<org.apache.spark.ui.scope.RDDOperationGraph> graph)  { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a job. */
  static public  scala.collection.Seq<scala.xml.Node> showDagVizForJob (int jobId, scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> graphs)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> tooltip (java.lang.String text, java.lang.String position)  { throw new RuntimeException(); }
  /**
   * Returns HTML rendering of a job or stage description. It will try to parse the string as HTML
   * and make sure that it only contains anchors with root-relative links. Otherwise,
   * the whole string will rendered as a simple escaped text.
   * <p>
   * Note: In terms of security, only anchor tags with root relative links are supported. So any
   * attempts to embed links outside Spark UI, or other tags like &amp;lt;script&amp;gt; will cause in
   * the whole description to be treated as plain text.
   * <p>
   * @param desc        the original job or stage description string, which may contain html tags.
   * @param basePathUri with which to prepend the relative links; this is used when plainText is
   *                    false.
   * @param plainText   whether to keep only plain text (i.e. remove html tags) from the original
   *                    description string.
   * @return the HTML rendering of the job or stage description, which will be a Text when plainText
   *         is true, and an Elem otherwise.
   */
  static public  scala.xml.NodeSeq makeDescription (java.lang.String desc, java.lang.String basePathUri, boolean plainText)  { throw new RuntimeException(); }
  /**
   * Decode URLParameter if URL is encoded by YARN-WebAppProxyServlet.
   * Due to YARN-2844: WebAppProxyServlet cannot handle urls which contain encoded characters
   * Therefore we need to decode it until we get the real URLParameter.
   * @param urlParam (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String decodeURLParameter (java.lang.String urlParam)  { throw new RuntimeException(); }
  static public  int getTimeZoneOffset ()  { throw new RuntimeException(); }
  /**
   * Return the correct Href after checking if master is running in the
   * reverse proxy mode or not.
   * @param proxy (undocumented)
   * @param id (undocumented)
   * @param origHref (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String makeHref (boolean proxy, java.lang.String id, java.lang.String origHref)  { throw new RuntimeException(); }
  static public  javax.ws.rs.core.Response buildErrorResponse (javax.ws.rs.core.Response.Status status, java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * There may be different duration labels in each batch. So we need to
   * mark those missing duration label as '0d' to avoid UI rending error.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>>[] durationDataPadding (scala.Tuple2<java.lang.Object, java.util.Map<java.lang.String, java.lang.Long>>[] values)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> detailsUINode (boolean isMultiline, java.lang.String message)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
