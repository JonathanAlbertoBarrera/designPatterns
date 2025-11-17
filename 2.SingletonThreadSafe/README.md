# Singleton Thread-Safe

Este proyecto implementa una versión **thread-safe** del patrón Singleton, asegurando que funcione correctamente en entornos multi-hilo (multithreading).

## 📋 Descripción

Esta implementación mejora el Singleton básico agregando:
- Sincronización para evitar condiciones de carrera
- Protección contra múltiples instancias en contextos concurrentes
- Uso correcto en aplicaciones con múltiples hilos de ejecución

Es especialmente útil cuando varias partes del programa pueden intentar crear la instancia simultáneamente.
