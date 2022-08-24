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
public class CaliforniaPizzaStore extends PizzaStore {
    protected Pizza createPizza (String item) {
if (item.equals("cheese")) {
return new CaliforniaStyleCheesePizza ();
} else if (item.equals("veggie")) {
return new CaliforniaStyleVeggiePizza ();
} else if (item.equals("clam")) {
return new CaliforniaStyleClamPizza ();
} else if (item.equals("pepperoni")) {
return new CaliforniaStylePepperoniPizza ();
} 
else return null;
    
    
}
}