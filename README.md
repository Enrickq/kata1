# Kata 1 - Familiarización con IntelliJ IDEA y flujo básico de trabajo

## Objetivo

El objetivo de esta kata es practicar y mecanizar el flujo básico de trabajo con IntelliJ IDEA, Java, Git y GitHub
mediante la construcción repetida de un microproyecto sencillo.

El proyecto utiliza una clase de dominio `Person` con dos atributos (`name` y `birthDate`) y un método que calcula la
edad de la persona en una fecha determinada. La clase `Main` se limita a crear una instancia, utilizar sus métodos y
mostrar el resultado por consola.

La kata se ha realizado tres veces para practicar la creación de clases, ejecución, depuración, refactorización y flujo
Git hasta ganar soltura con las herramientas.

## Entorno y dependencias

- Java: OpenJDK 27
- Build system: Maven
- IDE utilizado: IntelliJ IDEA
- Dependencias externas: ninguna

### Nota sobre Maven

En el equipo utilizado para desarrollar la kata, el comando `mvn` no estaba
disponible globalmente en el `PATH`. La compilación y verificación se realizaron
utilizando Maven desde la ventana integrada de IntelliJ IDEA (`Maven -> Lifecycle -> compile`).

El proyecto se define mediante `pom.xml` y no requiere dependencias externas.

El proyecto utiliza únicamente clases de la biblioteca estándar de Java, principalmente `LocalDate` y `Period`.

## Estructura del proyecto

```text
kata1/
├── src/
│   └── main/
│       └── java/
│           └── software/
│               └── ulpgc/
│                   └── kata1/
│                       ├── Main.java
│                       └── Person.java
├── .gitignore
├── pom.xml
└── README.md
```

## Shortcuts de IntelliJ IDEA utilizados

Durante la kata se practicaron los siguientes atajos:

| Atajo              | Acción                                               |
|--------------------|------------------------------------------------------|
| `Alt + Insert`     | Crear una nueva clase o archivo                      |
| `Ctrl + Alt + L`   | Formatear el código                                  |
| `Shift + F10`      | Ejecutar la configuración actual                     |
| `Shift + F9`       | Ejecutar en modo depuración                          |
| `F9`               | Continuar la ejecución hasta el siguiente breakpoint |
| `Shift + F6`       | Renombrar mediante refactorización                   |
| `Ctrl + K`         | Crear un commit                                      |
| `Ctrl + Shift + K` | Hacer push                                           |
| `Alt + 9`          | Abrir la ventana de Git y consultar el historial     |
| `Ctrl + Shift + A` | Buscar una acción de IntelliJ                        |

Estos atajos se repitieron durante las distintas ejecuciones de la kata con el
objetivo de reducir la dependencia de los menús y ganar fluidez con el IDE.

## Depuración

Durante cada repetición se utilizaron breakpoints en dos puntos de la clase
`Person`:

- En el constructor, para inspeccionar `name` y `birthDate`.
- En `calculateAgeOn`, para inspeccionar la fecha de nacimiento y la fecha
  utilizada para calcular la edad.

La ejecución en modo Debug permite detener temporalmente el programa y observar
el valor de las variables antes de continuar.

## Refactorización

Se utilizó la herramienta **Rename Refactoring** de IntelliJ IDEA mediante
`Shift + F6`.

El método:

```java
ageOn(LocalDate date)
```

se renombró a:

```java
calculateAgeOn(LocalDate date)
```

IntelliJ actualizó automáticamente las referencias al método en `Main`, evitando
tener que buscar y modificar manualmente cada uso.

## Flujo Git y GitHub

El repositorio utiliza dos ramas:

- `main`: contiene la versión integrada y evaluable.
- `develop`: se utiliza para realizar el trabajo habitual de cada repetición.

El flujo seguido fue:

```text
develop
   |
   |-- implementación
   |-- ejecución y depuración
   |-- refactorización
   |-- commits
   |
   v
main
   |
   |-- integración de develop
   |-- tag de la repetición
   |
   v
GitHub
```

