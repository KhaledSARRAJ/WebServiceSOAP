package web.service.serveur;

import web.service.service.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurWS {
    public static void main(String[] args) {
        String url = "http://localhost:8585/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(url);
    }
}
