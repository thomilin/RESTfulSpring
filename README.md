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

