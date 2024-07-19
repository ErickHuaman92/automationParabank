# Ejecucion de automatizacion ParaBank

A continuacion se muestra los pasos para ejecutar la automatizacion ParaBank desde la terminal:

Paso 1: Descargar proyecto desde repositorio y ubicarse dentro de la carpeta del proyecto

    git clone https://github.com/ErickHuaman92/automationParabank.git
    cd automationParabank

Paso 2: Ejecucion de prueba web con Maven

    mvn clean verify

Paso 3: Se levantara el navegador y empezara la ejecucion de la prueba web. 
Al culminar la prueba se generara el reporte con las capturas de la ejecucion en la siguiente ruta

    \target\site\serenity\index.html
    

### Consideraciones

```
1. Tener instaldo Maven y Java 18
2. La ejecucion usa la libreria 'Faker' para la generacion de datos aleatorios, por lo que hay una probabilidad de 
que el usuario que se genera pueda ya existir y de error. En ese caso se debe volver a ejecutar la prueba. Esto seria
un caso alterno, por el momento la automatizacion contempla el happyPath segun los pasos indicados.
3. La automatizacion sigue el patron de diseño Screenplay
4. En caso de haber algun inconveniente con los comandos, se puede ejecutar la prueba ingresando al proyecto
desde un IDE, y ejecutar la clase 'src.test.java.com.parabank.CucumberTestSuite'