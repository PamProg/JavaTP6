package fr.pizzeria.ihm;

import fr.pizzeria.console.PizzeriaAdmin;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoMemoire;
import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	
	public NouvellePizzaOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		String codeString;
		String nomString;
		String prixString;
		
		dao = new PizzaDaoMemoire();
		
		System.out.println("Veuillez saisir le code");
		codeString = PizzeriaAdmin.getInput().next();
		System.out.println("Veuillez saisir le nom (sans espace)");
		nomString = PizzeriaAdmin.getInput().next();
		System.out.println("Veuillez saisir le prix");
		prixString = PizzeriaAdmin.getInput().next();
		
		Pizza p = new Pizza(codeString, nomString, Double.parseDouble(prixString));
		dao.saveNexPizza(p);
		
		return true;
	}

}
