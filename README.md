https://github.com/Parcial-1-PDE/Tarea-1.git

# Lista de Tareas - Aplicación Android

Esta es una aplicación de lista de tareas desarrollada en Android Studio utilizando Java, que permite a los usuarios gestionar tareas pendientes y realizadas. La aplicación facilita el seguimiento de tareas por hacer y tareas completadas de forma intuitiva.

## Funcionalidades

1. **Agregar Tareas**: El usuario puede escribir una tarea en un campo de texto y presionar el botón "Añadir" para agregarla a la lista de tareas pendientes.

2. **Marcar Tarea como Hecha**: Al hacer clic en una tarea pendiente, se abre un menú contextual con la opción "Hecho". Al seleccionarla, la tarea se mueve a la lista de tareas realizadas.

3. **Eliminar Tarea**: En el menú contextual, el usuario también puede seleccionar la opción "Eliminar" para borrar una tarea. Esta opción está disponible en ambas listas, pendientes y realizadas.

4. **Ver Tareas Pendientes y Hechas**: Los botones "Pendientes" y "Hechas" en la interfaz permiten al usuario alternar entre la vista de tareas pendientes y la de tareas realizadas.

## Estructura del Código

La aplicación tiene una estructura sencilla:

- **MainActivity**: Es la actividad principal que maneja la lógica de la aplicación, incluyendo la creación, eliminación, y movimiento de tareas entre listas.
- **Menu**: Clase auxiliar que gestiona el menú contextual, permitiendo al usuario marcar tareas como hechas o eliminarlas.

### Recursos

La aplicación está localizada en español e inglés, y cambia automáticamente el idioma según la configuración del dispositivo.

## Diagrama de Clases

![Diagrama de Clases](diagrama_clases.puml)

## Diagrama de Casos de Uso

![Diagrama de Casos de Uso](diagrama_casos_uso.puml)

## Requisitos

- Android Studio 4.0 o superior
- Conocimiento básico de Java y desarrollo en Android

## Instalación

1. Clona el repositorio.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo físico.

## Uso

1. Abre la aplicación.
2. Escribe una tarea en el campo de texto y presiona "Añadir" para agregarla a la lista de tareas pendientes.
3. Haz clic en una tarea para ver el menú contextual. Selecciona "Hecho" para marcarla como realizada o "Eliminar" para borrarla.
4. Usa los botones "Pendientes" y "Hechas" para alternar entre las listas de tareas pendientes y realizadas.

## Localización

La aplicación soporta dos idiomas:
- Español (idioma predeterminado)
- Inglés

