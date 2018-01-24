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


import com.fieldnation.models.ListEnvelope;
import com.fieldnation.models.PayModifier;
import com.fieldnation.models.PayModifiersSum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PayModifiers
 */

public class PayModifiers {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("sum")
  private PayModifiersSum sum = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    ADD("add");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  @SerializedName("results")
  private List<PayModifier> results = null;

  public PayModifiers metadata(ListEnvelope metadata) {
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

  public PayModifiers sum(PayModifiersSum sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/

  public PayModifiersSum getSum() {
    return sum;
  }

  public void setSum(PayModifiersSum sum) {
    this.sum = sum;
  }

  public PayModifiers actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public PayModifiers addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  public PayModifiers results(List<PayModifier> results) {
    this.results = results;
    return this;
  }

  public PayModifiers addResultsItem(PayModifier resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<PayModifier>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<PayModifier> getResults() {
    return results;
  }

  public void setResults(List<PayModifier> results) {
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
    PayModifiers payModifiers = (PayModifiers) o;
    return Objects.equals(this.metadata, payModifiers.metadata) &&
        Objects.equals(this.sum, payModifiers.sum) &&
        Objects.equals(this.actions, payModifiers.actions) &&
        Objects.equals(this.results, payModifiers.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, sum, actions, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayModifiers {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

