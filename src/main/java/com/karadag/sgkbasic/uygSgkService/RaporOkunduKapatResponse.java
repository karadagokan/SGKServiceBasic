/**
 * RaporOkunduKapatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class RaporOkunduKapatResponse  implements java.io.Serializable {
    private com.karadag.sgkbasic.uygSgkService.Cevap raporOkunduKapatReturn;

    public RaporOkunduKapatResponse() {
    }

    public RaporOkunduKapatResponse(
           com.karadag.sgkbasic.uygSgkService.Cevap raporOkunduKapatReturn) {
           this.raporOkunduKapatReturn = raporOkunduKapatReturn;
    }


    /**
     * Gets the raporOkunduKapatReturn value for this RaporOkunduKapatResponse.
     * 
     * @return raporOkunduKapatReturn
     */
    public com.karadag.sgkbasic.uygSgkService.Cevap getRaporOkunduKapatReturn() {
        return raporOkunduKapatReturn;
    }


    /**
     * Sets the raporOkunduKapatReturn value for this RaporOkunduKapatResponse.
     * 
     * @param raporOkunduKapatReturn
     */
    public void setRaporOkunduKapatReturn(com.karadag.sgkbasic.uygSgkService.Cevap raporOkunduKapatReturn) {
        this.raporOkunduKapatReturn = raporOkunduKapatReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RaporOkunduKapatResponse)) return false;
        RaporOkunduKapatResponse other = (RaporOkunduKapatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.raporOkunduKapatReturn==null && other.getRaporOkunduKapatReturn()==null) || 
             (this.raporOkunduKapatReturn!=null &&
              this.raporOkunduKapatReturn.equals(other.getRaporOkunduKapatReturn())));
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
        if (getRaporOkunduKapatReturn() != null) {
            _hashCode += getRaporOkunduKapatReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RaporOkunduKapatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">raporOkunduKapatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raporOkunduKapatReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raporOkunduKapatReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.vizite.ws.sgk.com", "Cevap"));
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
