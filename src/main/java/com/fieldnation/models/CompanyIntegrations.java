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


import com.fieldnation.models.CompanyIntegration;
import com.fieldnation.models.ListEnvelope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CompanyIntegrations
 */

public class CompanyIntegrations {
  @SerializedName("envelope")
  private ListEnvelope envelope = null;

  @SerializedName("results")
  private List<CompanyIntegration> results = null;

  public CompanyIntegrations envelope(ListEnvelope envelope) {
    this.envelope = envelope;
    return this;
  }

   /**
   * Get envelope
   * @return envelope
  **/

  public ListEnvelope getEnvelope() {
    return envelope;
  }

  public void setEnvelope(ListEnvelope envelope) {
    this.envelope = envelope;
  }

  public CompanyIntegrations results(List<CompanyIntegration> results) {
    this.results = results;
    return this;
  }

  public CompanyIntegrations addResultsItem(CompanyIntegration resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<CompanyIntegration>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<CompanyIntegration> getResults() {
    return results;
  }

  public void setResults(List<CompanyIntegration> results) {
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
    CompanyIntegrations companyIntegrations = (CompanyIntegrations) o;
    return Objects.equals(this.envelope, companyIntegrations.envelope) &&
        Objects.equals(this.results, companyIntegrations.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelope, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIntegrations {\n");
    
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
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

