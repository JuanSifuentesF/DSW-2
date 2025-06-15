package pe.edu.cibertec.apifundamentalsrest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.apifundamentalsrest.dto.FactorialResponseDto;
import pe.edu.cibertec.apifundamentalsrest.dto.FibonacciResponseDto;
import pe.edu.cibertec.apifundamentalsrest.dto.GenericResponseDto;
import pe.edu.cibertec.apifundamentalsrest.dto.PrimoResponseDto;
import pe.edu.cibertec.apifundamentalsrest.service.IFundamentalsService;

@RestController
@RequestMapping("/api/v1/operacion")
@RequiredArgsConstructor
public class FundamentalsController {

  private final IFundamentalsService fundamentalsService;

  //localhost:8080/api/v1/operacion/primo?numeroPrimo=5
  @GetMapping("/primo")
  public ResponseEntity<GenericResponseDto<PrimoResponseDto>> validarNumeroPrimo(@RequestParam Integer numeroPrimo) {

    PrimoResponseDto responseDto = PrimoResponseDto.builder()
        .numero(numeroPrimo)
        .resultado(fundamentalsService.validarNumeroPrimo(numeroPrimo))
        .build();

    return ResponseEntity.ok(GenericResponseDto.<PrimoResponseDto>builder()
        .response(responseDto)
        .build());
  }

  //localhost:8080/api/v1/operacion/factorial
  @GetMapping("/factorial")
  public ResponseEntity<GenericResponseDto<FactorialResponseDto>> obtenerFactoria(@RequestParam(required = false, defaultValue = "2") Integer numeroFactorial) {
    FactorialResponseDto responseDto = FactorialResponseDto.builder()
        .numeroHasta(numeroFactorial)
        .valorFactorial(fundamentalsService.calcularFactorial(numeroFactorial))
        .build();

    return ResponseEntity.ok(GenericResponseDto.<FactorialResponseDto>builder()
          .response(responseDto)
          .build());

  }

  @GetMapping({"/fibonacci","/fibonacci/{numeroFibonacci}"})
  public ResponseEntity<GenericResponseDto<FibonacciResponseDto>> obtenerFibonacci(@PathVariable(required = false) Integer numeroFibonacci) {
    if (numeroFibonacci == null) numeroFibonacci = 1;
    FibonacciResponseDto responseDto = FibonacciResponseDto.builder()
        .numeroHasta(numeroFibonacci)
        .fibonacci(fundamentalsService.calularFibonacci(numeroFibonacci))
        .build();

    return ResponseEntity.ok(GenericResponseDto.<FibonacciResponseDto>builder()
          .response(responseDto)
          .build());
  }


}
