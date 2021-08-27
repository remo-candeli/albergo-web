package org.albergo.massimo.dtos;

import java.util.List;

public class AlloggioDto {

    private String nomeCliente;
    private int giorniPermanenza;
    private List<CameraDto> rooms;

    public AlloggioDto() {
    }

    public AlloggioDto(String nomeCliente, int giorniPermanenza, List<CameraDto> rooms) {
        this.nomeCliente = nomeCliente;
        this.giorniPermanenza = giorniPermanenza;
        this.rooms = rooms;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getGiorniPermanenza() {
        return giorniPermanenza;
    }

    public void setGiorniPermanenza(int giorniPermanenza) {
        this.giorniPermanenza = giorniPermanenza;
    }


    public List<CameraDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<CameraDto> rooms) {
        this.rooms = rooms;
    }
}
