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
 * ServiceContractsInner
 */

public class ServiceContractsInner {
  @SerializedName("value")
  private Integer value = null;

  @SerializedName("label")
  private String label = null;

  public ServiceContractsInner value(Integer value) {
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

  public ServiceContractsInner label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceContractsInner serviceContractsInner = (ServiceContractsInner) o;
    return Objects.equals(this.value, serviceContractsInner.value) &&
        Objects.equals(this.label, serviceContractsInner.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceContractsInner {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

