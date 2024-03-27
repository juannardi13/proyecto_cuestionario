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

        Pregunta pregunta30 = new Pregunta("¿Qué debe entenderse por bocacalle?",
                List.of(new String[]{"A. La zona de la calzada común a dos o más arterias, incluidas las sendas o pasos peatonales.", "B. El lugar donde se cruzan una calle con una avenida.", "C. El lugar donde se cruzan dos autopistas."}),
                0);

        Pregunta pregunta31 = new Pregunta("¿Cuál es la velocidad máxima permitida en avenidas, salvo señalización que indique lo contrario?",
                List.of(new String[]{"A. 80 km/h.", "B. 60 km/h.", "C. 40 km/h."}),
                1);

        Pregunta pregunta32 = new Pregunta("¿Cuál es la velocidad máxima permitida en calles?",
                List.of(new String[]{"A. 30 km/h.", "B. 40 km/h.", "C. 50 km/h."}),
                1);

        Pregunta pregunta33 = new Pregunta("Cuando un vehículo circula por una arteria ubicada al costado de una vía férrea ¿es obligatorio ceder el paso al otro que sale del paso a nivel?",
                List.of(new String[]{"A. Sí, si viende desde la derecha.", "B. Sí, si viene desde la izquierda.", "C. Debe cedérsele el paso, venga de la izquierda o de la derecha"}),
                2);

        Pregunta pregunta34 = new Pregunta("¿Cómo norma general, cuál es la velocidad máxima permitida en autopistas, en el ámbito de la Ciudad Autónoma de Buenos Aires?",
                List.of(new String[]{"A. 70 km/h.", "B. 100 km/h.", "C. 120 km/h."}),
                1);

        Pregunta pregunta35 = new Pregunta("Entre los efectos que produce el alcohol en el conductor se encuentra la:",
                List.of(new String[]{"A. Incorrecta apreciación de distancias y velocidades.", "B. Ampliación del campo visual.", "C. Disminución de la distancia de frenado."}),
                0);

        Pregunta pregunta36 = new Pregunta("La instalación del airbag en un vehículo ¿sustituye la obligación de utilizar el cinturón de seguridad?",
                List.of(new String[]{"A. Sí, porque evita el impacto del conductor y pasajeros contra los elementos del vehículo.", "B. Sí, porque invita lesiones en el cabeza y cuello.", "C. No, porque actúa complementando la protección que ofrece el cinturón de seguridad."}),
                2);

        Pregunta pregunta37 = new Pregunta("Usted ha sufrido un desperfecto en su vehículo y lo ha dejado inmovilizado en la banquina. ¿Debe señalizarlo?",
                List.of(new String[]{"A. No, porque el vehículo no está en la calzada.", "B. Sí, con los triángulos de señalización de peligro.", "C. Sí, con las balizas encendidas, los triángulos de señalización de peligro y con las luces de posición."}),
                2);

        Pregunta pregunta38 = new Pregunta("Un triángulo pintado en la calzada, ¿qué significa?", "/images/pregunta_38.jpg",
                List.of(new String[]{"A. Advierte de la proximidad de un peligro.", "B. La obligación de ceder el paso en el cruce.", "C. La prioridad de paso en el cruce." }),
                1);

        Pregunta pregunta39 = new Pregunta("En zona urbana, cuando es obligatorio llevar encendidas las luces de un vehículo ¿cuáles debemos utilizar?",
                List.of(new String[]{"A. Las luces de posición y las altas.", "B. Las del interior del vehículo.", "C. Las luces de posición y las bajas."}),
                2);

        Pregunta pregunta40 = new Pregunta("Con carácter general ¿qué vehículo tiene prioridad de paso en una pendiente?",
                List.of(new String[]{"A. Los vehículos que ascienden por sobre los que descienden.", "B. Los vehículos que descienden por sobre los que ascienden.", "C. Depende lo que indique la señal correspondiente."}),
                0);

        Pregunta pregunta41 = new Pregunta("¿Qué es un carril de aceleración?",
                List.of(new String[]{"A. Es el carril derecho de una autopista.", "B. Es el carril de incorporación a una autopista.", "C. Es el carril izquierdo de una autopista."}),
                1);

        Pregunta pregunta42 = new Pregunta("Si el conductor de un vehículo circula con las balizas encendidas, toca repetidamente la bocina y el acompañante saca el brazo agitando un pañuelo. ¿Qué están indicando?",
                List.of(new String[]{"A. Que el vehículo tiene un desperfecto.", "B. Que transportan a una persona grave a un hospital.", "C. Al exceso de velocidad y a la violación de luz roja."}),
                1);

        Pregunta pregunta43 = new Pregunta("¿Cuál es la velocidad máxima permitida en autopistas, según la Ley 24.449?",
                List.of(new String[]{"A. 60 km./h.", "B. 80 km./h.", "C. 130 km./h."}),
                2);

        Pregunta pregunta44 = new Pregunta("¿Quién tiene prioridad de paso en una rotonda?",
                List.of(new String[]{"A. El vehículo que circula por la rotonda sobre el que intenta ingresar; y el vehículo que egresa sobre el que intenta ingresar o continúa circulando.", "B. El vehículo que quiere ingresar a la rotonda por sobre el que quiere egresar de la misma.", "C. El vehículo que quiere ingresar a la rotonda sobre el que está circulando en la misma."}),
                0);

        Pregunta pregunta45 = new Pregunta("En caso de niebla ¿es mejor parar en la banquina?",
                List.of(new String[]{"A. Cuando la niebla es muy cerrada; sí.", "B. Nunca, si no hay otra posibilidad, debe alejarse lo más posible de la calzada y de la banquina.", "C. Cuando la niebla no es muy cerrada; sí."}),
                1);

        Pregunta pregunta46 = new Pregunta("Antes de iniciar un giro, ¿a qué distancia mínima del cruce debe estar ubicado el vehículo sobre el carril más próximo al cordón del lado que va a doblar?",
                List.of(new String[]{"A. 10 metros.", "B. 20 metros.", "C. 30 metros."}),
                2);

        Pregunta pregunta47 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_47.jpg",
                List.of(new String[]{"A. Contramano.", "B. Rotonda.", "C. Puesto de control."}),
                0);

        Pregunta pregunta48 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_48.jpg",
                List.of(new String[]{"A. Estrechamiento en las dos manos.", "B. Puente angosto.", "C. Calzada dividida."}),
                1);

        Pregunta pregunta49 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_49.jpg",
                List.of(new String[]{"A. Prohibición de estacionar.", "B. No estacionar ni detenerse.", "C. Estacionamiento exclusivo."}),
                1);

        Pregunta pregunta50 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_50.jpg",
                List.of(new String[]{"A. Inicio de doble circulación.", "B. Calzada dividida.", "C. Camino sinuoso."}),
                0);

        Pregunta pregunta51 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_51.jpg",
                List.of(new String[]{"A. Altura limitada (máxima).", "B. Ancho limitado.", "C. Puente angosto."}),
                0);

        Pregunta pregunta52 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_52.jpg",
                List.of(new String[]{"A. Rotonda.", "B. Calzada dividida.", "C. Inicio doble mano."}),
                1);

        Pregunta pregunta53 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_53.jpg",
                List.of(new String[]{"A. Estrechamiento (en una mano).", "B. Calzada dividida.", "C. Estrechamiento (en las dos manos)."}),
                2);

        Pregunta pregunta54 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_54.jpg",
                List.of(new String[]{"A. Limitación de altura.", "B. Limitación de ancho.", "C. Limitación de peso."}),
                0);

        Pregunta pregunta55 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_55.jpg",
                List.of(new String[]{"A. Encrucijada.", "B. Camino lateral.", "C. Incorporación de tránsito lateral."}),
                2);

        Pregunta pregunta56 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_56.jpg",
                List.of(new String[]{"A. Ceda el paso.", "B. Atención.", "C. Carril exclusivo de colectivos."}),
                0);

        Pregunta pregunta57 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_57.jpg",
                List.of(new String[]{"A. Contramano.", "B. No avanzar.", "C. Pare."}),
                2);

        Pregunta pregunta58 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_58.jpg",
                List.of(new String[]{"A. Curva (común).", "B. Curva (en S).", "C. Calzada dividida."}),
                1);

        Pregunta pregunta59 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_59.jpg",
                List.of(new String[]{"A. Limitación de altura.", "B. Limitación de peso.", "C. Limitación de ancho."}),
                1);

        Pregunta pregunta60 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_60.jpg",
                List.of(new String[]{"A. Limitación de ancho.", "B. Limitación de altura.", "C. Puente angosto."}),
                0);

        Pregunta pregunta61 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_61.jpg",
                List.of(new String[]{"A. Estrechamiento (en dos manos).", "B. Estrechamiento (en una mano).", "C. Puente angosto."}),
                1);

        Pregunta pregunta62 = new Pregunta("Ingerir alimentos antes de conducir puede afectar negativamente a la conducción. Por tanto, antes de iniciar un viaje y para evitar la aparición de sueño debe:",
                List.of(new String[]{"A. Abstenerse de ingerir alimentos para viajar en ayunas.", "B. Ingerir alimentos de alto contenido en grasas, que dan mayor vitalidad.", "C. Ingerir alimentos ligeros, de bajo poder calórico, que son de fácil digestión."}),
                2);

        Pregunta pregunta63 = new Pregunta("El camión de la fotografía está detenido por un tiempo indeterminado en doble fila durante el reparto de la mercancía, ¿es correcta su posición en la calzada?", "/images/pregunta_63.jpg",
                List.of(new String[]{"A. Sí.", "B. No.", "C. Sí, siempre que lo haga en el horario permitido para carga y descarga."}),
                1);

        Pregunta pregunta64 = new Pregunta("El vehículo que se observa en la fotografía lleva una señal de color naranja con reborde negro, compuesta por dos rectángulos y números en su interior ¿qué significa?", "/images/pregunta_64.jpg",
                List.of(new String[]{"A. Que el vehículo transporta mercancía peligrosas determinadas por los números.", "B. Que el vehículo excede en masas y dimensiones.", "C. Que el vehículo lleva una patente extranjera."}),
                0);

        Pregunta pregunta65 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_65.jpg",
                List.of(new String[]{"A. Proyección de piedras.", "B. Zona de derrumbe.", "C. Calzada resbaladiza."}),
                1);

        Pregunta pregunta66 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_66.jpg",
                List.of(new String[]{"A. Camino sinuoso.", "B. Calzada resbaladiza.", "C. Curva y contracurva."}),
                1);

        Pregunta pregunta67 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_67.jpg",
                List.of(new String[]{"A. Zona de derrumbe.", "B. Calzada resbaladiza.", "C. Proyección de piedras."}),
                2);

        Pregunta pregunta68 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_68.jpg",
                List.of(new String[]{"A. Cruce de peatones.", "B. Peatones a la izquierda.", "C. Prohibición de circular."}),
                0);

        Pregunta pregunta69 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_69.jpg",
                List.of(new String[]{"A. Curva cerrada.", "B. Curva (común).", "C. Calzada resbaladiza."}),
                0);

        Pregunta pregunta70 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_70.jpg",
                List.of(new String[]{"A. Puesto de control.", "B. Contramano.", "C. No avanzar."}),
                0);

        Pregunta pregunta71 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_71.jpg",
                List.of(new String[]{"A. Túnel.", "B. Puente angosto.", "C. Altura mínima."}),
                0);

        Pregunta pregunta72 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_72.jpg",
                List.of(new String[]{"A. Vientos fuertes laterales.", "B. Estrechamiento.", "C. Atención."}),
                2);

        Pregunta pregunta73 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_73.jpg",
                List.of(new String[]{"A. No estacionar.", "B. Estacionamiento exclusivo.", "C. No estacionar ni detenerse."}),
                1);

        Pregunta pregunta74 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_74.jpg",
                List.of(new String[]{"A. Paso obligado (derecha).", "B. Paso obligado (izquierda).", "C. Encrucijada (cruce)."}),
                0);

        Pregunta pregunta75 = new Pregunta("A las placas de identificación de dominio (chapas patente) ¿está permitido ubicarlas en la luneta trasera del vehículo u otro lugar que nosotros deseamos?",
                List.of(new String[]{"A. Si, siempre que sean bien visibles.", "B. Sí, pero solo la placa trasera.", "C. No, las placas deben ubicarse en los lugares indicados para ello, sin excepción."}),
                2);

        Pregunta pregunta76 = new Pregunta("Si la luz verde del semáforo nos da paso en un cruce de calles y por la transversal aún avanza algún vehículo ¿qué debemos hacer?",
                List.of(new String[]{"A. No iniciar el cruce, hasta que los demás vehículos hayan completado el suyo.", "B. Avanzar, la prioridad es nuestra porque tenemos luz verde.", "C. Esperar hasta que se reinicie el verde."}),
                0);

        Pregunta pregunta77 = new Pregunta("Con carácter general, ¿está prohibido en zona urbana el uso de bocina en los vehículos?",
                List.of(new String[]{"A. No, está permitido.", "B. Si, está prohibido.", "C. Está prohibido el uso indebido de la bocina."}),
                2);

        Pregunta pregunta78 = new Pregunta("¿Cuál es el nivel máximo de alcoholemia admitido para conducir un automóvil particular?",
                List.of(new String[]{"A. 0,8 gr. por litro de sangre.", "B. 0,5 gr. por litro de sangre.", "C. 1,5 gr. por litro de sangre."}),
                1);

        Pregunta pregunta79 = new Pregunta("Cuando no hay senda peatonal marcada en el piso ¿por dónde debemos cruzar las calles?",
                List.of(new String[]{"A. A mitad de cuadra.", "B. En coincidencia con las paradas de transporte.", "C. En la esquina, por la prolongación de la vereda sobre la calle."}),
                2);

        Pregunta pregunta80 = new Pregunta("Ud. está llegando a un cruce de calles sin semáforos ni policía, una persona está cruzando por la senda peatonal, Ud. debe:",
                List.of(new String[]{"A. Disminuir la marcha y tener cuidado.", "B. Parar y cederle el paso al peatón.", "C. Seguir y atravesar el cruce, porque tiene prioridad."}),
                1);

        Pregunta pregunta81 = new Pregunta("Al atravesar túneles o puentes en una ruta ¿está permitido adelantarse a otro vehículo?",
                List.of(new String[]{"A. Sí.", "B. No.", "C. Según los días y horas."}),
                1);

        Pregunta pregunta82 = new Pregunta("¿Está permitido detener un vehículo sobre una senda peatonal?",
                List.of(new String[]{"A. No.", "B. Sí.", "C. Según los casos."}),
                0);

        Pregunta pregunta83 = new Pregunta("¿Qué distancia debe dejarse entre el cordón de la acera y el vehículo, al estacionar en forma paralela al mismo?",
                List.of(new String[]{"A. 50 cm.", "B. 10 cm.", "C. 20 cm."}),
                2);

        Pregunta pregunta84 = new Pregunta("En un automóvil ¿cuál es la profundidad mínima que debe tener el dibujo de las cubiertas?",
                List.of(new String[]{"A. 0,5 mm.", "B. 1,0 mm.", "C. 1,6 mm."}),
                2);

        Pregunta pregunta85 = new Pregunta("¿Qué utilidad tienen los cinturones de seguridad?",
                List.of(new String[]{"A. Son útiles sólo para altas velocidades.", "B. Sirven para proteger a los menores.", "C. Evitan y/o disminuyen los daños físicos a las personas, en caso de accidentes."}),
                2);

        Pregunta pregunta86 = new Pregunta("Como norma de carácter general, ¿quién tiene prioridad de paso en una encrucijada o bocacalle?",
                List.of(new String[]{"A. Los vehículos de transporte de pasajero.", "B. El vehículo de menor tamaño.", "C. El vehículo que se presenta por el lado derecho."}),
                2);

        Pregunta pregunta87 = new Pregunta("En los vehículos que poseen cinturones de seguridad ¿es obligatorio usarlos?",
                List.of(new String[]{"A. Sí, todos sin excepción.", "B. Sólo los que ocupen el asiento delantero, siendo opcional para los demás.", "C. Sí, pero únicamente cuando circulen en rutas o autopistas."}),
                0);

        Pregunta pregunta88 = new Pregunta("Al estacionar su vehículo observa que no deja espacio suficiente para el paso de otros vehículos, por lo que estaciona ocupando parte de la acera ¿es correcto su comportamiento?",
                List.of(new String[]{"A. No.", "B. Sí, siempre que no obstaculice el paso de los peatones por la acera.", "C. Sí, pero únicamente por la noche, que es cuando menos tránsito de peatones hay."}),
                0);

        Pregunta pregunta89 = new Pregunta("Ud. observa que una ambulancia se aproxima con las luces especiales encendidas ¿debe facilitarle el paso?",
                List.of(new String[]{"A. No, porque sólo advierten de su presencia, pero no significa que estén realizando un servicio urgente.", "B. Sí, porque debo entender que circula en servicio de urgencia.", "C. Sí, sólo cuando se advierta que está trasladando pacientes."}),
                0);

        Pregunta pregunta90 = new Pregunta("Para advertir a otros conductores que va a realizar una maniobra con su vehículo, preferentemente lo hará con:",
                List.of(new String[]{"A. El brazo.", "B. La señalización luminosa del vehículo.", "C. La señalización acústica del vehículo."}),
                1);

        Pregunta pregunta91 = new Pregunta("Circula detrás de otros vehículos por una vía urbana. Si al llegar a una intersección prevé que va a quedar detenido en la misma obstruyendo la circulación transversal, ¿qué debe hacer?",
                List.of(new String[]{"A. Pasar si tengo preferencia de paso.", "B. Intentar atravesar la intersección en el caso de que la luz esté en verde.", "C. No penetrar en la intersección hasta estar seguro de que voy a poder franquearla sin ser un obstáculo."}),
                2);

        Pregunta pregunta92 = new Pregunta("Los vehículos de emergencia ¿Cuándo tienen prioridad de paso?",
                List.of(new String[]{"A. Siempre.", "B. Cuando están en una situación de emergencia.", "C. Cuando están en situación de emergencia y circulan por una avenida."}),
                1);

        Pregunta pregunta93 = new Pregunta("¿En condiciones normales, a qué distancia mínima en tiempo debe circular en relación al vehículo que lo antecede?",
                List.of(new String[]{"A. A una separación en tiempo de cinco segundos (5\").", "B. A una separación en tiempo de dos segundos (2\").", "C. A una separación en tiempo de tres segundos (3\")."}),
                1);

        Pregunta pregunta94 = new Pregunta("¿Qué significa el término hidroplaneo (acuaplaning)?",
                List.of(new String[]{"A. Que las cubiertas comienzan a desplazarse únicamente sobre una película de aceite.", "B. Que las cubiertas comienzan a desplazarse únicamente sobre una película de agua.", "C. Es el plazo de vida útil del vehículo."}),
                1);

        Pregunta pregunta95 = new Pregunta("Una línea de trazo discontinuo demarcada sobre la calzada en forma paralela a su eje (a lo largo) ¿qué nos indica?",
                List.of(new String[]{"A. Indica que la misma no puede ser traspasada, debiendo conservar su lugar el vehículo que circula contiguo a ella.", "B. Indica que puede ser traspasada para adelantar a otro vehículo.", "C. Que el asfalto se encuentra en mal estado de conservación."}),
                1);

        Pregunta pregunta96 = new Pregunta("¿Qué significa la doble línea continua amarilla?",
                List.of(new String[]{"A. Es una señalización que se utiliza únicamente para dividir los sentidos de circulación.", "B. Indica, para ambos sentidos de circulación, que no debe ser traspasada ni se puede circular sobre ella.", "C. Significa que solo pueden circular vehículos particulares."}),
                1);

        Pregunta pregunta97 = new Pregunta("¿Qué es una arteria de doble mano?",
                List.of(new String[]{"A. Una vía ancha que se cruza con otra vía.", "B. Una vía donde se circula en ambos sentidos de tránsito.", "C. Una vía reservada al uso de transporte público."}),
                1);

        Pregunta pregunta98 = new Pregunta("Adelantarse en una curva está permitido:",
                List.of(new String[]{"A. Solo si la curva no es muy cerrada.", "B. Solo si no viene un vehículo en sentido contrario.", "C. No, está prohibido."}),
                2);

        Pregunta pregunta99 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_99.jpg",
                List.of(new String[]{"A. Prohibido adelantarse.", "B. No ruidos molestos (bocina).", "C. Prohibición de luz alta."}),
                1);

        Pregunta pregunta100 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_100.jpg",
                List.of(new String[]{"A. Camino de cornisa.", "B. Pendiente de ingreso.", "C. Pendiente descendente."}),
                2);

        Pregunta pregunta101 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_101.jpg",
                List.of(new String[]{"A. Prohibido adelantarse.", "B. Prohibición de circular.", "C. Circulación exclusiva de bicicletas."}),
                0);

        Pregunta pregunta102 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_102.jpg",
                List.of(new String[]{"A. Girar a la izquierda.", "B. Proximidad de obstáculo.", "C. Rotonda."}),
                2);

        Pregunta pregunta103 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_103.jpg",
                List.of(new String[]{"A. Velocidad máxima.", "B. Velocidad mínima.", "C. Velocidad controlada por radar."}),
                1);

        Pregunta pregunta104 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_104.jpg",
                List.of(new String[]{"A. Animales sueltos.", "B. Zona Rural.", "C. Zoológico."}),
                0);

        Pregunta pregunta105 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_105.jpg",
                List.of(new String[]{"A. Limitación largo de vehículo.", "B. Circulación exclusiva (transporte público).", "C. Tránsito pesado a la derecha."}),
                1);

        Pregunta pregunta106 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_106.jpg",
                List.of(new String[]{"A. Prohibición de circular (bicicletas).", "B. Ciclistas.", "C. Prohibición de circular (motos)."}),
                1);

        Pregunta pregunta107 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_107.jpg",
                List.of(new String[]{"A. Inicio de doble mano.", "B. Estrechamiento (en una sola mano).", "C. Encrucijada (bifurcación)."}),
                2);

        Pregunta pregunta108 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_108.jpg",
                List.of(new String[]{"A. Cruce ferroviario.", "B. Estación ferroviaria.", "C. Circulación exclusiva (ferrocarril)."}),
                0);

        Pregunta pregunta109 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_109.jpg",
                List.of(new String[]{"A. Inicio de doble mano.", "B. Estrechamiento (en una sola mano).", "C. Encrucijada (bifurcación)."}),
                2);

        Pregunta pregunta110 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_110.jpg",
                List.of(new String[]{"A. Límite de velocidad mínima.", "B. Velocidad controlada por radar.", "C. Límite máximo de velocidad."}),
                2);

        Pregunta pregunta111 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_111.jpg",
                List.of(new String[]{"A. Niños.", "B. Escolares.", "C. Cruce de peatones."}),
                1);

        Pregunta pregunta112 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_112.jpg",
                List.of(new String[]{"A. Curva cerrada.", "B. Giro obligatorio (izquierda).", "C. Curva."}),
                1);

        Pregunta pregunta113 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_113.jpg",
                List.of(new String[]{"A. Zona montañosa.", "B. Perfil irregular.", "C. Cruce ferroviario."}),
                1);

        Pregunta pregunta114 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_114.jpg",
                List.of(new String[]{"A. Puente móvil.", "B. Puente angosto.", "C. Pendiente (descendente)"}),
                0);

        Pregunta pregunta115 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_115.jpg",
                List.of(new String[]{"A. Curva.", "B. Giro obligatorio.", "C. Camino sinuoso."}),
                0);

        Pregunta pregunta116 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_116.jpg",
                List.of(new String[]{"A. Carril de emergencia.", "B. No estacionar.", "C. Carril exclusivo."}),
                1);

        Pregunta pregunta117 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_117.jpg",
                List.of(new String[]{"A. No girar en U (no retomar).", "B. No avanzar.", "C. Puesto de control."}),
                1);

        Pregunta pregunta118 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_118.jpg",
                List.of(new String[]{"A. Curva (común)", "B. Sentido de circulación (izquierda)", "C. Encrucijada (cruce)"}),
                1);

        Pregunta pregunta119 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_119.jpg",
                List.of(new String[]{"A. No avanzar.", "B. Comienzo de doble mano.", "C. Sentido de circulación (comienzo de sentido único)"}),
                2);

        Pregunta pregunta120 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_120.jpg",
                List.of(new String[]{"A. Prohibición de adelantarse.", "B. Circulación exclusiva (motos).", "C. Prohibición de circular (autos)"}),
                2);

        Pregunta pregunta121 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_121.jpg",
                List.of(new String[]{"A. Permitido retomar.", "B. Camino sinuoso.", "C. No girar en U (no retomar)"}),
                2);

        Pregunta pregunta122 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_122.jpg",
                List.of(new String[]{"A. No girar en U.", "B. Prohibido girar a la izquierda.", "C. Giro a la izquierda."}),
                1);

        Pregunta pregunta123 = new Pregunta("Determine qué indica la señal que a continuación se presenta:", "/images/pregunta_123.jpg",
                List.of(new String[]{"A. Curva.", "B. Giro obligatorio (izquierda).", "C. Giro obligatorio (derecha)"}),
                2);

        Pregunta pregunta124 = new Pregunta("A la vista de las señales de la fotografía, Ud. debe:", "/images/pregunta_124.jpg",
                List.of(new String[]{"A. Pasar por el lado que indica la flecha, porque hacia el lado izquierdo la entrada está prohibida.", "B. Pasar por el lado que indica la flecha, porque hacia el lado izquierdo la circulación está prohibida en ambos sentidos de la marcha.", "C. Pasar por el lado que indica la flecha, aunque podría pasar por el lado izquierdo si observo que no se aproxima ningún vehículo en sentido contrario."}),
                0);

        Pregunta pregunta125 = new Pregunta("A la vista de la señal circular que se observa en la fotografía, ¿qué vehículo tendrá preferencia de paso si, en este tramo de vía, por su estrechez, es imposible el cruce de ambos vehículos?", "/images/pregunta_125.jpg",
                List.of(new String[]{"A. El automóvil.", "B. El vehículo que tenga más facilidad de maniobrar.", "C. El camión."}),
                2);

        Pregunta pregunta126 = new Pregunta("Ud. conduce su vehículo por esta calzada. A la vista de la señalización que se observa en la fotografía ¿le está permitido adelantar al automóvil rojo?", "/images/pregunta_126.jpg",
                List.of(new String[]{"A. Sí.", "B. Únicamente cuando no venga ningún vehículo en sentido contrario.", "C. No."}),
                2);

        Pregunta pregunta127 = new Pregunta("En la ciudad, ¿está permitido usar la bocina de su vehículo para advertir al conductor del vehículo que circula delante que va a ser adelantado?",
                List.of(new String[]{"A. Sí, siempre que sea a intervalos cortos y el sonido emitido no sea estridente.", "B. Sí, salvo prohibición expresa mediante la correspondiente señal.", "C. No, porque no es uno de los usos admitidos."}),
                2);

        Pregunta pregunta128 = new Pregunta("Ud. circula conduciendo su vehículo por una vía urbana. ¿Debe llevar abrochado el cinturón de seguridad?",
                List.of(new String[]{"A. Sí, en todos los casos.", "B. No, porque sólo se exige utilizar el cinturón en vías interurbanas.", "C. No, si voy a poca velocidad."}),
                0);

        Pregunta pregunta129 = new Pregunta("En el vehículo que Ud. conduce va a viajar como pasajero su hijo de ocho años ¿está permitido que lo haga en el asiento delantero del mismo?",
                List.of(new String[]{"A. No, en ningún caso.", "B. No, salvo que utilice asientos de seguridad o dispositivos debidamente homologados para este fin.", "C. Sí, en todos los casos."}),
                0);

        Pregunta pregunta130 = new Pregunta("¿Dónde deben llevarse las balizas portátiles?",
                List.of(new String[]{"A. En la guantera.", "B. En el interior del habitáculo, debidamente sujetas.", "C. En un lugar accesible."}),
                2);

        Pregunta pregunta131 = new Pregunta("¿Cree Ud. que puede ser encandilado por las luces de otro vehículo que circula detrás del suyo?",
                List.of(new String[]{"A. No, el deslumbramiento únicamente lo produce un vehículo en sentido contrario.", "B. Sí, siempre que lleve encendida la luz de largo alcance o alta.", "C. Sí, cuando el vehículo lleva encendidas las luces altas o, incluso, las luces bajas y por las características de la vía o porque las luces están desalineadas y circula próximo a mi vehículo existe la posibilidad de encandilamiento."}),
                2);

        Pregunta pregunta132 = new Pregunta("En los casos de doble línea, compuesta una por un trazo continuo y otra por un trazo discontinuo ¿cuál es la conducta a seguir?",
                List.of(new String[]{"A. Podemos cruzarlas o no, siempre que lo hagamos con precaución.", "B. No está permitido trasponerla.", "C. Debemos respetar lo que rige con respecto a la línea que está de nuestro lado (si es continua no cruzarla; si es discontinua está permitido cruzarla)."}),
                2);

        Pregunta pregunta133 = new Pregunta("Cuando un semáforo cambia de luz roja a verde, nos habilita a reiniciar la marcha, no obstante ello, ¿qué precauciones o limitaciones debemos adoptar?",
                List.of(new String[]{"A. No iniciar el cruce si no hay espacio para acomodar el vehículo del otro lado sin obstruir la circulación transversal.", "B. Permitir, antes de avanzar, que complete el cruce otro vehículo o peatón que lo está haciendo.", "C. Por lo menos, lo indicado en a y b."}),
                2);

        Pregunta pregunta134 = new Pregunta("Si a los costados de la ruta observa una señal triangular como la que a continuación se presenta, ¿qué debe interpretarse?", "/images/pregunta_134.jpg",
                List.of(new String[]{"A. Peligro por la proximidad de una zona de la vía en la que la calzada se estrecha por el lado de la derecha.", "B. Peligro por la proximidad de una curva peligrosa hacia la derecha.", "C. Peligro por la existencia de un tramo de vía con fuerte pendiente ascendente."}),
                1);

        Pregunta pregunta135 = new Pregunta("Según la Ley N° 2148, en una autopista está prohibido:",
                List.of(new String[]{"A. sobrepasar a otros vehículos.", "B. detenerse por causas de fuerza mayor.", "C. circular marcha atrás."}),
                2);

        Pregunta pregunta136 = new Pregunta("Según el Manual del Conductor, cuando la luz naranja del semáforo peatonal se torna intermitente ¿Qué conducta debe tomar el peatón que espera para cruzar?",
                List.of(new String[]{"A. No comenzar a cruzar la calzada.", "B. Si está cruzando, finalizar el cruce con mucha precaución.", "C. Ambas respuestas (a y b) son correctas."}),
                2);

        Pregunta pregunta137 = new Pregunta("Según el Manual del Conductor, en un incidente de tránsito ¿qué significa que el conductor es considerado responsable por impericia?",
                List.of(new String[]{"A. Que no ha respondido adecuadamente a una circunstancia del tránsito por falta de conocimiento o práctica en la conducción.", "B. Que ha realizado un acto con su vehículo que las reglas de prudencia indican no hacer, o sea, que ha actuado peligrosamente.", "C. Que ha tenido una conducta negligente al circular con un vehículo en mal estado."}),
                0);

        Pregunta pregunta138 = new Pregunta("Según la Ley Nº 24.449, ¿qué indica un cordón pintado de color rojo?",
                List.of(new String[]{"A. Que está prohibido estacionar, pudiendo efectuarse la detención para ascenso y descenso de pasajeros.", "B. Que ese un espacio reservado al estacionamiento exclusivo de vehículos destinados a servicio de emergencia.", "C. Que está prohibido estacionar o detenerse al costado de la acera."}),
                2);

        Pregunta pregunta139 = new Pregunta("Según la Ley Nº 24.449, ¿qué indica un cordón pintado de color amarillo?",
                List.of(new String[]{"A. Indica que sólo está prohibido estacionar, pudiendo efectuarse detenciones para ascenso y descenso de carga y pasajeros.", "B. Indica que es un lugar reservado para el estacionamiento exclusivo de vehículos destinados al transporte de pasajeros.", "C. Indica que está prohibido estacionar o detenerse al costado de la acera."}),
                0);

        Pregunta pregunta140 = new Pregunta("Según la Ley N° 2148, los vehículos destinados al servicio de emergencia, en cumplimiento de su función, tienen la prioridad de paso sobre todos los demás vehículos, además de esta ¿están exentos de cumplir otras normas?",
                List.of(new String[]{"A. Sí, al ser vehículos destinados la servicio de emergencia la ley los exceptúa del cumplimiento de otras normas.", "B. Sí, están exentos de cumplir otras normas excepto las indicaciones de los agentes de control de tránsito.", "C. No, aun siendo vehículos destinados al servicio de emergencia, al circular por la vía pública están obligados a respetar las normas como el resto de los vehículos."}),
                1);

        Pregunta pregunta141 = new Pregunta("Según las Ley N° 2148, un vehículo que no está destinado al servicio de emergencia, en caso de extrema necesidad ¿puede realizar un servicio similar al que efectúan estos últimos?",
                List.of(new String[]{"A. Sí, debiendo advertirlo encendiendo las luces, empleando la bocina en forma intermitente y agitando un paño.", "B. Sí, el conductor de dicho vehículo deberá sacar un brazo por la ventanilla y agitarlo reiteradamente para indicarle al resto de los usuarios de la vía la situación en la que se encuentra.", "C. No, los servicios de emergencia sólo pueden ser efectuados por los vehículos habilitados para ese fin."}),
                0);

        Pregunta pregunta142 = new Pregunta("Según la Ley N° 2148, los vehículos afectados al control del tránsito ¿pueden detenerse en cualquier parte de la vía pública?",
                List.of(new String[]{"A. No, sólo pueden hacerlo en los lugares en donde esté permitido detenerse.", "B. Sí, cuando realicen tareas de control, siempre que no constituyan un obstáculo peligroso para otros vehículos.", "C. Sí, porque al ser un servicio de emergencia las restricciones en cuanto a la detención en la vía pública no los abarcan."}),
                1);

        Pregunta pregunta143 = new Pregunta("Según la Ley N° 2148, en lo que respecta a las prioridades de paso, en encrucijadas sin semáforos ¿cuál es el orden jerárquico (de importancia) de las distintas arterias?",
                List.of(new String[]{"A. pasaje, calle, avenida.", "B. calle, avenida, pasaje.", "C. avenida, calle, pasaje."}),
                2);

        Pregunta pregunta144 = new Pregunta("La Ley N° 2148 establece como norma general que en las avenidas de doble sentido de circulación está prohibido estacionar vehículos:",
                List.of(new String[]{"A. Junto a ambas aceras los días hábiles entre las 7 y las 21 horas.", "B. Junto a la acera derecha los días hábiles entre las 7 y las 21 horas.", "C. Junto a la acera izquierda los días hábiles entre las 7 y las 21 horas."}),
                0);

        Pregunta pregunta145 = new Pregunta("La Ley N° 2148 establece como norma general que en las avenidas con sentido único de circulación está prohibido estacionar vehículos:",
                List.of(new String[]{"A. Junto a la acera izquierda los días hábiles durante las 24 horas.", "B. Junto a la acera izquierda los días hábiles entre las 7 y las 21 horas.", "C. Junto a la acera derecha los días hábiles de 7 a 21 horas."}),
                1);

        Pregunta pregunta146 = new Pregunta("La Ley N° 2148 establece como norma general que en las calles con sentido único de circulación está prohibido estacionar vehículos:",
                List.of(new String[]{"A. Junto a la acera derecha los días hábiles durante las 24 horas.", "B. Junto a la acera izquierda los días hábiles de 7 a 21 horas.", "C. Junto a la acera izquierda todos los días durante las 24 horas."}),
                2);

        Pregunta pregunta147 = new Pregunta("La Ley N° 2148 establece como norma general la prohibición de detenerse:",
                List.of(new String[]{"A. En doble fila, excepto como detención para el ascenso o descenso de pasajeros.", "B. En doble fila, excepto como detención previa a la maniobra de estacionamiento.", "C. En doble fila, sin ninguna excepción."}),
                1);

        Pregunta pregunta148 = new Pregunta("¿Cuándo se considera que un vehículo está detenido?",
                List.of(new String[]{"A. Se considera detención a la permanencia en un sector de la vía pública de un vehículo por circunstancias de la circulación o por causas de fuerza mayor.", "B. Se considera detención a la permanencia de un vehículo junto a la acera por un tiempo estrictamente necesario para casos de control de tránsito realizado por autoridad competente, ascenso o descenso de pasajeros o para carga y descarga.", "C. Lo indicado en a y b."}),
                1);

        Pregunta pregunta149 = new Pregunta("De acuerdo a lo que establece la Ley Nacional (24.449) y su reglamentación, con respecto al vehículo ¿qué documentación debe llevar?",
                List.of(new String[]{"A. Recibo de pago de patente y cédula verde.", "B. Recibo de pago de patente y comprobante de pago del seguro.", "C. Recibo de pago de patente, comprobante de pago del seguro, cédula verde, y cuando correspondiera (taxi, remis, etc.) comprobante de verificación técnica del vehículo y habilitación."}),
                2);

        Pregunta pregunta150 = new Pregunta("El alcohol produce en el conductor:",
                List.of(new String[]{"A. Un aumento del campo visual.", "B. Un estado de euforia y de falsa seguridad en sí mismo.", "C. Una reducción del tiempo de reacción."}),
                1);

        Pregunta pregunta151 = new Pregunta("Se considera a la niebla un factor de riesgo porque:",
                List.of(new String[]{"A. Reduce el alcance de la visibilidad, produce condiciones resbaladizas en la calzada e induce a calcular mal las distancias.", "B. Aumenta la percepción de objetos pero se modifica la percepción de la distancia.", "C. Ambas respuestas, la a y la b, son correctas."}),
                0);

        Pregunta pregunta152 = new Pregunta("Para indicar las velocidades máximas a desarrollar en zonas donde es habitual la formación de bancos de niebla, se utilizan señales horizontales en forma de letra V invertida ¿cómo se saben o reconocen esas velocidades máximas?",
                List.of(new String[]{"A. Cuando un conductor alcanza a ver sólo una señal V invertida, la velocidad máxima no deberá superar los 40 km./h.", "B. Si alcanza a ver dos señales V invertidas, la velocidad máxima no deberá superar los 60 km./h.", "C. Lo indicado en a y b."}),
                2);

        Pregunta pregunta153 = new Pregunta("Si al aproximarse a una bocacalle sin semáforo, Ud. advierte que un peatón pretende efectuar el cruce desde su izquierda hacia su derecha, ¿qué deberá hacer?",
                List.of(new String[]{"A. cederle el paso, pues el peatón tiene prioridad.", "B. avanzar a velocidad precautoria, pues sólo tiene prioridad aquel que viene por la derecha.", "C. la prioridad de paso es del vehículo ya que su marcha es más difícil de controlar."}),
                0);

        Pregunta pregunta154 = new Pregunta("La Ley C.A.B.A. 2148, establece la obligatoriedad de denunciar a la brevedad cualquier cambio de los datos consignados en la licencia de conducir. De no denunciarse dicho cambio, al cabo de cuánto tiempo caduca la misma?",
                List.of(new String[]{"A. 60 días.", "B. 90 días.", "C. 120 días."}),
                1);

        Pregunta pregunta155 = new Pregunta("Todo usuario de la vía pública debe, como premisa básica:",
                List.of(new String[]{"A. asumir la obligación de no generar peligro innecesario", "B. acreditar experiencia de manejo en vehículos, que por su categoría de licencia le corresponda, no menor a un año", "C. concurrir a cursos de actualización en temática vial, con una frecuencia no mayor a seis meses."}),
                0);

        Pregunta pregunta156 = new Pregunta("En materia de responsabilidad Civil, ¿qué es lo que se considera como factor determinante para dar inicio a una demanda?",
                List.of(new String[]{"A. la intención de la conducta dañosa;", "B. la existencia de un daño real que afecte a algún particular, provocado como consecuencia del accidente", "C. la edad de la persona que provoca el daño."}),
                1);

        Pregunta pregunta157 = new Pregunta("En materia de responsabilidad Penal, ¿puede ésta transferirse de una persona (por ejemplo, el conductor del vehículo que provoca el accidente) a otra (por ejemplo, el dueño del vehículo)?",
                List.of(new String[]{"A. No, porque la responsabilidad penal es intransferible.", "B. Sí, y de éste último también puede transferirse a la Compañía de Seguros.", "C. El Juez resolverá en función de la gravedad del accidente y sus consecuencias."}),
                0);

        Pregunta pregunta158 = new Pregunta("En cualquier circunstancia o situación posible, durante la circulación, ¿a qué le prestaría atención Ud. a fin de aumentar su seguridad y la de otros?",
                List.of(new String[]{"A. El estado del pavimento, del auto y el clima.", "B. Las condiciones en que se encuentra el automóvil, las condiciones relativas a infraestructura vial, las condiciones climáticas y el estado del conductor", "C. Las condiciones en que se encuentra el conductor, caudal de tránsito y tipo de cubiertas."}),
                1);

        Pregunta pregunta159 = new Pregunta("¿Cuáles son los números de emergencia que todo usuario de la vía pública debe conocer con el objetivo de poder llamar y pedir ayuda ante un accidente de cualquier índole?",
                List.of(new String[]{"A. 211 y/o 109.", "B. 112 y/o 110.", "C. 911 y/o 107."}),
                2);

        Pregunta pregunta160 = new Pregunta("La niebla, como factor de riesgo produce modificaciones en:",
                List.of(new String[]{"A. el campo visual del conductor y su percepción del entorno, la capacidad lumínica del vehículo como la adherencia de sus cubiertas y la respuesta del pavimento.", "B. El campo visual del conductor y el estado del pavimento.", "C. Sólo afecta la capacidad lumínica del vehículo y la respuesta de sus cubiertas en el avance."}),
                0);

        Pregunta pregunta161 = new Pregunta("Ante la presencia de bancos de niebla y a fin de reducir riesgos, ¿qué es lo que se recomienda?",
                List.of(new String[]{"A. Utilizar las luces rompeniebla, lo cual es suficiente porque permite ampliar la visibilidad del conductor.", "B. Conducir con ambas manos en el volante, reducir la velocidad, aumentar la distancia entre vehículos y utilizar las luces del vehículo correspondientes.", "C. Detenerse en la banquina hasta que levante el banco de niebla."}),
                1);

        Pregunta pregunta162 = new Pregunta("Durante la circulación, el uso de telefonía celular está prohibida para el conductor porque en tanto factor de riesgo:",
                List.of(new String[]{"A. disminuye su capacidad atencional y limita el sentido de la audición, aumentando el tiempo de reacción.", "B. Debido a que el conductor debe mantener ambas manos comprometidas en la acción de conducir, el equipo celular reduciría la capacidad para maniobrar.", "C. Ambas respuestas (a y b) son correctas"}),
                2);

        Pregunta pregunta163 = new Pregunta("Durante la circulación, la prohibición del uso de telefonía celular afecta también al acompañante:",
                List.of(new String[]{"A. en condiciones normales, no; pero sí cuando la circulación se realiza en condiciones de máximo peligro.", "B. La prohibición del uso de telefonía celular afecta sólo al conductor del vehículo.", "C. Ambas respuestas (a y b) son correctas"}),
                1);

        Pregunta pregunta164 = new Pregunta("Ante un eventual control de tránsito en vía pública, de constatar la Autoridad de Control algún tipo de falta por parte del conductor, el pago de la multa (sanción) podrá efectuarse:",
                List.of(new String[]{"A. En ese mismo momento y ante la autoridad de control si ésta lo requiere.", "B. Ante el Tribunal de Faltas que lo determina como sanción a aplicar.", "C. Ambas respuestas (a y b) son correctas."}),
                1);

        Pregunta pregunta165 = new Pregunta("Para realizar una maniobra de 'ingreso a.../egreso de...' un garage o estacionamiento, el conductor debe cruzar la acera; si al hacerlo se encuentra con un transeúnte (peatón), ¿qué conducta debe adoptar el conductor?",
                List.of(new String[]{"A. Priorizar la marcha del peatón, indefectiblemente.", "B. Realizar una guiñada para advertir su preferencia de avance.", "C. Completar la maniobra como sea posible, para evitar su mayor exposición por encontrarse maniobrando en la vía de circulación."}),
                0);

        Pregunta pregunta166 = new Pregunta("Todos los cristales de un vehículo deben garantizar visibilidad:",
                List.of(new String[]{"A. Solamente desde dentro del automóvil hacia fuera.", "B. De adentro hacia fuera y de afuera hacia adentro (ambas direcciones).", "C. El único cristal que debe garantizar plena y total visibilidad es el parabrisas."}),
                1);

        Pregunta pregunta167 = new Pregunta("Ud. viene circulando por una avenida de doble mano, y al llegar a la bocacalle precisa efectuar un giro a su izquierda; de acuerdo a la Ley Nº 2148, ¿en qué condiciones puede efectuar esa maniobra?",
                List.of(new String[]{"A. Sólo si hay semáforo de giro que me habilite o, en su defecto, si no hubiera ningún tipo de semáforo.", "B. Si mi semáforo de circulación está en verde, tomando las debidas precauciones y mirando atentamente a ambos lados", "C. Es absolutamente indispensable que no venga ningún vehículo por la mano de circulación contraria a la de mi avance."}),
                0);

        Pregunta pregunta168 = new Pregunta("¿Qué vehículo puede realizar el remolque de otro vehículo averiado en la vía pública?",
                List.of(new String[]{"A. Cualquier vehículo que posea potencia suficiente para remolcar a otro vehículo y un elemento para asirlo firmemente sin riesgo alguno.", "B. Cualquier vehículo que posea al menos algún tipo de elemento para asirlo firmemente sin riesgo.", "C. Sólo los vehículos destinados a ese fin."}),
                2);

        Pregunta pregunta169 = new Pregunta("De acuerdo a lo que establece la Ley Nº 2148, ¿estaría permitido agregar al vehículo luces adicionales?",
                List.of(new String[]{"A. Está prohibido el agregado de luces o faros adicionales que no sean los descritos en esa misma ley, excepto el agregado de dos faros rompenieblas y de hasta dos faros elevados con luces de freno.", "B. No está prohibido agregar luces ya que cuanto más capacidad de iluminación tenga el automóvil, mejor visibilidad tiene el conductor.", "C. No está permitido agregar ningún tipo de luz, solo eventualmente se podrá reponer las que traiga de fábrica en caso de destrucción."}),
                0);

        Pregunta pregunta170 = new Pregunta("Cuando un conductor realiza la maniobra de circulación en reversa (marcha atrás), ¿cuál es la distancia establecida que puede recorrer en la realización dicha maniobra?",
                List.of(new String[]{"A. Mínimamente 20 metros.", "B. No más de 20 metros.", "C. El recorrido mínimo e indispensable."}),
                2);

        Pregunta pregunta171 = new Pregunta("En cuánto al grado de tono o color que pueden tener los cristales de un automóvil, qué establece la Ley Nº 2148, con respecto a su control en vía pública?",
                List.of(new String[]{"A. Para medir el grado de tonalidad debe efectuarse una prueba colorimétrica mediante un dispositivo portátil reglamentado debidamente", "B. Se deben distinguir los ocupantes del vehículo a corta distancia.", "C. A 15 (quince) metros de distancia (medida de referencia) se debiera poder divisar las facciones del conductor."}),
                1);

        Pregunta pregunta172 = new Pregunta("La ubicación y posición de las placas de identificación del vehículo (chapas patente) pueden sufrir algún tipo de modificación o cambio:",
                List.of(new String[]{"A. Sólo eventualmente pueden amplificarse para mejorar su visibilidad.", "B. De ninguna manera, deben estar colocadas en posición y forma normal en los lugares reglamentarios.", "C. Sólo está prohibido modificar la placa de identificación delantera, no así la posterior."}),
                1);

        Pregunta pregunta173 = new Pregunta("La negativa a realizar una prueba de alcoholemia ¿constituye una falta?",
                List.of(new String[]{"A. Sólo si se ha incurrido en una infracción o participado en un accidente.", "B. No.", "C. Siempre."}),
                2);

        Pregunta pregunta174 = new Pregunta("¿Cómo se debe dejar un vehículo durante el estacionamiento, en un terreno sin pendiente?",
                List.of(new String[]{"A. Con el motor detenido.", "B. Con el motor detenido y sin cambio.", "C. Con el motor detenido y las ruedas delanteras transversales a la acera."}),
                1);

        Pregunta pregunta175 = new Pregunta("¿Qué debe hacer cuando el automóvil que está adelante suyo, está esperando para doblar a la izquierda?",
                List.of(new String[]{"A. Realizar el sobrepaso por la derecha colocando luz de giro y observando por los espejos.", "B. Realizar el sobrepaso con cuidado por la izquierda.", "C. Tocar bocina para indicarle que siga."}),
                0);

        Pregunta pregunta176 = new Pregunta("¿Qué vehículo tiene prioridad para adelantarse, cuando varios circulan encolumnados?",
                List.of(new String[]{"A. El que lo intente primero.", "B. El último de la fila.", "C. El que circula primero detrás del vehículo que se desea adelantar."}),
                2);

        Pregunta pregunta177 = new Pregunta("¿Esta permitido estacionar el vehículo sobre la acera (vereda) para bajar a abrir o cerrar el acceso a un garaje?",
                List.of(new String[]{"A. No.", "B. Solo por poco tiempo.", "C. Solo si la acera es ancha."}),
                0);

        Pregunta pregunta178 = new Pregunta("Cuando vemos las luces rojas de un vehículo ¿qué significado tienen en cuanto al sentido de dirección de marcha del mismo?",
                List.of(new String[]{"A. Que esta ubicado para circular en la misma dirección que nosotros.", "B. Que viene hacia nosotros.", "C. Que esta descompuesto."}),
                0);

        Pregunta pregunta179 = new Pregunta("¿Qué señales verticales (carteles) nos indican que no tenemos prioridad de paso en un cruce o bocacalle sin semáforo?",
                List.of(new String[]{"A. Señal de Pare o Ceda el Paso.", "B. Señal de Prohibido Retomar.", "C. Señal de Contramano o Dirección Obligatoria."}),
                0);

        Pregunta pregunta180 = new Pregunta("¿Qué debe hacer el conductor que transita por una calle de doble sentido de circulación y encuentra ante él su mano obstruída en el momento que se aproxima otro vehículo por la mano contraria?",
                List.of(new String[]{"A. Debe ceder el paso al otro vehículo.", "B. Tiene derecho a pasar primero.", "C. No existe preferencia."}),
                0);

        Pregunta pregunta181 = new Pregunta("Al efectuar un giro en una bocacalle estando encendida la luz verde del semáforo, entre el conductor y el peatón ¿Quién tiene prioridad de paso?",
                List.of(new String[]{"A. El peatón.", "B. El conductor.", "C. Es indistinto."}),
                0);

        Pregunta pregunta182 = new Pregunta("El vehiculo que circule por el carril obligatorio para transito lento, ¿puede abandonarlo para adelantar a otro mas lento?",
                List.of(new String[]{"A. No, nunca.", "B. Si, siempre que se respete la velocidades establecidas en las señales.", "C. Es indistinto."}),
                1);

        Pregunta pregunta183 = new Pregunta("Si una calle de sentido único posee isletas, usted podrá circular por:",
                List.of(new String[]{"A. El centro.", "B. La parte derecha de la calzada.", "C. Cualquiera de los dos lados."}),
                2);

        Pregunta pregunta184 = new Pregunta("Al pretender abandonar una autopista o semiautopista, ¿cuándo se debe reducir la velocidad?",
                List.of(new String[]{"A. Cuando se haya entrado en el carril de desaceleración.", "B. A la entrada de la nueva vía de circulación.", "C. Poco antes de abandonar la misma."}),
                0);

        Pregunta pregunta185 = new Pregunta("¿Qué distintivo deben llevar colocado, en la parte interior del parabrisas y luneta del vehículo, los conductores principiantes?",
                List.of(new String[]{"A. Están obligados a llevar, durante un período de seis (6) meses, un distintivo con la letra P en color blanco sobre fondo verde.", "B. Están obligados a llevar, durante un período de tres (3) meses, un distintivo con la letra P en color blanco sobre fondo verde.", "C. Están obligados a llevar, durante un período de doce (12) meses, un distintivo con la letra P en color blanco sobre fondo verde."}),
                0);

        Pregunta pregunta186 = new Pregunta("Si el conductor de un vehículo toca repetidamente la bocina y el acompañante saca el brazo agitando un pañuelo. ¿Qué están indicando?",
                List.of(new String[]{"A. Que el vehículo tiene un desperfecto.", "B. Que transportan a una persona grave a un hospital.", "C. Al exceso de velocidad y a la violación de luz roja."}),
                1);

        Pregunta pregunta187 = new Pregunta("Ud. está llegando a un cruce de calles sin semáforos ni policía, una persona está cruzando por la senda peatonal, Ud. debe:",
                List.of(new String[]{"A. Disminuir la marcha y tener cuidado.", "B. Parar y cederle el paso al peatón.", "C. Seguir y atravesar el cruce, porque tiene prioridad."}),
                1);

        Pregunta pregunta188 = new Pregunta("¿Qué distancia debe dejarse entre el cordón de la acera y el vehículo, al estacionar en forma paralela al mismo?",
                List.of(new String[]{"A. 50 cm.", "B. 10 cm.", "C. 20 cm."}),
                2);

        Pregunta pregunta189 = new Pregunta("En un automóvil ¿cuál es la profundidad mínima que debe tener el dibujo de las cubiertas?",
                List.of(new String[]{"A. 0,5 mm.", "B. 1,0 mm.", "C. 1,6 mm."}),
                2);

        Pregunta pregunta190 = new Pregunta("¿Debe Ud. ceder el paso a una fila de escolares que circula por la calzada?",
                List.of(new String[]{"A. No.", "B. Sí.", "C. Solo si advierto la existencia de un colegio cercano."}),
                1);

        Pregunta pregunta191 = new Pregunta("¿Cuál es la velocidad mínima permitida en calles?",
                List.of(new String[]{"A. 30 km/h.", "B. 20 km/h.", "C. 25 km/h."}),
                1);

        Pregunta pregunta192 = new Pregunta("¿Qué nos indica en un semáforo, el encendido solamente de la luz roja, de manera intermitente?",
                List.of(new String[]{"A. Que el semáforo está funcionando parcialmente y que nos aproximamos a un cruce peligroso, debiendo detener la marcha y reiniciándola sólo cuando se observe que no hay riesgo para continuar.", "B. Que el semáforo funciona mal.", "C. Que va a cambiar a verde."}),
                0);

        Pregunta pregunta193 = new Pregunta("¿Cuál es la velocidad máxima permitida en un cruce a nivel ferroviario sin barreras ni semáforos?",
                List.of(new String[]{"A. 10 km./h.", "B. 20 km./h.", "C. 30 km./h."}),
                1);

        Pregunta pregunta194 = new Pregunta("¿Cuál es la velocidad mínima permitida en avenidas?",
                List.of(new String[]{"A. 40 km/h.", "B. 20 km/h.", "C. 30 km/h."}),
                2);

        Pregunta pregunta195 = new Pregunta("¿Qué requisitos debe reunir una vía de circulación (a diferencia de una autopista) para ser considerada una semiautopista (autovia) ?",
                List.of(new String[]{"A. Tener cruces a nivel.", "B. Tener semáforos y peaje.", "C. Ser elevadas y con dos carriles por mano."}),
                0);

        Pregunta pregunta196 = new Pregunta("En caso de barrera baja ¿a qué distancia de ella se debe detener el vehículo si no hay línea de pare que lo indique?",
                List.of(new String[]{"A. 7 metros.", "B. 5 metros.", "C. 2 metros."}),
                1);

        Pregunta pregunta197 = new Pregunta("Con carácter general, cuando nos encontramos con una señal de PROHIBIDO ESTACIONAR ¿está permitido parar para subir o bajar pasajeros de un automóvil?",
                List.of(new String[]{"A. Si.", "B. No.", "C. Según la hora."}),
                0);

        Pregunta pregunta198 = new Pregunta("¿Qué requisito básico debe reunir una vía de circulación para ser considerada una autopista?",
                List.of(new String[]{"A. No tener cruces a nivel con otras vías.", "B. Tener muchos carriles para circular.", "C. Tener que pagar peaje para circular."}),
                0);

        Pregunta pregunta199 = new Pregunta("Cuando Ud. se acerca a un paso a nivel la barrera comienza a bajar para atravesarse en la calzada ¿debe Ud. cruzar el paso a nivel?",
                List.of(new String[]{"A. Sí, siempre que observe que no se aproxima ningún vehículo que circule sobre raíles.", "B. No, en ningún caso.", "C. Sí, teniendo la precaución de cruzar antes de que esté la barrera completamente bajada."}),
                1);

        Pregunta pregunta200 = new Pregunta("En esta intersección ¿qué vehículo pasa en primer lugar?", "/images/pregunta_200.jpg",
                List.of(new String[]{"A. El automóvil rojo.", "B. El ciclomotor.", "C. La furgoneta amarilla"}),
                0);

        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
        preguntas.add(pregunta3);
        preguntas.add(pregunta4);
        preguntas.add(pregunta5);
        preguntas.add(pregunta6);
        preguntas.add(pregunta7);
        preguntas.add(pregunta8);
        preguntas.add(pregunta9);
        preguntas.add(pregunta10);
        preguntas.add(pregunta11);
        preguntas.add(pregunta12);
        preguntas.add(pregunta13);
        preguntas.add(pregunta14);
        preguntas.add(pregunta15);
        preguntas.add(pregunta16);
        preguntas.add(pregunta17);
        preguntas.add(pregunta18);
        preguntas.add(pregunta19);
        preguntas.add(pregunta20);
        preguntas.add(pregunta21);
        preguntas.add(pregunta22);
        preguntas.add(pregunta23);
        preguntas.add(pregunta24);
        preguntas.add(pregunta25);
        preguntas.add(pregunta26);
        preguntas.add(pregunta27);
        preguntas.add(pregunta28);
        preguntas.add(pregunta29);
        preguntas.add(pregunta30);
        preguntas.add(pregunta31);
        preguntas.add(pregunta32);
        preguntas.add(pregunta33);
        preguntas.add(pregunta34);
        preguntas.add(pregunta35);
        preguntas.add(pregunta36);
        preguntas.add(pregunta37);
        preguntas.add(pregunta38);
        preguntas.add(pregunta39);
        preguntas.add(pregunta40);
        preguntas.add(pregunta41);
        preguntas.add(pregunta42);
        preguntas.add(pregunta43);
        preguntas.add(pregunta44);
        preguntas.add(pregunta45);
        preguntas.add(pregunta46);
        preguntas.add(pregunta47);
        preguntas.add(pregunta48);
        preguntas.add(pregunta49);
        preguntas.add(pregunta50);
        preguntas.add(pregunta51);
        preguntas.add(pregunta52);
        preguntas.add(pregunta53);
        preguntas.add(pregunta54);
        preguntas.add(pregunta55);
        preguntas.add(pregunta56);
        preguntas.add(pregunta57);
        preguntas.add(pregunta58);
        preguntas.add(pregunta59);
        preguntas.add(pregunta60);
        preguntas.add(pregunta61);
        preguntas.add(pregunta62);
        preguntas.add(pregunta63);
        preguntas.add(pregunta64);
        preguntas.add(pregunta65);
        preguntas.add(pregunta66);
        preguntas.add(pregunta67);
        preguntas.add(pregunta68);
        preguntas.add(pregunta69);
        preguntas.add(pregunta70);
        preguntas.add(pregunta71);
        preguntas.add(pregunta72);
        preguntas.add(pregunta73);
        preguntas.add(pregunta74);
        preguntas.add(pregunta75);
        preguntas.add(pregunta76);
        preguntas.add(pregunta77);
        preguntas.add(pregunta78);
        preguntas.add(pregunta79);
        preguntas.add(pregunta80);
        preguntas.add(pregunta81);
        preguntas.add(pregunta82);
        preguntas.add(pregunta83);
        preguntas.add(pregunta84);
        preguntas.add(pregunta85);
        preguntas.add(pregunta86);
        preguntas.add(pregunta87);
        preguntas.add(pregunta88);
        preguntas.add(pregunta89);
        preguntas.add(pregunta90);
        preguntas.add(pregunta91);
        preguntas.add(pregunta92);
        preguntas.add(pregunta93);
        preguntas.add(pregunta94);
        preguntas.add(pregunta95);
        preguntas.add(pregunta96);
        preguntas.add(pregunta97);
        preguntas.add(pregunta98);
        preguntas.add(pregunta99);
        preguntas.add(pregunta100);
        preguntas.add(pregunta101);
        preguntas.add(pregunta102);
        preguntas.add(pregunta103);
        preguntas.add(pregunta104);
        preguntas.add(pregunta105);
        preguntas.add(pregunta106);
        preguntas.add(pregunta107);
        preguntas.add(pregunta108);
        preguntas.add(pregunta109);
        preguntas.add(pregunta110);
        preguntas.add(pregunta111);
        preguntas.add(pregunta112);
        preguntas.add(pregunta113);
        preguntas.add(pregunta114);
        preguntas.add(pregunta115);
        preguntas.add(pregunta116);
        preguntas.add(pregunta117);
        preguntas.add(pregunta118);
        preguntas.add(pregunta119);
        preguntas.add(pregunta120);
        preguntas.add(pregunta121);
        preguntas.add(pregunta122);
        preguntas.add(pregunta123);
        preguntas.add(pregunta124);
        preguntas.add(pregunta125);
        preguntas.add(pregunta126);
        preguntas.add(pregunta127);
        preguntas.add(pregunta128);
        preguntas.add(pregunta129);
        preguntas.add(pregunta130);
        preguntas.add(pregunta131);
        preguntas.add(pregunta132);
        preguntas.add(pregunta133);
        preguntas.add(pregunta134);
        preguntas.add(pregunta135);
        preguntas.add(pregunta136);
        preguntas.add(pregunta137);
        preguntas.add(pregunta138);
        preguntas.add(pregunta139);
        preguntas.add(pregunta140);
        preguntas.add(pregunta141);
        preguntas.add(pregunta142);
        preguntas.add(pregunta143);
        preguntas.add(pregunta144);
        preguntas.add(pregunta145);
        preguntas.add(pregunta146);
        preguntas.add(pregunta147);
        preguntas.add(pregunta148);
        preguntas.add(pregunta149);
        preguntas.add(pregunta150);
        preguntas.add(pregunta151);
        preguntas.add(pregunta152);
        preguntas.add(pregunta153);
        preguntas.add(pregunta154);
        preguntas.add(pregunta155);
        preguntas.add(pregunta156);
        preguntas.add(pregunta157);
        preguntas.add(pregunta158);
        preguntas.add(pregunta159);
        preguntas.add(pregunta160);
        preguntas.add(pregunta161);
        preguntas.add(pregunta162);
        preguntas.add(pregunta163);
        preguntas.add(pregunta164);
        preguntas.add(pregunta165);
        preguntas.add(pregunta166);
        preguntas.add(pregunta167);
        preguntas.add(pregunta168);
        preguntas.add(pregunta169);
        preguntas.add(pregunta170);
        preguntas.add(pregunta171);
        preguntas.add(pregunta172);
        preguntas.add(pregunta173);
        preguntas.add(pregunta174);
        preguntas.add(pregunta175);
        preguntas.add(pregunta176);
        preguntas.add(pregunta177);
        preguntas.add(pregunta178);
        preguntas.add(pregunta179);
        preguntas.add(pregunta180);
        preguntas.add(pregunta181);
        preguntas.add(pregunta182);
        preguntas.add(pregunta183);
        preguntas.add(pregunta184);
        preguntas.add(pregunta185);
        preguntas.add(pregunta186);
        preguntas.add(pregunta187);
        preguntas.add(pregunta188);
        preguntas.add(pregunta189);
        preguntas.add(pregunta190);
        preguntas.add(pregunta191);
        preguntas.add(pregunta192);
        preguntas.add(pregunta193);
        preguntas.add(pregunta194);
        preguntas.add(pregunta195);
        preguntas.add(pregunta196);
        preguntas.add(pregunta197);
        preguntas.add(pregunta198);
        preguntas.add(pregunta199);
        preguntas.add(pregunta200);

        return preguntas;
    }
}







































