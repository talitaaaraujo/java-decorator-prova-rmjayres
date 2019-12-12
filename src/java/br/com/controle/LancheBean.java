/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;


import br.com.subway.Bacon;
import br.com.subway.Bebida;
import br.com.subway.Bebida350ml;
import br.com.subway.Bebida500ml;
import br.com.subway.Calabresa;
import br.com.subway.Frango;
import br.com.subway.Hamburguer;
import br.com.subway.Lanche;
import br.com.subway.Lanche15cm;
import br.com.subway.Lanche30cm;
import br.com.subway.Molho;
import br.com.subway.Pao;
import br.com.subway.Queijo;
import br.com.subway.Refrigerante;
import br.com.subway.Salada;
import br.com.subway.Sucos;
import java.text.NumberFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Talita Araujo
 */
@ManagedBean
@ViewScoped
public class LancheBean {

    private int tamLanche = 1 ;
    private int tipoPao = 1 ;
    private int tipoCarne = 1 ;
    private int tipoQueijo = 1 ;
    private int tipoSalada = 1 ;
    private int tipoMolho = 1 ;
    private int tipoSuco = 1 ;
    private int tipoRefri = 1 ;
    private int tamBebida = 1 ;
    private int desejaBebida = 1 ;
    private Lanche lanche = null;
    private Bebida bebida = null;
    private String mensagem ="";
    
    private String DescricaoLanche = "" ;
    private String DescricaoBebida = "" ;
    private String valorLanche = "" ;
    private String valorBebida = "" ;
    private String valTotal = "" ;
    

    private boolean finilized = false ; 
    
    public LancheBean() {
    }

    public String finalizar(){

        FacesContext fc = FacesContext.getCurrentInstance();

        if( !this.ProcessarDados() ){
            
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao Finalizar", this.mensagem);
            fc.addMessage(null, fm);
            this.finilized = false ;
        }
        else{
            
            double total = 0 ;
           
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso ao Finalizar", this.mensagem);
            fc.addMessage(null, fm);
            
            if( this.bebida != null ){
                this.DescricaoBebida = this.bebida.getNome() ;
                this.valorBebida = NumberFormat.getCurrencyInstance().format(this.bebida.getValor()) ;
                total += this.bebida.getValor() ;
            }
            else{
                this.DescricaoBebida = "-" ;
                this.valorBebida = "R$ -" ;
            }
            
            total += this.lanche.getPreco() ;
            this.DescricaoLanche = this.lanche.getDescricao() ;
            this.valorLanche = NumberFormat.getCurrencyInstance().format(this.lanche.getPreco()) ;
            this.valTotal = NumberFormat.getCurrencyInstance().format(total) ;

            this.finilized = true ;
        }

        return null;
    }

    public String getValTotal() {
        return valTotal;
    }

    public void setValTotal(String valTotal) {
        this.valTotal = valTotal;
    }

    public boolean isFinilized() {
        return finilized;
    }

    public void setFinilized(boolean finilized) {
        this.finilized = finilized;
    }

    public int getTamLanche() {
        return tamLanche;
    }

    public void setTamLanche(int tamLanche) {
        this.tamLanche = tamLanche;
    }

    public int getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(int tipoPao) {
        this.tipoPao = tipoPao;
    }

