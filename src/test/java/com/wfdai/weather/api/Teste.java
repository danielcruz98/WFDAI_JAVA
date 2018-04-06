package com.wfdai.weather.api;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public class Teste {
     public static void main(String[] args) throws JAXBException, IOException{
         
  
        Weather ywapi = new Weather();
        Parser parser = new Parser();
        ywapi.setWeather("braga");
        parser.setParser(ywapi);
        String xpto= parser.getParsedMessage();
        Publisher publisher = new Publisher();
        publisher.publish("braga",xpto);
        System.out.println(xpto);

              
    }   
}