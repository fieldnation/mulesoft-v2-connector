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


import com.fieldnation.models.EmailTemplate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmailTemplates
 */

public class EmailTemplates {
  @SerializedName("results")
  private List<EmailTemplate> results = null;

  public EmailTemplates results(List<EmailTemplate> results) {
    this.results = results;
    return this;
  }

  public EmailTemplates addResultsItem(EmailTemplate resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<EmailTemplate>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<EmailTemplate> getResults() {
    return results;
  }

  public void setResults(List<EmailTemplate> results) {
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
    EmailTemplates emailTemplates = (EmailTemplates) o;
    return Objects.equals(this.results, emailTemplates.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplates {\n");
    
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

