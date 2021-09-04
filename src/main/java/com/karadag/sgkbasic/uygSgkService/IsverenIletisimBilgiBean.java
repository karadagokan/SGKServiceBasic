/**
 * IsverenIletisimBilgiBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class IsverenIletisimBilgiBean  implements java.io.Serializable {
    private java.lang.String eposta;

    private java.lang.String tel;

    public IsverenIletisimBilgiBean() {
    }

    public IsverenIletisimBilgiBean(
           java.lang.String eposta,
           java.lang.String tel) {
           this.eposta = eposta;
           this.tel = tel;
    }


    /**
     * Gets the eposta value for this IsverenIletisimBilgiBean.
     * 
     * @return eposta
     */
    public java.lang.String getEposta() {
        return eposta;
    }


    /**
     * Sets the eposta value for this IsverenIletisimBilgiBean.
     * 
     * @param eposta
     */
    public void setEposta(java.lang.String eposta) {
        this.eposta = eposta;
    }


    /**
     * Gets the tel value for this IsverenIletisimBilgiBean.
     * 
     * @return tel
     */
    public java.lang.String getTel() {
        return tel;
    }


    /**
     * Sets the tel value for this IsverenIletisimBilgiBean.
     * 
     * @param tel
     */
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsverenIletisimBilgiBean)) return false;
        IsverenIletisimBilgiBean other = (IsverenIletisimBilgiBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eposta==null && other.getEposta()==null) || 
             (this.eposta!=null &&
              this.eposta.equals(other.getEposta()))) &&
            ((this.tel==null && other.getTel()==null) || 
             (this.tel!=null &&
              this.tel.equals(other.getTel())));
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
        if (getEposta() != null) {
            _hashCode += getEposta().hashCode();
        }
        if (getTel() != null) {
            _hashCode += getTel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsverenIletisimBilgiBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "IsverenIletisimBilgiBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
