# 🏁 Carrera de Corredores en Java

## 📌 Descripción

Este proyecto consiste en una simulación de una carrera entre dos corredores utilizando **concurrencia en Java**. Cada corredor se ejecuta en un hilo independiente y muestra su progreso hasta completar una distancia de 100 metros.

El proyecto fue desarrollado como parte del **Trabajo Práctico N.º 2: Implementación de Concurrencia en Java**.

## 🎯 Objetivos

- Implementar la interfaz `Runnable`.
- Utilizar la clase `Thread` para crear y ejecutar hilos.
- Simular el avance de dos corredores.
- Observar la ejecución concurrente de ambos hilos.

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java
- **Concurrencia:** `Runnable` y `Thread`
- **Salida:** Consola

## 📂 Estructura del proyecto

```text
Carrera/
├── Corredor.java
├── Carrera.java
└── README.md
```

### Descripción de los archivos

- `Corredor.java`: define la clase `Corredor`, implementa `Runnable` y contiene la lógica del avance.
- `Carrera.java`: contiene el método `main()`, crea los corredores y ejecuta sus respectivos hilos.
- `README.md`: documentación del proyecto.

## ⚙️ Funcionamiento

1. Se crean dos corredores identificados como A y B.
2. Se instancia un hilo para cada corredor.
3. Ambos hilos se inician mediante el método `start()`.
4. Cada corredor avanza en incrementos de 10 metros hasta alcanzar los 100 metros.
5. Al completar la distancia, cada corredor imprime un mensaje de finalización.

Cada avance incluye una pausa de 200 milisegundos para facilitar la observación de la ejecución concurrente.

## ▶️ Ejecución

### Requisitos previos

Tener instalado el **JDK de Java** y disponer de acceso a una terminal.

### Compilar el proyecto

Desde la carpeta donde se encuentran los archivos, ejecutar:

```bash
javac Corredor.java Carrera.java
```

### Ejecutar el programa

```bash
java Carrera
```

## 📋 Ejemplo de salida

```text
Corredor A ha avanzado 10 metros
Corredor B ha avanzado 10 metros
Corredor A ha avanzado 20 metros
Corredor B ha avanzado 20 metros
...
Corredor A ha avanzado 100 metros
Corredor B ha avanzado 100 metros
Corredor A ha finalizado la carrera
Corredor B ha finalizado la carrera
```

*Nota: el orden de los mensajes puede variar en cada ejecución debido a la concurrencia de los hilos.*

## 📚 Conceptos aplicados

- **`Runnable`:** interfaz que define la tarea que ejecutará cada hilo.
- **`Thread`:** clase utilizada para crear y ejecutar los hilos.
- **`run()`:** método que contiene las instrucciones de cada corredor.
- **`start()`:** método que inicia la ejecución de un hilo.
- **`Thread.sleep()`:** introduce una pausa entre los avances.

## ✅ Conclusión

Este proyecto permite comprender los fundamentos de la concurrencia en Java mediante una simulación sencilla, mostrando cómo dos hilos pueden ejecutar tareas independientes dentro de un mismo programa.
