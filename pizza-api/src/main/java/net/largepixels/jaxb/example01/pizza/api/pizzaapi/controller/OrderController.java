package net.largepixels.jaxb.example01.pizza.api.pizzaapi.controller;

import net.largepixels.jaxb.example01.pizza.api.pizzaapi.model.Pizza;
import net.largepixels.jaxb.example01.pizza.api.pizzaapi.model.Receipt;
import org.springframework.web.bind.annotation.*;

/**
 * Created by johnminchuk on 7/13/17.
 */
@RestController
public class OrderController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Receipt index(@RequestBody Pizza pizza) {

        System.out.println("Let's make a " + pizza.getName());
        System.out.println("Let's make it for " + pizza.getCustomer().getName());
        System.out.println("Deliver it to " + pizza.getCustomer().getAddress().getStreet());
        System.out.println("Oh now let's write up a receipt");

        Receipt receipt = new Receipt();
        receipt.setOrderNumber(1);
        receipt.setDeliveryAddress(pizza.getCustomer().getAddress().getStreet());
        receipt.setPizza(pizza.getName());
        receipt.setTotal(10.50f);

        return receipt;

    }

}
