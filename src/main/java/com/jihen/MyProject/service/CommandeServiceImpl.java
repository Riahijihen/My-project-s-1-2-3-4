package com.jihen.MyProject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihen.MyProject.entities.Client;
import com.jihen.MyProject.entities.commande;
import com.jihen.MyProject.repos.CommandeRepository;


@Service
public class CommandeServiceImpl implements CommandeService {
@Autowired
CommandeRepository commandeRepository;

@Override
public commande saveCommande(commande c) {
	// TODO Auto-generated method stub
	return commandeRepository.save(c);
			}

@Override
public commande updateCommande(commande c) {
	// TODO Auto-generated method stub
	return commandeRepository.save(c);
}

@Override
public void deleteCommande(commande c) {
	// TODO Auto-generated method stub
	commandeRepository.delete(c);

	
}

@Override
public void deleteCommandeById(Long id) {
	// TODO Auto-generated method stub
	commandeRepository.deleteById(id);
	
}

@Override
public commande getCommande(Long id) {
	// TODO Auto-generated method stub
	return commandeRepository.findById(id).get();

}

@Override
public List<commande> getAllCommande() {
	// TODO Auto-generated method stub
	return commandeRepository.findAll();

}

@Override
public List<commande> findByNomCommande(String nom) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> findByNomCommandeContains(String nom) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> findByNomPrix(String nom, Double prix) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> findByClient(Client client) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> findByClietIdCli(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> findByOrderByNomCommandeAsc() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<commande> trierCommandesNomsPrix() {
	// TODO Auto-generated method stub
	return null;
}

}
