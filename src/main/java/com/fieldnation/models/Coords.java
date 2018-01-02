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


import java.io.IOException;
import java.math.BigDecimal;

/**
 * Coords
 */

public class Coords {
  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("exact")
  private Boolean exact = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("search")
  private String search = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("map_href")
  private String mapHref = null;

  public Coords latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public Coords longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public Coords exact(Boolean exact) {
    this.exact = exact;
    return this;
  }

   /**
   * Get exact
   * @return exact
  **/

  public Boolean isExact() {
    return exact;
  }

  public void setExact(Boolean exact) {
    this.exact = exact;
  }

  public Coords success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/

  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public Coords search(String search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/

  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public Coords distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/

  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public Coords mapHref(String mapHref) {
    this.mapHref = mapHref;
    return this;
  }

   /**
   * Get mapHref
   * @return mapHref
  **/

  public String getMapHref() {
    return mapHref;
  }

  public void setMapHref(String mapHref) {
    this.mapHref = mapHref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coords coords = (Coords) o;
    return Objects.equals(this.latitude, coords.latitude) &&
        Objects.equals(this.longitude, coords.longitude) &&
        Objects.equals(this.exact, coords.exact) &&
        Objects.equals(this.success, coords.success) &&
        Objects.equals(this.search, coords.search) &&
        Objects.equals(this.distance, coords.distance) &&
        Objects.equals(this.mapHref, coords.mapHref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, exact, success, search, distance, mapHref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coords {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    mapHref: ").append(toIndentedString(mapHref)).append("\n");
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

