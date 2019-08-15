/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a tax that applies to one or more line item in the order.  Fixed-amount, order-scoped taxes are distributed across all non-zero line item totals. The amount distributed to each line item is relative to the amount the item contributes to the order subtotal.
 */
@ApiModel(description = "Represents a tax that applies to one or more line item in the order.  Fixed-amount, order-scoped taxes are distributed across all non-zero line item totals. The amount distributed to each line item is relative to the amount the item contributes to the order subtotal.")

public class OrderLineItemTax {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  @JsonProperty("scope")
  private String scope = null;

  public OrderLineItemTax uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the tax only within this order.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the tax only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderLineItemTax catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object id referencing [CatalogTax](#type-catalogtax).
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object id referencing [CatalogTax](#type-catalogtax).")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderLineItemTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tax's name.
   * @return name
  **/
  @ApiModelProperty(value = "The tax's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLineItemTax type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderLineItemTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number. For example, a value of `\"7.25\"` corresponds to a percentage of 7.25%.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number. For example, a value of `\"7.25\"` corresponds to a percentage of 7.25%.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderLineItemTax appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of the money applied by the tax in the order.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of the money applied by the tax in the order.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderLineItemTax scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates the level at which the tax applies. For `ORDER` scoped taxes, Square generates references in `applied_taxes` on all order line items that do not have them. For `LINE_ITEM` scoped taxes, the tax will only apply to line items with references in their `applied_taxes` field.  This field is immutable. To change the scope, you must delete the tax and re-add it as a new tax. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates the level at which the tax applies. For `ORDER` scoped taxes, Square generates references in `applied_taxes` on all order line items that do not have them. For `LINE_ITEM` scoped taxes, the tax will only apply to line items with references in their `applied_taxes` field.  This field is immutable. To change the scope, you must delete the tax and re-add it as a new tax. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItemTax orderLineItemTax = (OrderLineItemTax) o;
    return Objects.equals(this.uid, orderLineItemTax.uid) &&
        Objects.equals(this.catalogObjectId, orderLineItemTax.catalogObjectId) &&
        Objects.equals(this.name, orderLineItemTax.name) &&
        Objects.equals(this.type, orderLineItemTax.type) &&
        Objects.equals(this.percentage, orderLineItemTax.percentage) &&
        Objects.equals(this.appliedMoney, orderLineItemTax.appliedMoney) &&
        Objects.equals(this.scope, orderLineItemTax.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, catalogObjectId, name, type, percentage, appliedMoney, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItemTax {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
