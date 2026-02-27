# P1AppsMovilesNativas
Primera practica del curso de Desarrollo de Aplicaciones Móviles Nativas

## Contenidos
- [Aplicación de Navegación por Activities](#aplicación-de-navegación-por-activities)
- [Descripción de las Activities](#descripción-de-las-activities)
- [Manejo de Transiciones y Ciclo de Vida](#manejo-de-transiciones-y-ciclo-de-vida)
- [Instrucciones para Ejecutar la Aplicación](#instrucciones-para-ejecutar-la-aplicación)
  - [Prerrequisitos](#prerrequisitos)
  - [Pasos para la Ejecución](#pasos-para-la-ejecución)

# Aplicación de Navegación por Activities

Esta es una aplicación de ejemplo desarrollada en Android Studio que demuestra la navegación entre múltiples Activities. La aplicación guía al usuario a través de un viaje conceptual desde la Vía Láctea hasta un destino final ficticio llamado "Ecatepunk".

## Descripción de las Activities

La aplicación consta de las siguientes Activities, cada una representando una pantalla con un tema específico:

1.  **`BienvenidaActivity`**
    - **Descripción:** Es la pantalla de inicio de la aplicación. Su función es dar la bienvenida al usuario y proporcionar un botón "Comenzar" para iniciar el recorrido por las demás pantallas.

2.  **`GalaxiaActivity`**
    - **Descripción:** Representa la inmensidad de una galaxia. Esta actividad contiene dos botones: "Siguiente", que lleva a la pantalla del Sistema Solar, y "Anterior", cuya funcionalidad no está implementada en el código proporcionado, pero se espera que regrese a la pantalla de Bienvenida.

3.  **`SistemaSolarActivity`**
    - **Descripción:** Muestra información o una representación del Sistema Solar. Permite la navegación hacia atrás (a `GalaxiaActivity`) mediante el método `finish()` y hacia adelante (a `PlanetasActivity`) con un `Intent`.

4.  **`PlanetasActivity`**
    - **Descripción:** Pantalla dedicada a los planetas. Similar a la anterior, permite regresar a `SistemaSolarActivity` con `finish()` y avanzar a `TierraActivity` con un `Intent`.

5.  **`TierraActivity`**
    - **Descripción:** Enfocada en el planeta Tierra. Ofrece navegación hacia atrás (a `PlanetasActivity`) con `finish()` y hacia adelante (a `PaisesActivity`) con un `Intent`.

6.  **`PaisesActivity`**
    - **Descripción:** Representa la pantalla de "Países". Desde aquí, el botón "Anterior" regresa a `TierraActivity` usando `finish()`. El botón "Siguiente" (etiquetado como `btnFinalizar` en el código) avanza a la última pantalla, `EcatepunkActivity`.

7.  **`EcatepunkActivity`**
    - **Descripción:** Es la pantalla final de la aplicación. Contiene un botón "Anterior" que regresa a `PaisesActivity` con `finish()` y un botón "Finalizar" que cierra completamente la aplicación usando `finishAffinity()`.

## Manejo de Transiciones y Ciclo de Vida

## Instrucciones para Ejecutar la Aplicación

Sigue estos pasos para ejecutar la aplicación en un entorno de desarrollo:

### Prerrequisitos

-   **Android Studio:** Tener instalada la última versión estable de Android Studio (Iguana | 2023.2.1 o superior).
-   **JDK:** Java Development Kit (JDK) 17 o superior, generalmente incluido con Android Studio.
-   **Dispositivo/Emulador:** Un dispositivo Android físico con depuración USB habilitada o un Emulador de Android configurado (AVD).

### Pasos para la Ejecución

1.  **Clonar o Descargar el Proyecto:**
    - Si el código está en un repositorio, clónalo usando:
      ```bash
      git clone [URL del repositorio]
      ```
    - O descarga y descomprime el archivo ZIP del proyecto.

2.  **Abrir el Proyecto en Android Studio:**
    - Inicia Android Studio.
    - En la ventana de bienvenida, selecciona "Open".
    - Navega hasta la carpeta raíz del proyecto y haz clic en "OK".
    - Espera a que Android Studio importe y sincronice el proyecto (esto puede tomar unos minutos la primera vez).

3.  **Configurar un Dispositivo Virtual (Opcional pero Recomendado):**
    - Si no tienes un dispositivo físico, abre el "Device Manager" (Administrador de Dispositivos) desde la barra lateral derecha.
    - Haz clic en "Create device" y elige un modelo de teléfono (por ejemplo, Pixel 6).
    - Selecciona una imagen del sistema (recomendado: una versión reciente de API, como API 34) y descárgala si es necesario.
    - Finaliza la configuración.

4.  **Ejecutar la Aplicación:**
    - Conecta tu dispositivo físico vía USB (y asegúrate de tener la depuración USB activada) o asegúrate de que tu emulador esté encendido.
    - En la barra de herramientas de Android Studio, selecciona tu dispositivo/emulador en el menú desplegable.
    - Haz clic en el botón verde "Run" (icono de "play") o ve a `Run` -> `Run 'app'`.
    - Espera a que la aplicación se compile e instale en el dispositivo.

5.  **Interactuar con la App:**
    - Una vez instalada, la aplicación se abrirá automáticamente mostrando `BienvenidaActivity`. Presiona "Comenzar" y utiliza los botones "Siguiente" y "Anterior" para navegar a través de las pantallas. Finalmente, presiona "Finalizar" en la última pantalla para cerrar la app.
