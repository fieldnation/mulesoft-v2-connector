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


import com.fieldnation.models.Problem;
import java.io.IOException;

/**
 * Status
 */

public class Status {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
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
  private ActionsEnum actions = null;

  @SerializedName("display")
  private String display = null;

  @SerializedName("problem_reported")
  private Boolean problemReported = null;

  @SerializedName("is_routed")
  private Boolean isRouted = null;

  @SerializedName("problem")
  private Problem problem = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("sub_status")
  private String subStatus = null;

  @SerializedName("delay")
  private Integer delay = null;

  @SerializedName("ncns")
  private Boolean ncns = null;

  @SerializedName("confirmed")
  private Boolean confirmed = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  public Status id(Integer id) {
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

  public Status name(String name) {
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

  public Status actions(ActionsEnum actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public ActionsEnum getActions() {
    return actions;
  }

  public void setActions(ActionsEnum actions) {
    this.actions = actions;
  }

  public Status display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Status problemReported(Boolean problemReported) {
    this.problemReported = problemReported;
    return this;
  }

   /**
   * Get problemReported
   * @return problemReported
  **/

  public Boolean isProblemReported() {
    return problemReported;
  }

  public void setProblemReported(Boolean problemReported) {
    this.problemReported = problemReported;
  }

  public Status isRouted(Boolean isRouted) {
    this.isRouted = isRouted;
    return this;
  }

   /**
   * Get isRouted
   * @return isRouted
  **/

  public Boolean isIsRouted() {
    return isRouted;
  }

  public void setIsRouted(Boolean isRouted) {
    this.isRouted = isRouted;
  }

  public Status problem(Problem problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/

  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public Status code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Status subStatus(String subStatus) {
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/

  public String getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  public Status delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Get delay
   * @return delay
  **/

  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public Status ncns(Boolean ncns) {
    this.ncns = ncns;
    return this;
  }

   /**
   * Get ncns
   * @return ncns
  **/

  public Boolean isNcns() {
    return ncns;
  }

  public void setNcns(Boolean ncns) {
    this.ncns = ncns;
  }

  public Status confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/

  public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public Status correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.id, status.id) &&
        Objects.equals(this.name, status.name) &&
        Objects.equals(this.actions, status.actions) &&
        Objects.equals(this.display, status.display) &&
        Objects.equals(this.problemReported, status.problemReported) &&
        Objects.equals(this.isRouted, status.isRouted) &&
        Objects.equals(this.problem, status.problem) &&
        Objects.equals(this.code, status.code) &&
        Objects.equals(this.subStatus, status.subStatus) &&
        Objects.equals(this.delay, status.delay) &&
        Objects.equals(this.ncns, status.ncns) &&
        Objects.equals(this.confirmed, status.confirmed) &&
        Objects.equals(this.correlationId, status.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, actions, display, problemReported, isRouted, problem, code, subStatus, delay, ncns, confirmed, correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    problemReported: ").append(toIndentedString(problemReported)).append("\n");
    sb.append("    isRouted: ").append(toIndentedString(isRouted)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    ncns: ").append(toIndentedString(ncns)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

