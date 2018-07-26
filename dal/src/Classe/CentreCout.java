package Classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afpa
 */
public class CentreCout {
    private int id;
    private String service;
    private int code_service;
    private int id_personnel;

    public CentreCout(String service, int code_service, int id_personnel) {
        this.service = service;
        this.code_service = code_service;
        this.id_personnel = id_personnel;
    }

    public CentreCout(int id, String service, int code_service, int id_personnel) {
        this.id = id;
        this.service = service;
        this.code_service = code_service;
        this.id_personnel = id_personnel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getCode_service() {
        return code_service;
    }

    public void setCode_service(int code_service) {
        this.code_service = code_service;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

}
