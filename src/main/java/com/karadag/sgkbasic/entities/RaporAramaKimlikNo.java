package com.karadag.sgkbasic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaporAramaKimlikNo extends BaseRaporArama {
    String ad;
    String soyad;
    String raporBitTar;
    String isvereneBildirildigiTarih;
    String bashekimOnayTarihi;
    String tesisKodu;
    String tesisAdi;
    String ceza;

}
