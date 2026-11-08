# JFo 8.1 y 8.2 - Actividad 09

## Calcula la media de cinco notas

Lee cinco puntuaciones, guárdalas en un array y calcula su media.

### Detalles

- Lee las cinco notas con el `Scanner` (por ejemplo, con la entrada `70 80 90 60 100` la media es 80.0) y guárdalas en `scores` con un bucle.
- No muestres mensajes de petición: la única salida debe ser la línea `Media: ...`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Entrada usada por el test

```text
70 80 90 60 100
```

## Salida esperada

```text
Media: 80.0
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad09/Actividad09.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
