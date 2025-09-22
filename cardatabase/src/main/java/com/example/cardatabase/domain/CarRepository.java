package com.example.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    // 브랜드로 자동차를 검색
    List<Car> findByBrand(String brand);

    // 색상으로 자동차를 검색
    List<Car> findByColor(String color);
    // 연식으로 자동차를 검색
    List<Car> findByModelYear(int modelYear);

    // 브랜드와 모델을 합쳐서 자동차를 검색
    List<Car> findByBrandAndModel(String brand, String model);

    // 브랜드 또는 색상별로 자동차를 가져오기
    List<Car> findByBrandOrColor(String brand, String color);
}
