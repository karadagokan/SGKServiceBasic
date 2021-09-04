/**
 * OnayliRaporlarTarihileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class OnayliRaporlarTarihileResponse  implements java.io.Serializable {
    private com.karadag.sgkbasic.uygSgkService.CevapRapor onayliRaporlarTarihileReturn;

    public OnayliRaporlarTarihileResponse() {
    }

    public OnayliRaporlarTarihileResponse(
           com.karadag.sgkbasic.uygSgkService.CevapRapor onayliRaporlarTarihileReturn) {
           this.onayliRaporlarTarihileReturn = onayliRaporlarTarihileReturn;
    }


    /**
     * Gets the onayliRaporlarTarihileReturn value for this OnayliRaporlarTarihileResponse.
     * 
     * @return onayliRaporlarTarihileReturn
     */
    public com.karadag.sgkbasic.uygSgkService.CevapRapor getOnayliRaporlarTarihileReturn() {
        return onayliRaporlarTarihileReturn;
    }


    /**
     * Sets the onayliRaporlarTarihileReturn value for this OnayliRaporlarTarihileResponse.
     * 
     * @param onayliRaporlarTarihileReturn
     */
    public void setOnayliRaporlarTarihileReturn(com.karadag.sgkbasic.uygSgkService.CevapRapor onayliRaporlarTarihileReturn) {
        this.onayliRaporlarTarihileReturn = onayliRaporlarTarihileReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnayliRaporlarTarihileResponse)) return false;
        OnayliRaporlarTarihileResponse other = (OnayliRaporlarTarihileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onayliRaporlarTarihileReturn==null && other.getOnayliRaporlarTarihileReturn()==null) || 
             (this.onayliRaporlarTarihileReturn!=null &&
              this.onayliRaporlarTarihileReturn.equals(other.getOnayliRaporlarTarihileReturn())));
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
        if (getOnayliRaporlarTarihileReturn() != null) {
            _hashCode += getOnayliRaporlarTarihileReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnayliRaporlarTarihileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">onayliRaporlarTarihileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onayliRaporlarTarihileReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onayliRaporlarTarihileReturn"));
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
