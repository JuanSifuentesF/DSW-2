package pe.edu.cibertec.t2juansifuentesp1.endpoint;


import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.t2juansifuentesp1.service.OperacionesService;
import pe.edu.cibertec.ws.estacionamiento.CalcularCostoRequest;
import pe.edu.cibertec.ws.estacionamiento.CalcularCostoResponse;
import pe.edu.cibertec.ws.utilidades.CalcularUtilidadRequest;
import pe.edu.cibertec.ws.utilidades.CalcularUtilidadResponse;

@Endpoint
@RequiredArgsConstructor
public class OperacionesEndPoint {

  // Dentro de la clase OperacionesEndPoint

  private static final String ESTACIONAMIENTO_NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/estacionamiento";
  private static final String UTILIDADES_NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/utilidades";

  private final OperacionesService operacionesService;

  @PayloadRoot(namespace = ESTACIONAMIENTO_NAMESPACE_URI, localPart = "calcularCostoRequest")
  @ResponsePayload
  public CalcularCostoResponse calcularCostoEstacionamiento(@RequestPayload CalcularCostoRequest request) {
    CalcularCostoResponse response = new CalcularCostoResponse();
    Double pago = operacionesService.calcularPagoEstacionamiento(request.getHoras(), request.getMinutos());
    response.setPagoTotal(pago);
    return response;
  }

  @PayloadRoot(namespace = UTILIDADES_NAMESPACE_URI, localPart = "calcularUtilidadRequest")
  @ResponsePayload
  public CalcularUtilidadResponse calcularUtilidad(@RequestPayload CalcularUtilidadRequest request) {
    CalcularUtilidadResponse response = new CalcularUtilidadResponse();
    Double utilidad = operacionesService.calcularUtilidad(request.getSalarioMensual(), request.getAniosTrabajando());
    response.setMontoUtilidad(utilidad);
    return response;
  }

}
