/**
 * ViziteGonderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class ViziteGonderServiceLocator extends org.apache.axis.client.Service implements com.karadag.sgkbasic.uygSgkService.ViziteGonderService {

    public ViziteGonderServiceLocator() {
    }


    public ViziteGonderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ViziteGonderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ViziteGonder
    private java.lang.String ViziteGonder_address = "http://uyg.sgk.gov.tr:80/Ws_Vizite/services/ViziteGonder";

    public java.lang.String getViziteGonderAddress() {
        return ViziteGonder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ViziteGonderWSDDServiceName = "ViziteGonder";

    public java.lang.String getViziteGonderWSDDServiceName() {
        return ViziteGonderWSDDServiceName;
    }

    public void setViziteGonderWSDDServiceName(java.lang.String name) {
        ViziteGonderWSDDServiceName = name;
    }

    public com.karadag.sgkbasic.uygSgkService.ViziteGonder_PortType getViziteGonder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ViziteGonder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getViziteGonder(endpoint);
    }

    public com.karadag.sgkbasic.uygSgkService.ViziteGonder_PortType getViziteGonder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub _stub = new com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub(portAddress, this);
            _stub.setPortName(getViziteGonderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setViziteGonderEndpointAddress(java.lang.String address) {
        ViziteGonder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.karadag.sgkbasic.uygSgkService.ViziteGonder_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub _stub = new com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub(new java.net.URL(ViziteGonder_address), this);
                _stub.setPortName(getViziteGonderWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ViziteGonder".equals(inputPortName)) {
            return getViziteGonder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.com", "ViziteGonderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.com", "ViziteGonder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ViziteGonder".equals(portName)) {
            setViziteGonderEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
