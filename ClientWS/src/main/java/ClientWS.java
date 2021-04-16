package main.java;

import web.service.service.BanqueServiceService;
import web.service.service.BanqueWS;
import web.service.service.Compte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        //creer un stub ou proxy
        BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
    double res = stub.conversionEuroToDn(800);
        System.out.println("800 en DH "+res);
        Compte cp = stub.getCompte(1L);
        List<Compte> cptes = new ArrayList<>();
        System.out.println(cp.getSolde());
        System.out.println("--------------");
        for (Compte c:cptes
             ) {
            System.out.println(c.getSolde());
            System.out.println(c.getSolde());
            System.out.println("---------------------");

        }
    }
}
