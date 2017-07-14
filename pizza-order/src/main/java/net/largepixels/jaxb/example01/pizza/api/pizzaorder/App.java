package net.largepixels.jaxb.example01.pizza.api.pizzaorder;

import generated.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Pizza pizza = createPizzaOrder();

        RestTemplate restTemplate = new RestTemplate();
        Receipt receipt = restTemplate.postForObject("http://localhost:8080/", pizza, Receipt.class);

        System.out.println("Order has been placed!");
        System.out.println("It is a " + receipt.getPizza());
        System.out.println("It's being sent to " + receipt.getDeliveryAddress());
        System.out.println("Order total is " + receipt.getTotal());
    }

    public static Pizza createPizzaOrder() {
        Pizza pizza = new Pizza();

        pizza.setName("Pepperoni Pizza");
        pizza.setSize(12);

        Topping topping1 = new Topping();
        topping1.setName("Cheese");

        Topping topping2 = new Topping();
        topping2.setName("Pepperoni");

        pizza.getToppings().add(topping1);
        pizza.getToppings().add(topping2);

        Customer customer = new Customer();
        customer.setName("John Smith");
        customer.setPhone("123-123-1234");

        Address address = new Address();
        address.setCity("Chicago");
        address.setState("IL");
        address.setStreet("155 N Wacker");
        address.setZip(60606);

        customer.setAddress(address);

        pizza.setCustomer(customer);

        return pizza;
    }
}
