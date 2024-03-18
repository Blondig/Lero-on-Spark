package org.apache.spark.status.api.v1;
/**
 * Base class for resource handlers that use app-specific data. Abstracts away dealing with
 * application and attempt IDs, and finding the app's UI.
 */
public  interface BaseAppResource extends org.apache.spark.status.api.v1.ApiRequestContext {
  public  java.lang.String appId ()  ;
  public  java.lang.String attemptId ()  ;
  public  void checkUIViewPermissions ()  ;
  public <T extends java.lang.Object> T withUI (scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  ;
}
