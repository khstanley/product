package com.kh.product.web.form.product;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveForm {
  @NotBlank // null, 빈문자열("")를 허용 안함, 문자열 타입만 사용
  @Size(min=1,max=10)
  private String pname;
  @NotNull
  @Positive   //양수
//  @Max(value=10000,message="최대값은 10000초과 불과")  //최대 1000초과 불과!
  private Long quantity;

  @NotNull
  @Positive
  @Min(100)
  @Max(100000000)
  private Long price;
}
