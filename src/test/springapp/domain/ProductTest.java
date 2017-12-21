package test.springapp.domain;

import org.junit.Before;
import org.junit.Test;
import springapp.domain.Product;

import static org.junit.Assert.*;

/**
 * Created by GODFATHER.
 */
public class ProductTest {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
    }

    @Test
    public void testSetAndGetDescription() throws Exception {
        String testDiscription = "aDiscription";
        assertNull(product.getDescription());
        product.setDescription(testDiscription);
        assertEquals(testDiscription, product.getDescription());
    }

    @Test
    public void testSetAndGetPrice() throws Exception {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

}