package pe.edu.cibertec.apifundamentalsrest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenericResponseDto<T> {

  private T response;
  private MessageErrorDto error;

}
