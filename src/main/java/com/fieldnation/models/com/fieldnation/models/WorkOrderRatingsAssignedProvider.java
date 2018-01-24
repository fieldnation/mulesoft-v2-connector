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


import com.fieldnation.models.Block;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.WorkOrderRatingsAssignedProviderOverall;
import com.fieldnation.models.WorkOrderRatingsAssignedProviderWorkOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderRatingsAssignedProvider
 */

public class WorkOrderRatingsAssignedProvider {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
    EDIT("edit"),
    
    DELETE("delete");

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

  @SerializedName("user")
  private MinimalUser user = null;

  @SerializedName("work_order")
  private WorkOrderRatingsAssignedProviderWorkOrder workOrder = null;

  @SerializedName("overall")
  private WorkOrderRatingsAssignedProviderOverall overall = null;

  @SerializedName("blocks")
  private Block blocks = null;

  public WorkOrderRatingsAssignedProvider actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WorkOrderRatingsAssignedProvider addActionsItem(ActionsEnum actionsItem) {
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

  public WorkOrderRatingsAssignedProvider user(MinimalUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/

  public MinimalUser getUser() {
    return user;
  }

  public void setUser(MinimalUser user) {
    this.user = user;
  }

  public WorkOrderRatingsAssignedProvider workOrder(WorkOrderRatingsAssignedProviderWorkOrder workOrder) {
    this.workOrder = workOrder;
    return this;
  }

   /**
   * Get workOrder
   * @return workOrder
  **/

  public WorkOrderRatingsAssignedProviderWorkOrder getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(WorkOrderRatingsAssignedProviderWorkOrder workOrder) {
    this.workOrder = workOrder;
  }

  public WorkOrderRatingsAssignedProvider overall(WorkOrderRatingsAssignedProviderOverall overall) {
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/

  public WorkOrderRatingsAssignedProviderOverall getOverall() {
    return overall;
  }

  public void setOverall(WorkOrderRatingsAssignedProviderOverall overall) {
    this.overall = overall;
  }

  public WorkOrderRatingsAssignedProvider blocks(Block blocks) {
    this.blocks = blocks;
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/

  public Block getBlocks() {
    return blocks;
  }

  public void setBlocks(Block blocks) {
    this.blocks = blocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsAssignedProvider workOrderRatingsAssignedProvider = (WorkOrderRatingsAssignedProvider) o;
    return Objects.equals(this.actions, workOrderRatingsAssignedProvider.actions) &&
        Objects.equals(this.user, workOrderRatingsAssignedProvider.user) &&
        Objects.equals(this.workOrder, workOrderRatingsAssignedProvider.workOrder) &&
        Objects.equals(this.overall, workOrderRatingsAssignedProvider.overall) &&
        Objects.equals(this.blocks, workOrderRatingsAssignedProvider.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, user, workOrder, overall, blocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsAssignedProvider {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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

