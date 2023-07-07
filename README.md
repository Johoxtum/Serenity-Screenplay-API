# Proyecto de APIs con Serenity Screenplay ✨

Este repositorio contiene un proyecto de automatización de pruebas para las APIs de la página web [Petstore](https://petstore.swagger.io/v2) utilizando el framework Serenity Screenplay.

El framework Serenity Screenplay permite escribir pruebas de una manera más legible y mantenible, siguiendo el patrón de diseño Screenplay. Proporciona una estructura clara y flexible para organizar y ejecutar las pruebas, así como generar informes detallados.

## Requisitos previos 📋

Antes de ejecutar las pruebas, asegúrate de tener instalado lo siguiente:

- Java 8 o superior ☕
- Gradle 🚀
- IntelliJ IDEA (recomendado) o cualquier otro IDE de tu elección

## Configuración del proyecto ⚙️

Sigue los pasos a continuación para configurar el proyecto en tu máquina local:

1. Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/serenity-screenplay-api.git
```

## :rocket: Ejecutando las pruebas

```shell
gradle clean test aggregate
```
## Estructura del Proyecto📁

```Gherkin
src
+ main                                  | Source main
+ test                                  |
 + java                                | Test runners and supporting code
   + features                          | Features set
     + {feature_name}                  | Feature name
       + pages                         | Pages use with webdriver test
       + steps                         | Utility class for definition steps
     + {feature_name}Definition.java   | Definition class 
   + model                             | DTOs, Pojos, VOs, etc ...
   + utils                             | General utility class
   + RunnerTestSuite.java              | Main class
 + resources                           |
   + features                          | Feature files
      + {feature_name}                 | Feature file  specific
          {feature_name}.feature       |
   + serenity.conf                     | Config file for Serenity
serenity.properties                       | General properties Serenity
```

## Contacto :email:

Si tienes alguna pregunta o comentario sobre este proyecto, no dudes en contactarme:

- Nombre: Johoxtum Jiménez
- Email: [Johoxtum@gmail.com](mailto:Johoxtum@gmail.com)
- LinkedIn: [Perfil de LinkedIn](https://www.linkedin.com/in/johoxtum-jimenez-463ba1211/)

Gracias por tu interés en este proyecto de automatización QA con Serenity Screenplay!
