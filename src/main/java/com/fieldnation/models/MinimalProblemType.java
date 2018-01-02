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

/**
 * MinimalProblemType
 */

public class MinimalProblemType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("has_other")
  private Boolean hasOther = null;

  @SerializedName("other")
  private String other = null;

  @SerializedName("performance_event")
  private Boolean performanceEvent = null;

  @SerializedName("file_with_support")
  private Boolean fileWithSupport = null;

  @SerializedName("show_pqap_warning")
  private Boolean showPqapWarning = null;

  public MinimalProblemType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MinimalProblemType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MinimalProblemType hasOther(Boolean hasOther) {
    this.hasOther = hasOther;
    return this;
  }

   /**
   * Get hasOther
   * @return hasOther
  **/

  public Boolean isHasOther() {
    return hasOther;
  }

  public void setHasOther(Boolean hasOther) {
    this.hasOther = hasOther;
  }

  public MinimalProblemType other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/

  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public MinimalProblemType performanceEvent(Boolean performanceEvent) {
    this.performanceEvent = performanceEvent;
    return this;
  }

   /**
   * Get performanceEvent
   * @return performanceEvent
  **/

  public Boolean isPerformanceEvent() {
    return performanceEvent;
  }

  public void setPerformanceEvent(Boolean performanceEvent) {
    this.performanceEvent = performanceEvent;
  }

  public MinimalProblemType fileWithSupport(Boolean fileWithSupport) {
    this.fileWithSupport = fileWithSupport;
    return this;
  }

   /**
   * Get fileWithSupport
   * @return fileWithSupport
  **/

  public Boolean isFileWithSupport() {
    return fileWithSupport;
  }

  public void setFileWithSupport(Boolean fileWithSupport) {
    this.fileWithSupport = fileWithSupport;
  }

  public MinimalProblemType showPqapWarning(Boolean showPqapWarning) {
    this.showPqapWarning = showPqapWarning;
    return this;
  }

   /**
   * Get showPqapWarning
   * @return showPqapWarning
  **/

  public Boolean isShowPqapWarning() {
    return showPqapWarning;
  }

  public void setShowPqapWarning(Boolean showPqapWarning) {
    this.showPqapWarning = showPqapWarning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimalProblemType minimalProblemType = (MinimalProblemType) o;
    return Objects.equals(this.id, minimalProblemType.id) &&
        Objects.equals(this.name, minimalProblemType.name) &&
        Objects.equals(this.hasOther, minimalProblemType.hasOther) &&
        Objects.equals(this.other, minimalProblemType.other) &&
        Objects.equals(this.performanceEvent, minimalProblemType.performanceEvent) &&
        Objects.equals(this.fileWithSupport, minimalProblemType.fileWithSupport) &&
        Objects.equals(this.showPqapWarning, minimalProblemType.showPqapWarning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hasOther, other, performanceEvent, fileWithSupport, showPqapWarning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalProblemType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasOther: ").append(toIndentedString(hasOther)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    performanceEvent: ").append(toIndentedString(performanceEvent)).append("\n");
    sb.append("    fileWithSupport: ").append(toIndentedString(fileWithSupport)).append("\n");
    sb.append("    showPqapWarning: ").append(toIndentedString(showPqapWarning)).append("\n");
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

