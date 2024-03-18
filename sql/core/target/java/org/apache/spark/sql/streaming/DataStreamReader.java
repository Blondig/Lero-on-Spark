package org.apache.spark.sql.streaming;
/**
 * Interface used to load a streaming <code>Dataset</code> from external storage systems (e.g. file systems,
 * key-value stores, etc). Use <code>SparkSession.readStream</code> to access this.
 * <p>
 * @since 2.0.0
 */
public final class DataStreamReader implements org.apache.spark.internal.Logging {
     DataStreamReader (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Loads a CSV file stream and returns the result as a <code>DataFrame</code>.
   * <p>
   * This function will go through the input once to determine the input schema if <code>inferSchema</code>
   * is enabled. To avoid going through the entire data once, disable <code>inferSchema</code> option or
   * specify the schema explicitly using <code>schema</code>.
   * <p>
   * You can set the following option(s):
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * You can find the CSV-specific options for reading CSV file stream in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-csv.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Specifies the input data source format.
   * <p>
   * @since 2.0.0
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Loads a JSON file stream and returns the results as a <code>DataFrame</code>.
   * <p>
   * <a href="http://jsonlines.org/">JSON Lines</a> (newline-delimited JSON) is supported by
   * default. For JSON (one record per file), set the <code>multiLine</code> option to true.
   * <p>
   * This function goes through the input once to determine the input schema. If you know the
   * schema in advance, use the version that specifies the schema to avoid the extra scan.
   * <p>
   * You can set the following option(s):
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * You can find the JSON-specific options for reading JSON file stream in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-json.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads input data stream in as a <code>DataFrame</code>, for data streams that don't require a path
   * (e.g. external key-value stores).
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load ()  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data streams that read from some path.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, boolean value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, long value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, double value)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Adds input options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader options (scala.collection.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Java-specific) Adds input options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader options (java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Loads a ORC file stream, returning the result as a <code>DataFrame</code>.
   * <p>
   * You can set the following option(s):
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * ORC-specific option(s) for reading ORC file stream can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-orc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.3.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> orc (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file stream, returning the result as a <code>DataFrame</code>.
   * <p>
   * You can set the following option(s):
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * Parquet-specific option(s) for reading Parquet file stream can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquet (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Specifies the input schema. Some data sources (e.g. JSON) can infer the input schema
   * automatically from data. By specifying the schema here, the underlying data source can
   * skip the schema inference step, and thus speed up data loading.
   * <p>
   * @since 2.0.0
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader schema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Specifies the schema by using the input DDL-formatted string. Some data sources (e.g. JSON) can
   * infer the input schema automatically from data. By specifying the schema here, the underlying
   * data source can skip the schema inference step, and thus speed up data loading.
   * <p>
   * @since 2.3.0
   * @param schemaString (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader schema (java.lang.String schemaString)  { throw new RuntimeException(); }
  /**
   * Define a Streaming DataFrame on a Table. The DataSource corresponding to the table should
   * support streaming mode.
   * @param tableName The name of the table
   * @since 3.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> table (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a <code>DataFrame</code> whose schema starts with a string column named
   * "value", and followed by partitioned columns if there are any.
   * The text files must be encoded as UTF-8.
   * <p>
   * By default, each line in the text files is a new row in the resulting DataFrame. For example:
   * <pre><code>
   *   // Scala:
   *   spark.readStream.text("/path/to/directory/")
   *
   *   // Java:
   *   spark.readStream().text("/path/to/directory/")
   * </code></pre>
   * <p>
   * You can set the following option(s):
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * You can find the text-specific options for reading text files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-text.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> text (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads text file(s) and returns a <code>Dataset</code> of String. The underlying schema of the Dataset
   * contains a single string column named "value".
   * The text files must be encoded as UTF-8.
   * <p>
   * If the directory structure of the text files contains partitioning information, those are
   * ignored in the resulting Dataset. To include partitioning information as columns, use <code>text</code>.
   * <p>
   * By default, each line in the text file is a new element in the resulting Dataset. For example:
   * <pre><code>
   *   // Scala:
   *   spark.readStream.textFile("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.readStream().textFile("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can set the text-specific options as specified in <code>DataStreamReader.text</code>.
   * <p>
   * @param path input path
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> textFile (java.lang.String path)  { throw new RuntimeException(); }
}
