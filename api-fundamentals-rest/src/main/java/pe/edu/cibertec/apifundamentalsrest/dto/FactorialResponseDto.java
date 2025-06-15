package pe.edu.cibertec.apifundamentalsrest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FactorialResponseDto {

  private Integer numeroHasta;
  private String valorFactorial;

}
