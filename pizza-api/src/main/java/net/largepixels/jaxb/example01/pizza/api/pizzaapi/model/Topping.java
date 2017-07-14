package net.largepixels.jaxb.example01.pizza.api.pizzaapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * A topping that can go on a pizza
 */
@Data
public class Topping {

    @XmlElement
    String name;

}
