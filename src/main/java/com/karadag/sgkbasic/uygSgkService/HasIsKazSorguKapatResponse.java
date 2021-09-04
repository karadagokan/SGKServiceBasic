/**
 * HasIsKazSorguKapatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class HasIsKazSorguKapatResponse  implements java.io.Serializable {
    private com.karadag.sgkbasic.uygSgkService.Cevap hasIsKazSorguKapatReturn;

    public HasIsKazSorguKapatResponse() {
    }

    public HasIsKazSorguKapatResponse(
           com.karadag.sgkbasic.uygSgkService.Cevap hasIsKazSorguKapatReturn) {
           this.hasIsKazSorguKapatReturn = hasIsKazSorguKapatReturn;
    }


    /**
     * Gets the hasIsKazSorguKapatReturn value for this HasIsKazSorguKapatResponse.
     * 
     * @return hasIsKazSorguKapatReturn
     */
    public com.karadag.sgkbasic.uygSgkService.Cevap getHasIsKazSorguKapatReturn() {
        return hasIsKazSorguKapatReturn;
    }


    /**
     * Sets the hasIsKazSorguKapatReturn value for this HasIsKazSorguKapatResponse.
     * 
     * @param hasIsKazSorguKapatReturn
     */
    public void setHasIsKazSorguKapatReturn(com.karadag.sgkbasic.uygSgkService.Cevap hasIsKazSorguKapatReturn) {
        this.hasIsKazSorguKapatReturn = hasIsKazSorguKapatReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HasIsKazSorguKapatResponse)) return false;
        HasIsKazSorguKapatResponse other = (HasIsKazSorguKapatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hasIsKazSorguKapatReturn==null && other.getHasIsKazSorguKapatReturn()==null) || 
             (this.hasIsKazSorguKapatReturn!=null &&
              this.hasIsKazSorguKapatReturn.equals(other.getHasIsKazSorguKapatReturn())));
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
        if (getHasIsKazSorguKapatReturn() != null) {
            _hashCode += getHasIsKazSorguKapatReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HasIsKazSorguKapatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">hasIsKazSorguKapatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasIsKazSorguKapatReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasIsKazSorguKapatReturn"));
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
