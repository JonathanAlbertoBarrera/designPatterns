# Ejercicio Singleton - Sistema de Sesión

Ejercicio práctico que implementa un **Sistema de Gestión de Sesión de Usuario** utilizando el patrón Singleton para mantener una única sesión activa en el sistema.

## 📋 Descripción

El sistema de sesión controla:
- **Inicio de sesión**: Solo permite una sesión activa a la vez
- **Usuario activo**: Muestra qué usuario tiene la sesión iniciada
- **Cierre de sesión**: Libera la sesión actual

Este patrón es ideal para sistemas donde solo debe haber un usuario autenticado simultáneamente, similar a aplicaciones de escritorio o sistemas con sesión única.