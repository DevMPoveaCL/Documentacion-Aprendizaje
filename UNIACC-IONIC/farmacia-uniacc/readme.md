# 🏥 **Farmacia Uniacc** 🏥

Bienvenido a la aplicación **Farmacia Uniacc**, una app de **delivery** de farmacia construida utilizando **Ionic** y **Angular**. Este proyecto tiene como objetivo crear la cáscara de navegación de la aplicación móvil siguiendo el diseño propuesto, brindando una estructura básica de navegación entre las diferentes páginas de la aplicación.

---

## 🚀 **Pasos para Ejecutar la Aplicación**

1. **Clonar el repositorio** o descargar el código fuente desde tu terminal o GitHub (recuerda tener Node.js instalado).
2. **Navegar al directorio del proyecto**:
   cd farmacia-uniacc
Instalar las dependencias necesarias para que la aplicación funcione: npm install

Iniciar la aplicación en modo desarrollo: ionic serve

Esto abrirá automáticamente tu navegador predeterminado y podrás ver la aplicación en ejecución en http://localhost:8100/inicio.

🔧 Problemas Encontrados y Soluciones
Durante el desarrollo de la cáscara de navegación, nos encontramos con los siguientes problemas y sus respectivas soluciones:

1. Problema con la generación del proyecto en versión standalone:
Síntoma: Al generar el proyecto en versión standalone, las rutas no funcionaban correctamente y hubo dificultades al integrar los módulos.
Solución: Re-creé el proyecto utilizando ngModules para manejar las rutas de manera adecuada. Esto resolvió los problemas de navegación y permitió que las transiciones entre las páginas fueran fluidas.

2. Conflictos con el modo oscuro:
Síntoma: La activación del modo oscuro en la aplicación generaba inconsistencias en los estilos, especialmente con los colores de la interfaz.
Solución: Decidí desactivar el modo oscuro modificando las configuraciones en el archivo "variables.scss", lo que permitió que los estilos visuales se mantuvieran consistentes.

3. Paleta de colores personalizada:
Síntoma: Los colores predeterminados de Ionic no coincidían con el diseño visual propuesto para la app "Farmacia Uniacc".
Solución: Implementé una paleta de colores personalizada en el archivo variables.scss para hacer la interfaz más fiel al diseño original.


💻 Tecnologías Usadas
Ionic: Framework para el desarrollo de aplicaciones móviles híbridas.
Angular: Framework para el desarrollo de aplicaciones web dinámicas.
SCSS: Lenguaje de preprocesador CSS para mejorar la organización de los estilos.
HTML: Lenguaje de marcado para la estructura de la aplicación.

👨‍💻 Autor
Marco Povea: Desarrollador de la aplicación como parte de un ejercicio práctico en el curso de Programación para Dispositivos Móviles.

📜 Licencia
Este proyecto está bajo la Licencia MIT. Puedes usar, modificar y distribuir el código de acuerdo con los términos de la licencia.

¡Gracias por visitar el proyecto de Farmacia Uniacc! 🚀 Si tienes alguna pregunta o sugerencia, no dudes en contactarme. 😊