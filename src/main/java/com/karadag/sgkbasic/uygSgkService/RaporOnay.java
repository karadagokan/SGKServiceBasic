/**
 * RaporOnay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class RaporOnay  implements java.io.Serializable {
    private java.lang.String kullaniciAdi;

    private java.lang.String isyeriKodu;

    private java.lang.String wsToken;

    private java.lang.String tckNo;

    private java.lang.String vaka;

    private java.lang.String medulaRaporId;

    private java.lang.String nitelikDurumu;

    private java.lang.String tarih;

    public RaporOnay() {
    }

    public RaporOnay(
           java.lang.String kullaniciAdi,
           java.lang.String isyeriKodu,
           java.lang.String wsToken,
           java.lang.String tckNo,
           java.lang.String vaka,
           java.lang.String medulaRaporId,
           java.lang.String nitelikDurumu,
           java.lang.String tarih) {
           this.kullaniciAdi = kullaniciAdi;
           this.isyeriKodu = isyeriKodu;
           this.wsToken = wsToken;
           this.tckNo = tckNo;
           this.vaka = vaka;
           this.medulaRaporId = medulaRaporId;
           this.nitelikDurumu = nitelikDurumu;
           this.tarih = tarih;
    }


    /**
     * Gets the kullaniciAdi value for this RaporOnay.
     * 
     * @return kullaniciAdi
     */
    public java.lang.String getKullaniciAdi() {
        return kullaniciAdi;
    }


    /**
     * Sets the kullaniciAdi value for this RaporOnay.
     * 
     * @param kullaniciAdi
     */
    public void setKullaniciAdi(java.lang.String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }


    /**
     * Gets the isyeriKodu value for this RaporOnay.
     * 
     * @return isyeriKodu
     */
    public java.lang.String getIsyeriKodu() {
        return isyeriKodu;
    }


    /**
     * Sets the isyeriKodu value for this RaporOnay.
     * 
     * @param isyeriKodu
     */
    public void setIsyeriKodu(java.lang.String isyeriKodu) {
        this.isyeriKodu = isyeriKodu;
    }


    /**
     * Gets the wsToken value for this RaporOnay.
     * 
     * @return wsToken
     */
    public java.lang.String getWsToken() {
        return wsToken;
    }


    /**
     * Sets the wsToken value for this RaporOnay.
     * 
     * @param wsToken
     */
    public void setWsToken(java.lang.String wsToken) {
        this.wsToken = wsToken;
    }


    /**
     * Gets the tckNo value for this RaporOnay.
     * 
     * @return tckNo
     */
    public java.lang.String getTckNo() {
        return tckNo;
    }


    /**
     * Sets the tckNo value for this RaporOnay.
     * 
     * @param tckNo
     */
    public void setTckNo(java.lang.String tckNo) {
        this.tckNo = tckNo;
    }


    /**
     * Gets the vaka value for this RaporOnay.
     * 
     * @return vaka
     */
    public java.lang.String getVaka() {
        return vaka;
    }


    /**
     * Sets the vaka value for this RaporOnay.
     * 
     * @param vaka
     */
    public void setVaka(java.lang.String vaka) {
        this.vaka = vaka;
    }


    /**
     * Gets the medulaRaporId value for this RaporOnay.
     * 
     * @return medulaRaporId
     */
    public java.lang.String getMedulaRaporId() {
        return medulaRaporId;
    }


    /**
     * Sets the medulaRaporId value for this RaporOnay.
     * 
     * @param medulaRaporId
     */
    public void setMedulaRaporId(java.lang.String medulaRaporId) {
        this.medulaRaporId = medulaRaporId;
    }


    /**
     * Gets the nitelikDurumu value for this RaporOnay.
     * 
     * @return nitelikDurumu
     */
    public java.lang.String getNitelikDurumu() {
        return nitelikDurumu;
    }


    /**
     * Sets the nitelikDurumu value for this RaporOnay.
     * 
     * @param nitelikDurumu
     */
    public void setNitelikDurumu(java.lang.String nitelikDurumu) {
        this.nitelikDurumu = nitelikDurumu;
    }


    /**
     * Gets the tarih value for this RaporOnay.
     * 
     * @return tarih
     */
    public java.lang.String getTarih() {
        return tarih;
    }


    /**
     * Sets the tarih value for this RaporOnay.
     * 
     * @param tarih
     */
    public void setTarih(java.lang.String tarih) {
        this.tarih = tarih;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RaporOnay)) return false;
        RaporOnay other = (RaporOnay) obj;
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
              this.wsToken.equals(other.getWsToken()))) &&
            ((this.tckNo==null && other.getTckNo()==null) || 
             (this.tckNo!=null &&
              this.tckNo.equals(other.getTckNo()))) &&
            ((this.vaka==null && other.getVaka()==null) || 
             (this.vaka!=null &&
              this.vaka.equals(other.getVaka()))) &&
            ((this.medulaRaporId==null && other.getMedulaRaporId()==null) || 
             (this.medulaRaporId!=null &&
              this.medulaRaporId.equals(other.getMedulaRaporId()))) &&
            ((this.nitelikDurumu==null && other.getNitelikDurumu()==null) || 
             (this.nitelikDurumu!=null &&
              this.nitelikDurumu.equals(other.getNitelikDurumu()))) &&
            ((this.tarih==null && other.getTarih()==null) || 
             (this.tarih!=null &&
              this.tarih.equals(other.getTarih())));
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
        if (getTckNo() != null) {
            _hashCode += getTckNo().hashCode();
        }
        if (getVaka() != null) {
            _hashCode += getVaka().hashCode();
        }
        if (getMedulaRaporId() != null) {
            _hashCode += getMedulaRaporId().hashCode();
        }
        if (getNitelikDurumu() != null) {
            _hashCode += getNitelikDurumu().hashCode();
        }
        if (getTarih() != null) {
            _hashCode += getTarih().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RaporOnay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">raporOnay"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tckNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tckNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaka");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vaka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medulaRaporId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medulaRaporId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nitelikDurumu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nitelikDurumu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarih");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarih"));
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
