package server;

import controllers.CuestionarioController;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Router {

    public static void init() {
        Server.app().get("/", ctx -> ctx.render("/index.hbs"));
        Server.app().get("/cuestionario", new CuestionarioController()::primeraPregunta);
        Server.app().post("/responder", new CuestionarioController()::procesarRespuesta);
    }
}