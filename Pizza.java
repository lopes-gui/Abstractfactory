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
public abstract class Pizza {
    String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies [];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	abstract void prepare();
	void bake () {
		System.out.println("Assar por 25 minutos a 350°");

	}
	void cut () {
		System.out.println("Cortar a pizza em fatias diagonais");

	}
	
	void box () {
		System.out.println("Colocar a pizza na caixa oficial da pizzaria");

	}
	void setName (String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	public String tostring() {
        return null;
	//código para imprimir a pizza aqui
	}
}
