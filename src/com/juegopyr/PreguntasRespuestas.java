package com.juegopyr;

public class PreguntasRespuestas {
    static String[] preguntas = {
            "¿Cuál es la capital de Francia?\n" +
                    "a) Berlín\nb) Madrid\nc) París\nd) Roma",
            "¿En qué año comenzó la Segunda Guerra Mundial?\n" +
                    "a) 1929\nb) 1939\nc) 1945\nd) 1955",
            "¿Cuántos lados tiene un triángulo?\n" +
                    "a) 3\nb) 4\nc) 5\nd) 6",
            "¿Cuál es el río más largo del mundo?\n" +
                    "a) Nilo\nb) Amazonas\nc) Yangtsé\nd) Misisipi",
            "¿Quién escribió 'Cien años de soledad'?\n" +
                    "a) Gabriel García Márquez\nb) Mario Vargas Llosa\nc) Isabel Allende\nd) Julio Cortázar",
            "¿Cuál es el elemento más abundante en la corteza terrestre?\n" +
                    "a) Oxígeno\nb) Hierro\nc) Silicio\nd) Aluminio",
            "¿En qué año se fundó la Organización de las Naciones Unidas (ONU)?\n" +
                    "a) 1945\nb) 1955\nc) 1965\nd) 1975",
            "¿Cuál es el océano más grande del mundo?\n" +
                    "a) Atlántico\nb) Índico\nc) Pacífico\nd) Antártico",
            "¿Quién pintó la Mona Lisa?\n" +
                    "a) Vincent van Gogh\nb) Leonardo da Vinci\nc) Pablo Picasso\nd) Claude Monet"
    };

    static String[] respuestas = {
            "c",
            "b",
            "a",
            "b",
            "a",
            "c",
            "a",
            "c",
            "b"
    };

    static int puntaje = 0;

    public static void handleAnswer (String respuestaUsuario, Integer i) {
        if (respuestaUsuario.equals(respuestas[i])) {
            System.out.println("¡Correcto! +1 punto\n");
            puntaje++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + respuestas[i] + " \n");
        }
    }
}
