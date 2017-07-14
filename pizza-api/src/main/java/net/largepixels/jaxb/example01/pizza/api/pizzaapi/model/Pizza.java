package net.largepixels.jaxb.example01.pizza.api.pizzaapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * The product we sell
 */
@Data
@XmlType
@XmlRootElement
public class Pizza {

    @XmlElement
    String name;

    @XmlElement
    int size;

    @XmlElement
    List<Topping> toppings;

    @XmlElement
    Customer customer;

}
