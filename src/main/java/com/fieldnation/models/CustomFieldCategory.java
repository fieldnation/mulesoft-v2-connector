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
import com.fieldnation.models.CustomField;
import com.fieldnation.models.ListEnvelope;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomFieldCategory
 */

public class CustomFieldCategory {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("results")
  private List<CustomField> results = null;

  public CustomFieldCategory metadata(ListEnvelope metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public ListEnvelope getMetadata() {
    return metadata;
  }

  public void setMetadata(ListEnvelope metadata) {
    this.metadata = metadata;
  }

  public CustomFieldCategory id(Integer id) {
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

  public CustomFieldCategory name(String name) {
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

  public CustomFieldCategory role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public CustomFieldCategory results(List<CustomField> results) {
    this.results = results;
    return this;
  }

  public CustomFieldCategory addResultsItem(CustomField resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<CustomField>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<CustomField> getResults() {
    return results;
  }

  public void setResults(List<CustomField> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCategory customFieldCategory = (CustomFieldCategory) o;
    return Objects.equals(this.metadata, customFieldCategory.metadata) &&
        Objects.equals(this.id, customFieldCategory.id) &&
        Objects.equals(this.name, customFieldCategory.name) &&
        Objects.equals(this.role, customFieldCategory.role) &&
        Objects.equals(this.results, customFieldCategory.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, name, role, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCategory {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

