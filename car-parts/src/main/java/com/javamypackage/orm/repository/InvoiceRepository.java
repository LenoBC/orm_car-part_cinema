package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    long count();
    long countByUserId(long user_id);
}
