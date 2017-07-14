package net.largepixels.jaxb.example01.pizza.api.pizzaapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * Invoice for a pizza purchase
 */
@Data
public class Receipt {

    @XmlElement
    long orderNumber;

    @XmlElement
    float total;

    @XmlElement
    String pizza;

    @XmlElement
    String deliveryAddress;

}
