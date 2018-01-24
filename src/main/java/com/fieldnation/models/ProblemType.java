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
import com.fieldnation.models.MinimalProblemType;
import java.util.ArrayList;
import java.util.List;

/**
 * ProblemType
 */

public class ProblemType {
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

  @SerializedName("children")
  private List<MinimalProblemType> children = null;

  public ProblemType id(Integer id) {
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

  public ProblemType name(String name) {
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

  public ProblemType hasOther(Boolean hasOther) {
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

  public ProblemType other(String other) {
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

  public ProblemType performanceEvent(Boolean performanceEvent) {
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

  public ProblemType fileWithSupport(Boolean fileWithSupport) {
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

  public ProblemType showPqapWarning(Boolean showPqapWarning) {
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

  public ProblemType children(List<MinimalProblemType> children) {
    this.children = children;
    return this;
  }

  public ProblemType addChildrenItem(MinimalProblemType childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<MinimalProblemType>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/

  public List<MinimalProblemType> getChildren() {
    return children;
  }

  public void setChildren(List<MinimalProblemType> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemType problemType = (ProblemType) o;
    return Objects.equals(this.id, problemType.id) &&
        Objects.equals(this.name, problemType.name) &&
        Objects.equals(this.hasOther, problemType.hasOther) &&
        Objects.equals(this.other, problemType.other) &&
        Objects.equals(this.performanceEvent, problemType.performanceEvent) &&
        Objects.equals(this.fileWithSupport, problemType.fileWithSupport) &&
        Objects.equals(this.showPqapWarning, problemType.showPqapWarning) &&
        Objects.equals(this.children, problemType.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hasOther, other, performanceEvent, fileWithSupport, showPqapWarning, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasOther: ").append(toIndentedString(hasOther)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    performanceEvent: ").append(toIndentedString(performanceEvent)).append("\n");
    sb.append("    fileWithSupport: ").append(toIndentedString(fileWithSupport)).append("\n");
    sb.append("    showPqapWarning: ").append(toIndentedString(showPqapWarning)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

