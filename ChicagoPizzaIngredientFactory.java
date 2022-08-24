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
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough () {
	return new ThickCrustDough ();
}
public Sauce createSauce () {
	return new PlumTomatoSauce ();
}
public Cheese createCheese () {
return new Mozzarella ();

}
public Veggies [] createVeggies () {
Veggies veggies [] = { new Blackolives (),
new Spinach (),
new Eggplant () };
return veggies;
}
public Pepperoni createPepperoni () {
return new SlicedPepperoni_1 ();
}
public Clam createclam () {
return new FrozenClam ();
}

    @Override
    public Clam createClam() {
        return null;
  
    }
    
}
