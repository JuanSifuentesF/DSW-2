package pe.edu.cibertec.apifundamentalsrest.service;

import java.util.List;

public interface IFundamentalsService {

  String validarNumeroPrimo(Integer numero);

  String calcularFactorial(Integer numero);

  List<Integer> calularFibonacci(Integer numero);

}
