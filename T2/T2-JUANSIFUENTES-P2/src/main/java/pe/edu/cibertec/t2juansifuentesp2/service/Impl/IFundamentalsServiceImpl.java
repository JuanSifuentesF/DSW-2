package pe.edu.cibertec.t2juansifuentesp2.service.Impl;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.t2juansifuentesp2.service.IFundamentalsService;

@Service
public class IFundamentalsServiceImpl implements IFundamentalsService {

  @Override
  public Integer sumarDigitos(Integer numero) {
    // Validación para el requisito de 4 dígitos
    if (numero == null || numero < 1000 || numero > 9999) {
      return 0;
    }
    int suma = 0;
    String numeroStr = numero.toString();
    for (char digitoChar : numeroStr.toCharArray()) {
      suma += Character.getNumericValue(digitoChar);
    }
    return suma;
  }

  @Override
  public String verificarNumeroPerfecto(Integer numero) {
    if (numero <= 1) {
      return "No es perfecto";
    }
    int sumaDivisores = 0;
    for (int i = 1; i <= numero / 2; i++) {
      if (numero % i == 0) {
        sumaDivisores += i;
      }
    }
    if (sumaDivisores == numero) {
      return "Es perfecto";
    } else {
      return "No es perfecto";
    }
  }

}
