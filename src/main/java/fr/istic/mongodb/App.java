package fr.istic.mongodb;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.net.UnknownHostException;

public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
        
        Morphia morphia = new Morphia();	
    	Mongo mongo = new Mongo();
    	morphia.map(Person.class).map(Address.class);
    	Datastore ds = morphia.createDatastore(mongo, "my_database");
    	
    	/*
    	 * Creation personne Tintin
    	 */
    	Person p = new Person();
    	p.setName("Tintin");

    	Address address = new Address();
    	address.setStreet("123 Some street");
    	address.setCity("Some city");
    	address.setPostCode("123 456");
    	address.setCountry("Some country");
    	//set address
    	p.setAddress(address);
    	// Save the POJO
    	ds.save(p);
        
        //Création d'une personne
        Person jm = new Person();
    	jm.setName("JeanMichel");

    	Address ad = new Address();
    	ad.setStreet("Rue de la Paillette");
    	ad.setCity("Rennes");
    	ad.setPostCode("35000");
    	ad.setCountry("France");
    	//set address
    	jm.setAddress(ad);
    	// Save the POJO
    	ds.save(jm);
        
        //Création d'un article
        Article article = new Article();
    	article.setName("La pêche du brochet en période d'ouverture");
    	article.setStarts(10);
    	article.setBuyers(jm);
    	ds.save(article);
        
    }
}