    public int getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(int tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public int getTipoQueijo() {
        return tipoQueijo;
    }

    public void setTipoQueijo(int tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    public int getTipoSalada() {
        return tipoSalada;
    }

    public void setTipoSalada(int tipoSalada) {
        this.tipoSalada = tipoSalada;
    }

    public int getTipoMolho() {
        return tipoMolho;
    }

    public void setTipoMolho(int tipoMolho) {
        this.tipoMolho = tipoMolho;
    }

    public int getTipoSuco() {
        return tipoSuco;
    }

    public void setTipoSuco(int tipoSuco) {
        this.tipoSuco = tipoSuco;
    }

    public int getTipoRefri() {
        return tipoRefri;
    }

    public void setTipoRefri(int tipoRefri) {
        this.tipoRefri = tipoRefri;
    }

    public int getDesejaBebida() {
        return desejaBebida;
    }

    public void setDesejaBebida(int desejaBebida) {
        this.desejaBebida = desejaBebida;
    }

    public int getTamBebida() {
        return tamBebida;
    }

    public void setTamBebida(int tamBebida) {
        this.tamBebida = tamBebida;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDescricaoLanche() {
        return DescricaoLanche;
    }

    public void setDescricaoLanche(String DescricaoLanche) {
        this.DescricaoLanche = DescricaoLanche;
    }

    public String getDescricaoBebida() {
        return DescricaoBebida;
    }

    public void setDescricaoBebida(String DescricaoBebida) {
        this.DescricaoBebida = DescricaoBebida;
    }

    public String getValorLanche() {
        return valorLanche;
    }

    public void setValorLanche(String valorLanche) {
        this.valorLanche = valorLanche;
    }

    public String getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(String valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    public boolean ProcessarDados(){
        
        this.lanche = null ;
        this.bebida = null ;
        
        //******TAMANHO LANCHE********//
        if (this.tamLanche == 1){
            this.lanche = new Lanche15cm();
        }
        else if (this.tamLanche == 2){
            this.lanche = new Lanche30cm();
        }
        else {
            this.mensagem = "Selecione o tamanho do Lanche!";
            return false;
        }

        //******TAMANHO BEBIDA********//
        if (this.tamBebida == 1){
            this.bebida = new Bebida350ml();
        }
        else if (this.tamBebida == 2){
            this.bebida = new Bebida500ml();
        }
        //******TIPO PÃO********//
        if (this.tipoPao == 1){
            this.lanche = new Pao("Parmesão e Orégano", this.lanche);
        }
        else if (this.tipoPao == 2){
            this.lanche = new Pao("9 grãos", this.lanche);
        }
        else if (this.tipoPao == 3){
            this.lanche = new Pao("Três queijos", this.lanche);
        }
        else if (this.tipoPao == 4){
            this.lanche = new Pao("Italiano Branco", this.lanche);
        }
        //******TIPO CARNE********//
        if (this.tipoCarne == 1){
            this.lanche = new Frango("Frango", this.lanche);
        }
        else if (this.tipoCarne == 2){
            this.lanche = new Bacon("Bacon", this.lanche);
        }
        else if (this.tipoCarne == 3){
            this.lanche = new Calabresa("Calabresa", this.lanche);
        }
        else if (this.tipoCarne == 4){
            this.lanche = new Hamburguer("Hamburguer", this.lanche);
        }
        //******TIPO QUEIJO********//
        if (this.tipoQueijo == 1){
            this.lanche = new Queijo("Cheddar", this.lanche);
        }
        else if (this.tipoQueijo == 2){
            this.lanche = new Queijo("Mussarela", this.lanche);
        }
        else if (this.tipoQueijo == 3){
            this.lanche = new Queijo("Prato", this.lanche);
        }
        //******TIPO SALADA********//
        if (this.tipoSalada == 1){
            this.lanche = new Salada("Pepino", this.lanche);
        }
        else if (this.tipoSalada == 2){
            this.lanche = new Salada("Alface", this.lanche);
        }
        else if (this.tipoSalada == 3){
            this.lanche = new Salada("Tomate", this.lanche);
        }
        //******TIPO MOLHO********//
        if (this.tipoMolho == 1){
            this.lanche = new Molho("Barbecue", this.lanche);
        }
        else if (this.tipoMolho == 2){
            this.lanche = new Molho("Maionese", this.lanche);
        }
        else if (this.tipoMolho == 3){
            this.lanche = new Molho("Mostarda", this.lanche);
        }
         //******SUCOS********//
        
        if( this.bebida != null ){
            if (this.tipoSuco == 1){
                this.bebida = new Sucos("Maracuja",3.80, this.bebida);
            }
            else if (this.tipoSuco == 2){
                this.bebida = new Sucos("Laranja",1.60, this.bebida);
            }
            else if (this.tipoSuco == 3){
                this.bebida = new Sucos("Abacaxi",3.20, this.bebida);
            }   
        }
        //******REFRIS********//
        if( this.bebida != null ){
            if (this.tipoRefri == 1){
                this.bebida = new Refrigerante("Coca-Cola",6.80, this.bebida);
            }
            else if (this.tipoRefri == 2){
                this.bebida = new Refrigerante("Fanta",4.60, this.bebida);
            }
            else if (this.tipoRefri == 3){
                this.bebida = new Refrigerante("Sprite",3.20, this.bebida);
            }   
        }

        this.mensagem = "Pedido finalizado com sucesso!"; 
        return true;
}
}
