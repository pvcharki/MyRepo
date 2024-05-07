package com.customer.restapi.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.restapi.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Long>
{

}
