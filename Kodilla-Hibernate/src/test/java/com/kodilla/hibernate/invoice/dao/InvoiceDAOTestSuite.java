package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDAOTestSuite {

    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private InvoiceDAO invoiceDAO;

    @Test
    void testInvoiceDAOSave() {
        //Given
        Product product1 = new Product("Office chair");
        Product product2 = new Product("Standing desk");
        Item item1 = new Item(new BigDecimal(1600), 1);
        Item item2 = new Item(new BigDecimal(2500), 1);
        Item item3 = new Item(new BigDecimal(1600), 3);
        Invoice invoice = new Invoice("69420");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        product1.getItems().add(item1);
        product1.getItems().add(item3);
        product2.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDAO.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDAO.deleteById(id);
    }

}
