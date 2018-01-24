/*
 * Field Nation V2 API
 *
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 *
 *
 * Do not edit the class manually.
 */


package com.fieldnation.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * PublishStats
 */

public class PublishStats {
  @SerializedName("requests")
  private Integer requests = null;

  @SerializedName("all_requests")
  private Integer allRequests = null;

  @SerializedName("counter_offers")
  private Integer counterOffers = null;

  @SerializedName("routes")
  private Integer routes = null;

  @SerializedName("declines")
  private Integer declines = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  public PublishStats requests(Integer requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/

  public Integer getRequests() {
    return requests;
  }

  public void setRequests(Integer requests) {
    this.requests = requests;
  }

  public PublishStats allRequests(Integer allRequests) {
    this.allRequests = allRequests;
    return this;
  }

   /**
   * Get allRequests
   * @return allRequests
  **/

  public Integer getAllRequests() {
    return allRequests;
  }

  public void setAllRequests(Integer allRequests) {
    this.allRequests = allRequests;
  }

  public PublishStats counterOffers(Integer counterOffers) {
    this.counterOffers = counterOffers;
    return this;
  }

   /**
   * Get counterOffers
   * @return counterOffers
  **/

  public Integer getCounterOffers() {
    return counterOffers;
  }

  public void setCounterOffers(Integer counterOffers) {
    this.counterOffers = counterOffers;
  }

  public PublishStats routes(Integer routes) {
    this.routes = routes;
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/

  public Integer getRoutes() {
    return routes;
  }

  public void setRoutes(Integer routes) {
    this.routes = routes;
  }

  public PublishStats declines(Integer declines) {
    this.declines = declines;
    return this;
  }

   /**
   * Get declines
   * @return declines
  **/

  public Integer getDeclines() {
    return declines;
  }

  public void setDeclines(Integer declines) {
    this.declines = declines;
  }

  public PublishStats correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishStats publishStats = (PublishStats) o;
    return Objects.equals(this.requests, publishStats.requests) &&
        Objects.equals(this.allRequests, publishStats.allRequests) &&
        Objects.equals(this.counterOffers, publishStats.counterOffers) &&
        Objects.equals(this.routes, publishStats.routes) &&
        Objects.equals(this.declines, publishStats.declines) &&
        Objects.equals(this.correlationId, publishStats.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, allRequests, counterOffers, routes, declines, correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishStats {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    allRequests: ").append(toIndentedString(allRequests)).append("\n");
    sb.append("    counterOffers: ").append(toIndentedString(counterOffers)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    declines: ").append(toIndentedString(declines)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

