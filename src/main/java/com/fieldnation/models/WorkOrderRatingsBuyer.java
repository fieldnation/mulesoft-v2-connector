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
import com.fieldnation.models.CheckInOutTimeLog;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.WorkOrderRatingsBuyerOverall;
import com.fieldnation.models.WorkOrderRatingsBuyerWorkOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderRatingsBuyer
 */

public class WorkOrderRatingsBuyer {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
    EDIT("edit");

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

  @SerializedName("manager")
  private MinimalUser manager = null;

  @SerializedName("company")
  private CheckInOutTimeLog company = null;

  @SerializedName("overall")
  private WorkOrderRatingsBuyerOverall overall = null;

  @SerializedName("work_order")
  private WorkOrderRatingsBuyerWorkOrder workOrder = null;

  @SerializedName("blocks")
  private Block blocks = null;

  public WorkOrderRatingsBuyer actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WorkOrderRatingsBuyer addActionsItem(ActionsEnum actionsItem) {
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

  public WorkOrderRatingsBuyer manager(MinimalUser manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/

  public MinimalUser getManager() {
    return manager;
  }

  public void setManager(MinimalUser manager) {
    this.manager = manager;
  }

  public WorkOrderRatingsBuyer company(CheckInOutTimeLog company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public CheckInOutTimeLog getCompany() {
    return company;
  }

  public void setCompany(CheckInOutTimeLog company) {
    this.company = company;
  }

  public WorkOrderRatingsBuyer overall(WorkOrderRatingsBuyerOverall overall) {
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/

  public WorkOrderRatingsBuyerOverall getOverall() {
    return overall;
  }

  public void setOverall(WorkOrderRatingsBuyerOverall overall) {
    this.overall = overall;
  }

  public WorkOrderRatingsBuyer workOrder(WorkOrderRatingsBuyerWorkOrder workOrder) {
    this.workOrder = workOrder;
    return this;
  }

   /**
   * Get workOrder
   * @return workOrder
  **/

  public WorkOrderRatingsBuyerWorkOrder getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(WorkOrderRatingsBuyerWorkOrder workOrder) {
    this.workOrder = workOrder;
  }

  public WorkOrderRatingsBuyer blocks(Block blocks) {
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
    WorkOrderRatingsBuyer workOrderRatingsBuyer = (WorkOrderRatingsBuyer) o;
    return Objects.equals(this.actions, workOrderRatingsBuyer.actions) &&
        Objects.equals(this.manager, workOrderRatingsBuyer.manager) &&
        Objects.equals(this.company, workOrderRatingsBuyer.company) &&
        Objects.equals(this.overall, workOrderRatingsBuyer.overall) &&
        Objects.equals(this.workOrder, workOrderRatingsBuyer.workOrder) &&
        Objects.equals(this.blocks, workOrderRatingsBuyer.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, manager, company, overall, workOrder, blocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsBuyer {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
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

