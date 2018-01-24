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
import com.fieldnation.models.ListEnvelopeTimings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ListEnvelope
 */

public class ListEnvelope {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("total_unread")
  private Integer totalUnread = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("pages")
  private Integer pages = null;

  @SerializedName("per_page")
  private Integer perPage = null;

  @SerializedName("columns")
  private String columns = null;

  @SerializedName("available_columns")
  private List<AvailableColumn> availableColumns = null;

  @SerializedName("list")
  private String list = null;

  /**
   * Gets or Sets view
   */
  @JsonAdapter(ViewEnum.Adapter.class)
  public enum ViewEnum {
    MAP("map"),
    
    LIST("list"),
    
    SCHEDULE("schedule"),
    
    MODEL("model"),
    
    CARD("card");

    private String value;

    ViewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewEnum fromValue(String text) {
      for (ViewEnum b : ViewEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ViewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ViewEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("view")
  private ViewEnum view = null;

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

  @SerializedName("timings")
  private List<ListEnvelopeTimings> timings = null;

  public ListEnvelope total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListEnvelope totalUnread(Integer totalUnread) {
    this.totalUnread = totalUnread;
    return this;
  }

   /**
   * Get totalUnread
   * @return totalUnread
  **/

  public Integer getTotalUnread() {
    return totalUnread;
  }

  public void setTotalUnread(Integer totalUnread) {
    this.totalUnread = totalUnread;
  }

  public ListEnvelope page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListEnvelope pages(Integer pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/

  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public ListEnvelope perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/

  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public ListEnvelope columns(String columns) {
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

  public ListEnvelope availableColumns(List<AvailableColumn> availableColumns) {
    this.availableColumns = availableColumns;
    return this;
  }

  public ListEnvelope addAvailableColumnsItem(AvailableColumn availableColumnsItem) {
    if (this.availableColumns == null) {
      this.availableColumns = new ArrayList<AvailableColumn>();
    }
    this.availableColumns.add(availableColumnsItem);
    return this;
  }

   /**
   * Get availableColumns
   * @return availableColumns
  **/

  public List<AvailableColumn> getAvailableColumns() {
    return availableColumns;
  }

  public void setAvailableColumns(List<AvailableColumn> availableColumns) {
    this.availableColumns = availableColumns;
  }

  public ListEnvelope list(String list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/

  public String getList() {
    return list;
  }

  public void setList(String list) {
    this.list = list;
  }

  public ListEnvelope view(ViewEnum view) {
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/

  public ViewEnum getView() {
    return view;
  }

  public void setView(ViewEnum view) {
    this.view = view;
  }

  public ListEnvelope sort(String sort) {
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

  public ListEnvelope order(OrderEnum order) {
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

  public ListEnvelope timings(List<ListEnvelopeTimings> timings) {
    this.timings = timings;
    return this;
  }

  public ListEnvelope addTimingsItem(ListEnvelopeTimings timingsItem) {
    if (this.timings == null) {
      this.timings = new ArrayList<ListEnvelopeTimings>();
    }
    this.timings.add(timingsItem);
    return this;
  }

   /**
   * Get timings
   * @return timings
  **/

  public List<ListEnvelopeTimings> getTimings() {
    return timings;
  }

  public void setTimings(List<ListEnvelopeTimings> timings) {
    this.timings = timings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEnvelope listEnvelope = (ListEnvelope) o;
    return Objects.equals(this.total, listEnvelope.total) &&
        Objects.equals(this.totalUnread, listEnvelope.totalUnread) &&
        Objects.equals(this.page, listEnvelope.page) &&
        Objects.equals(this.pages, listEnvelope.pages) &&
        Objects.equals(this.perPage, listEnvelope.perPage) &&
        Objects.equals(this.columns, listEnvelope.columns) &&
        Objects.equals(this.availableColumns, listEnvelope.availableColumns) &&
        Objects.equals(this.list, listEnvelope.list) &&
        Objects.equals(this.view, listEnvelope.view) &&
        Objects.equals(this.sort, listEnvelope.sort) &&
        Objects.equals(this.order, listEnvelope.order) &&
        Objects.equals(this.timings, listEnvelope.timings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, totalUnread, page, pages, perPage, columns, availableColumns, list, view, sort, order, timings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnvelope {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalUnread: ").append(toIndentedString(totalUnread)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    availableColumns: ").append(toIndentedString(availableColumns)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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

