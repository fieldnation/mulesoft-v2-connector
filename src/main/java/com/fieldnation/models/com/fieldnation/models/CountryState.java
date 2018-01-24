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
import com.fieldnation.models.CountryStateValues;
import java.util.ArrayList;
import java.util.List;

/**
 * CountryState
 */

public class CountryState {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("values")
  private List<CountryStateValues> values = null;

  public CountryState required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/

  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CountryState label(String label) {
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

  public CountryState values(List<CountryStateValues> values) {
    this.values = values;
    return this;
  }

  public CountryState addValuesItem(CountryStateValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<CountryStateValues>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/

  public List<CountryStateValues> getValues() {
    return values;
  }

  public void setValues(List<CountryStateValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryState countryState = (CountryState) o;
    return Objects.equals(this.required, countryState.required) &&
        Objects.equals(this.label, countryState.label) &&
        Objects.equals(this.values, countryState.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, label, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryState {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

