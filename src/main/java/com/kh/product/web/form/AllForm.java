package com.kh.product.web.form;

import lombok.Data;

@Data
public class AllForm {
  private Long productId;
  private String pname;
  private Long quantity;
  private Long price;
}
