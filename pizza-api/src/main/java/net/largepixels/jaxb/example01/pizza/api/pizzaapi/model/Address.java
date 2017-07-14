package net.largepixels.jaxb.example01.pizza.api.pizzaapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * The location of a customer
 */
@Data
public class Address {

    @XmlElement
    String street;

    @XmlElement
    String city;

    @XmlElement
    String state;

    @XmlElement
    long zip;

}
