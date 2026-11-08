# JFo 8.1 y 8.2 - Actividad 04

## Corrige una inicialización incompleta

Inicializa con 1 las diez posiciones de un array de byte.

### Detalles

- Usa un bucle (o `java.util.Arrays.fill`) para poner a 1 las diez posiciones; ten en cuenta que asignar un `int` a un `byte` puede requerir un cast `(byte)`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad04/Actividad04.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad04Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
