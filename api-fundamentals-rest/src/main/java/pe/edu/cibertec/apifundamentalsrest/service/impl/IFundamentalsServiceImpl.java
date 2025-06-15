package pe.edu.cibertec.apifundamentalsrest.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.apifundamentalsrest.service.IFundamentalsService;

import java.util.ArrayList;
import java.util.List;

@Service
public class IFundamentalsServiceImpl implements IFundamentalsService {

  @Override
  public String validarNumeroPrimo(Integer numero) {
    if (numero < 2) {
      return "No es primo";
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0){
          return "No es primo";
        }
    }
    return "Es primo";
  }

  @Override
  public String calcularFactorial(Integer numero) {
    if (numero < 0) {
      return "No se puede calcular el factorial de un numero negativo";
    }
    long factorial = 1;
    for (int i = 1; i <= numero; i++) {
      factorial *= i;
    }
    return "El factorial es = " + factorial;
  }

  @Override
  public List<Integer> calularFibonacci(Integer numero) {
    List<Integer> fibonacci = new ArrayList<>();

    if (numero <= 0) {
      return fibonacci;
    }

    int num1 = 0, num2 = 1;

    for (int i = 0; i < numero; i++) {
      fibonacci.add(num1);
      int siguienteValor = num1 + num2;
      num1 = num2;
      num2 = siguienteValor;
    }
    return fibonacci;
  }
}
