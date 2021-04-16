package web.service.service;

import web.service.metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(name = "BanqueWS")
public class BanqueService {
    public BanqueService() {
    }

    @WebMethod(operationName = "ConversionEuroToDn")
public double conversion(@WebParam(name = "montant") double mt){
    return mt*3.1;
}
@WebMethod
public Compte getCompte( @WebParam(name = "code") Long code){
    return new Compte(code,Math.random()*800, new Date());
}
@WebMethod
public List<Compte> getComptes(){
    List<Compte> lesComptes = new ArrayList<>();
    lesComptes.add(new Compte(1L, Math.random()*8000, new Date()));
    lesComptes.add(new Compte(2L, Math.random()*8000, new Date()));
return lesComptes;
}
}
