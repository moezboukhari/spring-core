package org.opendevup.service;

import java.util.Collection;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BourseGetwayRestService {



@RequestMapping(value="/names")
public Collection<Societe> listeSocietes(){
	RestTemplate restTemplate =new RestTemplate();
	ParameterizedTypeReference<Resources<Societe>> responseType= new  ParameterizedTypeReference<Resources<Societe>>(){ }; 
	HttpHeaders httpHeaders = new HttpHeaders();
	//JSONObject json = new JSONObject();
	httpHeaders.set("Content-Type", "application/json");
	//httpHeaders.setAll(MediaType.APPLICATION_JSON);
	HttpEntity <Societe> httpEntity = new HttpEntity <Societe> (new Societe(), httpHeaders);
	return   restTemplate.exchange("http://localhost:8082/societes",HttpMethod.GET,httpEntity,responseType)
			.getBody()
			.getContent();
	
	
}

}
class Societe {
private Long id;
private String nomSociete;
public Long getId() {
	return id;
}
public Societe(Long id, String nomSociete) {
	super();
	this.id = id;
	this.nomSociete = nomSociete;
}
public Societe() {
	super();
	// TODO Auto-generated constructor stub
}
public void setId(Long id) {
	this.id = id;
}
public String getNomSociete() {
	return nomSociete;
}
public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}
}


