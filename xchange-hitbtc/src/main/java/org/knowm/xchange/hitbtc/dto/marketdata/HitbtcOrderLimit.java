package org.knowm.xchange.hitbtc.dto.marketdata;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HitbtcOrderLimit {

  private final BigDecimal price;
  private final BigDecimal size;

  public HitbtcOrderLimit(@JsonProperty("price") BigDecimal price, @JsonProperty("size") BigDecimal size) {
    this.price = price;
    this.size = size;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getSize() {
    return size;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).
        append("price", price).
        append("size", size).
        toString();
  }

}
