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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LocationProviders
 */

public class LocationProviders {
  @SerializedName("results")
  private List<MinimalUser> results = null;

  @SerializedName("location_id")
  private Integer locationId = null;

  public LocationProviders results(List<MinimalUser> results) {
    this.results = results;
    return this;
  }

  public LocationProviders addResultsItem(MinimalUser resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<MinimalUser>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<MinimalUser> getResults() {
    return results;
  }

  public void setResults(List<MinimalUser> results) {
    this.results = results;
  }

  public LocationProviders locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/

  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationProviders locationProviders = (LocationProviders) o;
    return Objects.equals(this.results, locationProviders.results) &&
        Objects.equals(this.locationId, locationProviders.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationProviders {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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

