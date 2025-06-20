package pe.edu.cibertec.t2juansifuentesp1.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesService {

  public Double calcularPagoEstacionamiento(int horas, int minutos) {
    double tarifaPorHora = 1.5;
    int horasTotalesACobrar = horas;
    // Si hay minutos, aunque sea uno solo, se cuenta como una hora completa.
    if (minutos > 0) {
      horasTotalesACobrar++;
    }
    return horasTotalesACobrar * tarifaPorHora;
  }


  public Double calcularUtilidad(double salario, int anios) {
    double porcentajeUtilidad;
    if (anios < 1) {
      porcentajeUtilidad = 0.05; // 5%
    } else if (anios >= 1 && anios < 2) {
      porcentajeUtilidad = 0.07; // 7%
    } else if (anios >= 2 && anios < 5) {
      porcentajeUtilidad = 0.10; // 10%
    } else if (anios >= 5 && anios < 10) {
      porcentajeUtilidad = 0.15; // 15%
    } else { // 10 años o más
      porcentajeUtilidad = 0.20; // 20%
    }
    return salario * porcentajeUtilidad;
  }

}
