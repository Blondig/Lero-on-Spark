package org.apache.spark.ml.feature;
/** A term that may be part of an interaction, e.g. 'x' in 'x:y' */
public  interface InteractableTerm extends org.apache.spark.ml.feature.Term {
  /** Convert to ColumnInteraction to wrap all interactions. */
  public  org.apache.spark.ml.feature.ColumnInteraction asInteraction ()  ;
  /** Interactions of interactable terms. */
  public  org.apache.spark.ml.feature.Term interact (org.apache.spark.ml.feature.Term other)  ;
}
