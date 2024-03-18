package org.apache.spark.sql;
/**
 * Interface used to write a {@link Dataset} to external storage systems (e.g. file systems,
 * key-value stores, etc). Use <code>Dataset.write</code> to access this.
 * <p>
 * @since 1.4.0
 */
public final class DataFrameWriter<T extends java.lang.Object> {
  // not preceding
     DataFrameWriter (org.apache.spark.sql.Dataset<T> ds)  { throw new RuntimeException(); }
  /**
   * Buckets the output by the given columns. If specified, the output is laid out on the file
   * system similar to Hive's bucketing scheme, but with a different bucket hash function
   * and is not compatible with Hive's bucketing.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 2.0
   * @param numBuckets (undocumented)
   * @param colName (undocumented)
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> bucketBy (int numBuckets, java.lang.String colName, java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Buckets the output by the given columns. If specified, the output is laid out on the file
   * system similar to Hive's bucketing scheme, but with a different bucket hash function
   * and is not compatible with Hive's bucketing.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 2.0
   * @param numBuckets (undocumented)
   * @param colName (undocumented)
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> bucketBy (int numBuckets, java.lang.String colName, scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> in CSV format at the specified path.
   * This is equivalent to:
   * <pre><code>
   *   format("csv").save(path)
   * </code></pre>
   * <p>
   * You can find the CSV-specific options for writing CSV files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-csv.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   */
  public  void csv (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Specifies the underlying output data source. Built-in options include "parquet", "json", etc.
   * <p>
   * @since 1.4.0
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Inserts the content of the <code>DataFrame</code> to the specified table. It requires that
   * the schema of the <code>DataFrame</code> is the same as the schema of the table.
   * <p>
   * @note Unlike <code>saveAsTable</code>, <code>insertInto</code> ignores the column names and just uses position-based
   * resolution. For example:
   * <p>
   * @note SaveMode.ErrorIfExists and SaveMode.Ignore behave as SaveMode.Append in <code>insertInto</code> as
   *       <code>insertInto</code> is not a table creating operation.
   * <p>
   * <pre><code>
   *    scala&gt; Seq((1, 2)).toDF("i", "j").write.mode("overwrite").saveAsTable("t1")
   *    scala&gt; Seq((3, 4)).toDF("j", "i").write.insertInto("t1")
   *    scala&gt; Seq((5, 6)).toDF("a", "b").write.insertInto("t1")
   *    scala&gt; sql("select * from t1").show
   *    +---+---+
   *    |  i|  j|
   *    +---+---+
   *    |  5|  6|
   *    |  3|  4|
   *    |  1|  2|
   *    +---+---+
   * </code></pre>
   * <p>
   * Because it inserts data to an existing table, format or options will be ignored.
   * <p>
   * @since 1.4.0
   * @param tableName (undocumented)
   */
  public  void insertInto (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> to an external database table via JDBC. In the case the
   * table already exists in the external database, behavior of this function depends on the
   * save mode, specified by the <code>mode</code> function (default to throwing an exception).
   * <p>
   * Don't create too many partitions in parallel on a large cluster; otherwise Spark might crash
   * your external database systems.
   * <p>
   * JDBC-specific option and parameter documentation for storing tables via JDBC in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @param table Name of the table in the external database.
   * @param connectionProperties JDBC database connection arguments, a list of arbitrary string
   *                             tag/value. Normally at least a "user" and "password" property
   *                             should be included. "batchsize" can be used to control the
   *                             number of rows per insert. "isolationLevel" can be one of
   *                             "NONE", "READ_COMMITTED", "READ_UNCOMMITTED", "REPEATABLE_READ",
   *                             or "SERIALIZABLE", corresponding to standard transaction
   *                             isolation levels defined by JDBC's Connection object, with default
   *                             of "READ_UNCOMMITTED".
   * @since 1.4.0
   * @param url (undocumented)
   */
  public  void jdbc (java.lang.String url, java.lang.String table, java.util.Properties connectionProperties)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> in JSON format (<a href="http://jsonlines.org/">
   * JSON Lines text format or newline-delimited JSON</a>) at the specified path.
   * This is equivalent to:
   * <pre><code>
   *   format("json").save(path)
   * </code></pre>
   * <p>
   * You can find the JSON-specific options for writing JSON files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-json.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.4.0
   * @param path (undocumented)
   */
  public  void json (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Specifies the behavior when data or table already exists. Options include:
   * <ul>
   * <li><code>SaveMode.Overwrite</code>: overwrite the existing data.</li>
   * <li><code>SaveMode.Append</code>: append the data.</li>
   * <li><code>SaveMode.Ignore</code>: ignore the operation (i.e. no-op).</li>
   * <li><code>SaveMode.ErrorIfExists</code>: throw an exception at runtime.</li>
   * </ul>
   * <p>
   * The default option is <code>ErrorIfExists</code>.
   * <p>
   * @since 1.4.0
   * @param saveMode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> mode (org.apache.spark.sql.SaveMode saveMode)  { throw new RuntimeException(); }
  /**
   * Specifies the behavior when data or table already exists. Options include:
   * <ul>
   * <li><code>overwrite</code>: overwrite the existing data.</li>
   * <li><code>append</code>: append the data.</li>
   * <li><code>ignore</code>: ignore the operation (i.e. no-op).</li>
   * <li><code>error</code> or <code>errorifexists</code>: default option, throw an exception at runtime.</li>
   * </ul>
   * <p>
   * @since 1.4.0
   * @param saveMode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> mode (java.lang.String saveMode)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> option (java.lang.String key, boolean value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> option (java.lang.String key, long value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> option (java.lang.String key, double value)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Adds output options for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> options (scala.collection.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Adds output options for the underlying data source.
   * <p>
   * All options are maintained in a case-insensitive way in terms of key names.
   * If a new option has the same key case-insensitively, it will override the existing option.
   * <p>
   * @since 1.4.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> options (java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> in ORC format at the specified path.
   * This is equivalent to:
   * <pre><code>
   *   format("orc").save(path)
   * </code></pre>
   * <p>
   * ORC-specific option(s) for writing ORC files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-orc.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.5.0
   * @param path (undocumented)
   */
  public  void orc (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> in Parquet format at the specified path.
   * This is equivalent to:
   * <pre><code>
   *   format("parquet").save(path)
   * </code></pre>
   * <p>
   * Parquet-specific option(s) for writing Parquet files can be found in
   * <a href=
   *   "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.4.0
   * @param path (undocumented)
   */
  public  void parquet (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Partitions the output by the given columns on the file system. If specified, the output is
   * laid out on the file system similar to Hive's partitioning scheme. As an example, when we
   * partition a dataset by year and then month, the directory layout would look like:
   * <ul>
   * <li>year=2016/month=01/</li>
   * <li>year=2016/month=02/</li>
   * </ul>
   * <p>
   * Partitioning is one of the most widely used techniques to optimize physical data layout.
   * It provides a coarse-grained index for skipping unnecessary data reads when queries have
   * predicates on the partitioned columns. In order for partitioning to work well, the number
   * of distinct values in each column should typically be less than tens of thousands.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 1.4.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> partitionBy (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Partitions the output by the given columns on the file system. If specified, the output is
   * laid out on the file system similar to Hive's partitioning scheme. As an example, when we
   * partition a dataset by year and then month, the directory layout would look like:
   * <ul>
   * <li>year=2016/month=01/</li>
   * <li>year=2016/month=02/</li>
   * </ul>
   * <p>
   * Partitioning is one of the most widely used techniques to optimize physical data layout.
   * It provides a coarse-grained index for skipping unnecessary data reads when queries have
   * predicates on the partitioned columns. In order for partitioning to work well, the number
   * of distinct values in each column should typically be less than tens of thousands.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 1.4.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> partitionBy (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> at the specified path.
   * <p>
   * @since 1.4.0
   * @param path (undocumented)
   */
  public  void save (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> as the specified table.
   * <p>
   * @since 1.4.0
   */
  public  void save ()  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> as the specified table.
   * <p>
   * In the case the table already exists, behavior of this function depends on the
   * save mode, specified by the <code>mode</code> function (default to throwing an exception).
   * When <code>mode</code> is <code>Overwrite</code>, the schema of the <code>DataFrame</code> does not need to be
   * the same as that of the existing table.
   * <p>
   * When <code>mode</code> is <code>Append</code>, if there is an existing table, we will use the format and options of
   * the existing table. The column order in the schema of the <code>DataFrame</code> doesn't need to be same
   * as that of the existing table. Unlike <code>insertInto</code>, <code>saveAsTable</code> will use the column names to
   * find the correct column positions. For example:
   * <p>
   * <pre><code>
   *    scala&gt; Seq((1, 2)).toDF("i", "j").write.mode("overwrite").saveAsTable("t1")
   *    scala&gt; Seq((3, 4)).toDF("j", "i").write.mode("append").saveAsTable("t1")
   *    scala&gt; sql("select * from t1").show
   *    +---+---+
   *    |  i|  j|
   *    +---+---+
   *    |  1|  2|
   *    |  4|  3|
   *    +---+---+
   * </code></pre>
   * <p>
   * In this method, save mode is used to determine the behavior if the data source table exists in
   * Spark catalog. We will always overwrite the underlying data of data source (e.g. a table in
   * JDBC data source) if the table doesn't exist in Spark catalog, and will always append to the
   * underlying data of data source if the table already exists.
   * <p>
   * When the DataFrame is created from a non-partitioned <code>HadoopFsRelation</code> with a single input
   * path, and the data source provider can be mapped to an existing Hive builtin SerDe (i.e. ORC
   * and Parquet), the table is persisted in a Hive compatible format, which means other systems
   * like Hive will be able to read this table. Otherwise, the table is persisted in a Spark SQL
   * specific format.
   * <p>
   * @since 1.4.0
   * @param tableName (undocumented)
   */
  public  void saveAsTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Sorts the output in each bucket by the given columns.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 2.0
   * @param colName (undocumented)
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> sortBy (java.lang.String colName, java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Sorts the output in each bucket by the given columns.
   * <p>
   * This is applicable for all file-based data sources (e.g. Parquet, JSON) starting with Spark
   * 2.1.0.
   * <p>
   * @since 2.0
   * @param colName (undocumented)
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> sortBy (java.lang.String colName, scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Saves the content of the <code>DataFrame</code> in a text file at the specified path.
   * The DataFrame must have only one column that is of string type.
   * Each row becomes a new line in the output file. For example:
   * <pre><code>
   *   // Scala:
   *   df.write.text("/path/to/output")
   *
   *   // Java:
   *   df.write().text("/path/to/output")
   * </code></pre>
   * The text files will be encoded as UTF-8.
   * <p>
   * You can find the text-specific options for writing text files in
   * <a href="https://spark.apache.org/docs/latest/sql-data-sources-text.html#data-source-option">
   *   Data Source Option</a> in the version you use.
   * <p>
   * @since 1.6.0
   * @param path (undocumented)
   */
  public  void text (java.lang.String path)  { throw new RuntimeException(); }
}
