# JFo 8.1 y 8.2 - Actividad 14

## Elimina números pares con Iterator

Elimina de forma segura los pares del 1 al 20 mediante iterator.remove().

### Detalles

- Recorrer la lista con for-each y llamar a `numbers.remove(...)` lanza `ConcurrentModificationException`. Usa un `Iterator` y `iterator.remove()`.
- Muestra la lista antes (`Antes: ...`) y después (`Después: ...`) de eliminar los pares.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Antes: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
Después: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
