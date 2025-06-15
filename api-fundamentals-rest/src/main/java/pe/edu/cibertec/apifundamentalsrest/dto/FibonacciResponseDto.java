package pe.edu.cibertec.apifundamentalsrest.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class FibonacciResponseDto {

  private Integer numeroHasta;
  private List<Integer> fibonacci = new ArrayList<>();

}
