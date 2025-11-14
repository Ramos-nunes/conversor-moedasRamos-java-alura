package com.ramos.conversormoedas;

public record Moeda(
        String base_code,       // Moeda de origem
        String target_code,     // Moeda de destino
        double conversion_rate, // Taxa de conversão
        double conversion_result // Resultado convertido
) {}
