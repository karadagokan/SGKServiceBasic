package com.karadag.sgkbasic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaporAramaTarihle extends BaseRaporArama {
    String sigortaliAdSoyad;
    String yatRapBasTar;
    String yatRapBitTar;

}
