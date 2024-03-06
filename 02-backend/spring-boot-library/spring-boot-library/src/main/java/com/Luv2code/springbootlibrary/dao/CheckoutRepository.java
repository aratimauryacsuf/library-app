package com.Luv2code.springbootlibrary.dao;

import com.Luv2code.springbootlibrary.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository  extends JpaRepository<Checkout,Long> {

    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);
}
