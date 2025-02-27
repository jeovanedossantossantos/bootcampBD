package stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Desafio {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // - Desafio 1 - Mostre a lista na ordem numérica:

        // Crie um programa que utilize a Stream API para ordenar a lista
        // de números em ordem crescente e a exiba no console.

        Collections.sort(numeros);

        System.out.println(numeros);

        // - Desafio 2 - Imprima a soma dos números pares da lista:

        // Utilizando a Stream API, realize a soma dos números pares
        // da lista e exiba o resultado no console.

        numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {

            }

        });

    }

}
