# Factory Method Pattern

Este proyecto implementa el **patrón Factory Method**, un patrón creacional que proporciona una interfaz para crear objetos, pero permite a las subclases decidir qué clase instanciar.

## 📋 Descripción

El ejemplo demuestra:
- Creación de diferentes tipos de juegos (Ajedrez, Solitario)
- Creación de tableros específicos según el tipo de juego
- Desacoplamiento entre la creación de objetos y su uso
- Flexibilidad para agregar nuevos tipos de juegos sin modificar código existente

El patrón Factory Method es útil cuando una clase no puede anticipar el tipo de objetos que debe crear o cuando quiere delegar la responsabilidad de instanciación a sus subclases.
