package com.bancolombia.aplicacioncuenta.model;

import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Validated
public class TransaccionDTO {

    @Positive(message = "Monto debe ser mayor a cero!!")
    @NotNull(message = "Monto no puede estar vacío!!")
    private BigDecimal monto;

    @NotNull(message = "Descripción obligatoria!!")
    private String descripcion;

    @NotNull(message = "Id obligatorio!!")
    private String cuentaId;

    public TransaccionDTO(BigDecimal monto, String descripcion, String cuentaId) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.cuentaId = cuentaId;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(String cuentaId) {
        this.cuentaId = cuentaId;
    }
}
