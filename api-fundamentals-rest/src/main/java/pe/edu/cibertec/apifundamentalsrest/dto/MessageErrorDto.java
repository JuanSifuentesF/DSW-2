package pe.edu.cibertec.apifundamentalsrest.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class MessageErrorDto {

  private LocalDate dateError;
  private String message;

}
