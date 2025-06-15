package pe.edu.cibertec.apifundamentalsrest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrimoResponseDto {
  private Integer numero;
  private String resultado;
}
