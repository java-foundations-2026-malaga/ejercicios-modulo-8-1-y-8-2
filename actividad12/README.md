# JFo 8.1 y 8.2 - Actividad 12

## Inserta y elimina estudiantes

Inserta Nick y Mike y elimina el elemento situado en el índice 3.

### Detalles

- Inserta `Nick` en la posición 0 y `Mike` en la posición 1 con `add(indice, valor)`; después elimina el elemento del índice 3 con `remove(3)`.
- Imprime la lista y `"Tamaño: " + students.size()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
[Nick, Mike, Amy, Cindy, David]
Tamaño: 5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad12/Actividad12.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad12Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
