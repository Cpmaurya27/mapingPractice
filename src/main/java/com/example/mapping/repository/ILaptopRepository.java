package com.example.mapping.repository;

import com.example.mapping.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends CrudRepository<Laptop, String> {
}
