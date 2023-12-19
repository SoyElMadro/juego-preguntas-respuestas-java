package com.juegopyr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] preguntas = PreguntasRespuestas.preguntas;
        String[] respuestas = PreguntasRespuestas.respuestas;

        int numPreguntas = preguntas.length;

        for (int i = 0; i < numPreguntas; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.println("Elige tu respuesta (a, b, c, d): ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            PreguntasRespuestas.handleAnswer(respuestaUsuario, i);
        }

        int puntaje = PreguntasRespuestas.puntaje;
        System.out.println("Juego terminado. Puntaje final: " + puntaje);
        scanner.close();
    }
}