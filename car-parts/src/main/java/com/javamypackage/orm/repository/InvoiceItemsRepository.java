package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.InvoiceItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceItemsRepository extends CrudRepository<InvoiceItem,Long> {
    long countByPartId(long part_id);
}
