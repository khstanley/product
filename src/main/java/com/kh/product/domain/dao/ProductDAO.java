package com.kh.product.domain.dao;

import com.kh.product.domain.dao.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
  //등록
  Long save(Product product);

  //조회
  Optional<Product> findById(Long productId);

  //목록
  List<Product> findAll();

  //단건삭제
  int deleteById(Long productId);

  //수정
  int updateById(Long productId, Product product);
}
