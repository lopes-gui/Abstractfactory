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
public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
	public CheesePizza (PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
}
void prepare() {

	System.out.println("Preparing " + name);
	dough =ingredientFactory.createDough ();
	sauce = ingredientFactory.createSauce ();
	cheese=ingredientFactory.createCheese ();
}
}
