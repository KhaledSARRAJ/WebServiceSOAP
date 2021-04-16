
package web.service.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetComptes_QNAME = new QName("http://service.service.web/", "getComptes");
    private final static QName _ConversionEuroToDn_QNAME = new QName("http://service.service.web/", "ConversionEuroToDn");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service.service.web/", "getComptesResponse");
    private final static QName _Compte_QNAME = new QName("http://service.service.web/", "compte");
    private final static QName _ConversionEuroToDnResponse_QNAME = new QName("http://service.service.web/", "ConversionEuroToDnResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service.service.web/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service.service.web/", "getCompte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link ConversionEuroToDnResponse }
     * 
     */
    public ConversionEuroToDnResponse createConversionEuroToDnResponse() {
        return new ConversionEuroToDnResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDn }
     * 
     */
    public ConversionEuroToDn createConversionEuroToDn() {
        return new ConversionEuroToDn();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "ConversionEuroToDn")
    public JAXBElement<ConversionEuroToDn> createConversionEuroToDn(ConversionEuroToDn value) {
        return new JAXBElement<ConversionEuroToDn>(_ConversionEuroToDn_QNAME, ConversionEuroToDn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "ConversionEuroToDnResponse")
    public JAXBElement<ConversionEuroToDnResponse> createConversionEuroToDnResponse(ConversionEuroToDnResponse value) {
        return new JAXBElement<ConversionEuroToDnResponse>(_ConversionEuroToDnResponse_QNAME, ConversionEuroToDnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.service.web/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

}
