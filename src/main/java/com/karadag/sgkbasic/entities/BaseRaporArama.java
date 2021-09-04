package com.karadag.sgkbasic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseRaporArama {
    String tcKimlikNo;//*
    String medulaRaporId;//*
    String raporTakipNo;//*
    String raporSiraNo;//*
    String polikinlikTar;//*
    String yatRapBasTar;//*
    String aBasTar;//*
    String aBitTar;//*
    String isBasKontTar;//*
    String raporDurumu;//*
    String vaka;//*
    String vakaAdi;//*
}
