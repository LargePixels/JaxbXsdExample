package net.largepixels.jaxb.example01.pizza.api.pizzaapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * A customer is somebody who buys a pizza
 */
@Data
public class Customer {

    @XmlElement
    String name;

    @XmlElement
    String phone;

    @XmlElement
    Address address;

}
