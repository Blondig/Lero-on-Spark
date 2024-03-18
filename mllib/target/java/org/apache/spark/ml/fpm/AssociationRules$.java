package org.apache.spark.ml.fpm;
public  class AssociationRules$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AssociationRules$ MODULE$ = null;
  public   AssociationRules$ ()  { throw new RuntimeException(); }
  /**
   * Computes the association rules with confidence above minConfidence.
   * @param dataset DataFrame("items"[Array], "freq"[Long]) containing frequent itemsets obtained
   *                from algorithms like {@link FPGrowth}.
   * @param itemsCol column name for frequent itemsets
   * @param freqCol column name for appearance count of the frequent itemsets
   * @param minConfidence minimum confidence for generating the association rules
   * @param itemSupport map containing an item and its support
   * @param numTrainingRecords count of training Dataset
   * @return a DataFrame("antecedent"[Array], "consequent"[Array], "confidence"[Double],
   *         "lift" [Double]) containing the association rules.
   * @param evidence$2 (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getAssociationRulesFromFP (org.apache.spark.sql.Dataset<?> dataset, java.lang.String itemsCol, java.lang.String freqCol, double minConfidence, scala.collection.Map<T, java.lang.Object> itemSupport, long numTrainingRecords, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
