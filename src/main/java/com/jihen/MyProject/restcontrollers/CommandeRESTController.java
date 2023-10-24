package com.jihen.MyProject.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jihen.MyProject.entities.commande;
import com.jihen.MyProject.service.CommandeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CommandeRESTController {
	@Autowired
	CommandeService commandeService;

	@RequestMapping(method = RequestMethod.GET)
	public List<commande> getAllCommande() {
		return commandeService.getAllCommande();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public commande getProduitById(@PathVariable("id") Long id) {
		return commandeService.getCommande(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public commande createProduit(@RequestBody commande commande) {
	return commandeService.saveCommande(commande);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public commande updateProduit(@RequestBody commande commande) {
	return commandeService.updateCommande(commande);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCommande(@PathVariable("id") Long id)
	{
		commandeService.deleteCommandeById(id);
	}
	
	@RequestMapping(value="/comscli/{idCli}",method = RequestMethod.GET)
	public List<commande> getProduitsByCatId(@PathVariable("idCli") Long idCli) {
	return commandeService.findByClietIdCli(idCli);
	}




}
