/**
 * Flink Monitoring REST API
 * OpenAPI for Flink Monitoring REST API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.ApiResponse
import org.openapitools.client.model.DashboardConfiguration
import java.io.File
import java.nio.file.Files
import org.openapitools.client.model.JarListInfo
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object MonitoringApi {

  def apply(baseUrl: String = "http://localhost:8081/v1") = new MonitoringApi(baseUrl)
}

class MonitoringApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : DashboardConfiguration (DashboardConfiguration)
   */
  def getConfig(): ApiRequest[DashboardConfiguration] =
    ApiRequest[DashboardConfiguration](ApiMethods.GET, "http://localhost:8081/v1", "/config", "application/json")
      .withSuccessResponse[DashboardConfiguration](200)
      

  /**
   * Expected answers:
   *   code 200 : JarListInfo (JarListInfo)
   */
  def getJars(): ApiRequest[JarListInfo] =
    ApiRequest[JarListInfo](ApiMethods.GET, "http://localhost:8081/v1", "/jars", "application/json")
      .withSuccessResponse[JarListInfo](200)
      

  /**
   * Expected answers:
   *   code 200 : ApiResponse (successful operation)
   * 
   * @param fileName file to upload
   */
  def uploadJar(fileName: Option[File] = None): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "http://localhost:8081/v1", "/jars/upload", "multipart/form-data")
      .withFormParam("fileName", fileName)
      .withSuccessResponse[ApiResponse](200)
      



}

