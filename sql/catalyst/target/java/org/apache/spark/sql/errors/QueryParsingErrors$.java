package org.apache.spark.sql.errors;
/**
 * Object for grouping all error messages of the query parsing.
 * Currently it includes all ParseException.
 */
public  class QueryParsingErrors$ implements org.apache.spark.sql.errors.QueryErrorsBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final QueryParsingErrors$ MODULE$ = null;
  public   QueryParsingErrors$ ()  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidInsertIntoError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertIntoContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable insertOverwriteDirectoryUnsupportedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertIntoContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable columnAliasInOperationNotAllowedError (java.lang.String op, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableAliasContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable emptySourceForMergeError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MergeIntoTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unrecognizedMatchedActionError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MatchedClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable insertedValueNumberNotMatchFieldNumberError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NotMatchedClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unrecognizedNotMatchedActionError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NotMatchedClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable mergeStatementWithoutWhenClauseError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MergeIntoTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable nonLastMatchedClauseOmitConditionError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MergeIntoTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable nonLastNotMatchedClauseOmitConditionError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MergeIntoTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable emptyPartitionKeyError (java.lang.String key, org.apache.spark.sql.catalyst.parser.SqlBaseParser.PartitionSpecContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable combinationQueryResultClausesUnsupportedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryOrganizationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable distributeByUnsupportedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryOrganizationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable transformNotSupportQuantifierError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable transformWithSerdeUnsupportedError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable lateralWithPivotInFromClauseNotAllowedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FromClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable lateralJoinWithNaturalJoinUnsupportedError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable lateralJoinWithUsingJoinUnsupportedError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unsupportedLateralJoinTypeError (org.antlr.v4.runtime.ParserRuleContext ctx, java.lang.String joinType)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidLateralJoinRelationError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RelationPrimaryContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable repetitiveWindowDefinitionError (java.lang.String name, org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidWindowReferenceError (java.lang.String name, org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotResolveWindowReferenceError (java.lang.String name, org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowClauseContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable naturalCrossJoinUnsupportedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RelationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable emptyInputForTableSampleError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable tableSampleByBytesUnsupportedError (java.lang.String msg, org.apache.spark.sql.catalyst.parser.SqlBaseParser.SampleMethodContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidByteLengthLiteralError (java.lang.String bytesStr, org.apache.spark.sql.catalyst.parser.SqlBaseParser.SampleByBytesContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidEscapeStringError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.PredicateContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable trimOptionUnsupportedError (int trimOption, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TrimContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable functionNameUnsupportedError (java.lang.String functionName, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotParseValueTypeError (java.lang.String valueType, java.lang.String value, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TypeConstructorContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotParseIntervalValueError (java.lang.String value, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TypeConstructorContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable literalValueTypeUnsupportedError (java.lang.String valueType, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TypeConstructorContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable parsingValueTypeError (java.lang.IllegalArgumentException e, java.lang.String valueType, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TypeConstructorContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidNumericLiteralRangeError (java.lang.String rawStrippedQualifier, scala.math.BigDecimal minValue, scala.math.BigDecimal maxValue, java.lang.String typeName, org.apache.spark.sql.catalyst.parser.SqlBaseParser.NumberContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable moreThanOneFromToUnitInIntervalLiteralError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidIntervalLiteralError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntervalContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidIntervalFormError (java.lang.String value, org.apache.spark.sql.catalyst.parser.SqlBaseParser.MultiUnitsIntervalContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidFromToUnitValueError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntervalValueContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable fromToIntervalUnsupportedError (java.lang.String from, java.lang.String to, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable mixedIntervalUnitsError (java.lang.String literal, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable dataTypeUnsupportedError (java.lang.String dataType, org.apache.spark.sql.catalyst.parser.SqlBaseParser.PrimitiveDataTypeContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable charTypeMissingLengthError (java.lang.String dataType, org.apache.spark.sql.catalyst.parser.SqlBaseParser.PrimitiveDataTypeContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable partitionTransformNotExpectedError (java.lang.String name, java.lang.String describe, org.apache.spark.sql.catalyst.parser.SqlBaseParser.ApplyTransformContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable tooManyArgumentsForTransformError (java.lang.String name, org.apache.spark.sql.catalyst.parser.SqlBaseParser.ApplyTransformContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidBucketsNumberError (java.lang.String describe, org.apache.spark.sql.catalyst.parser.SqlBaseParser.ApplyTransformContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotCleanReservedNamespacePropertyError (java.lang.String property, org.antlr.v4.runtime.ParserRuleContext ctx, java.lang.String msg)  { throw new RuntimeException(); }
  public  java.lang.Throwable propertiesAndDbPropertiesBothSpecifiedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateNamespaceContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotCleanReservedTablePropertyError (java.lang.String property, org.antlr.v4.runtime.ParserRuleContext ctx, java.lang.String msg)  { throw new RuntimeException(); }
  public  java.lang.Throwable duplicatedTablePathsFoundError (java.lang.String pathOne, java.lang.String pathTwo, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable storedAsAndStoredByBothSpecifiedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFileFormatContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable operationInHiveStyleCommandUnsupportedError (java.lang.String operation, java.lang.String command, org.apache.spark.sql.catalyst.parser.SqlBaseParser.StatementContext ctx, scala.Option<java.lang.String> msgOpt)  { throw new RuntimeException(); }
  public  java.lang.Throwable operationNotAllowedError (java.lang.String message, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable descColumnForPartitionUnsupportedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeRelationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable incompletePartitionSpecificationError (java.lang.String key, org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeRelationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable computeStatisticsNotExpectedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IdentifierContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable addCatalogInCacheTableAsSelectNotAllowedError (java.lang.String quoted, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CacheTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable showFunctionsUnsupportedError (java.lang.String identifier, org.apache.spark.sql.catalyst.parser.SqlBaseParser.IdentifierContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable showFunctionsInvalidPatternError (java.lang.String pattern, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable duplicateCteDefinitionNamesError (java.lang.String duplicateNames, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CtesContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable sqlStatementUnsupportedError (java.lang.String sqlText, org.apache.spark.sql.catalyst.trees.Origin position)  { throw new RuntimeException(); }
  public  java.lang.Throwable unquotedIdentifierError (java.lang.String ident, org.apache.spark.sql.catalyst.parser.SqlBaseParser.ErrorIdentContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable duplicateClausesError (java.lang.String clauseName, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable duplicateKeysError (java.lang.String key, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unexpectedFomatForSetConfigurationError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidPropertyKeyForSetQuotedConfigurationError (java.lang.String keyCandidate, java.lang.String valueStr, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidPropertyValueForSetQuotedConfigurationError (java.lang.String valueCandidate, java.lang.String keyStr, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unexpectedFormatForResetConfigurationError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ResetConfigurationContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable intervalValueOutOfRangeError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntervalContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidTimeZoneDisplacementValueError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetTimeZoneContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable createTempTableNotSpecifyProviderError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable rowFormatNotUsedWithStoredAsError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableLikeContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable useDefinedRecordReaderOrWriterClassesError (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable directoryPathAndOptionsPathBothSpecifiedError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertOverwriteDirContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unsupportedLocalFileSchemeError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertOverwriteDirContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidGroupingSetError (java.lang.String element, org.apache.spark.sql.catalyst.parser.SqlBaseParser.GroupingAnalyticsContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable createViewWithBothIfNotExistsAndReplaceError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateViewContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable defineTempViewWithIfNotExistsError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateViewContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable notAllowedToAddDBPrefixForTempViewError (java.lang.String database, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateViewContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable createFuncWithBothIfNotExistsAndReplaceError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable defineTempFuncWithIfNotExistsError (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unsupportedFunctionNameError (java.lang.String quoted, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable specifyingDBInCreateTempFuncError (java.lang.String databaseName, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidTableValuedFunctionNameError (scala.collection.Seq<java.lang.String> name, org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableValuedFunctionContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable unclosedBracketedCommentError (java.lang.String command, org.apache.spark.sql.catalyst.trees.Origin position)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidTimeTravelSpec (java.lang.String reason, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Throwable invalidNameForDropTempFunc (scala.collection.Seq<java.lang.String> name, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
}