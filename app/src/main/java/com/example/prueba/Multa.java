package com.example.prueba;

import org.json.JSONException;
import org.json.JSONObject;


public class Multa {

    String placa, descripcion, estado, fecha, valor, cedula, id, modelo;

    public Multa(JSONObject objetoJSON) throws JSONException {
        this.placa = objetoJSON.getString("placa");
        this.descripcion = objetoJSON.getString("descripcion");
        this.estado = objetoJSON.getString("estado");
        this.fecha = objetoJSON.getString("fecha");
        this.valor = objetoJSON.getString("valor");
        this.cedula = objetoJSON.getString("cedula");
        this.id = objetoJSON.getString("id");
        this.modelo = objetoJSON.getString("modelo");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
