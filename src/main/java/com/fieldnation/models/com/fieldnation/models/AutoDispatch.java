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
import com.fieldnation.models.SelectionRule;
import java.util.ArrayList;
import java.util.List;

/**
 * AutoDispatch
 */

public class AutoDispatch {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("work_order_ids")
  private List<Integer> workOrderIds = null;

  @SerializedName("selection_rule_id")
  private Integer selectionRuleId = null;

  @SerializedName("selection_rule")
  private SelectionRule selectionRule = null;

  @SerializedName("delay")
  private Integer delay = null;

  @SerializedName("w2_skippub")
  private Boolean w2Skippub = null;

  @SerializedName("w2_failswitch")
  private Boolean w2Failswitch = null;

  @SerializedName("should_route")
  private Boolean shouldRoute = null;

  public AutoDispatch id(Integer id) {
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

  public AutoDispatch workOrderIds(List<Integer> workOrderIds) {
    this.workOrderIds = workOrderIds;
    return this;
  }

  public AutoDispatch addWorkOrderIdsItem(Integer workOrderIdsItem) {
    if (this.workOrderIds == null) {
      this.workOrderIds = new ArrayList<Integer>();
    }
    this.workOrderIds.add(workOrderIdsItem);
    return this;
  }

   /**
   * Get workOrderIds
   * @return workOrderIds
  **/

  public List<Integer> getWorkOrderIds() {
    return workOrderIds;
  }

  public void setWorkOrderIds(List<Integer> workOrderIds) {
    this.workOrderIds = workOrderIds;
  }

  public AutoDispatch selectionRuleId(Integer selectionRuleId) {
    this.selectionRuleId = selectionRuleId;
    return this;
  }

   /**
   * Get selectionRuleId
   * @return selectionRuleId
  **/

  public Integer getSelectionRuleId() {
    return selectionRuleId;
  }

  public void setSelectionRuleId(Integer selectionRuleId) {
    this.selectionRuleId = selectionRuleId;
  }

  public AutoDispatch selectionRule(SelectionRule selectionRule) {
    this.selectionRule = selectionRule;
    return this;
  }

   /**
   * Get selectionRule
   * @return selectionRule
  **/

  public SelectionRule getSelectionRule() {
    return selectionRule;
  }

  public void setSelectionRule(SelectionRule selectionRule) {
    this.selectionRule = selectionRule;
  }

  public AutoDispatch delay(Integer delay) {
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

  public AutoDispatch w2Skippub(Boolean w2Skippub) {
    this.w2Skippub = w2Skippub;
    return this;
  }

   /**
   * Get w2Skippub
   * @return w2Skippub
  **/

  public Boolean isW2Skippub() {
    return w2Skippub;
  }

  public void setW2Skippub(Boolean w2Skippub) {
    this.w2Skippub = w2Skippub;
  }

  public AutoDispatch w2Failswitch(Boolean w2Failswitch) {
    this.w2Failswitch = w2Failswitch;
    return this;
  }

   /**
   * Get w2Failswitch
   * @return w2Failswitch
  **/

  public Boolean isW2Failswitch() {
    return w2Failswitch;
  }

  public void setW2Failswitch(Boolean w2Failswitch) {
    this.w2Failswitch = w2Failswitch;
  }

  public AutoDispatch shouldRoute(Boolean shouldRoute) {
    this.shouldRoute = shouldRoute;
    return this;
  }

   /**
   * Get shouldRoute
   * @return shouldRoute
  **/

  public Boolean isShouldRoute() {
    return shouldRoute;
  }

  public void setShouldRoute(Boolean shouldRoute) {
    this.shouldRoute = shouldRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoDispatch autoDispatch = (AutoDispatch) o;
    return Objects.equals(this.id, autoDispatch.id) &&
        Objects.equals(this.workOrderIds, autoDispatch.workOrderIds) &&
        Objects.equals(this.selectionRuleId, autoDispatch.selectionRuleId) &&
        Objects.equals(this.selectionRule, autoDispatch.selectionRule) &&
        Objects.equals(this.delay, autoDispatch.delay) &&
        Objects.equals(this.w2Skippub, autoDispatch.w2Skippub) &&
        Objects.equals(this.w2Failswitch, autoDispatch.w2Failswitch) &&
        Objects.equals(this.shouldRoute, autoDispatch.shouldRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workOrderIds, selectionRuleId, selectionRule, delay, w2Skippub, w2Failswitch, shouldRoute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoDispatch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workOrderIds: ").append(toIndentedString(workOrderIds)).append("\n");
    sb.append("    selectionRuleId: ").append(toIndentedString(selectionRuleId)).append("\n");
    sb.append("    selectionRule: ").append(toIndentedString(selectionRule)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    w2Skippub: ").append(toIndentedString(w2Skippub)).append("\n");
    sb.append("    w2Failswitch: ").append(toIndentedString(w2Failswitch)).append("\n");
    sb.append("    shouldRoute: ").append(toIndentedString(shouldRoute)).append("\n");
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

