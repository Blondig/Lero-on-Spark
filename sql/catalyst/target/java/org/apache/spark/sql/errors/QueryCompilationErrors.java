package org.apache.spark.sql.errors;
/**
 * Object for grouping error messages from exceptions thrown during query compilation.
 * As commands are executed eagerly, this also includes errors thrown during the execution of
 * commands, which users can see immediately.
 */
public  class QueryCompilationErrors {
  static public  java.lang.Throwable groupingIDMismatchError (org.apache.spark.sql.catalyst.expressions.GroupingID groupingID, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs)  { throw new RuntimeException(); }
  static public  java.lang.Throwable groupingColInvalidError (org.apache.spark.sql.catalyst.expressions.Expression groupingCol, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs)  { throw new RuntimeException(); }
  static public  java.lang.Throwable groupingSizeTooLargeError (int sizeLimit)  { throw new RuntimeException(); }
  static public  java.lang.Throwable zeroArgumentIndexError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unorderablePivotColError (org.apache.spark.sql.catalyst.expressions.Expression pivotCol)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonLiteralPivotValError (org.apache.spark.sql.catalyst.expressions.Expression pivotVal)  { throw new RuntimeException(); }
  static public  java.lang.Throwable pivotValDataTypeMismatchError (org.apache.spark.sql.catalyst.expressions.Expression pivotVal, org.apache.spark.sql.catalyst.expressions.Expression pivotCol)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedIfNotExistsError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonPartitionColError (java.lang.String partitionName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable missingStaticPartitionColumn (java.lang.String staticName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nestedGeneratorError (org.apache.spark.sql.catalyst.expressions.Expression trimmedNestedGenerator)  { throw new RuntimeException(); }
  static public  java.lang.Throwable moreThanOneGeneratorError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> generators, java.lang.String clause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable generatorOutsideSelectError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  java.lang.Throwable legacyStoreAssignmentPolicyError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unresolvedUsingColForJoinError (java.lang.String colName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, java.lang.String side)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeMismatchForDeserializerError (org.apache.spark.sql.types.DataType dataType, java.lang.String desiredType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable fieldNumberMismatchForDeserializerError (org.apache.spark.sql.types.StructType schema, int maxOrdinal)  { throw new RuntimeException(); }
  static public  java.lang.Throwable upCastFailureError (java.lang.String fromStr, org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable outerScopeFailureForNewInstanceError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable referenceColNotFoundForAlterTableChangesError (org.apache.spark.sql.connector.catalog.TableChange.After after, java.lang.String parentName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowSpecificationNotDefinedError (java.lang.String windowName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable selectExprNotInGroupByError (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases)  { throw new RuntimeException(); }
  static public  java.lang.Throwable groupingMustWithGroupingSetsOrCubeOrRollupError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable pandasUDFAggregateNotSupportedInPivotError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable aggregateExpressionRequiredForPivotError (java.lang.String sql)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeIntoTempViewNotAllowedError (java.lang.String quoted)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expectTableOrPermanentViewNotTempViewError (java.lang.String quoted, java.lang.String cmd, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable readNonStreamingTempViewError (java.lang.String quoted)  { throw new RuntimeException(); }
  static public  java.lang.Throwable viewDepthExceedsMaxResolutionDepthError (org.apache.spark.sql.catalyst.TableIdentifier identifier, int maxNestedViewDepth, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable insertIntoViewNotAllowedError (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeIntoViewNotAllowedError (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeIntoV1TableNotAllowedError (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expectTableNotViewError (org.apache.spark.sql.catalyst.analysis.ResolvedView v, java.lang.String cmd, scala.Option<java.lang.String> mismatchHint, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expectViewNotTableError (org.apache.spark.sql.catalyst.analysis.ResolvedTable v, java.lang.String cmd, scala.Option<java.lang.String> mismatchHint, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expectPersistentFuncError (java.lang.String name, java.lang.String cmd, scala.Option<java.lang.String> mismatchHint, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable permanentViewNotSupportedByStreamingReadingAPIError (java.lang.String quoted)  { throw new RuntimeException(); }
  static public  java.lang.Throwable starNotAllowedWhenGroupByOrdinalPositionUsedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidStarUsageError (java.lang.String prettyName, scala.collection.Seq<org.apache.spark.sql.catalyst.analysis.Star> stars)  { throw new RuntimeException(); }
  static public  java.lang.Throwable singleTableStarInCountNotAllowedError (java.lang.String targetString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable orderByPositionRangeError (int index, int size, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable groupByPositionRefersToAggregateFunctionError (int index, org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable groupByPositionRangeError (int index, int size)  { throw new RuntimeException(); }
  static public  java.lang.Throwable generatorNotExpectedError (org.apache.spark.sql.catalyst.FunctionIdentifier name, java.lang.String classCanonicalName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable functionWithUnsupportedSyntaxError (java.lang.String prettyName, java.lang.String syntax)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonDeterministicFilterInAggregateError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonBooleanFilterInAggregateError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable aggregateInAggregateFilterError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowFunctionInAggregateFilterError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable aliasNumberNotMatchColumnNumberError (int columnSize, int outputSize, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable aliasesNumberNotMatchUDTFOutputError (int aliasesSize, java.lang.String aliasesNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowAggregateFunctionWithFilterNotSupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowFunctionInsideAggregateFunctionNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable expressionWithoutWindowExpressionError (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable expressionWithMultiWindowExpressionsError (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition> distinctWindowSpec)  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowFunctionNotAllowedError (java.lang.String clauseName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSpecifyWindowFrameError (java.lang.String prettyName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowFrameNotMatchRequiredFrameError (org.apache.spark.sql.catalyst.expressions.SpecifiedWindowFrame f, org.apache.spark.sql.catalyst.expressions.WindowFrame required)  { throw new RuntimeException(); }
  static public  java.lang.Throwable windowFunctionWithWindowFrameNotOrderedError (org.apache.spark.sql.catalyst.expressions.WindowFunction wf)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotResolveUserSpecifiedColumnsError (java.lang.String col, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeTableWithMismatchedColumnsError (int columnSize, int outputSize, org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multiTimeWindowExpressionsNotSupportedError (org.apache.spark.sql.catalyst.trees.TreeNode<?> t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable sessionWindowGapDurationDataTypeError (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  java.lang.Throwable viewOutputNumberMismatchQueryColumnNamesError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<java.lang.String> queryColumnNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable attributeNotFoundError (java.lang.String colName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  static public  java.lang.Throwable functionUndefinedError (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidFunctionArgumentsError (java.lang.String name, java.lang.String expectedInfo, int actualNumber)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidFunctionArgumentNumberError (scala.collection.Seq<java.lang.Object> validParametersCount, java.lang.String name, int actualNumber)  { throw new RuntimeException(); }
  static public  java.lang.Throwable functionAcceptsOnlyOneArgumentError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterV2TableSetLocationWithPartitionNotSupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable joinStrategyHintParameterNotSupportedError (Object unsupported)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidHintParameterError (java.lang.String hintName, scala.collection.Seq<java.lang.Object> invalidParams)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidCoalesceHintParameterError (java.lang.String hintName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable attributeNameSyntaxError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable starExpandDataTypeNotSupportedError (scala.collection.Seq<java.lang.String> attributes)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotResolveStarExpandGivenInputColumnsError (java.lang.String targetString, java.lang.String columns)  { throw new RuntimeException(); }
  static public  java.lang.Throwable addColumnWithV1TableCannotSpecifyNotNullError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable operationOnlySupportedWithV2TableError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterColumnWithV1TableCannotSpecifyNotNullError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterColumnCannotFindColumnInV1TableError (java.lang.String colName, org.apache.spark.sql.connector.catalog.V1Table v1Table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidDatabaseNameError (java.lang.String quoted)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropViewWithDropTableError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable showColumnsWithConflictDatabasesError (scala.collection.Seq<java.lang.String> db, org.apache.spark.sql.catalyst.TableIdentifier v1TableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable sqlOnlySupportedWithV1TablesError (java.lang.String sql)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateTableWithBothProviderAndSerdeError (scala.Option<java.lang.String> provider, scala.Option<org.apache.spark.sql.catalyst.plans.logical.SerdeInfo> maybeSerdeInfo)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidFileFormatForStoredAsError (org.apache.spark.sql.catalyst.plans.logical.SerdeInfo serdeInfo)  { throw new RuntimeException(); }
  static public  java.lang.Throwable commandNotSupportNestedColumnError (java.lang.String command, java.lang.String quoted)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnDoesNotExistError (java.lang.String colName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable renameTempViewToExistingViewError (java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropNonemptyDatabaseError (java.lang.String db)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropNonemptyNamespaceError (scala.collection.Seq<java.lang.String> namespace)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidNameForTableOrDatabaseError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateDatabaseWithSameNameAsPreservedDatabaseError (java.lang.String database)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropDefaultDatabaseError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUsePreservedDatabaseAsCurrentDatabaseError (java.lang.String database)  { throw new RuntimeException(); }
  static public  java.lang.Throwable createExternalTableWithoutLocationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotOperateManagedTableWithExistingLocationError (java.lang.String methodName, org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, org.apache.hadoop.fs.Path tableLocation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dropNonExistentColumnsNotSupportedError (scala.collection.Seq<java.lang.String> nonExistentColumnNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRetrieveTableOrViewNotInSameDatabaseError (scala.collection.Seq<org.apache.spark.sql.catalyst.QualifiedTableName> qualifiedTableNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable renameTableSourceAndDestinationMismatchError (java.lang.String db, java.lang.String newDb)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRenameTempViewWithDatabaseSpecifiedError (org.apache.spark.sql.catalyst.TableIdentifier oldName, org.apache.spark.sql.catalyst.TableIdentifier newName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRenameTempViewToExistingTableError (org.apache.spark.sql.catalyst.TableIdentifier oldName, org.apache.spark.sql.catalyst.TableIdentifier newName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionSpecError (java.lang.String details)  { throw new RuntimeException(); }
  static public  java.lang.Throwable functionAlreadyExistsError (org.apache.spark.sql.catalyst.FunctionIdentifier func)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotLoadClassWhenRegisteringFunctionError (java.lang.String className, org.apache.spark.sql.catalyst.FunctionIdentifier func)  { throw new RuntimeException(); }
  static public  java.lang.Throwable resourceTypeNotSupportedError (java.lang.String resourceType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableNotSpecifyDatabaseError (org.apache.spark.sql.catalyst.TableIdentifier identifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableNotSpecifyLocationUriError (org.apache.spark.sql.catalyst.TableIdentifier identifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable partitionNotSpecifyLocationUriError (java.lang.String specString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidBucketNumberError (int bucketingMaxBuckets, int numBuckets)  { throw new RuntimeException(); }
  static public  java.lang.Throwable corruptedTableNameContextInCatalogError (int numParts, int index)  { throw new RuntimeException(); }
  static public  java.lang.Throwable corruptedViewSQLConfigsInCatalogError (java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable corruptedViewQueryOutputColumnsInCatalogError (java.lang.String numCols, int index)  { throw new RuntimeException(); }
  static public  java.lang.Throwable corruptedViewReferredTempViewInCatalogError (java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable corruptedViewReferredTempFunctionsInCatalogError (java.lang.Exception e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnStatisticsDeserializationNotSupportedError (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnStatisticsSerializationNotSupportedError (java.lang.String colName, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReadCorruptedTablePropertyError (java.lang.String key, java.lang.String details)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidSchemaStringError (org.apache.spark.sql.catalyst.expressions.Expression exp)  { throw new RuntimeException(); }
  static public  java.lang.Throwable schemaNotFoldableError (org.apache.spark.sql.catalyst.expressions.Expression exp)  { throw new RuntimeException(); }
  static public  java.lang.Throwable schemaIsNotStructTypeError (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable keyValueInMapNotStringError (org.apache.spark.sql.catalyst.expressions.CreateMap m)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonMapFunctionNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidFieldTypeForCorruptRecordError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnsupportedByClassError (org.apache.spark.sql.types.DataType x, java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable parseModeUnsupportedError (java.lang.String funcName, org.apache.spark.sql.catalyst.util.ParseMode mode)  { throw new RuntimeException(); }
  static public  java.lang.Throwable requireLiteralParameter (java.lang.String funcName, java.lang.String argName, java.lang.String requiredType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidStringLiteralParameter (java.lang.String funcName, java.lang.String argName, java.lang.String invalidValue, scala.Option<java.lang.String> allowedValues)  { throw new RuntimeException(); }
  static public  java.lang.Throwable literalTypeUnsupportedForSourceTypeError (java.lang.String field, org.apache.spark.sql.catalyst.expressions.Expression source)  { throw new RuntimeException(); }
  static public  java.lang.Throwable arrayComponentTypeUnsupportedError (java.lang.Class<?> clz)  { throw new RuntimeException(); }
  static public  java.lang.Throwable secondArgumentNotDoubleLiteralError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnsupportedByExtractValueError (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.catalyst.expressions.Expression extraction, org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noHandlerForUDAFError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable batchWriteCapabilityError (org.apache.spark.sql.connector.catalog.Table table, java.lang.String v2WriteClassName, java.lang.String v1WriteClassName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedDeleteByConditionWithSubqueryError (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotTranslateExpressionToSourceFilterError (org.apache.spark.sql.catalyst.expressions.Expression f)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDeleteTableWhereFiltersError (org.apache.spark.sql.connector.catalog.Table table, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public  java.lang.Throwable deleteOnlySupportedWithV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable describeDoesNotSupportPartitionForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReplaceMissingTableError (org.apache.spark.sql.connector.catalog.Identifier tableIdentifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotReplaceMissingTableError (org.apache.spark.sql.connector.catalog.Identifier tableIdentifier, scala.Option<java.lang.Throwable> cause)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTableOperationError (org.apache.spark.sql.connector.catalog.Table table, java.lang.String cmd)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedBatchReadError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedMicroBatchOrContinuousScanError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedAppendInBatchModeError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedDynamicOverwriteInBatchModeError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTruncateInBatchModeError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedOverwriteByFilterInBatchModeError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable streamingSourcesDoNotSupportCommonExecutionModeError (scala.collection.Seq<java.lang.String> microBatchSources, scala.collection.Seq<java.lang.String> continuousSources)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchTableError (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchNamespaceError (java.lang.String[] namespace)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableAlreadyExistsError (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  static public  java.lang.Throwable requiresSinglePartNamespaceError (scala.collection.Seq<java.lang.String> ns)  { throw new RuntimeException(); }
  static public  java.lang.Throwable namespaceAlreadyExistsError (java.lang.String[] namespace)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateJDBCTableUsingProviderError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateJDBCTableUsingLocationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateJDBCNamespaceUsingProviderError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateJDBCNamespaceWithPropertyError (java.lang.String k)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSetJDBCNamespaceWithPropertyError (java.lang.String k)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUnsetJDBCNamespaceWithPropertyError (java.lang.String k)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedJDBCNamespaceChangeInCatalogError (scala.collection.Seq<org.apache.spark.sql.connector.catalog.NamespaceChange> changes)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportReadsError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportWritesError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportDeletesError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportTruncatesError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportPartitionManagementError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotSupportAtomicPartitionManagementError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableIsNotRowLevelOperationTableError (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRenameTableWithAlterViewError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable analyzeTableNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableRecoverPartitionsNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableSerDePropertiesNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableAsSerdeNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable showColumnsNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable repairTableNotSupportedForV2TablesError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable databaseFromV1SessionCatalogNotSpecifiedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable nestedDatabaseUnsupportedByV1SessionCatalogError (java.lang.String catalog)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidRepartitionExpressionsError (scala.collection.Seq<java.lang.Object> sortOrders)  { throw new RuntimeException(); }
  static public  java.lang.Throwable partitionColumnNotSpecifiedError (java.lang.String format, java.lang.String partitionColumn)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataSchemaNotSpecifiedError (java.lang.String format)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataPathNotExistError (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataSourceOutputModeUnsupportedError (java.lang.String className, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  static public  java.lang.Throwable schemaNotSpecifiedForSchemaRelationProviderError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable userSpecifiedSchemaMismatchActualSchemaError (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructType actualSchema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataSchemaNotSpecifiedError (java.lang.String format, java.lang.String fileCatalog)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidDataSourceError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSaveIntervalIntoExternalStorageError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotResolveAttributeError (java.lang.String name, java.lang.String outputStr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable orcNotUsedWithHiveEnabledError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToFindAvroDataSourceError (java.lang.String provider)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToFindKafkaDataSourceError (java.lang.String provider)  { throw new RuntimeException(); }
  static public  java.lang.Throwable findMultipleDataSourceError (java.lang.String provider, scala.collection.Seq<java.lang.String> sourceNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeEmptySchemasUnsupportedByDataSourceError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable insertMismatchedColumnNumberError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> targetAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> sourceAttributes, int staticPartitionsSize)  { throw new RuntimeException(); }
  static public  java.lang.Throwable insertMismatchedPartitionNumberError (org.apache.spark.sql.types.StructType targetPartitionSchema, int providedPartitionsSize)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionColumnError (java.lang.String partKey, org.apache.spark.sql.types.StructType targetPartitionSchema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable multiplePartitionColumnValuesSpecifiedError (org.apache.spark.sql.types.StructField field, scala.collection.immutable.Map<java.lang.String, java.lang.String> potentialSpecs)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidOrderingForConstantValuePartitionColumnError (org.apache.spark.sql.types.StructType targetPartitionSchema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotWriteDataToRelationsWithMultiplePathsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedToRebuildExpressionError (org.apache.spark.sql.sources.Filter filter)  { throw new RuntimeException(); }
  static public  java.lang.Throwable dataTypeUnsupportedByDataSourceError (java.lang.String format, org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToResolveDataSourceForTableError (org.apache.spark.sql.catalyst.catalog.CatalogTable table, java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable outputPathAlreadyExistsError (org.apache.hadoop.fs.Path outputPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUseDataTypeForPartitionColumnError (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUseAllColumnsForPartitionColumnsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable partitionColumnNotFoundInSchemaError (java.lang.String col, java.lang.String schemaCatalog)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnNotFoundInSchemaError (org.apache.spark.sql.types.StructField col, scala.Option<org.apache.spark.sql.types.StructType> tableSchema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedDataSourceTypeForDirectQueryOnFilesError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable saveDataIntoViewNotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedTableFormatError (java.lang.String tableName, java.lang.Class<?> existingProvider, java.lang.Class<?> specifiedProvider)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedTableLocationError (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.catalog.CatalogTable existingTable, org.apache.spark.sql.catalyst.catalog.CatalogTable tableDesc)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedTableColumnNumberError (java.lang.String tableName, org.apache.spark.sql.catalyst.catalog.CatalogTable existingTable, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotResolveColumnGivenInputColumnsError (java.lang.String col, java.lang.String inputColumns)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedTablePartitionColumnError (java.lang.String tableName, scala.collection.Seq<java.lang.String> specifiedPartCols, java.lang.String existingPartCols)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedTableBucketingError (java.lang.String tableName, java.lang.String specifiedBucketString, java.lang.String existingBucketString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable specifyPartitionNotAllowedWhenTableSchemaNotDefinedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable bucketingColumnCannotBePartOfPartitionColumnsError (java.lang.String bucketCol, scala.collection.Seq<java.lang.String> normalizedPartCols)  { throw new RuntimeException(); }
  static public  java.lang.Throwable bucketSortingColumnCannotBePartOfPartitionColumnsError (java.lang.String sortCol, scala.collection.Seq<java.lang.String> normalizedPartCols)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mismatchedInsertedDataColumnNumberError (java.lang.String tableName, org.apache.spark.sql.catalyst.plans.logical.InsertIntoStatement insert, scala.collection.immutable.Set<java.lang.String> staticPartCols)  { throw new RuntimeException(); }
  static public  java.lang.Throwable requestedPartitionsMismatchTablePartitionsError (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> normalizedPartSpec, org.apache.spark.sql.types.StructType partColNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ddlWithoutHiveSupportEnabledError (java.lang.String detail)  { throw new RuntimeException(); }
  static public  java.lang.Throwable createTableColumnTypesOptionColumnNotFoundInSchemaError (java.lang.String col, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable parquetTypeUnsupportedYetError (java.lang.String parquetType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable illegalParquetTypeError (java.lang.String parquetType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unrecognizedParquetTypeError (java.lang.String field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotConvertDataTypeToParquetTypeError (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable incompatibleViewSchemaChange (java.lang.String viewName, java.lang.String colName, int expectedNum, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> actualCols, scala.Option<java.lang.String> viewDDL)  { throw new RuntimeException(); }
  static public  java.lang.Throwable numberOfPartitionsNotAllowedWithUnspecifiedDistributionError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotApplyTableValuedFunctionError (java.lang.String name, java.lang.String arguments, java.lang.String usage, java.lang.String details)  { throw new RuntimeException(); }
  static public  java.lang.Throwable incompatibleRangeInputDataTypeError (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable streamJoinStreamWithoutEqualityPredicateUnsupportedError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUseMixtureOfAggFunctionAndGroupAggPandasUDFError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable ambiguousAttributesInSelfJoinError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> ambiguousAttrs)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedEvalTypesForUDFsError (scala.collection.immutable.Set<java.lang.Object> evalTypes)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ambiguousFieldNameError (scala.collection.Seq<java.lang.String> fieldName, int numMatches, org.apache.spark.sql.catalyst.trees.Origin context)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotUseIntervalTypeInTableSchemaError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotPartitionByNestedColumnError (org.apache.spark.sql.connector.expressions.NamedReference reference)  { throw new RuntimeException(); }
  static public  java.lang.Throwable missingCatalogAbilityError (org.apache.spark.sql.connector.catalog.CatalogPlugin plugin, java.lang.String ability)  { throw new RuntimeException(); }
  static public  java.lang.Throwable identifierHavingMoreThanTwoNamePartsError (java.lang.String quoted, java.lang.String identifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable emptyMultipartIdentifierError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotOperateOnHiveDataSourceFilesError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable setPathOptionAndCallWithPathParameterError (java.lang.String method)  { throw new RuntimeException(); }
  static public  java.lang.Throwable userSpecifiedSchemaUnsupportedError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tempViewNotSupportStreamingWriteError (java.lang.String viewName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable streamingIntoViewNotSupportedError (java.lang.String viewName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable inputSourceDiffersFromDataSourceProviderError (java.lang.String source, java.lang.String tableName, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableNotSupportStreamingWriteError (java.lang.String tableName, org.apache.spark.sql.connector.catalog.Table t)  { throw new RuntimeException(); }
  static public  java.lang.Throwable queryNameNotSpecifiedForMemorySinkError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable sourceNotSupportedWithContinuousTriggerError (java.lang.String source)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnNotFoundInExistingColumnsError (java.lang.String columnType, java.lang.String columnName, scala.collection.Seq<java.lang.String> validColumnNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable operationNotSupportPartitioningError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable mixedRefsInAggFunc (java.lang.String funcStr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable lookupFunctionInNonFunctionCatalogError (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.connector.catalog.CatalogPlugin catalog)  { throw new RuntimeException(); }
  static public  java.lang.Throwable functionCannotProcessInputError (org.apache.spark.sql.connector.catalog.functions.UnboundFunction unbound, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, java.lang.UnsupportedOperationException unsupported)  { throw new RuntimeException(); }
  static public  java.lang.Throwable v2FunctionInvalidInputTypeLengthError (org.apache.spark.sql.connector.catalog.functions.BoundFunction bound, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> args)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ambiguousRelationAliasNameInNestedCTEError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable commandUnsupportedInV2TableError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotResolveColumnNameAmongAttributesError (java.lang.String colName, java.lang.String fieldNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotWriteTooManyColumnsToTableError (java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expected, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotWriteNotEnoughColumnsToTableError (java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expected, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotWriteIncompatibleDataToTableError (java.lang.String tableName, scala.collection.Seq<java.lang.String> errors)  { throw new RuntimeException(); }
  static public  java.lang.Throwable secondArgumentOfFunctionIsNotIntegerError (java.lang.String function, java.lang.NumberFormatException e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable nonPartitionPruningPredicatesNotExpectedError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> nonPartitionPruningPredicates)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnNotDefinedInTableError (java.lang.String colType, java.lang.String colName, java.lang.String tableName, scala.collection.Seq<java.lang.String> tableCols)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidLiteralForWindowDurationError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchStructFieldInGivenFieldsError (java.lang.String fieldName, org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
  static public  java.lang.Throwable ambiguousReferenceToFieldsError (java.lang.String fields)  { throw new RuntimeException(); }
  static public  java.lang.Throwable secondArgumentInFunctionIsNotBooleanLiteralError (java.lang.String funcName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable joinConditionMissingOrTrivialError (org.apache.spark.sql.catalyst.plans.logical.Join join, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  static public  java.lang.Throwable usePythonUDFInJoinConditionUnsupportedError (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable conflictingAttributesInJoinConditionError (org.apache.spark.sql.catalyst.expressions.AttributeSet conflictingAttrs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outerPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan subplan)  { throw new RuntimeException(); }
  static public  java.lang.Throwable emptyWindowExpressionError (org.apache.spark.sql.catalyst.plans.logical.Window expr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foundDifferentWindowFunctionTypeError (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> windowExpressions)  { throw new RuntimeException(); }
  static public  java.lang.Throwable charOrVarcharTypeAsStringUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPatternError (java.lang.String pattern, java.lang.String message)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableIdentifierExistsError (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableIdentifierNotConvertedToHadoopFsRelationError (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterDatabaseLocationUnsupportedError (java.lang.String version)  { throw new RuntimeException(); }
  static public  java.lang.Throwable hiveTableTypeUnsupportedError (java.lang.String tableType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable hiveCreatePermanentFunctionsUnsupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unknownHiveResourceTypeError (java.lang.String resourceType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidDayTimeField (byte field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidDayTimeIntervalType (java.lang.String startFieldName, java.lang.String endFieldName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidYearMonthField (byte field)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidYearMonthIntervalType (java.lang.String startFieldName, java.lang.String endFieldName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable configRemovedInVersionError (java.lang.String configName, java.lang.String version, java.lang.String comment)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failedFallbackParsingError (java.lang.String msg, java.lang.Throwable e1, java.lang.Throwable e2)  { throw new RuntimeException(); }
  static public  java.lang.Throwable decimalCannotGreaterThanPrecisionError (int scale, int precision)  { throw new RuntimeException(); }
  static public  java.lang.Throwable decimalOnlySupportPrecisionUptoError (java.lang.String decimalType, int precision)  { throw new RuntimeException(); }
  static public  java.lang.Throwable negativeScaleNotAllowedError (int scale)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionColumnKeyInTableError (java.lang.String key, java.lang.String tblName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionSpecError (java.lang.String specKeys, scala.collection.Seq<java.lang.String> partitionColumnNames, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable foundDuplicateColumnError (java.lang.String colType, scala.collection.Seq<java.lang.String> duplicateCol)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchTableError (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tempViewNotCachedForAnalyzingColumnsError (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnTypeNotSupportStatisticsCollectionError (java.lang.String name, org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable analyzeTableNotSupportedOnViewsError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedPartitionColumnPrefixError (java.lang.String table, java.lang.String database, java.lang.String schemaColumns, java.lang.String specColumns)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchPartitionError (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition)  { throw new RuntimeException(); }
  static public  java.lang.Throwable analyzingColumnStatisticsNotSupportedForColumnTypeError (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableAlreadyExistsError (java.lang.String table, java.lang.String guide)  { throw new RuntimeException(); }
  static public  java.lang.Throwable createTableAsSelectWithNonEmptyDirectoryError (java.lang.String tablePath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableOrViewNotFoundError (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchFunctionError (scala.collection.Seq<java.lang.String> rawName, org.apache.spark.sql.catalyst.trees.TreeNode<?> t, scala.Option<scala.collection.Seq<java.lang.String>> fullName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsetNonExistentPropertyError (java.lang.String property, org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableChangeColumnNotSupportedForColumnTypeError (org.apache.spark.sql.types.StructField originColumn, org.apache.spark.sql.types.StructField newColumn)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindColumnError (java.lang.String name, java.lang.String[] fieldNames)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableSetSerdeForSpecificPartitionNotSupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterTableSetSerdeNotSupportedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cmdOnlyWorksOnPartitionedTablesError (java.lang.String cmd, java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cmdOnlyWorksOnTableWithLocationError (java.lang.String cmd, java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable actionNotAllowedOnTableWithFilesourcePartitionManagementDisabledError (java.lang.String action, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable actionNotAllowedOnTableSincePartitionMetadataNotStoredError (java.lang.String action, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAlterViewWithAlterTableError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotAlterTableWithAlterViewError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotOverwritePathBeingReadFromError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotDropBuiltinFuncError (java.lang.String functionName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRefreshBuiltInFuncError (java.lang.String functionName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotRefreshTempFuncError (java.lang.String functionName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable noSuchFunctionError (org.apache.spark.sql.catalyst.FunctionIdentifier identifier)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterAddColNotSupportViewError (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable alterAddColNotSupportDatasourceTableError (Object tableType, org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataNotSupportedForDatasourceTablesError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataWithoutPartitionSpecProvidedError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataPartitionSizeNotMatchNumPartitionColumnsError (java.lang.String tableIdentWithDB, int partitionSize, int targetTableSize)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataTargetTableNotPartitionedButPartitionSpecWasProvidedError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable loadDataInputPathNotExistError (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.Throwable truncateTableOnExternalTablesError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable truncateTablePartitionNotSupportedForNotPartitionedTablesError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable failToTruncateTableWhenRemovingDataError (java.lang.String tableIdentWithDB, org.apache.hadoop.fs.Path path, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable descPartitionNotAllowedOnTempView (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable descPartitionNotAllowedOnView (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showPartitionNotAllowedOnTableNotPartitionedError (java.lang.String tableIdentWithDB)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableNotSupportedOnTempView (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableFailToExecuteUnsupportedFeatureError (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableNotSupportTransactionalHiveTableError (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableFailToExecuteUnsupportedConfError (org.apache.spark.sql.catalyst.TableIdentifier table, scala.collection.mutable.StringBuilder builder)  { throw new RuntimeException(); }
  static public  java.lang.Throwable descPartitionNotAllowedOnViewError (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableAsSerdeNotAllowedOnSparkDataSourceTableError (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  static public  java.lang.Throwable showCreateTableOrViewFailToExecuteUnsupportedFeatureError (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.collection.Seq<java.lang.String> features)  { throw new RuntimeException(); }
  static public  java.lang.Throwable logicalPlanForViewNotAnalyzedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable createViewNumColumnsMismatchUserSpecifiedColumnLengthError (int analyzedPlanLength, int userSpecifiedColumnsLength)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableIsNotViewError (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable viewAlreadyExistsError (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable createPersistedViewFromDatasetAPINotAllowedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable recursiveViewDetectedError (org.apache.spark.sql.catalyst.TableIdentifier viewIdent, scala.collection.Seq<org.apache.spark.sql.catalyst.TableIdentifier> newPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notAllowedToCreatePermanentViewWithoutAssigningAliasForExpressionError (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String attrName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notAllowedToCreatePermanentViewByReferencingTempViewError (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String nameParts)  { throw new RuntimeException(); }
  static public  java.lang.Throwable notAllowedToCreatePermanentViewByReferencingTempFuncError (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String funcName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable queryFromRawFilesIncludeCorruptRecordColumnError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable userDefinedPartitionNotFoundInJDBCRelationError (java.lang.String columnName, java.lang.String schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionColumnTypeError (org.apache.spark.sql.types.StructField column)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableOrViewAlreadyExistsError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable columnNameContainsInvalidCharactersError (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.Throwable textDataSourceWithMultiColumnsError (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindPartitionColumnInPartitionSchemaError (org.apache.spark.sql.types.StructField readField, org.apache.spark.sql.types.StructType partitionSchema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotSpecifyDatabaseForTempViewError (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotCreateTempViewUsingHiveDataSourceError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidTimestampProvidedForStrategyError (java.lang.String strategy, java.lang.String timeString)  { throw new RuntimeException(); }
  static public  java.lang.Throwable hostOptionNotSetError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable portOptionNotSetError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidIncludeTimestampValueError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable checkpointLocationNotSpecifiedError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable recoverQueryFromCheckpointUnsupportedError (org.apache.hadoop.fs.Path checkpointPath)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindColumnInRelationOutputError (java.lang.String colName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidBoundaryStartError (long start)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidBoundaryEndError (long end)  { throw new RuntimeException(); }
  static public  java.lang.Throwable databaseDoesNotExistError (java.lang.String dbName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableDoesNotExistInDatabaseError (java.lang.String tableName, java.lang.String dbName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableOrViewNotFoundInDatabaseError (java.lang.String tableName, java.lang.String dbName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unexpectedTypeOfRelationError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable unsupportedTableChangeInJDBCCatalogError (org.apache.spark.sql.connector.catalog.TableChange change)  { throw new RuntimeException(); }
  static public  java.lang.Throwable pathOptionNotSetCorrectlyWhenReadingError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable pathOptionNotSetCorrectlyWhenWritingError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeWithSaveModeUnsupportedBySourceError (java.lang.String source, java.lang.String createMode)  { throw new RuntimeException(); }
  static public  java.lang.Throwable partitionByDoesNotAllowedWhenUsingInsertIntoError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotFindCatalogToHandleIdentifierError (java.lang.String quote)  { throw new RuntimeException(); }
  static public  java.lang.Throwable sortByNotUsedWithBucketByError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable bucketByUnsupportedByOperationError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable bucketByAndSortByUnsupportedByOperationError (java.lang.String operation)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableAlreadyExistsError (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotOverwriteTableThatIsBeingReadFromError (java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidPartitionTransformationError (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.AnalysisException cannotResolveColumnNameAmongFieldsError (java.lang.String colName, java.lang.String fieldsStr, java.lang.String extraMsg)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotParseIntervalError (java.lang.String delayThreshold, java.lang.Throwable e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidJoinTypeInJoinWithError (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotPassTypedColumnInUntypedSelectError (java.lang.String typedCol)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidViewNameError (java.lang.String viewName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidBucketsNumberError (java.lang.String numBuckets, java.lang.String e)  { throw new RuntimeException(); }
  static public  java.lang.Throwable usingUntypedScalaUDFError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable aggregationFunctionAppliedOnNonNumericColumnError (java.lang.String colName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable aggregationFunctionAppliedOnNonNumericColumnError (java.lang.String pivotColumn, int maxValues)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotModifyValueOfStaticConfigError (java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotModifyValueOfSparkConfigError (java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.Throwable commandExecutionInRunnerUnsupportedError (java.lang.String runner)  { throw new RuntimeException(); }
  static public  java.lang.Throwable udfClassDoesNotImplementAnyUDFInterfaceError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable udfClassNotAllowedToImplementMultiUDFInterfacesError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable udfClassWithTooManyTypeArgumentsError (int n)  { throw new RuntimeException(); }
  static public  java.lang.Throwable classWithoutPublicNonArgumentConstructorError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable cannotLoadClassNotOnClassPathError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable classDoesNotImplementUserDefinedAggregateFunctionError (java.lang.String className)  { throw new RuntimeException(); }
  static public  java.lang.Throwable missingFieldError (scala.collection.Seq<java.lang.String> fieldName, org.apache.spark.sql.catalyst.analysis.ResolvedTable table, org.apache.spark.sql.catalyst.trees.Origin context)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidFieldName (scala.collection.Seq<java.lang.String> fieldName, scala.collection.Seq<java.lang.String> path, org.apache.spark.sql.catalyst.trees.Origin context)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidJsonSchema (org.apache.spark.sql.types.DataType schema)  { throw new RuntimeException(); }
  static public  java.lang.Throwable tableIndexNotSupportedError (java.lang.String errorMessage)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidViewText (java.lang.String viewText, java.lang.String tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidTimeTravelSpecError ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable invalidTimestampExprForTimeTravel (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  java.lang.Throwable timeTravelUnsupportedError (java.lang.String target)  { throw new RuntimeException(); }
  static public  java.lang.UnsupportedOperationException tableNotSupportTimeTravelError (org.apache.spark.sql.connector.catalog.Identifier tableName)  { throw new RuntimeException(); }
  static public  java.lang.Throwable writeDistributionAndOrderingNotSupportedInContinuousExecution ()  { throw new RuntimeException(); }
  static public  java.lang.String toSQLValue (Object v, org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLStmt (java.lang.String text)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLId (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLId (java.lang.String parts)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLType (org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLConf (java.lang.String conf)  { throw new RuntimeException(); }
  static public  java.lang.String toDSOption (java.lang.String option)  { throw new RuntimeException(); }
  static public  java.lang.String toSQLExpr (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
