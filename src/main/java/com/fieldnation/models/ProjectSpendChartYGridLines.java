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
 * ProjectSpendChartYGridLines
 */

public class ProjectSpendChartYGridLines {
  @SerializedName("value")
  private Integer value = null;

  @SerializedName("axis")
  private String axis = null;

  public ProjectSpendChartYGridLines value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ProjectSpendChartYGridLines axis(String axis) {
    this.axis = axis;
    return this;
  }

   /**
   * Get axis
   * @return axis
  **/

  public String getAxis() {
    return axis;
  }

  public void setAxis(String axis) {
    this.axis = axis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSpendChartYGridLines projectSpendChartYGridLines = (ProjectSpendChartYGridLines) o;
    return Objects.equals(this.value, projectSpendChartYGridLines.value) &&
        Objects.equals(this.axis, projectSpendChartYGridLines.axis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, axis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSpendChartYGridLines {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    axis: ").append(toIndentedString(axis)).append("\n");
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

