package org.apache.spark.sql;
/**
 * Interface used to load a {@link Dataset} from external storage systems (e.g. file systems,
 * key-value stores, etc). Use <code>SparkSession.read</code> to access this.
 * <p>
 * @since 1.4.0
 */
public  class DataFrameReader implements org.apache.spark.internal.Logging {
  // not preceding
     DataFrameReader (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Loads CSV files and returns the result as a <code>DataFrame</code>.
   * <p>
   * This function will go through the input once to determine the input schema if <code>inferSchema</code>
   * is enabled. To avoid going through the entire data once, disable <code>inferSchema</code> option or
   * specify the schema explicitly using <code>schema</code>.
   * <p>
   * You can find the CSV-specific options for reading CSV files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-csv.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads a CSV file and returns the result as a <code>DataFrame</code>. See the documentation on the
   * other overloaded <code>csv()</code> method for more details.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads an <code>Dataset[String]</code> storing CSV rows and returns the result as a <code>DataFrame</code>.
   * <p>
   * If the schema is not specified using <code>schema</code> function and <code>inferSchema</code> option is enabled,
   * this function goes through the input once to determine the input schema.
   * <p>
   * If the schema is not specified using <code>schema</code> function and <code>inferSchema</code> option is disabled,
   * it determines the columns as string types and it reads only the first line to determine the
   * names and the number of fields.
   * <p>
   * If the enforceSchema is set to <code>false</code>, only the CSV header in the first line is checked
   * to conform specified or inferred schema.
   * <p>
   * @note if <code>header</code> option is set to <code>true</code> when calling this API, all lines same with
   * the header will be removed if exists.
   * <p>
   * @param csvDataset input Dataset with one CSV row per record
   * @since 2.2.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (org.apache.spark.sql.Dataset<java.lang.String> csvDataset)  { throw new RuntimeException(); }
  /**
   * Loads CSV files and returns the result as a <code>DataFrame</code>.
   * <p>
   * This function will go through the input once to determine the input schema if <code>inferSchema</code>
   * is enabled. To avoid going through the entire data once, disable <code>inferSchema</code> option or
   * specify the schema explicitly using <code>schema</code>.
   * <p>
   * You can find the CSV-specific options for reading CSV files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-csv.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Specifies the input data source format.
   * <p>
   * @since 1.4.0
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table and connection properties.
   * <p>
   * You can find the JDBC-specific option and parameter documentation for reading tables
   * via JDBC in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.4.0
   * @param url (undocumented)
   * @param table (undocumented)
   * @param properties (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table. Partitions of the table will be retrieved in parallel based on the parameters
   * passed to this function.
   * <p>
   * Don't create too many partitions in parallel on a large cluster; otherwise Spark might crash
   * your external database systems.
   * <p>
   * You can find the JDBC-specific option and parameter documentation for reading tables via JDBC in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param table Name of the table in the external database.
   * @param columnName Alias of <code>partitionColumn</code> option. Refer to <code>partitionColumn</code> in
   *                   <a href="https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html#data-source-option">
   *                     Data Source Option</a> in the version you use.
   * @param connectionProperties JDBC database connection arguments, a list of arbitrary string
   *                             tag/value. Normally at least a "user" and "password" property
   *                             should be included. "fetchsize" can be used to control the
   *                             number of rows per fetch and "queryTimeout" can be used to wait
   *                             for a Statement object to execute to the given number of seconds.
   * @since 1.4.0
   * @param url (undocumented)
   * @param lowerBound (undocumented)
   * @param upperBound (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table, java.lang.String columnName, long lowerBound, long upperBound, int numPartitions, java.util.Properties connectionProperties)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table using connection properties. The <code>predicates</code> parameter gives a list
   * expressions suitable for inclusion in WHERE clauses; each one defines one partition
   * of the <code>DataFrame</code>.
   * <p>
   * Don't create too many partitions in parallel on a large cluster; otherwise Spark might crash
   * your external database systems.
   * <p>
   * You can find the JDBC-specific option and parameter documentation for reading tables
   * via JDBC in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param table Name of the table in the external database.
   * @param predicates Condition in the where clause for each partition.
   * @param connectionProperties JDBC database connection arguments, a list of arbitrary string
   *                             tag/value. Normally at least a "user" and "password" property
   *                             should be included. "fetchsize" can be used to control the
   *                             number of rows per fetch.
   * @since 1.4.0
   * @param url (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table, java.lang.String[] predicates, java.util.Properties connectionProperties)  { throw new RuntimeException(); }
  /**
   * Loads JSON files and returns the results as a <code>DataFrame</code>.
   * <p>
   * <a href="http://jsonlines.org/">JSON Lines</a> (newline-delimited JSON) is supported by
   * default. For JSON (one record per file), set the <code>multiLine</code> option to true.
   * <p>
   * This function goes through the input once to determine the input schema. If you know the
   * schema in advance, use the version that specifies the schema to avoid the extra scan.
   * <p>
   * You can find the JSON-specific options for reading JSON files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-json.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads a JSON file and returns the results as a <code>DataFrame</code>.
   * <p>
   * See the documentation on the overloaded <code>json()</code> method with varargs for more details.
   * <p>
   * @since 1.4.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads JSON files and returns the results as a <code>DataFrame</code>.
   * <p>
   * <a href="http://jsonlines.org/">JSON Lines</a> (newline-delimited JSON) is supported by
   * default. For JSON (one record per file), set the <code>multiLine</code> option to true.
   * <p>
   * This function goes through the input once to determine the input schema. If you know the
   * schema in advance, use the version that specifies the schema to avoid the extra scan.
   * <p>
   * You can find the JSON-specific options for reading JSON files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-json.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Loads a <code>JavaRDD[String]</code> storing JSON objects (<a href="http://jsonlines.org/">JSON
   * Lines text format or newline-delimited JSON</a>) and returns the result as
   * a <code>DataFrame</code>.
   * <p>
   * Unless the schema is specified using <code>schema</code> function, this function goes through the
   * input once to determine the input schema.
   * <p>
   * @param jsonRDD input RDD with one JSON object per record
   * @since 1.4.0
   * @return (undocumented)
   *
   * @deprecated Use json(Dataset[String]) instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (org.apache.spark.api.java.JavaRDD<java.lang.String> jsonRDD)  { throw new RuntimeException(); }
  /**
   * Loads an <code>RDD[String]</code> storing JSON objects (<a href="http://jsonlines.org/">JSON Lines
   * text format or newline-delimited JSON</a>) and returns the result as a <code>DataFrame</code>.
   * <p>
   * Unless the schema is specified using <code>schema</code> function, this function goes through the
   * input once to determine the input schema.
   * <p>
   * @param jsonRDD input RDD with one JSON object per record
   * @since 1.4.0
   * @return (undocumented)
   *
   * @deprecated Use json(Dataset[String]) instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (org.apache.spark.rdd.RDD<java.lang.String> jsonRDD)  { throw new RuntimeException(); }
  /**
   * Loads a <code>Dataset[String]</code> storing JSON objects (<a href="http://jsonlines.org/">JSON Lines
   * text format or newline-delimited JSON</a>) and returns the result as a <code>DataFrame</code>.
   * <p>
   * Unless the schema is specified using <code>schema</code> function, this function goes through the
   * input once to determine the input schema.
   * <p>
   * @param jsonDataset input Dataset with one JSON object per record
   * @since 2.2.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (org.apache.spark.sql.Dataset<java.lang.String> jsonDataset)  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data sources that support multiple paths.
   * Only works if the source is a HadoopFsRelationProvider.
   * <p>
   * @since 1.6.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data sources that don't require a path (e.g. external
   * key-value stores).
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load ()  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data sources that require a path (e.g. data backed by
   * a local or distributed file system).
   * <p>
   * @since 1.4.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data sources that support multiple paths.
   * Only works if the source is a HadoopFsRelationProvider.
   * <p>
   * @since 1.6.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader option (java.lang.String key, boolean value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader option (java.lang.String key, long value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader option (java.lang.String key, double value)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Adds input options for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader options (scala.collection.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Adds input options for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader options (java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Loads ORC files and returns the result as a <code>DataFrame</code>.
   * <p>
   * ORC-specific option(s) for reading ORC files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-orc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param paths input paths
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> orc (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads an ORC file and returns the result as a <code>DataFrame</code>.
   * <p>
   * @param path input path
   * @since 1.5.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> orc (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads ORC files and returns the result as a <code>DataFrame</code>.
   * <p>
   * ORC-specific option(s) for reading ORC files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-orc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param paths input paths
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> orc (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a <code>DataFrame</code>.
   * <p>
   * Parquet-specific option(s) for reading Parquet files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.4.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquet (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a <code>DataFrame</code>. See the documentation
   * on the other overloaded <code>parquet()</code> method for more details.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquet (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a <code>DataFrame</code>.
   * <p>
   * Parquet-specific option(s) for reading Parquet files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.4.0
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquet (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Specifies the input schema. Some data sources (e.g. JSON) can infer the input schema
   * automatically from data. By specifying the schema here, the underlying data source can
   * skip the schema inference step, and thus speed up data loading.
   * <p>
   * @since 1.4.0
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader schema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Specifies the schema by using the input DDL-formatted string. Some data sources (e.g. JSON) can
   * infer the input schema automatically from data. By specifying the schema here, the underlying
   * data source can skip the schema inference step, and thus speed up data loading.
   * <p>
   * <pre><code>
   *   spark.read.schema("a INT, b STRING, c DOUBLE").csv("test.csv")
   * </code></pre>
   * <p>
   * @since 2.3.0
   * @param schemaString (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader schema (java.lang.String schemaString)  { throw new RuntimeException(); }
  /**
   * Returns the specified table/view as a <code>DataFrame</code>. If it's a table, it must support batch
   * reading and the returned DataFrame is the batch scan query plan of this table. If it's a view,
   * the returned DataFrame is simply the query plan of the view, which can either be a batch or
   * streaming query plan.
   * <p>
   * @param tableName is either a qualified or unqualified name that designates a table or view.
   *                  If a database is specified, it identifies the table/view from the database.
   *                  Otherwise, it first attempts to find a temporary view with the given name
   *                  and then match the table/view from the current database.
   *                  Note that, the global temporary view database is also valid here.
   * @since 1.4.0
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
   *   spark.read.text("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.read().text("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can find the text-specific options for reading text files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-text.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param paths input paths
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> text (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a <code>DataFrame</code> whose schema starts with a string column named
   * "value", and followed by partitioned columns if there are any. See the documentation on
   * the other overloaded <code>text()</code> method for more details.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> text (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a <code>DataFrame</code> whose schema starts with a string column named
   * "value", and followed by partitioned columns if there are any.
   * The text files must be encoded as UTF-8.
   * <p>
   * By default, each line in the text files is a new row in the resulting DataFrame. For example:
   * <pre><code>
   *   // Scala:
   *   spark.read.text("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.read().text("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can find the text-specific options for reading text files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-text.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param paths input paths
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> text (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a {@link Dataset} of String. The underlying schema of the Dataset
   * contains a single string column named "value".
   * The text files must be encoded as UTF-8.
   * <p>
   * If the directory structure of the text files contains partitioning information, those are
   * ignored in the resulting Dataset. To include partitioning information as columns, use <code>text</code>.
   * <p>
   * By default, each line in the text files is a new row in the resulting DataFrame. For example:
   * <pre><code>
   *   // Scala:
   *   spark.read.textFile("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.read().textFile("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can set the text-specific options as specified in <code>DataFrameReader.text</code>.
   * <p>
   * @param paths input path
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> textFile (java.lang.String... paths)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a {@link Dataset} of String. See the documentation on the
   * other overloaded <code>textFile()</code> method for more details.
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> textFile (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a {@link Dataset} of String. The underlying schema of the Dataset
   * contains a single string column named "value".
   * The text files must be encoded as UTF-8.
   * <p>
   * If the directory structure of the text files contains partitioning information, those are
   * ignored in the resulting Dataset. To include partitioning information as columns, use <code>text</code>.
   * <p>
   * By default, each line in the text files is a new row in the resulting DataFrame. For example:
   * <pre><code>
   *   // Scala:
   *   spark.read.textFile("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.read().textFile("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can set the text-specific options as specified in <code>DataFrameReader.text</code>.
   * <p>
   * @param paths input path
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> textFile (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
}
