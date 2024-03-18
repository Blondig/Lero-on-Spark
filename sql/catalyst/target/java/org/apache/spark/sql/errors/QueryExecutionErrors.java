package org.apache.spark.sql.errors;
/**
 * Object for grouping error messages from (most) exceptions thrown during query execution.
 * This does not include exceptions thrown during the eager execution of commands, which are
 * grouped into {@link QueryCompilationErrors}.
 */
public  class QueryExecutionErrors {
  static public  java.lang.Throwable cannotEvaluateExpressionError (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGenerateCodeForExpressionError (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotTerminateGeneratorError (org.apache.spark.sql.catalyst.analysis.UnresolvedGenerator generator)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException castingCauseOverflowError (Object t, org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException cannotChangeDecimalPrecisionError (org.apache.spark.sql.types.Decimal value, int decimalPrecision, int decimalScale, java.lang.String context)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidInputInCastToDatetimeError (Object value, org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to, java.lang.String errorContext)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkRuntimeException invalidInputSyntaxForBooleanError (org.apache.spark.unsafe.types.UTF8String s, java.lang.String errorContext)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkNumberFormatException invalidInputInCastToNumberError (org.apache.spark.sql.types.DataType to, org.apache.spark.unsafe.types.UTF8String s, java.lang.String errorContext)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCastFromNullTypeError (org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCastError (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseDecimalError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnsupportedError (java.lang.String dataType, java.lang.String failure)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedExecuteUserDefinedFunctionError (java.lang.String funcCls, java.lang.String inputTypes, java.lang.String outputType, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException divideByZeroError (java.lang.String context)  { throw new RuntimeException(); }
  static public  java.lang.ArrayIndexOutOfBoundsException invalidArrayIndexError (int index, int numElements)  { throw new RuntimeException(); }
  static public  java.lang.ArrayIndexOutOfBoundsException invalidInputIndexError (int index, int numElements)  { throw new RuntimeException(); }
  static public  java.lang.ArrayIndexOutOfBoundsException invalidElementAtIndexError (int index, int numElements)  { throw new RuntimeException(); }
  static public  java.util.NoSuchElementException mapKeyNotExistError (Object key, org.apache.spark.sql.types.DataType dataType, java.lang.String context)  { throw new RuntimeException(); }
  static public  java.lang.Throwable inputTypeUnsupportedError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.time.DateTimeException invalidFractionOfSecondError ()  { throw new RuntimeException(); }
  static public  java.time.format.DateTimeParseException ansiDateTimeParseError (java.time.format.DateTimeParseException e)  { throw new RuntimeException(); }
  static public  java.time.DateTimeException ansiDateTimeError (java.time.DateTimeException e)  { throw new RuntimeException(); }
  static public  java.text.ParseException ansiParseError (java.text.ParseException e)  { throw new RuntimeException(); }
  static public  java.lang.IllegalArgumentException ansiIllegalArgumentError (java.lang.String message)  { throw new RuntimeException(); }
  static public  java.lang.IllegalArgumentException ansiIllegalArgumentError (java.lang.IllegalArgumentException e)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException overflowInSumOfDecimalError (java.lang.String context)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException overflowInIntegralDivideError (java.lang.String context)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException mapSizeExceedArraySizeWhenZipMapError (int size)  { throw new RuntimeException(); }
  static public  java.lang.Throwable copyNullFieldNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException literalTypeUnsupportedError (Object v)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException pivotColumnUnsupportedError (Object v, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException noDefaultForDataTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable doGenCodeOfAliasShouldNotBeCalledError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable orderedOperationUnsupportedByDataTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable regexGroupIndexLessThanZeroError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable regexGroupIndexExceedGroupCountError (int groupCount, int groupIndex)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidUrlError (org.apache.spark.unsafe.types.UTF8String url, java.net.URISyntaxException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeOperationUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable mergeUnsupportedByWindowFunctionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnexpectedError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable typeUnsupportedError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable negativeValueUnexpectedError (org.apache.spark.sql.catalyst.expressions.Expression frequencyExpression)  { throw new RuntimeException(); }
  static public  java.lang.Throwable addNewFunctionMismatchedWithFunctionError (java.lang.String funcName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGenerateCodeForUncomparableTypeError (java.lang.String codeType, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGenerateCodeForUnsupportedTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotInterpolateClassIntoCodeBlockError (Object arg)  { throw new RuntimeException(); }
  static public  java.lang.Throwable customCollectionClsNotResolvedError ()  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException classUnsupportedByMapObjectsError (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException nullAsMapKeyNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable methodNotDeclaredError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable constructorNotFoundError (java.lang.String cls)  { throw new RuntimeException(); }
  static public  java.lang.Throwable primaryConstructorNotFoundError (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedNaturalJoinTypeError (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notExpectedUnresolvedEncoderError (org.apache.spark.sql.catalyst.expressions.AttributeReference attr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedEncoderError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable notOverrideExpectedMethodsError (java.lang.String className, java.lang.String m1, java.lang.String m2)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToConvertValueToJsonError (java.lang.Object value, java.lang.Class<?> cls, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedOperatorInCorrelatedSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan op, java.lang.String pos)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unreachableError (java.lang.String err)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedRoundingMode (scala.Enumeration.Value roundMode)  { throw new RuntimeException(); }
  static public  java.lang.Throwable resolveCannotHandleNestedSchema (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException inputExternalRowCannotBeNullError ()  { throw new RuntimeException(); }
  static public  java.lang.String fieldCannotBeNullMsg (int index, java.lang.String fieldName)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException fieldCannotBeNullError (int index, java.lang.String fieldName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToCreateDatabaseAsFailedToCreateDirectoryError (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToDropDatabaseAsFailedToDeleteDirectoryError (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToCreateTableAsFailedToCreateDirectoryError (java.lang.String table, org.apache.hadoop.fs.Path defaultTableLocation, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToDeletePartitionPathError (org.apache.hadoop.fs.Path partitionPath, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToDropTableAsFailedToDeleteDirectoryError (java.lang.String table, org.apache.hadoop.fs.Path dir, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToRenameTableAsFailedToRenameDirectoryError (java.lang.String oldName, java.lang.String newName, org.apache.hadoop.fs.Path oldDir, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToCreatePartitionPathError (org.apache.hadoop.fs.Path partitionPath, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unableToRenamePartitionPathError (org.apache.hadoop.fs.Path oldPartPath, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable methodNotImplementedError (java.lang.String methodName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableStatsNotSpecifiedError ()  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException arithmeticOverflowError (java.lang.ArithmeticException e)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException arithmeticOverflowError (java.lang.String message, java.lang.String hint, java.lang.String errorContext)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException unaryMinusCauseOverflowError (int originValue)  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException binaryArithmeticCauseOverflowError (short eval1, java.lang.String symbol, short eval2)  { throw new RuntimeException(); }
  static public  java.lang.String failedSplitSubExpressionMsg (int length)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedSplitSubExpressionError (int length)  { throw new RuntimeException(); }
  static public  java.lang.String failedToCompileMsg (java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable internalCompilerError (org.codehaus.janino.InternalCompilerException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable compilerError (org.codehaus.commons.compiler.CompileException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTableChangeError (java.lang.IllegalArgumentException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notADatasourceRDDPartitionError (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataPathNotSpecifiedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable createStreamingSourceNotSpecifySchemaError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable streamedOperatorUnsupportedByDataSourceError (java.lang.String className, java.lang.String operator)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multiplePathsSpecifiedError (scala.collection.Seq<java.lang.String> allPaths)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToFindDataSourceError (java.lang.String provider, java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  java.lang.Throwable removedClassInSpark2Error (java.lang.String className, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable incompatibleDataSourceRegisterError (java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unrecognizedFileFormatError (java.lang.String format)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkUpgradeException sparkUpgradeInReadingDatesError (java.lang.String format, java.lang.String config, java.lang.String option)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkUpgradeException sparkUpgradeInWritingDatesError (java.lang.String format, java.lang.String config)  { throw new RuntimeException(); }
  static public  java.lang.Throwable buildReaderUnsupportedForFileFormatError (java.lang.String format)  { throw new RuntimeException(); }
  static public  java.lang.Throwable jobAbortedError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable taskFailedWhileWritingRowsError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable readCurrentFileNotFoundError (java.io.FileNotFoundException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedSaveModeError (java.lang.String saveMode, boolean pathExists)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotClearOutputDirectoryError (org.apache.hadoop.fs.Path staticPrefixPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotClearPartitionDirectoryError (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToCastValueToDataTypeForPartitionColumnError (java.lang.String value, org.apache.spark.sql.types.DataType dataType, java.lang.String columnName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable endOfStreamError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable fallbackV1RelationReportsInconsistentSchemaError (org.apache.spark.sql.types.StructType v2Schema, org.apache.spark.sql.types.StructType v1Schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noRecordsFromEmptyDataReaderError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable fileNotFoundError (java.io.FileNotFoundException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedSchemaColumnConvertError (java.lang.String filePath, java.lang.String column, java.lang.String logicalType, java.lang.String physicalType, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReadFilesError (java.lang.Throwable e, java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateColumnarReaderError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidNamespaceNameError (java.lang.String[] namespace)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedPartitionTransformError (org.apache.spark.sql.connector.expressions.Transform transform)  { throw new RuntimeException(); }
  static public  java.lang.Throwable missingDatabaseLocationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRemoveReservedPropertyError (java.lang.String property)  { throw new RuntimeException(); }
  static public  java.lang.Throwable namespaceNotEmptyError (java.lang.String[] namespace)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writingJobFailedError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writingJobAbortedError (java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable commitDeniedError (int partId, long taskId, int attemptId, int stageId, int stageAttempt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTableWritesError (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateJDBCTableWithPartitionsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedUserSpecifiedSchemaError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeUnsupportedForBinaryFileDataSourceError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable fileLengthExceedsMaxLengthError (org.apache.hadoop.fs.FileStatus status, int maxLength)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedFieldNameError (java.lang.String fieldName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSpecifyBothJdbcTableNameAndQueryError (java.lang.String jdbcTableName, java.lang.String jdbcQueryString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable missingJdbcTableNameAndQueryError (java.lang.String jdbcTableName, java.lang.String jdbcQueryString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable emptyOptionError (java.lang.String optionName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidJdbcTxnIsolationLevelError (java.lang.String jdbcTxnIsolationLevel, java.lang.String value)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGetJdbcTypeError (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unrecognizedSqlTypeError (int sqlType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedJdbcTypeError (java.lang.String content)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedArrayElementTypeBasedOnBinaryError (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nestedArraysUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotTranslateNonNullValueForFieldError (int pos)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidJdbcNumPartitionsError (int n, java.lang.String jdbcNumPartitions)  { throw new RuntimeException(); }
  static public  java.lang.Throwable transactionUnsupportedByJdbcServerError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnsupportedYetError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedOperationForDataTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable inputFilterNotFullyConvertibleError (java.lang.String owner)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReadFooterForFileError (org.apache.hadoop.fs.Path file, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReadFooterForFileError (org.apache.hadoop.fs.FileStatus file, java.lang.RuntimeException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foundDuplicateFieldInCaseInsensitiveModeError (java.lang.String requiredFieldName, java.lang.String matchedOrcFields)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foundDuplicateFieldInFieldIdLookupModeError (int requiredId, java.lang.String matchedFields)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToMergeIncompatibleSchemasError (org.apache.spark.sql.types.StructType left, org.apache.spark.sql.types.StructType right, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ddlUnsupportedTemporarilyError (java.lang.String ddl)  { throw new RuntimeException(); }
  static public  java.lang.Throwable operatingOnCanonicalizationPlanError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable executeBroadcastTimeoutError (long timeout, scala.Option<java.util.concurrent.TimeoutException> ex)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCompareCostWithTargetCostError (java.lang.String cost)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedDataTypeError (java.lang.String dt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notSupportTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notSupportNonPrimitiveTypeError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable useDictionaryEncodingWhenDictionaryOverflowError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable endOfIteratorError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAllocateMemoryToGrowBytesToBytesMapError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAcquireMemoryToBuildLongHashedRelationError (long size, long got)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAcquireMemoryToBuildUnsafeHashedRelationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable rowLargerThan256MUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotBuildHashedRelationWithUniqueKeysExceededError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotBuildHashedRelationLargerThan8GError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToPushRowIntoRowQueueError (java.lang.String rowQueue)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedWindowFunctionFrameError (java.lang.String frame)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseStatisticAsPercentileError (java.lang.String stats, java.lang.NumberFormatException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable statisticNotRecognizedError (java.lang.String stats)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unknownColumnError (java.lang.String unknownColumn)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedAccumulableUpdateValueError (Object o)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unscaledValueTooLargeForPrecisionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable decimalPrecisionExceedsMaxPrecisionError (int precision, int maxPrecision)  { throw new RuntimeException(); }
  static public  java.lang.Throwable outOfDecimalTypeRangeError (org.apache.spark.unsafe.types.UTF8String str)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedArrayTypeError (java.lang.Class<?> clazz)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedJavaTypeError (java.lang.Class<?> clazz)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedParsingStructTypeError (java.lang.String raw)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedMergingFieldsError (java.lang.String leftName, java.lang.String rightName, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMergeDecimalTypesWithIncompatiblePrecisionAndScaleError (int leftPrecision, int rightPrecision, int leftScale, int rightScale)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMergeDecimalTypesWithIncompatiblePrecisionError (int leftPrecision, int rightPrecision)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMergeDecimalTypesWithIncompatibleScaleError (int leftScale, int rightScale)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMergeIncompatibleDataTypesError (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  static public  java.lang.Throwable exceedMapSizeLimitError (int size)  { throw new RuntimeException(); }
  static public  java.lang.Throwable duplicateMapKeyFoundError (Object key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mapDataKeyArrayLengthDiffersFromValueArrayLengthError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable fieldDiffersFromDerivedLocalDateError (java.time.temporal.ChronoField field, int actual, int expected, java.time.LocalDate candidate)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToParseDateTimeInNewParserError (java.lang.String s, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToFormatDateTimeInNewFormatterError (java.lang.String resultCandidate, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToRecognizePatternAfterUpgradeError (java.lang.String pattern, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToRecognizePatternError (java.lang.String pattern, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCastToDateTimeError (Object value, org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to, java.lang.String errorContext)  { throw new RuntimeException(); }
  static public  java.lang.Throwable registeringStreamingQueryListenerError (java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable concurrentQueryInstanceError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseJsonArraysAsStructsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseStringAsDataTypeError (com.fasterxml.jackson.core.JsonParser parser, com.fasterxml.jackson.core.JsonToken token, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseStringAsDataTypeError (java.lang.String pattern, java.lang.String value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToParseEmptyStringForDataTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToParseValueForDataTypeError (com.fasterxml.jackson.core.JsonParser parser, com.fasterxml.jackson.core.JsonToken token, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable rootConverterReturnNullError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotHaveCircularReferencesInBeanClassError (java.lang.Class<?> clazz)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotHaveCircularReferencesInClassError (java.lang.String t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUseInvalidJavaIdentifierAsFieldNameError (java.lang.String fieldName, org.apache.spark.sql.catalyst.WalkedTypePath walkedTypePath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindEncoderForTypeError (java.lang.String tpe, org.apache.spark.sql.catalyst.WalkedTypePath walkedTypePath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable attributesForTypeUnsupportedError (org.apache.spark.sql.catalyst.ScalaReflection.Schema schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable schemaForTypeUnsupportedError (java.lang.String tpe)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindConstructorForTypeError (java.lang.String tpe)  { throw new RuntimeException(); }
  static public  java.lang.Throwable paramExceedOneCharError (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable paramIsNotIntegerError (java.lang.String paramName, java.lang.String value)  { throw new RuntimeException(); }
  static public  java.lang.Throwable paramIsNotBooleanValueError (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foundNullValueForNotNullableFieldError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable malformedCSVRecordError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable elementsOfTupleExceedLimitError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable expressionDecodingError (java.lang.Exception e, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expressionEncodingError (java.lang.Exception e, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  static public  java.lang.Throwable classHasUnexpectedSerializerError (java.lang.String clsName, org.apache.spark.sql.catalyst.expressions.Expression objSerializer)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGetOuterPointerForInnerClassError (java.lang.Class<?> innerCls)  { throw new RuntimeException(); }
  static public  java.lang.Throwable userDefinedTypeNotAnnotatedAndRegisteredError (org.apache.spark.sql.types.UserDefinedType<?> udt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedOperandTypeForSizeFunctionError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException unexpectedValueForStartInFunctionError (java.lang.String prettyName)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException unexpectedValueForLengthInFunctionError (java.lang.String prettyName)  { throw new RuntimeException(); }
  static public  java.lang.ArrayIndexOutOfBoundsException sqlArrayIndexNotStartAtOneError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable concatArraysWithElementsExceedLimitError (long numberOfElements)  { throw new RuntimeException(); }
  static public  java.lang.Throwable flattenArraysWithElementsExceedLimitError (long numberOfElements)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException createArrayWithElementsExceedLimitError (Object count)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unionArrayWithElementsExceedLimitError (int length)  { throw new RuntimeException(); }
  static public  java.lang.Throwable initialTypeNotTargetDataTypeError (org.apache.spark.sql.types.DataType dataType, java.lang.String target)  { throw new RuntimeException(); }
  static public  java.lang.Throwable initialTypeNotTargetDataTypesError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotConvertColumnToJSONError (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable malformedRecordsDetectedInSchemaInferenceError (java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable malformedJSONError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable malformedRecordsDetectedInSchemaInferenceError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRewriteDomainJoinWithConditionsError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions, org.apache.spark.sql.catalyst.plans.logical.DomainJoin d)  { throw new RuntimeException(); }
  static public  java.lang.Throwable decorrelateInnerQueryThroughPlanUnsupportedError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  java.lang.Throwable methodCalledInAnalyzerNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSafelyMergeSerdePropertiesError (scala.collection.immutable.Map<java.lang.String, java.lang.String> props1, scala.collection.immutable.Map<java.lang.String, java.lang.String> props2, scala.collection.immutable.Set<java.lang.String> conflictKeys)  { throw new RuntimeException(); }
  static public  java.lang.Throwable pairUnsupportedAtFunctionError (org.apache.spark.sql.catalyst.plans.logical.statsEstimation.ValueInterval r1, org.apache.spark.sql.catalyst.plans.logical.statsEstimation.ValueInterval r2, java.lang.String function)  { throw new RuntimeException(); }
  static public <TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> java.lang.Throwable onceStrategyIdempotenceIsBrokenForBatchError (java.lang.String batchName, TreeType plan, TreeType reOptimized)  { throw new RuntimeException(); }
  static public  java.lang.Throwable structuralIntegrityOfInputPlanIsBrokenInClassError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable structuralIntegrityIsBrokenAfterApplyingRuleError (java.lang.String ruleName, java.lang.String batchName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ruleIdNotFoundForRuleError (java.lang.String ruleName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateArrayWithElementsExceedLimitError (long numElements, java.lang.String additionalErrorMessage)  { throw new RuntimeException(); }
  static public  java.lang.Throwable indexOutOfBoundsOfArrayDataError (int idx)  { throw new RuntimeException(); }
  static public  java.lang.Throwable malformedRecordsDetectedInRecordParsingError (org.apache.spark.sql.catalyst.util.BadRecordException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable remoteOperationsUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidKerberosConfigForHiveServer2Error ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable parentSparkUIToAttachTabNotFoundError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable inferSchemaUnsupportedForHiveError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable requestedPartitionsMismatchTablePartitionsError (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dynamicPartitionKeyNotAmongWrittenPartitionPathsError (java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRemovePartitionDirError (org.apache.hadoop.fs.Path partitionPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateStagingDirError (java.lang.String message, java.io.IOException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable serDeInterfaceNotFoundError (java.lang.NoClassDefFoundError e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable convertHiveTableToCatalogTableError (org.apache.spark.SparkException e, java.lang.String dbName, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRecognizeHiveTypeError (org.apache.spark.sql.catalyst.parser.ParseException e, java.lang.String fieldType, java.lang.String fieldName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable getTablesByTypeUnsupportedByHiveVersionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dropTableWithPurgeUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableWithDropPartitionAndPurgeUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionFilterError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable getPartitionMetadataByFilterError (java.lang.reflect.InvocationTargetException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedHiveMetastoreVersionError (java.lang.String version, java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadHiveClientCausesNoClassDefFoundError (java.lang.NoClassDefFoundError cnf, scala.collection.Seq<java.net.URL> execJars, java.lang.String key, java.lang.reflect.InvocationTargetException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFetchTablesOfDatabaseError (java.lang.String dbName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable illegalLocationClauseForViewPartitionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable renamePathAsExistsPathError (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path dstPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable renameAsExistsPathError (org.apache.hadoop.fs.Path dstPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable renameSrcPathNotFoundError (org.apache.hadoop.fs.Path srcPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedRenameTempFileError (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path dstPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable legacyMetadataPathExistsError (org.apache.hadoop.fs.Path metadataPath, org.apache.hadoop.fs.Path legacyMetadataPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable partitionColumnNotFoundInSchemaError (java.lang.String col, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable stateNotDefinedOrAlreadyRemovedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSetTimeoutDurationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGetEventTimeWatermarkError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSetTimeoutTimestampError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable batchMetadataFileNotFoundError (org.apache.hadoop.fs.Path batchMetadataFile)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multiStreamingQueriesUsingPathConcurrentlyError (java.lang.String path, org.apache.hadoop.fs.FileAlreadyExistsException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable addFilesWithAbsolutePathUnsupportedError (java.lang.String commitProtocol)  { throw new RuntimeException(); }
  static public  java.lang.Throwable microBatchUnsupportedByDataSourceError (java.lang.String srcName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotExecuteStreamingRelationExecError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidStreamingOutputModeError (scala.Option<org.apache.spark.sql.streaming.OutputMode> outputMode)  { throw new RuntimeException(); }
  static public  java.lang.Throwable catalogPluginClassNotFoundError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable catalogPluginClassNotImplementedError (java.lang.String name, java.lang.String pluginClassName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable catalogPluginClassNotFoundForCatalogError (java.lang.String name, java.lang.String pluginClassName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable catalogFailToFindPublicNoArgConstructorError (java.lang.String name, java.lang.String pluginClassName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable catalogFailToCallPublicNoArgConstructorError (java.lang.String name, java.lang.String pluginClassName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotInstantiateAbstractCatalogPluginClassError (java.lang.String name, java.lang.String pluginClassName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToInstantiateConstructorForCatalogError (java.lang.String name, java.lang.String pluginClassName, java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchElementExceptionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchElementExceptionError (java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMutateReadOnlySQLConfError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCloneOrCopyReadOnlySQLConfError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotGetSQLConfInSchedulerEventLoopThreadError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedOperationExceptionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable nullLiteralsCannotBeCastedError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notUserDefinedTypeError (java.lang.String name, java.lang.String userClass)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotLoadUserDefinedTypeError (java.lang.String name, java.lang.String userClass)  { throw new RuntimeException(); }
  static public  java.lang.Throwable timeZoneIdNotSpecifiedForTimestampTypeError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable notPublicClassError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable primitiveTypesNotSupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable fieldIndexOnRowWithoutSchemaError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable valueIsNullError (int index)  { throw new RuntimeException(); }
  static public  java.lang.Throwable onlySupportDataSourcesProvidingFileFormatError (java.lang.String providingClass)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToSetOriginalPermissionBackError (org.apache.hadoop.fs.permission.FsPermission permission, org.apache.hadoop.fs.Path path, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToSetOriginalACLBackError (java.lang.String aclEntries, org.apache.hadoop.fs.Path path, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multiFailuresInStageMaterializationError (java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unrecognizedCompressionSchemaTypeIDError (int typeId)  { throw new RuntimeException(); }
  static public  java.lang.Throwable getParentLoggerNotImplementedError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateParquetConverterForTypeError (org.apache.spark.sql.types.DecimalType t, java.lang.String parquetType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateParquetConverterForDecimalTypeError (org.apache.spark.sql.types.DecimalType t, java.lang.String parquetType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateParquetConverterForDataTypeError (org.apache.spark.sql.types.DataType t, java.lang.String parquetType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAddMultiPartitionsOnNonatomicPartitionTableError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable userSpecifiedSchemaUnsupportedByDataSourceError (org.apache.spark.sql.connector.catalog.TableProvider provider)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropMultiPartitionsOnNonatomicPartitionTableError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable truncateMultiPartitionUnsupportedError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable overwriteTableByUnsupportedExpressionError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dynamicPartitionOverwriteUnsupportedByTableError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedMergingSchemaError (org.apache.spark.sql.types.StructType schema, org.apache.spark.SparkException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotBroadcastTableOverMaxTableRowsError (long maxBroadcastTableRows, long numRows)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotBroadcastTableOverMaxTableBytesError (long maxBroadcastTableBytes, long dataSize)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notEnoughMemoryToBuildAndBroadcastTableError (java.lang.OutOfMemoryError oe)  { throw new RuntimeException(); }
  static public  java.lang.Throwable executeCodePathUnsupportedError (java.lang.String execName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotMergeClassWithOtherClassError (java.lang.String className, java.lang.String otherClass)  { throw new RuntimeException(); }
  static public  java.lang.Throwable continuousProcessingUnsupportedByDataSourceError (java.lang.String sourceName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToReadDataError (java.lang.Throwable failureReason)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToGenerateEpochMarkerError (java.lang.Throwable failureReason)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foreachWriterAbortedDueToTaskFailureError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable integerOverflowError (java.lang.String message)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToReadDeltaFileError (org.apache.hadoop.fs.Path fileToRead, java.lang.String clazz, int keySize)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToReadSnapshotFileError (org.apache.hadoop.fs.Path fileToRead, java.lang.String clazz, java.lang.String message)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotPurgeAsBreakInternalStateError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cleanUpSourceFilesUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable latestOffsetNotCalledError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable legacyCheckpointDirectoryExistsError (org.apache.hadoop.fs.Path checkpointPath, java.lang.String legacyCheckpointDir)  { throw new RuntimeException(); }
  static public  java.lang.Throwable subprocessExitedError (int exitCode, org.apache.spark.util.CircularBuffer stderrBuffer, java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable outputDataTypeUnsupportedByNodeWithoutSerdeError (java.lang.String nodeName, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidStartIndexError (int numRows, int startIndex)  { throw new RuntimeException(); }
  static public  java.lang.Throwable concurrentModificationOnExternalAppendOnlyUnsafeRowArrayError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable doExecuteBroadcastNotImplementedError (java.lang.String nodeName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable databaseNameConflictWithSystemPreservedDatabaseError (java.lang.String globalTempDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable commentOnTableUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedUpdateColumnNullabilityError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable renameColumnUnsupportedForOlderMySQLError ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.QueryExecutionException failedToExecuteQueryError (java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nestedFieldUnsupportedError (java.lang.String colName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable transformationsAndActionsNotInvokedByDriverError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable repeatedPivotsUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable pivotNotAfterGroupByUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException invalidAesKeyLengthError (int actualLength)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException aesModeUnsupportedError (java.lang.String mode, java.lang.String padding)  { throw new RuntimeException(); }
  static public  java.lang.RuntimeException aesCryptoError (java.lang.String detailMessage)  { throw new RuntimeException(); }
  static public  java.lang.Throwable hiveTableWithAnsiIntervalsError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotConvertOrcTimestampToTimestampNTZError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotConvertOrcTimestampNTZToTimestampLTZError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable writePartitionExceedConfigSizeWhenDynamicPartitionError (int numWrittenParts, int maxDynamicPartitions, java.lang.String maxDynamicPartitionsKey)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidNumberFormatError (org.apache.spark.unsafe.types.UTF8String input, java.lang.String format)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multipleBucketTransformsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedCreateNamespaceCommentError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedRemoveNamespaceCommentError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedDropNamespaceRestrictError ()  { throw new RuntimeException(); }
  static public  java.lang.ArithmeticException timestampAddOverflowError (long micros, int amount, java.lang.String unit)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLValue (Object v, org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLStmt (java.lang.String text)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLId (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLId (java.lang.String parts)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLType (org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLConf (java.lang.String conf)  { throw new RuntimeException(); }
  static public  java.lang.String toDSOption (java.lang.String option)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLExpr (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