Se realizaron commits pequeños y descriptivos para que el historial permita
identificar el trabajo realizado en cada repetición.

Cada repetición finalizada quedó identificada mediante un tag:

- `repetition-1`
- `repetition-2`
- `repetition-3`

Las ramas `main` y `develop` se sincronizaron con el repositorio remoto de
GitHub mediante push.

## Repeticiones de la kata

### Repetición 1

En la primera repetición se construyó el microproyecto con las clases `Person`
y `Main`.

Se practicaron:

- Creación del proyecto Maven.
- Creación de la clase de dominio.
- Creación del punto de entrada.
- Compilación y ejecución.
- Uso del depurador con breakpoints.
- Refactorización del método de cálculo de edad.
- Trabajo en `develop`.
- Integración final en `main`.
- Push a GitHub.

### Repetición 2

Se reconstruyó el mismo microproyecto manteniendo un alcance equivalente.

Se repitieron la creación de las clases, compilación, ejecución, depuración,
refactorización y flujo Git para reducir la fricción al utilizar IntelliJ IDEA.

Como pequeña variación se modificaron los datos utilizados en el ejemplo de
ejecución.

### Repetición 3

Se volvió a construir el mismo microproyecto, esta vez buscando realizar el
flujo con mayor agilidad mediante los shortcuts y las herramientas Git
integradas en IntelliJ IDEA.

En esta repetición se practicó especialmente:

- Creación rápida de clases.
- Formateo y ejecución mediante shortcuts.
- Depuración.
- Rename Refactoring.
- Commits desde IntelliJ.
- Cambio de ramas.
- Integración de `develop` en `main`.
- Creación del tag `repetition-3`.
- Push desde IntelliJ.

## Commits y organización del historial

Los commits se realizaron de forma incremental para reflejar el proceso de
trabajo de cada repetición. Se utilizaron mensajes como:

- `Repetition 1: implement Person domain model`
- `Repetition 1: add application entry point`
- `Repetition 1: refactor age calculation`
- `Repetition 2: reset microproject`
- `Repetition 3: implement Person domain model`
- `Complete repetition 3`

Cada repetición se integró posteriormente en `main` mediante un commit de merge
y se marcó con su correspondiente tag.

## Verificación realizada

Durante el desarrollo se realizaron las siguientes comprobaciones:

- Compilación mediante Maven desde IntelliJ IDEA con resultado `BUILD SUCCESS`.
- Ejecución de `Main`.
- Comprobación de la salida por consola.
- Uso de breakpoints en el constructor y en el método de cálculo.
- Inspección de variables durante la depuración.
- Ejecución correcta después de realizar la refactorización.
- Revisión del historial Git.
- Comprobación de las ramas `main` y `develop` en GitHub.
- Comprobación de los tags `repetition-1`, `repetition-2` y `repetition-3`.

## Verificación desde una copia limpia

Como comprobación final, el repositorio se clonó desde GitHub en una carpeta
distinta de la utilizada durante el desarrollo.

El comando utilizado fue:

```bash
git clone https://github.com/Enrickq/kata1.git kata1-clean-test
```

Después de clonar el repositorio se comprobó que:

1. La copia estaba en la rama `main` y sincronizada con `origin/main`.
2. El proyecto podía abrirse correctamente en IntelliJ IDEA.
3. El proyecto utilizaba OpenJDK 27.
4. Maven cargaba correctamente el proyecto.
5. `Lifecycle -> compile` terminaba con `BUILD SUCCESS`.
6. `Main.java` se ejecutaba correctamente y mostraba el resultado esperado por consola.

De esta forma se verificó que la entrega puede clonarse, compilarse y ejecutarse
desde una copia limpia del repositorio.

## Vídeo explicativo

Vídeo de la Kata 1:

**Pendiente de añadir el enlace al vídeo.**

El vídeo mostrará brevemente:

- Los shortcuts utilizados.
- La ejecución del programa.
- El uso del depurador y los breakpoints.
- Una refactorización mediante `Shift + F6`.
- El flujo `develop` -> commit -> `main` -> push.
- La clonación y ejecución desde una copia limpia.
