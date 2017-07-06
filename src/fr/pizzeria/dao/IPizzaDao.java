package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {

	/**
	 * 
	 * @return la liste des pizzas stockées
	 */
	Pizza[] findAllPizzas();
	
	/**
	 * 
	 * @param pizza la pizza à stocker
	 * @return true si le stockage s'est bien passé, false sinon
	 */
	boolean saveNexPizza(Pizza pizza);
	
	/**
	 * 
	 * @param codePizza le code de la pizza à mettre à jour
	 * @param pizza
	 * @return
	 */
	boolean updatePizza(String codePizza, Pizza pizza);
	
	boolean deletePizza(String codePizza);
}
