package pe.edu.cibertec.webservicesoap.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesService {

  public Double calcularPromedio(int t1, int t2, int pf){
    return (t1*0.2) + (t2*0.35) + (pf*0.45);
  }

  public String estadoAlumno(Double promedio){
    return promedio >= 12.5 ? "Aprobado" : "Reprobado";
  }

  public Double calcularValorImc(int talla_cm, int peso_kg){
    Double talla_m = talla_cm / 100.0;
    return peso_kg / (talla_m * talla_m);
  }

  public String diagnosticoImc(Double valorImc){
    return valorImc < 18.5 ? "Bajo Peso" : valorImc < 24.9 ? "Normal" : valorImc < 29.9 ? "Sobrepeso" : "Obesidad";
  }

}
