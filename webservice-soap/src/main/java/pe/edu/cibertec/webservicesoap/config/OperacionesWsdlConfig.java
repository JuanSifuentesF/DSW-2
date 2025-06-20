package pe.edu.cibertec.webservicesoap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class OperacionesWsdlConfig {

  @Bean(name = "operaciones" )
  public DefaultWsdl11Definition operacionesWsdl(XsdSchema operacionesSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("OperacionesPort");
    wsdl11Definition.setLocationUri("/ws/operaciones");
    wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/operaciones");
    wsdl11Definition.setSchema(operacionesSchema);
    return wsdl11Definition;
  }


}
