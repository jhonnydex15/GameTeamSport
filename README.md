Prototipo 2 - App Android con Intents

Resumen del Proyecto 📋

Esta aplicación android fue desarrollada en Java y implementa 8 intents (5 implícitos + 3 explícitos) como parte del segundo prototipo para la asignatura de Programación Android. La app demuestra el uso de eventos explícitos e implícitos para mejorar la interacción entre componentes y aplicaciones del sistema.

Especificaciones Técnicas 🔧

-Lenguaje: Java
-Plataforma: Android
-Android Studio: Ver. 2025.1.4.8
-Android Gradle Plugin: 8.13.0 
-Min SDK: 21
-Target SDK: 34

Intents que se implementaron. 

Intents implícitos (5)

1.- Abrir Página Web: abre el navegador con una url especifica y verifica que se abra el navegador.

2.- Enviar Correo: Abre el cliente de correo con datos prellenados y da la opcion de elegir app de correo ya sea google o outlook.

3.- Tomar foto: Abre la Camara para tomar la foto, toma la foto y finalmente confirma una vista previa de esta.

4.- Seleccionar Imagenes: Abre la galeria para seleccionar las imagenes, selecciona la imagen y revisa la imagen con la vista previa.

5.- Agregar eventos de calendario: Abre calendario con evento predefinidos, agrega el evento seleccionado, se ve en la app calendario y se confirman los datos seleccionados.


Intents explícitos (3)

1.- AyudaActivity: Muestra pantalla de preguntas frecuentes, muestra la informacion y boton "atras"

2.- MapActivity: Muestra las coordenadas simulando un mapa, ve las coordenadas enviadas y confirma la navegacion.

3.- PhotoActivity: Muestra la galeria y funciones de la camara, muestra galeria de fotos, botones de camara y muestra vista previa de imagenes.


Capturas de pantalla: 📲

Pantalla Principal (MainActivity)
<img width="191" height="337" alt="image" src="https://github.com/user-attachments/assets/dc2791c0-79ec-4708-b904-69f5ce53d0e4" />

Interfaz principal con botones organizados para intents implícitos y explícitos

PhotoActivity en acción
<img width="188" height="337" alt="image" src="https://github.com/user-attachments/assets/a731028d-7bd3-43fc-aaee-b3f671f71da6" />
Galería funcional con botones para cámara y selección de imágenes

MapActivity con coordenadas
<img width="188" height="337" alt="image" src="https://github.com/user-attachments/assets/8c757a36-c4dd-4474-9cb6-ad9c90c3e093" />
Pantalla que recibe y muestra coordenadas geográficas

AyudaActivity - FAQ
<img width="228" height="404" alt="image" src="https://github.com/user-attachments/assets/afd48051-d578-449b-acd1-f1e07c68c025" />
Página de ayuda con preguntas frecuentes y soluciones


Instalación y compilación: 🎛️

Opción 1: Usar APK Debug (Recomendado)
El archivo APK listo para instalar se encuentra en:

- [[url-del-repositorio]](https://github.com/jhonnydex15/GameTeamSport)

Pasos para instalar:
1.- Descargar app-debug.apk
2.- Habilitar "Orígenes desconocidos" en ajustes de seguridad
3.- Instalar APK en dispositivo Android
4.- Ejecutar la aplicación

Opción 2: Compilar desde Código Fuente

Requisitos:
- Android Studio Electric Eel o superior
- Android SDK 33
- Java JDK 11+

Pasos para compilar: 
bash
1.- Clonar repositorio
git clone [[url-del-repositorio]](https://github.com/jhonnydex15/GameTeamSport)
cd [GameTeamSport]

2.- Abrir en Android Studio
3.- Sincronizar proyecto con archivos Gradle
4.- Conectar dispositivo Android o crear emulador
5.- Ejecutar app (Shift + F10)


Pruebas de funcionalidades

Checklist de Verificación

Intents implícitos:

- Navegador web se abre correctamente

- Cliente de correo muestra datos prellenados

- Cámara captura y retorna foto

- Selector de imágenes funciona

- Calendario crea evento con datos


Intents explícitos:

AyudaActivity muestra información correcta

MapActivity recibe coordenadas via extras

PhotoActivity permite tomar y ver imágenes


Estructura del proyecto:

<img width="500" height="1050" alt="image" src="https://github.com/user-attachments/assets/3a560208-0c02-4d89-a777-602c648f4e6a" />

Características técnicas implementadas

Funcionalidades avanzadas:

- ActivityResultLauncher para manejo moderno de resultados

- Validaciones de entrada en formularios

- Manejo de errores con try-catch y Toast messages

- Navegación con botones "Atrás" en Toolbar

- Paso de datos entre Activities usando Bundle y Extras

UX/UI:

- Design responsive con LinearLayout y ScrollView

- Feedback visual con mensajes Toast

- Iconos emoji para mejor experiencia de usuario

- Organización clara de funcionalidades


Desarrollo

- Equipo: Michael Cifuentes, Michael Inostroza.   
- Asignatura: Programación Android.  
- Institución: Santo Tomas.  
- Fecha de entrega: 18 de Octubre.


Licencia:

Este proyecto se ha desarrollado con fines educativos para la asignatura de Programación Android.
