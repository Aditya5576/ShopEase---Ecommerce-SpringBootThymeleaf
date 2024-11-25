package com.adityapatil.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adityapatil.ecommerce.dto.Customer;
import com.adityapatil.ecommerce.dto.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	List<CustomerOrder> findByCustomerAndPaymentIdIsNotNull(Customer customer);

}
