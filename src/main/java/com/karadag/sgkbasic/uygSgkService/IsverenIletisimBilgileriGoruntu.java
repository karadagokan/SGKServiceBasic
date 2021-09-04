/**
 * IsverenIletisimBilgileriGoruntu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class IsverenIletisimBilgileriGoruntu  implements java.io.Serializable {
    private java.lang.String kullaniciAdi;

    private java.lang.String isyeriKodu;

    private java.lang.String wsToken;

    public IsverenIletisimBilgileriGoruntu() {
    }

    public IsverenIletisimBilgileriGoruntu(
           java.lang.String kullaniciAdi,
           java.lang.String isyeriKodu,
           java.lang.String wsToken) {
           this.kullaniciAdi = kullaniciAdi;
           this.isyeriKodu = isyeriKodu;
           this.wsToken = wsToken;
    }


    /**
     * Gets the kullaniciAdi value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @return kullaniciAdi
     */
    public java.lang.String getKullaniciAdi() {
        return kullaniciAdi;
    }


    /**
     * Sets the kullaniciAdi value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @param kullaniciAdi
     */
    public void setKullaniciAdi(java.lang.String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }


    /**
     * Gets the isyeriKodu value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @return isyeriKodu
     */
    public java.lang.String getIsyeriKodu() {
        return isyeriKodu;
    }


    /**
     * Sets the isyeriKodu value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @param isyeriKodu
     */
    public void setIsyeriKodu(java.lang.String isyeriKodu) {
        this.isyeriKodu = isyeriKodu;
    }


    /**
     * Gets the wsToken value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @return wsToken
     */
    public java.lang.String getWsToken() {
        return wsToken;
    }


    /**
     * Sets the wsToken value for this IsverenIletisimBilgileriGoruntu.
     * 
     * @param wsToken
     */
    public void setWsToken(java.lang.String wsToken) {
        this.wsToken = wsToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsverenIletisimBilgileriGoruntu)) return false;
        IsverenIletisimBilgileriGoruntu other = (IsverenIletisimBilgileriGoruntu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kullaniciAdi==null && other.getKullaniciAdi()==null) || 
             (this.kullaniciAdi!=null &&
              this.kullaniciAdi.equals(other.getKullaniciAdi()))) &&
            ((this.isyeriKodu==null && other.getIsyeriKodu()==null) || 
             (this.isyeriKodu!=null &&
              this.isyeriKodu.equals(other.getIsyeriKodu()))) &&
            ((this.wsToken==null && other.getWsToken()==null) || 
             (this.wsToken!=null &&
              this.wsToken.equals(other.getWsToken())));
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
        if (getKullaniciAdi() != null) {
            _hashCode += getKullaniciAdi().hashCode();
        }
        if (getIsyeriKodu() != null) {
            _hashCode += getIsyeriKodu().hashCode();
        }
        if (getWsToken() != null) {
            _hashCode += getWsToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsverenIletisimBilgileriGoruntu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">isverenIletisimBilgileriGoruntu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kullaniciAdi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kullaniciAdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isyeriKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isyeriKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsToken"));
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
