package models.repositories;

import models.entities.Cuestionario.Pregunta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPreguntas {
    public List<Pregunta> buscarTodos() {
        List<Pregunta> preguntas = new ArrayList<>();

        //Preguntas de prueba

        Pregunta preguntaPrueba = new Pregunta("¿Quién compuso Angeleyes?", "/images/ABBA.jpg",
                List.of(new String[]{"a. The Beatles", "b. ABBA", "c. Elton John", "d. Lionel Ritchie"}),
                1);

        //preguntas.add(preguntaPrueba);

        Pregunta pregunta1 = new Pregunta("Determine qué indica la señal que a continuación se presenta: ", "/images/pregunta_1.jpg",
                List.of(new String[]{"A. Proximidad de bosques.", "B. Zonas de palmeras.", "C. Vientos fuertes laterales."}),
                2);

        Pregunta pregunta2 = new Pregunta("Cuando se debe cruzar la acera (vereda) para salir a la vía pública ¿de quién se presume que es la responsabilidad si se produce un accidente con un peatón u otro vehículo?",
                List.of(new String[]{"A. Del peatón, por no tomar la precaución al llegar a una salida de vehículos.", "B. Del conductor del otro vehículo, por no tener cuidado.", "C. Del conductor del vehículo que sale a la vía pública."}),
                2);

        Pregunta pregunta3 = new Pregunta("En algunas vías de tránsito podemos encontrar marcas en el piso o bien carteles con signos similares a una V invertida ¿qué significados tienen esos signos o marcas?",
                List.of(new String[]{"A. Que estamos en una zona donde frecuentemente hay niebla.", "B. Que estamos en una zona de velocidad controlada (radar).", "C. Que estamos en una zona que se inunda."}),
                0);

        Pregunta pregunta4 = new Pregunta("¿Quién es el responsable civil por un accidente de tránsito producido por un menor de edad poseedor de una licencia de conductor?",
                List.of(new String[]{"A. El que lo acompaña.", "B. El que firmó la autorización para obtener la licencia.", "C. El que autorizó el uso del vehículo."}),
                1);

        Pregunta pregunta5 = new Pregunta("Cuando se estaciona en proximidad de una esquina ¿qué línea no debe superarse?",
                List.of(new String[]{"A. La línea peatonal.", "B. La línea imaginaria de prolongación de ochava.", "C. La línea de edificación transversal."}),
                1);

        Pregunta pregunta6 = new Pregunta("En materia de señalamiento horizontal o demarcación horizaontal ¿qué se entiende por \"isleta\"?",
                List.of(new String[]{"A. Son las marcas canalizadoras y orientadoras de tránsito. No se puede traspasar o circular sobre ellas.", "B. Son marcas en la calzada que indican lugares donde está permitido detenerse.", "C. Son marcas en la calzada que indican lugares donde está permitido estacionarse y/o detenerse."}),
                0);

        Pregunta pregunta7 = new Pregunta("Con carácter general, cuando nos encontramos con una señal \"PROHIBIDO ESTACIONAR\" ¿está permitido parar para subir o bajar pasajeros de un automóvil?",
                List.of(new String[]{"A. Si.", "B. No.", "C. Según la hora."}),
                0);

        Pregunta pregunta8 = new Pregunta("¿Qué significa el término \"culposo\" en materia de accidentes de tránsito?",
                List.of(new String[]{"A. Que no es responsable por actuar con intención de provocar un daño.", "B. Que no obró con intención de provocar un daño.", "C. Que no estaba habilitado para conducir."}),
                1);

        Pregunta pregunta9 = new Pregunta("¿Cómo debe indicar a un vehículo que pretende sobrepasar al suyo que no debe hacerlo?",
                List.of(new String[]{"A. Encendiendo las luces llamadas balizas.", "B. Accionando la luz indicatoria de giro a la izquierda.", "C. Acionando la luz indicadora de giro a la derecha."}),
                1);

        Pregunta pregunta10 = new Pregunta("En la ciudad ¿está permitido circular marcha atrás?",
                List.of(new String[]{"A. Solo para estacionar, entrar o salir de un garage (cuando no hay otra posibilidad) o salvar un obstáculo.", "B. Cuando es por pocos metros.", "C. Solamente de día."}),
                0);

        Pregunta pregunta11 = new Pregunta("¿Qué distancia debe dejarse libre cuando se va a estacionar frente a la entrada de hospitales, escuelas, templos u otros organismos públicos?",
                List.of(new String[]{"A. 10 metros de cada lado de la entrada", "B. Todo el frente del edificio.", "C. 5 metros de cada lado de la entrada."}),
                0);

        Pregunta pregunta12 = new Pregunta("Si circula con su vehículo en un día de niebla ¿qué precaución, entre otras, debe tomar?",
                List.of(new String[]{"A. Adaptar la velocidad del vehículo a la visibilidad de la vía.", "B. Dejar una distancia mínima de 50 metros respecto del vehículo que circula delante.", "C. No efectuar ninguna maniobra."}),
                0);

        Pregunta pregunta13 = new Pregunta("Si para adelantar debe invadir un carril exclusivo para colectivos y taxis ¿le está permitido realizar la maniobra?",
                List.of(new String[]{"A. No, porque está prohibido utilizar dicho carril.", "B. Sí, cuando la línea longitudinal del lado exterior de este carril sea discontinua.", "C. Sí, porque sólo se permite su utilización para realizar alguna maniobra."}),
                0);

        Pregunta pregunta14 = new Pregunta("En una autopista, ¿está permitido remolcar con su vehículo a otro que se encuentra descompuesto?",
                List.of(new String[]{"A. Sí, pero sólo hasta el lugar más próximo donde pueda quedar inmovilizado.", "B. Sí, pero sólo si soy titular de un permiso que autoriza a conducir vehículos con remolque.", "C. No, porque está prohibido."}),
                2);

        Pregunta pregunta15 = new Pregunta("Ud. ha adelantado a otro vehículo en una intersección. ¿Es correcto su comportamiento?",
                List.of(new String[]{"A. Sí, porque en este caso tengo prioridad de paso en la intersección.", "B. No, porque en las intersecciones siempre está prohibido adelantar.", "C. No, porque sólo está permitido adelantar en las intersecciones con rotonda."}),
                1);

        Pregunta pregunta16 = new Pregunta("¿Cuál de las tres señales indica que la ruta es nacional?", "/images/pregunta_16.jpg",
                List.of(new String[]{"A. La señal A.", "B. La señal B.", "La señal C."}),
                1);

        Pregunta pregunta17 = new Pregunta("Todo vehículo debe estar cubierto por un seguro ¿qué daños debe cubrir el mismo?",
                List.of(new String[]{"A. Debe curbrir eventuales daños causados a terceros transportados o no.", "B. Debe cubrir eventuales daños causados a terceros transportados únicamente.", "C. Debe cubrir los daños causados a los vehículos únicamente"}),
                0);

        Pregunta pregunta18 = new Pregunta("Esta señal indica que ha finalizado: ", "/images/pregunta_18.jpg",
                List.of(new String[]{"A. Una obligación anterior.", "B. Una recomendación anterior.", "C. Una prohibición anterior."}),
                2);

        Pregunta pregunta19 = new Pregunta("Por norma general las luces traseras de los vehículos deben ser de color rojo (de posición y freno) y amarillas (giros) ¿por qué la luz de marcha atrás debe ser blanca?",
                List.of(new String[]{"A. Porque así se las diferencia de las luces de freno, de posición y de las luces de giro.", "B. Porque indica el sentido de circulación. La luz blanca significa que el vehículo circula en sentido contrario al nuestro.", "C. Porque por su color blanco se obtiene mejor visión cuando la maniobra de retroceso se deba realizar de noche o en condiciones de poca visibilidad"}),
                1);

        Pregunta pregunta20 = new Pregunta("El que conduce un vehículo ¿qué documentación personal debe llevar consigo?",
                List.of(new String[]{"A. La licencia de conductor es suficiente.", "B. La licencia de conductor y su documento de identidad.", "C. La licencia de conductor, su documento de identidad y la cédula verde."}),
                1);

        Pregunta pregunta21 = new Pregunta("¿Está permitido en los vehículos agregar en los paragolpes aditamentos(defensas, etc.) de cualquier naturaleza, que puedan considerarse peligrosos para personas u otros vehículos?",
                List.of(new String[]{"A. No está permitido modificar paragolpes originales de fábrica agregándoles elementos que puedan considerarse peligrosos o agresivos.", "B. Pueden agregarse defensas en vehículos pequeños.", "C. Depende de la zona donde se circule."}),
                0);

        Pregunta pregunta22 = new Pregunta("Las balizas portátiles que es obligatorio llevar en los vehículos ¿deben ser los conocidos triángulos reflectivos o pueden ser de otro tipo?",
                List.of(new String[]{"A. Deben ser únicamente los triángulos reflectivos.", "B. Pueden ser otras, incluso eléctricas, pero deben ser de igual o mayor eficacia que los triángulos.", "C. Depende del vehículo"}),
                1);

        Pregunta pregunta23 = new Pregunta("¿Cuándo está permitido estacionar en ángulo con el cordón de la acera derecha y/o izquierda?",
                List.of(new String[]{"A. Sólo cuando la calle es ancha.", "B. Sólo cuando el señalamiento lo indica.", "C. Sólo cuando es de un lado solamente."}),
                1);

        Pregunta pregunta24 = new Pregunta("¿Qué identifica la Cruz de San Andrés?",
                List.of(new String[]{"A. Cruce de caminos.", "B. Cruce de vías férreas.", "C. Cruce de peatones."}),
                1);

        Pregunta pregunta25= new Pregunta("Si Ud. sale de un estacionamiento paralelo al cordón, previamente debe: ",
                List.of(new String[]{"A. Tocar bocina e incorporarse al tránsito pasante.", "B. Salir con precaución cuando no haya tránsito pasante y colocar la luz de giro.", "C. Salir lo más rápido posible porque tiene prioridad."}),
                1);

        Pregunta pregunta26 = new Pregunta("¿Qué debe hacer si observa que un vehículo está a punto de alcanzarlo y pasarlo?",
                List.of(new String[]{"A. Ceñirse bien a la derecha, y si es necesario, bajar la velocidad.", "B. Aumentar la velocidad", "C. Es indiferente la velocidad de su vehículo."}),
                0);

        Pregunta pregunta27 = new Pregunta("En zona rural, cuando un peatón transita por la banquina ¿por qué lado debe caminar?",
                List.of(new String[]{"A. Caminar en sentido contrario al tránsito que viene hacia él.", "B. Transitar lo más próximo a la ruta.", "C. Caminar en el mismo sentido que el tránsito."}),
                0);

        Pregunta pregunta28 = new Pregunta("¿Qué es un carril de circulación vehicular?",
                List.of(new String[]{"A. Banquina de la izquierda.", "B. Banquina de la derecha.", "C. Franja de la calzada por donde circulan los vehículos en una fila."}),
                2);

        Pregunta pregunta29 = new Pregunta("¿Cuál es la forma correcta de adelantarse a otro vehículo?",
                List.of(new String[]{"A. Por la derecha.", "B. Por la banquina.", "C. Por la izquierda, haciendo las señales respectivas."}),
                2);

        return preguntas;
    }
}







































