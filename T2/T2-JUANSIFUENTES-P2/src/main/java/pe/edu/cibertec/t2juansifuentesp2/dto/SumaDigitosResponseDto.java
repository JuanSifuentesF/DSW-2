package pe.edu.cibertec.t2juansifuentesp2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SumaDigitosResponseDto {
  private Integer numeroIngresado;
  private Integer sumaDeDigitos;
}
