package pe.edu.cibertec.t2juansifuentesp2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t2juansifuentesp2.dto.GenericResponseDto;
import pe.edu.cibertec.t2juansifuentesp2.dto.NumeroPerfectoResponseDto;
import pe.edu.cibertec.t2juansifuentesp2.dto.SumaDigitosResponseDto;
import pe.edu.cibertec.t2juansifuentesp2.service.IFundamentalsService;

@RestController
@RequestMapping("/api/v1/operacion")
@RequiredArgsConstructor
public class FundamentalsController {

  private final IFundamentalsService fundamentalsService;

  // URL de ejemplo: localhost:8080/api/v1/operacion/sumar-digitos?numero=1234
  @GetMapping("/sumar-digitos")
  public ResponseEntity<GenericResponseDto<SumaDigitosResponseDto>> sumarDigitosDeNumero(@RequestParam Integer numero) {
    SumaDigitosResponseDto responseDto = SumaDigitosResponseDto.builder()
          .numeroIngresado(numero)
          .sumaDeDigitos(fundamentalsService.sumarDigitos(numero))
          .build();

    return ResponseEntity.ok(GenericResponseDto.<SumaDigitosResponseDto>builder()
          .response(responseDto)
          .build());
  }

  // URL de ejemplo: localhost:8080/api/v1/operacion/numero-perfecto?numero=6
  @GetMapping("/numero-perfecto")
  public ResponseEntity<GenericResponseDto<NumeroPerfectoResponseDto>> verificarSiNumeroEsPerfecto(@RequestParam Integer numero) {
    NumeroPerfectoResponseDto responseDto = NumeroPerfectoResponseDto.builder()
          .numeroVerificado(numero)
          .resultado(fundamentalsService.verificarNumeroPerfecto(numero))
          .build();

    return ResponseEntity.ok(GenericResponseDto.<NumeroPerfectoResponseDto>builder()
          .response(responseDto)
          .build());
  }

}
