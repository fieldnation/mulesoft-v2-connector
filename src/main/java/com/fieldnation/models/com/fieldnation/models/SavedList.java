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
 * SavedList
 */

public class SavedList {
  @SerializedName("id")
  private String id = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("sort")
  private String sort = null;

  /**
   * Gets or Sets order
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  @SerializedName("columns")
  private String columns = null;

  @SerializedName("label")
  private String label = null;

  public SavedList id(String id) {
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

  public SavedList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SavedList getDefault(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/

  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public SavedList sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public SavedList order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/

  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public SavedList columns(String columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/

  public String getColumns() {
    return columns;
  }

  public void setColumns(String columns) {
    this.columns = columns;
  }

  public SavedList label(String label) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedList savedList = (SavedList) o;
    return Objects.equals(this.id, savedList.id) &&
        Objects.equals(this.count, savedList.count) &&
        Objects.equals(this._default, savedList._default) &&
        Objects.equals(this.sort, savedList.sort) &&
        Objects.equals(this.order, savedList.order) &&
        Objects.equals(this.columns, savedList.columns) &&
        Objects.equals(this.label, savedList.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count, _default, sort, order, columns, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

