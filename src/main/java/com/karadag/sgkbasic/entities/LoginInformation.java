package com.karadag.sgkbasic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginInformation extends BaseInformation{
    String isyeriSifresi;
}
