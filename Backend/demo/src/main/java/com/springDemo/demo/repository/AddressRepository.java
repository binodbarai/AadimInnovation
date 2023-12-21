package com.springDemo.demo.repository;

import com.springDemo.demo.entity.Address;
import com.springDemo.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
