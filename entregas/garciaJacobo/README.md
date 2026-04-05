# 🏋️‍♂️ Sistema de Gestión de Gimnasio (FitLife Center)

**Autor:** Jacobo García  


---

## 📌 1. Descripción del Proyecto
Este sistema simula la gestión de reservas de un gimnasio, permitiendo inscribir socios en actividades específicas mientras se controla de forma estricta el **aforo** y las **normativas de horario**.Tambien muestra un apartado de **actividades** otro de **socios** y por ultimo uno de **reservas**.



---

## 🏗️ 2. Arquitectura de Clases

| Clase | Responsabilidad Principal | Característica Clave |
| :--- | :--- | :--- |
| **`Gimnasio`** | Identidad del centro. | Proporciona el nombre global del local. |
| **`Actividades`** | **Cerebro del Aforo**. | Gestiona inscritos y bloquea si la actividad esta llena. |
| **`Horario`** | Gestión del tiempo. | Valida que las clases duren **exactamente 2 horas**. |
| **`Socios`** | Perfil del usuario. | Gestiona el estado de **ALTA/BAJA** . |
| **`Reservas`** | Registro de inscripción. | Objeto que vincula Socio, Actividad y Fecha. |
| **`Cliente`** |  (Main). | Instancia objetos y ejecuta las pruebas. |

---

### 🛡️ Control de Aforo Automatizado
La clase `Actividades` actúa como un filtro de seguridad. No es un simple contador de texto; utiliza lógica interna para proteger la capacidad del gimnasio:
* **Validación Previa**: El método `agregarActividad()` verifica el estado del objeto antes de modificarlo.
* **Mensajería Dinámica**: El sistema informa al usuario el estado real (`Inscritos` vs `Aforo máximo`) tanto en caso de éxito como de error.

### 📅 Validación de Normativa de Horarios
Para asegurar la calidad de las clases, la clase `Horario` incluye un método privado `comprobarDuracion()`:
* Calcula la diferencia entre `horaFin` e `horaInicio`.
* Emite un aviso preventivo si la actividad no cumple con la planificación  de **2.0 horas**.

---

## 🚀 4. Caso de Prueba: Simulación de Límite de Aforo
Se ha implementado un flujo de prueba en la clase `Cliente` para verificar la robustez del sistema:

1. **Configuración**: Actividad "Yoga" limitada a **1 plaza**.
2. **Operación 1 (Juan García)**: El sistema permite la entrada y actualiza el estado a 0 plazas libres.
3. **Operación 2 (Pablo Martínez)**: El sistema detecta mediante `estaLlena()` que no hay capacidad.
4. **Resultado**: Se bloquea la inscripción de Pablo y se muestra un mensaje de error personalizado indicando la capacidad máxima alcanzada, asi mismo mostrando el aforo gracias al metodo  ` public void mostrarAforo()`

---
## 🖥️ 5. Ejemplo de Ejecución (Consola)

A continuación se muestra el resultado real del programa al intentar inscribir a dos socios en una actividad con aforo limitado a 1 persona:

```text
Gimnasio: FitLife Center

Actividades:
  "Yoga (Libres: 1)" - Monitor/a: Elena Ruiz - Lun/Vie La actividad comienza a las: 10.0 y termina a las: 12.0

Socios:
  "Juan García" - DNI: 12345678A  Estado: El socio Juan García está de ALTA.
  "Pablo Martinez" - DNI: 12345678A  Estado: El socio Pablo Martinez está de ALTA.

Reservas:
  >> ¡Éxito! Socio inscrito en Yoga
  >> Estado actual -> Inscritos: 1 | Aforo máximo: 1
  ->Socio: Juan García  [Aforo: 1 | Libres: 0]
Fecha de la reserva: 1/02/2026

----------------------------------------------------

 ->Socio Pablo Martinez 
   No se pudo agregar. La actividad Yoga está llena.
  [!] Capacidad máxima: 1
  [Aforo: 1 | Libres: 0]
