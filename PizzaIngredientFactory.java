/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstractfactory;

/**
 *
 * @author guilh
 */
public interface PizzaIngredientFactory {
public Dough createDough ();
public Sauce createSauce ();
public Cheese createCheese ();
public Veggies [] createVeggies ();
public Pepperoni createPepperoni ();
public Clam createClam();
}
