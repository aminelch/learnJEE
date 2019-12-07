package org.isetn;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication

public class ScolA7Application implements CommandLineRunner {
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private EtudiantRepository etudiantRepository;


	public static void main(String[] args) {     
		SpringApplication.run(ScolA7Application.class, args);    
	}

@Override  
public void run(String... args) throws Exception {

	 Formation f1 = formationRepository.save(new Formation(null,"Oracle",100,null));    
	 Formation f2 = formationRepository.save(new Formation(null,"J2EE",10,null));      
	 Formation f3 = formationRepository.save(new Formation(null,"Angular",120,null)); 
	 
	 
															
	etudiantRepository.save(new Etudiant(null, "Oussema", "Ben Salah", new Date(),f1)); 
	etudiantRepository.save(new Etudiant(null, "Abdou", "Ben Mahmoud", new Date(),f1));	
	etudiantRepository.save(new Etudiant(null, "Haythem", "Ben Mohamed", new Date(),f2));
	etudiantRepository.save(new Etudiant(null, "Iyadh", "Ben Toumia", new Date(),f3)); 
	} 
}