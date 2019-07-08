# altiora-app

### Requisitos para la ejecución del código fuente desde un ambiente de desarrollo

- Descargar e instalar **java** desde [aquí](https://www.java.com/es/download/). (Configurar las respectivas variables de entorno en el sistema operativo). La version de java utilizada es 8.
- Descargar e instalar **STS** desde [aquí](https://spring.io/tools).
- Descargar **gradle** desde [aquí](https://gradle.org/next-steps/?version=5.2&format=all). (Configurar las respectivas variables de entorno en el sistema operativo). La version de gradle utilizada es 5.2. Para la instalación de Gradle basta con crear la variable de entorno que haga referencia  al carpeta *..\gradle-5.2\bin\*. Posterior a dicha configuracion se podra ver la versión de gradle instalada mediante la ejecuión del comando *gradle -v* desde una terminal de comandos.

### Pasos para la ejecución del código fuente desde un ambiente de desarrollo
- Abrir el **STS** y una vez dentro **importar** como **proyecto gradle** haciendo referencia a la carpeta contenedora de este proyecto.
En caso de que aparezca la opción de **importar proyecto gradle** dirigirse a la barra de menú: Help > Eclipse Marketplace. Una vez abierta la ventana emergente buscar el plugin **Gradle Integration.**
- Dirigirse al Package Explorer ubicado en el lado izquierdo del IDE. Una vez importado el proyecto se dar click derecho sobre el módulo **altiora-app**. Escoger la opción **Run As > Spring boot app.**
- Esto permitirá el despliegue de los servicios web publicados en este proyecto.
