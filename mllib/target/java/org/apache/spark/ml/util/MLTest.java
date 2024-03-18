package org.apache.spark.ml.util;
public  interface MLTest extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.ml.util.TempDirectory {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
    void checkNominalOnDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, java.lang.String colName, int numValues)  ;
    void checkVectorSizeOnDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, java.lang.String vecColName, int vecSize)  ;
  public  java.lang.String checkpointDir ()  ;
  public  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  ;
  public  org.apache.spark.SparkContext sc ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  void testClassificationModelSingleRawPrediction (org.apache.spark.ml.classification.ClassificationModel<org.apache.spark.ml.linalg.Vector, ?> model, org.apache.spark.sql.Dataset<?> dataset)  ;
  public  void testClusteringModelSinglePrediction (org.apache.spark.ml.Model<?> model, scala.Function1<org.apache.spark.ml.linalg.Vector, java.lang.Object> transform, org.apache.spark.sql.Dataset<?> dataset, java.lang.String input, java.lang.String output)  ;
  public  void testClusteringModelSingleProbabilisticPrediction (org.apache.spark.ml.Model<?> model, scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> transform, org.apache.spark.sql.Dataset<?> dataset, java.lang.String input, java.lang.String output)  ;
  public  void testPredictionModelSinglePrediction (org.apache.spark.ml.PredictionModel<org.apache.spark.ml.linalg.Vector, ?> model, org.apache.spark.sql.Dataset<?> dataset)  ;
  public  void testProbClassificationModelSingleProbPrediction (org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, ?> model, org.apache.spark.sql.Dataset<?> dataset)  ;
  public <A extends java.lang.Object> void testTransformer (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, org.apache.spark.ml.Transformer transformer, java.lang.String firstResultCol, scala.collection.Seq<java.lang.String> otherResultCols, scala.Function1<org.apache.spark.sql.Row, scala.runtime.BoxedUnit> checkFunction, org.apache.spark.sql.Encoder<A> evidence$2)  ;
  public <A extends java.lang.Object> void testTransformerByGlobalCheckFunc (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, org.apache.spark.ml.Transformer transformer, java.lang.String firstResultCol, scala.collection.Seq<java.lang.String> otherResultCols, scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction, org.apache.spark.sql.Encoder<A> evidence$3)  ;
  public <A extends java.lang.Object> void testTransformerByInterceptingException (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, org.apache.spark.ml.Transformer transformer, java.lang.String expectedMessagePart, java.lang.String firstResultCol, org.apache.spark.sql.Encoder<A> evidence$4)  ;
    void testTransformerOnDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, org.apache.spark.ml.Transformer transformer, java.lang.String firstResultCol, scala.collection.Seq<java.lang.String> otherResultCols, scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction)  ;
   <A extends java.lang.Object> void testTransformerOnStreamData (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataframe, org.apache.spark.ml.Transformer transformer, java.lang.String firstResultCol, scala.collection.Seq<java.lang.String> otherResultCols, scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction, org.apache.spark.sql.Encoder<A> evidence$1)  ;
}
