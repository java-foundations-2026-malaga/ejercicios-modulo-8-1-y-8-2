# JFo 8.1 y 8.2 - Actividad 13

## Recorre una ArrayList de tres formas

Usa for-each, Iterator y ListIterator en ambos sentidos.

### Detalles

- Cada línea empieza con su etiqueta (`for-each:`, `Iterator:`, `ListIterator:`, `Inverso:`) seguida de los nombres separados por espacios. Para el recorrido inverso usa `hasPrevious()` y `previous()` del `ListIterator`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
for-each: Ana Bob Carla
Iterator: Ana Bob Carla
ListIterator: Ana Bob Carla
Inverso: Carla Bob Ana
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad13/Actividad13.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad13Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
