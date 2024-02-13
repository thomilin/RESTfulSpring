# Descripción del Proyecto Backend - Spring Boot

Este proyecto es una API RESTful desarrollada con Spring Boot que proporciona servicios para interactuar con una base de datos y gestionar datos específicos. La API RESTful se integra con un proyecto Angular front-end para proporcionar funcionalidades completas de CRUD (crear, leer, actualizar, eliminar) a través de HTTP.

## Tecnologías Utilizadas

- **Spring Boot**: Framework de desarrollo backend utilizado para crear la API RESTful.
- **API RESTful**: Implementada con Spring Boot, proporciona servicios HTTP para manipular datos en la base de datos.
- **Base de Datos**: La API se conecta a una base de datos para almacenar y recuperar datos. La configuración de la base de datos se encuentra integrada en la aplicación Spring Boot.

## Funcionalidades Principales

- **Operaciones CRUD**: La API ofrece operaciones CRUD estándar para gestionar datos en la base de datos, incluyendo creación, lectura, actualización y eliminación.
- **Interfaz de Usuario Front-end**: La API se integra con un proyecto Angular front-end para proporcionar una interfaz de usuario completa que interactúa con la API para mostrar y manipular datos.




## Requerimientos

- GET debe devolver una lista con todas las tareas.
En postman:
GET:  http://localhost:8080/tareas/lista

![image](https://github.com/thomilin/RESTfullSpring/assets/86990832/56c3d0e1-185f-4ae4-a481-49d4fde4c2ed)

- GET debe devolver los detalles de una tarea específica.
En postman:
GET:  http://localhost:8080/tarea/1

- POST debe permitir añadir una nueva tarea.
En postman:
POST:  http://localhost:8080/tarea
```
{
    "nombre": "Tarea1",
    "completado":true
}
```
- PUT debe permitir modificar una tarea existente.
En postman:
PUT:  http://localhost:8080/tarea/1
```
{
    "nombre": "Juanito",
    "completado":false
}
```
![image](https://github.com/thomilin/RESTfullSpring/assets/86990832/20191b27-d0f5-4698-aa05-51564691f469)

- DELETE debe permitir eliminar una tarea existente.
En postman:
DELETE:  http://localhost:8080/tarea/1
![image](https://github.com/thomilin/RESTfullSpring/assets/86990832/202797d1-886d-4cbb-9295-b6e3b036f83e)


> Template de la Tabla de Tareas sacado de https://colorlib.com/wp/template/table-05/
