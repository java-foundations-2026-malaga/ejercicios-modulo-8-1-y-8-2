# JFo 8.1 y 8.2 - Actividad 15

## Sistema de calificaciones con array y ArrayList

Lee estudiantes y notas, calcula la media, muestra quién la supera y elimina por nombre.

### Detalles

- Lee del teclado (`Scanner`): el número de estudiantes `n`, después `n` parejas `nombre nota` y, por último, el nombre del estudiante que hay que eliminar. Con la entrada `3 Ana 8 Luis 6 Marta 9 Luis` se obtiene la salida esperada.
- Guarda los nombres en un `ArrayList<String>` y las notas en un array `double[]`.
- Muestra cada estudiante con su nota, la media, los que están por encima de la media, el eliminado y la lista final. No muestres mensajes de petición.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Entrada usada por el test

```text
3 Ana 8 Luis 6 Marta 9 Luis
```

## Salida esperada

```text
Ana: 8.0
Luis: 6.0
Marta: 9.0
Media: 7.666666666666667
Sobre la media: Ana
Sobre la media: Marta
Eliminado: Luis
Estudiantes: [Ana, Marta]
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_1_8_2_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
