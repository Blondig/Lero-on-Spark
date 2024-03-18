package org.apache.spark.ml.feature;
/**
 * The expansion is done via recursion. Given n features and degree d, the size after expansion is
 * (n + d choose d) (including 1 and first-order values). For example, let f([a, b, c], 3) be the
 * function that expands [a, b, c] to their monomials of degree 3. We have the following recursion:
 * <p>
 * <blockquote>
 *    $$
 *    f([a, b, c], 3) &amp;= f([a, b], 3) ++ f([a, b], 2) * c ++ f([a, b], 1) * c^2 ++ [c^3]
 *    $$
 * </blockquote>
 * <p>
 * To handle sparsity, if c is zero, we can skip all monomials that contain it. We remember the
 * current index and increment it properly for sparse input.
 */
public  class PolynomialExpansion$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.PolynomialExpansion>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PolynomialExpansion$ MODULE$ = null;
  public   PolynomialExpansion$ ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.Vector expand (org.apache.spark.ml.linalg.Vector v, int degree)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PolynomialExpansion load (java.lang.String path)  { throw new RuntimeException(); }
}
