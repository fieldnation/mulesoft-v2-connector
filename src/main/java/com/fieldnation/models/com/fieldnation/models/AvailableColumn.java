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
import com.fieldnation.models.AvailableColumnItems;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailableColumn
 */

public class AvailableColumn {
  @SerializedName("group")
  private String group = null;

  @SerializedName("items")
  private List<AvailableColumnItems> items = null;

  public AvailableColumn group(String group) {
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

  public AvailableColumn items(List<AvailableColumnItems> items) {
    this.items = items;
    return this;
  }

  public AvailableColumn addItemsItem(AvailableColumnItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AvailableColumnItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/

  public List<AvailableColumnItems> getItems() {
    return items;
  }

  public void setItems(List<AvailableColumnItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableColumn availableColumn = (AvailableColumn) o;
    return Objects.equals(this.group, availableColumn.group) &&
        Objects.equals(this.items, availableColumn.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableColumn {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

