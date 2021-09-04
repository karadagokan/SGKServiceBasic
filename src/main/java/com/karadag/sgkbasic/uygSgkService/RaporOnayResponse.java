/**
 * RaporOnayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class RaporOnayResponse  implements java.io.Serializable {
    private com.karadag.sgkbasic.uygSgkService.CevapRapor raporOnayReturn;

    public RaporOnayResponse() {
    }

    public RaporOnayResponse(
           com.karadag.sgkbasic.uygSgkService.CevapRapor raporOnayReturn) {
           this.raporOnayReturn = raporOnayReturn;
    }


    /**
     * Gets the raporOnayReturn value for this RaporOnayResponse.
     * 
     * @return raporOnayReturn
     */
    public com.karadag.sgkbasic.uygSgkService.CevapRapor getRaporOnayReturn() {
        return raporOnayReturn;
    }


    /**
     * Sets the raporOnayReturn value for this RaporOnayResponse.
     * 
     * @param raporOnayReturn
     */
    public void setRaporOnayReturn(com.karadag.sgkbasic.uygSgkService.CevapRapor raporOnayReturn) {
        this.raporOnayReturn = raporOnayReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RaporOnayResponse)) return false;
        RaporOnayResponse other = (RaporOnayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.raporOnayReturn==null && other.getRaporOnayReturn()==null) || 
             (this.raporOnayReturn!=null &&
              this.raporOnayReturn.equals(other.getRaporOnayReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRaporOnayReturn() != null) {
            _hashCode += getRaporOnayReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RaporOnayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">raporOnayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raporOnayReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raporOnayReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.vizite.ws.sgk.com", "CevapRapor"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
