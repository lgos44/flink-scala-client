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
import org.openapitools.client.model.AsynchronousOperationResult
import org.openapitools.client.model.DashboardConfiguration
import org.openapitools.client.model.ErrorResponse
import java.io.File
import org.openapitools.client.model.JarListInfo
import org.openapitools.client.model.JarRunRequestBody
import org.openapitools.client.model.JarRunResponseBody
import org.openapitools.client.model.JobDetailsInfo
import org.openapitools.client.model.JobIdsWithStatusOverview
import org.openapitools.client.model.MultipleJobsDetails
import org.openapitools.client.model.SavepointTriggerRequestBody
import org.openapitools.client.model.TriggerResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object MonitoringApi {

  def apply(baseUrl: String = "http://localhost:8081/v1") = new MonitoringApi(baseUrl)
}

class MonitoringApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 :  (Deleted)
   */
  def deleteCluster(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "http://localhost:8081/v1", "/cluster", "application/json")
      .withSuccessResponse[Unit](200)
      

  /**
   * Expected answers:
   *   code 200 :  (Delete OK)
   * 
   * @param jarId Id of the jar to delete
   */
  def deleteJar(jarId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "http://localhost:8081/v1", "/jars/{jarId}", "application/json")
      .withPathParam("jarId", jarId)
      .withSuccessResponse[Unit](200)
      

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
   * Returns details of a job.
   * 
   * Expected answers:
   *   code 200 : JobDetailsInfo (OK)
   * 
   * @param jobId Id of the job
   */
  def getJob(jobId: String): ApiRequest[JobDetailsInfo] =
    ApiRequest[JobDetailsInfo](ApiMethods.GET, "http://localhost:8081/v1", "/jobs/{jobId}", "application/json")
      .withPathParam("jobId", jobId)
      .withSuccessResponse[JobDetailsInfo](200)
      

  /**
   * Returns an overview over all jobs and their current state.
   * 
   * Expected answers:
   *   code 200 : JobIdsWithStatusOverview (OK)
   */
  def getJobs(): ApiRequest[JobIdsWithStatusOverview] =
    ApiRequest[JobIdsWithStatusOverview](ApiMethods.GET, "http://localhost:8081/v1", "/jobs", "application/json")
      .withSuccessResponse[JobIdsWithStatusOverview](200)
      

  /**
   * Returns an overview over all jobs.
   * 
   * Expected answers:
   *   code 200 : MultipleJobsDetails (OK)
   */
  def getJobsOverview(): ApiRequest[MultipleJobsDetails] =
    ApiRequest[MultipleJobsDetails](ApiMethods.GET, "http://localhost:8081/v1", "/jobs/overview", "application/json")
      .withSuccessResponse[MultipleJobsDetails](200)
      

  /**
   * Triggers the rescaling of a job.
   * 
   * Expected answers:
   *   code 200 : AsynchronousOperationResult (Trigger status)
   * 
   * @param jobId 32-character hexadecimal string value that identifies a job. 
   * @param triggerId 32-character hexadecimal string that identifies an asynchronous operation trigger ID. The ID was returned then the operation was triggered. 
   */
  def getRescaleStatus(jobId: String, triggerId: String): ApiRequest[AsynchronousOperationResult] =
    ApiRequest[AsynchronousOperationResult](ApiMethods.GET, "http://localhost:8081/v1", "/jobs/{jobId}/rescaling/{triggerId}", "application/json")
      .withPathParam("jobId", jobId)
      .withPathParam("triggerId", triggerId)
      .withSuccessResponse[AsynchronousOperationResult](200)
      

  /**
   * Triggers the rescaling of a job.
   * 
   * Expected answers:
   *   code 200 : AsynchronousOperationResult (Trigger status)
   * 
   * @param jobId 32-character hexadecimal string value that identifies a job. 
   * @param triggerId 32-character hexadecimal string that identifies an asynchronous operation trigger ID. The ID was returned then the operation was triggered. 
   */
  def getSavepointStatus(jobId: String, triggerId: String): ApiRequest[AsynchronousOperationResult] =
    ApiRequest[AsynchronousOperationResult](ApiMethods.GET, "http://localhost:8081/v1", "/jobs/{jobId}/savepoints/{triggerId}", "application/json")
      .withPathParam("jobId", jobId)
      .withPathParam("triggerId", triggerId)
      .withSuccessResponse[AsynchronousOperationResult](200)
      

  /**
   * Triggers the rescaling of a job.
   * 
   * Expected answers:
   *   code 200 : TriggerResponse (Trigger OK)
   * 
   * @param jobId Id of the job
   * @param parallelism Positive integer value that specifies the desired parallelism. 
   */
  def rescaleJob(jobId: String, parallelism: Int): ApiRequest[TriggerResponse] =
    ApiRequest[TriggerResponse](ApiMethods.PATCH, "http://localhost:8081/v1", "/jobs/{jobId}/rescaling", "application/json")
      .withQueryParam("parallelism", parallelism)
      .withPathParam("jobId", jobId)
      .withSuccessResponse[TriggerResponse](200)
      

  /**
   * \"Submits a job by running a jar previously uploaded via '/jars/upload'.  Program arguments can be passed both via the JSON request (recommended) or query parameters\" 
   * 
   * Expected answers:
   *   code 200 : JarRunResponseBody (OK)
   * 
   * @param jarId Id of the jar
   * @param jarRunRequestBody Job parameters
   */
  def runJar(jarId: String, jarRunRequestBody: JarRunRequestBody): ApiRequest[JarRunResponseBody] =
    ApiRequest[JarRunResponseBody](ApiMethods.POST, "http://localhost:8081/v1", "/jars/{jarId}/run", "application/json")
      .withBody(jarRunRequestBody)
      .withPathParam("jarId", jarId)
      .withSuccessResponse[JarRunResponseBody](200)
      

  /**
   * Returns details of a job.
   * 
   * Expected answers:
   *   code 200 :  (Terminate OK)
   * 
   * @param jobId Id of the job
   * @param mode String value that specifies the termination mode.
   */
  def terminateJob(jobId: String, mode: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PATCH, "http://localhost:8081/v1", "/jobs/{jobId}", "application/json")
      .withQueryParam("mode", mode)
      .withPathParam("jobId", jobId)
      .withSuccessResponse[Unit](200)
      

  /**
   * Triggers the rescaling of a job.
   * 
   * Expected answers:
   *   code 202 : TriggerResponse (Trigger OK)
   * 
   * @param jobId 32-character hexadecimal string value that identifies a job. 
   * @param savepointTriggerRequestBody SavepointTriggerRequestBody
   */
  def triggerSavepoint(jobId: String, savepointTriggerRequestBody: SavepointTriggerRequestBody): ApiRequest[TriggerResponse] =
    ApiRequest[TriggerResponse](ApiMethods.POST, "http://localhost:8081/v1", "/jobs/{jobId}/savepoints", "application/json")
      .withBody(savepointTriggerRequestBody)
      .withPathParam("jobId", jobId)
      .withSuccessResponse[TriggerResponse](202)
      

  /**
   * Expected answers:
   *   code 200 : ApiResponse (Successful upload)
   *   code 400 : ErrorResponse (Error)
   * 
   * @param fileName file to upload
   */
  def uploadJar(fileName: Option[File] = None): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "http://localhost:8081/v1", "/jars/upload", "multipart/form-data")
      .withFormParam("fileName", fileName)
      .withSuccessResponse[ApiResponse](200)
      .withErrorResponse[ErrorResponse](400)
      



}

