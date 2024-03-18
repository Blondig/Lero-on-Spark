package org.apache.spark.ml.feature;
/**
 * R formula terms. See the R formula docs here for more information:
 * http://stat.ethz.ch/R-manual/R-patched/library/stats/html/formula.html
 */
public  interface Term {
  /** Creates a summation term by concatenation of terms. */
  public  org.apache.spark.ml.feature.Term add (org.apache.spark.ml.feature.Term other)  ;
  /** Default representation of a single Term as a part of summed terms. */
  public  org.apache.spark.ml.feature.Terms asTerms ()  ;
  /** Default interactions of a Term */
  public  org.apache.spark.ml.feature.Term interact (org.apache.spark.ml.feature.Term other)  ;
  /**
   * Fold by adding deletion terms to the left. Double negation
   * doesn't cancel deletion in order not to add extra terms, e.g.
   * a - (b - c) = a - Deletion(b) - Deletion(c) = a
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.Term subtract (org.apache.spark.ml.feature.Term other)  ;
}
