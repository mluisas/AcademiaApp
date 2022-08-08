package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.MonthDay;

@Getter
@Setter
@AllArgsConstructor
public class InfoPagamento {
    String numeroCartao;
    MonthDay dataVencimento;
}
