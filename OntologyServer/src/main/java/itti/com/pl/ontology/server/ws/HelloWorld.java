package itti.com.pl.ontology.server.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}