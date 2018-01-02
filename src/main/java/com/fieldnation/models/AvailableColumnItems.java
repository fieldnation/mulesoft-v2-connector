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


import java.io.IOException;

/**
 * AvailableColumnItems
 */

public class AvailableColumnItems {
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("selected")
  private Boolean selected = null;

  @SerializedName("can_sort")
  private Boolean canSort = null;

  @SerializedName("sort_dir")
  private String sortDir = null;

  public AvailableColumnItems id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AvailableColumnItems label(String label) {
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

  public AvailableColumnItems group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public AvailableColumnItems order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public AvailableColumnItems icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public AvailableColumnItems selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/

  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public AvailableColumnItems canSort(Boolean canSort) {
    this.canSort = canSort;
    return this;
  }

   /**
   * Get canSort
   * @return canSort
  **/

  public Boolean isCanSort() {
    return canSort;
  }

  public void setCanSort(Boolean canSort) {
    this.canSort = canSort;
  }

  public AvailableColumnItems sortDir(String sortDir) {
    this.sortDir = sortDir;
    return this;
  }

   /**
   * Get sortDir
   * @return sortDir
  **/

  public String getSortDir() {
    return sortDir;
  }

  public void setSortDir(String sortDir) {
    this.sortDir = sortDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableColumnItems availableColumnItems = (AvailableColumnItems) o;
    return Objects.equals(this.id, availableColumnItems.id) &&
        Objects.equals(this.label, availableColumnItems.label) &&
        Objects.equals(this.group, availableColumnItems.group) &&
        Objects.equals(this.order, availableColumnItems.order) &&
        Objects.equals(this.icon, availableColumnItems.icon) &&
        Objects.equals(this.selected, availableColumnItems.selected) &&
        Objects.equals(this.canSort, availableColumnItems.canSort) &&
        Objects.equals(this.sortDir, availableColumnItems.sortDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, group, order, icon, selected, canSort, sortDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableColumnItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    canSort: ").append(toIndentedString(canSort)).append("\n");
    sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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

