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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * V1AdjustInventoryRequest
 */
@ApiModel(description = "V1AdjustInventoryRequest")

public class V1AdjustInventoryRequest {
  @JsonProperty("quantity_delta")
  private BigDecimal quantityDelta = null;

  @JsonProperty("adjustment_type")
  private String adjustmentType = null;

  @JsonProperty("memo")
  private String memo = null;

  public V1AdjustInventoryRequest quantityDelta(BigDecimal quantityDelta) {
    this.quantityDelta = quantityDelta;
    return this;
  }

   /**
   * The number to adjust the variation's quantity by.
   * @return quantityDelta
  **/
  @ApiModelProperty(value = "The number to adjust the variation's quantity by.")
  public BigDecimal getQuantityDelta() {
    return quantityDelta;
  }

  public void setQuantityDelta(BigDecimal quantityDelta) {
    this.quantityDelta = quantityDelta;
  }

  public V1AdjustInventoryRequest adjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
    return this;
  }

   /**
   * The reason for the inventory adjustment. See [V1AdjustInventoryRequestAdjustmentType](#type-v1adjustinventoryrequestadjustmenttype) for possible values
   * @return adjustmentType
  **/
  @ApiModelProperty(value = "The reason for the inventory adjustment. See [V1AdjustInventoryRequestAdjustmentType](#type-v1adjustinventoryrequestadjustmenttype) for possible values")
  public String getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  public V1AdjustInventoryRequest memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * A note about the inventory adjustment.
   * @return memo
  **/
  @ApiModelProperty(value = "A note about the inventory adjustment.")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AdjustInventoryRequest v1AdjustInventoryRequest = (V1AdjustInventoryRequest) o;
    return Objects.equals(this.quantityDelta, v1AdjustInventoryRequest.quantityDelta) &&
        Objects.equals(this.adjustmentType, v1AdjustInventoryRequest.adjustmentType) &&
        Objects.equals(this.memo, v1AdjustInventoryRequest.memo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityDelta, adjustmentType, memo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AdjustInventoryRequest {\n");

    sb.append("    quantityDelta: ").append(toIndentedString(quantityDelta)).append("\n");
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
