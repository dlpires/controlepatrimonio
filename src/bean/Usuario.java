/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.UsuarioDAO;

/**
 *
 * @author dlpires
 */
public class Usuario {

    private String LoginUsuario;
    private String SenhaUsuario;
    private String ConfSenhaUsuario;
    private String NomeUsuario;
    private String FuncaoUsuario;
    private String CellUsuario;
    private int NivelAcesso;

    public Usuario() {
    }

    public Usuario(String LoginUsuario, String SenhaUsuario) {
        this.LoginUsuario = LoginUsuario;
        this.SenhaUsuario = SenhaUsuario;
    }
    
    
    
    public static boolean doLogin(String user, String pass){
        return UsuarioDAO.doLogin(user, pass);
    }
    
    /**
     * @return the LoginUsuario
     */
    public String getLoginUsuario() {
        return LoginUsuario;
    }

    /**
     * @param LoginUsuario the LoginUsuario to set
     */
    public void setLoginUsuario(String LoginUsuario) {
        this.LoginUsuario = LoginUsuario;
    }

    /**
     * @return the SenhaUsuario
     */
    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    /**
     * @param SenhaUsuario the SenhaUsuario to set
     */
    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }

    /**
     * @return the ConfSenhaUsuario
     */
    public String getConfSenhaUsuario() {
        return ConfSenhaUsuario;
    }

    /**
     * @param ConfSenhaUsuario the ConfSenhaUsuario to set
     */
    public void setConfSenhaUsuario(String ConfSenhaUsuario) {
        this.ConfSenhaUsuario = ConfSenhaUsuario;
    }

    /**
     * @return the NomeUsuario
     */
    public String getNomeUsuario() {
        return NomeUsuario;
    }

    /**
     * @param NomeUsuario the NomeUsuario to set
     */
    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    /**
     * @return the FuncaoUsuario
     */
    public String getFuncaoUsuario() {
        return FuncaoUsuario;
    }

    /**
     * @param FuncaoUsuario the FuncaoUsuario to set
     */
    public void setFuncaoUsuario(String FuncaoUsuario) {
        this.FuncaoUsuario = FuncaoUsuario;
    }

    /**
     * @return the CellUsuario
     */
    public String getCellUsuario() {
        return CellUsuario;
    }

    /**
     * @param CellUsuario the CellUsuario to set
     */
    public void setCellUsuario(String CellUsuario) {
        this.CellUsuario = CellUsuario;
    }

    /**
     * @return the NivelUsuario
     */
    public int getNivelAcesso() {
        return NivelAcesso;
    }

    /**
     * @param NivelAcesso
     */
    public void setNivelAcesso(int NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
    
    public void update(){
        if(verificarCampos()) UsuarioDAO.save(this);
    }
    
    public void delete(){
        if(verificarCampos()) UsuarioDAO.delete(this);
    }
    
    public void create(){
        if(verificarCampos()) UsuarioDAO.create(this);
    }
    
    private boolean verificarCampos(){
        return (!LoginUsuario.equals("")) && (SenhaUsuario.equals(ConfSenhaUsuario)) && 
                (!NomeUsuario.equals("")) && (!FuncaoUsuario.equals("")) &&
                (!CellUsuario.equals("")) && (NivelAcesso != 0);
                        
    }
}
