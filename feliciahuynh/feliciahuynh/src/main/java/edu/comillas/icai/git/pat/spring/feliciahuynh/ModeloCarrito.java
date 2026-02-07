package edu.comillas.icai.git.pat.spring.feliciahuynh;

import org.jspecify.annotations.NonNull;

public record ModeloCarrito(
    @NonNull
    Long idCarrito,
    @NonNull
    Long idArticulo,
    @NonNull
    String descripcion,
    @NonNull
    Long unidades,
    @NonNull
    Long precioFinal) {
    }


