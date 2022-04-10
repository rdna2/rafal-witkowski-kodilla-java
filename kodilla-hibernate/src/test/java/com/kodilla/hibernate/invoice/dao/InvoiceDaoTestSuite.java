package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
//        Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Product product4 = new Product("Product4");
        Product product5 = new Product("Product5");

        Invoice invoice1 = new Invoice("Invoice1");
        Invoice invoice2 = new Invoice("Invoice2");
        Invoice invoice3 = new Invoice("Invoice3");

        Item item1 = new Item(product1, new BigDecimal(50), 2, new BigDecimal(100));
        Item item2 = new Item(product2, new BigDecimal(40), 5, new BigDecimal(200));
        Item item3 = new Item(product3, new BigDecimal(7), 50, new BigDecimal(350));
        Item item4 = new Item(product4, new BigDecimal(30), 5, new BigDecimal(150));
        Item item5 = new Item(product5, new BigDecimal(2), 140, new BigDecimal(280));

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product5.getItems().add(item5);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice3);

        invoice1.getItems().add(item1);
        invoice2.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);
        invoice3.getItems().add(item5);


//        When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        int invoice1items = invoice1.getItems().size();
        int invoice2items = invoice2.getItems().size();
        int invoice3items = invoice3.getItems().size();

//        Then
        assertEquals(3, invoiceDao.count());
        assertEquals(3, invoice1items);
        assertEquals(1, invoice2items);
        assertEquals(1, invoice3items);


//        cleanup
        try {
            invoiceDao.deleteAll();
            productDao.deleteAll();
            itemDao.deleteAll();
        } catch (Exception e) {
        }

    }
}