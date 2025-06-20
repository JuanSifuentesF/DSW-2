package pe.edu.cibertec.t2juansifuentesp1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class OperacionesWsdlConfig {

  // Dentro de OperacionesWsdlConfig.java
  @Bean(name = "estacionamiento")
  public DefaultWsdl11Definition estacionamientoWsdl(XsdSchema estacionamientoSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("EstacionamientoPort");
    wsdl11Definition.setLocationUri("/ws/estacionamiento");
    wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/estacionamiento");
    wsdl11Definition.setSchema(estacionamientoSchema);
    return wsdl11Definition;
  }

  @Bean(name = "utilidades")
  public DefaultWsdl11Definition utilidadesWsdl(XsdSchema utilidadesSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("UtilidadesPort");
    wsdl11Definition.setLocationUri("/ws/utilidades");
    wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/utilidades");
    wsdl11Definition.setSchema(utilidadesSchema);
    return wsdl11Definition;
  }

}
