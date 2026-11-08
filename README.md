# JFo 8.1 y 8.2 - Matrices unidimensionales y ArrayList

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige una declaración de array incorrecta
02. Corrige índices fuera de rango
03. Corrige un bucle que recorre mal un array
04. Corrige una inicialización incompleta
05. Corrige el uso de sintaxis de array en un ArrayList
06. Crea y muestra un array de nombres
07. Modifica elementos de un array
08. Calcula mínimo y máximo
09. Calcula la media de cinco notas
10. Muestra un array con for-each
11. Crea una ArrayList de estudiantes
12. Inserta y elimina estudiantes
13. Recorre una ArrayList de tres formas
14. Elimina números pares con Iterator
15. Sistema de calificaciones con array y ArrayList

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
