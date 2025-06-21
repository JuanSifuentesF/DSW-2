package pe.edu.cibertec.t2juansifuentesp2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NumeroPerfectoResponseDto {
  private Integer numeroVerificado;
  private String resultado;
}