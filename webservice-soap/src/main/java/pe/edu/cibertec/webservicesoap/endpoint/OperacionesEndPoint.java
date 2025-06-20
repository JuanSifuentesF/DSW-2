package pe.edu.cibertec.webservicesoap.endpoint;

import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.webservicesoap.service.OperacionesService;
import pe.edu.cibertec.ws.operaciones.GetImcRequest;
import pe.edu.cibertec.ws.operaciones.GetImcResponse;
import pe.edu.cibertec.ws.operaciones.GetPromedioRequest;
import pe.edu.cibertec.ws.operaciones.GetPromedioResponse;

@Endpoint
@RequiredArgsConstructor
public class OperacionesEndPoint {

  private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/operaciones";

  private final OperacionesService operacionesService;

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPromedioRequest")
  @ResponsePayload
  public GetPromedioResponse getPromedioCibertec(@RequestPayload GetPromedioRequest request) {
    GetPromedioResponse response = new GetPromedioResponse();
    Double promedioFinal = operacionesService.calcularPromedio(
          request.getT1(), request.getT2(), request.getPf()
    );

    response.setValorPromedio(promedioFinal);
    response.setEstado(operacionesService.estadoAlumno(promedioFinal));
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getImcRequest")
  @ResponsePayload
  public GetImcResponse getImcResponse(@RequestPayload GetImcRequest request) {
    GetImcResponse response = new GetImcResponse();
    Double valorImc = operacionesService.calcularValorImc(
          request.getTalla(), request.getPeso()
    );
    response.setValorImc(valorImc);
    response.setDiagnostico(operacionesService.diagnosticoImc(valorImc));
    return response;
  }

}
