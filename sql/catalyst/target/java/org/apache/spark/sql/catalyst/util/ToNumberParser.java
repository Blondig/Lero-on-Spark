package org.apache.spark.sql.catalyst.util;
/**
 * This class represents a parser to implement the to_number or try_to_number SQL functions.
 * <p>
 * It works by consuming an input string and a format string. This class accepts the format string
 * as a field, and proceeds to iterate through the format string to generate a sequence of tokens
 * (or throw an exception if the format string is invalid). Then when the function is called with an
 * input string, this class steps through the sequence of tokens and compares them against the input
 * string, returning a Spark Decimal object if they match (or throwing an exception otherwise).
 * <p>
 * param:  numberFormat the format string describing the expected inputs.
 * param:  errorOnFail true if evaluation should throw an exception if the input string fails to
 *                    match the format string. Otherwise, returns NULL instead.
 */
public  class ToNumberParser implements scala.Serializable {
  static public  class ExactlyAsManyDigits extends org.apache.spark.sql.catalyst.util.ToNumberParser.Digits implements scala.Product, scala.Serializable {
    public  int num ()  { throw new RuntimeException(); }
    // not preceding
    public   ExactlyAsManyDigits (int num)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class ExactlyAsManyDigits$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.util.ToNumberParser.ExactlyAsManyDigits> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExactlyAsManyDigits$ MODULE$ = null;
    public   ExactlyAsManyDigits$ ()  { throw new RuntimeException(); }
  }
  static public  class AtMostAsManyDigits extends org.apache.spark.sql.catalyst.util.ToNumberParser.Digits implements scala.Product, scala.Serializable {
    public  int num ()  { throw new RuntimeException(); }
    // not preceding
    public   AtMostAsManyDigits (int num)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class AtMostAsManyDigits$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.util.ToNumberParser.AtMostAsManyDigits> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AtMostAsManyDigits$ MODULE$ = null;
    public   AtMostAsManyDigits$ ()  { throw new RuntimeException(); }
  }
  static public  class DecimalPoint extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   DecimalPoint ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class DecimalPoint$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.DecimalPoint> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecimalPoint$ MODULE$ = null;
    public   DecimalPoint$ ()  { throw new RuntimeException(); }
  }
  static public  class ThousandsSeparator extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   ThousandsSeparator ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class ThousandsSeparator$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.ThousandsSeparator> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ThousandsSeparator$ MODULE$ = null;
    public   ThousandsSeparator$ ()  { throw new RuntimeException(); }
  }
  static public  class DigitGroups extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken> tokens ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.Digits> digits ()  { throw new RuntimeException(); }
    // not preceding
    public   DigitGroups (scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken> tokens, scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.Digits> digits)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class DigitGroups$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken>, scala.collection.Seq<org.apache.spark.sql.catalyst.util.ToNumberParser.Digits>, org.apache.spark.sql.catalyst.util.ToNumberParser.DigitGroups> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DigitGroups$ MODULE$ = null;
    public   DigitGroups$ ()  { throw new RuntimeException(); }
  }
  static public  class DollarSign extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   DollarSign ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class DollarSign$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.DollarSign> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DollarSign$ MODULE$ = null;
    public   DollarSign$ ()  { throw new RuntimeException(); }
  }
  static public  class OptionalPlusOrMinusSign extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   OptionalPlusOrMinusSign ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class OptionalPlusOrMinusSign$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.OptionalPlusOrMinusSign> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OptionalPlusOrMinusSign$ MODULE$ = null;
    public   OptionalPlusOrMinusSign$ ()  { throw new RuntimeException(); }
  }
  static public  class OptionalMinusSign extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   OptionalMinusSign ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class OptionalMinusSign$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.OptionalMinusSign> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OptionalMinusSign$ MODULE$ = null;
    public   OptionalMinusSign$ ()  { throw new RuntimeException(); }
  }
  static public  class OpeningAngleBracket extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   OpeningAngleBracket ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class OpeningAngleBracket$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.OpeningAngleBracket> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OpeningAngleBracket$ MODULE$ = null;
    public   OpeningAngleBracket$ ()  { throw new RuntimeException(); }
  }
  static public  class ClosingAngleBracket extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    public   ClosingAngleBracket ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class ClosingAngleBracket$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.catalyst.util.ToNumberParser.ClosingAngleBracket> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ClosingAngleBracket$ MODULE$ = null;
    public   ClosingAngleBracket$ ()  { throw new RuntimeException(); }
  }
  static public  class InvalidUnrecognizedCharacter extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken implements scala.Product, scala.Serializable {
    // not preceding
    public   InvalidUnrecognizedCharacter (char char_)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class InvalidUnrecognizedCharacter$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.util.ToNumberParser.InvalidUnrecognizedCharacter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InvalidUnrecognizedCharacter$ MODULE$ = null;
    public   InvalidUnrecognizedCharacter$ ()  { throw new RuntimeException(); }
  }
  static public abstract class InputToken {
    public   InputToken ()  { throw new RuntimeException(); }
  }
  static public abstract class Digits extends org.apache.spark.sql.catalyst.util.ToNumberParser.InputToken {
    public   Digits ()  { throw new RuntimeException(); }
  }
  static public final  char ANGLE_BRACKET_CLOSE ()  { throw new RuntimeException(); }
  static public final  char ANGLE_BRACKET_OPEN ()  { throw new RuntimeException(); }
  static public final  char COMMA_LETTER ()  { throw new RuntimeException(); }
  static public final  char COMMA_SIGN ()  { throw new RuntimeException(); }
  static public final  char DOLLAR_SIGN ()  { throw new RuntimeException(); }
  static public final  char MINUS_SIGN ()  { throw new RuntimeException(); }
  static public final  char NINE_DIGIT ()  { throw new RuntimeException(); }
  static public final  char OPTIONAL_PLUS_OR_MINUS_LETTER ()  { throw new RuntimeException(); }
  static public final  char PLUS_SIGN ()  { throw new RuntimeException(); }
  static public final  char POINT_LETTER ()  { throw new RuntimeException(); }
  static public final  char POINT_SIGN ()  { throw new RuntimeException(); }
  static public final  char ZERO_DIGIT ()  { throw new RuntimeException(); }
  static public final  java.lang.String OPTIONAL_MINUS_STRING ()  { throw new RuntimeException(); }
  static public final  java.lang.String WRAPPING_ANGLE_BRACKETS_TO_NEGATIVE_NUMBER ()  { throw new RuntimeException(); }
  static public final  char OPTIONAL_MINUS_STRING_START ()  { throw new RuntimeException(); }
  static public final  char OPTIONAL_MINUS_STRING_END ()  { throw new RuntimeException(); }
  static public final  char WRAPPING_ANGLE_BRACKETS_TO_NEGATIVE_NUMBER_START ()  { throw new RuntimeException(); }
  static public final  char WRAPPING_ANGLE_BRACKETS_TO_NEGATIVE_NUMBER_END ()  { throw new RuntimeException(); }
  public   ToNumberParser (java.lang.String numberFormat, boolean errorOnFail)  { throw new RuntimeException(); }
  /**
   * The result type of this parsing is a Decimal value with the appropriate precision and scale.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DecimalType parsedDecimalType ()  { throw new RuntimeException(); }
  /**
   * Consumes the format string to check validity and computes an appropriate Decimal output type.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult check ()  { throw new RuntimeException(); }
  /**
   * Convert string to numeric based on the given number format.
   * <p>
   * Iterates through the {@link formatTokens} obtained from processing the format string, while also
   * keeping a parallel index into the input string. Throws an exception if the latter does not
   * contain expected characters at any point.
   * <p>
   * @param input the string that needs to converted
   * @return the result Decimal value obtained from string parsing
   */
  public  org.apache.spark.sql.types.Decimal parse (org.apache.spark.unsafe.types.UTF8String input)  { throw new RuntimeException(); }
}
