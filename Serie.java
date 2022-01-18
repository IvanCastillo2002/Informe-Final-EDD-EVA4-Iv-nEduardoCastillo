/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivned
 */
public class Serie {
   private String titulo,clasificacion,genero;
 private boolean estreno;
 public static byte total=0; //Variable de Clase
 
 public Serie(String titulo, String clasificacion, String genero,
                  boolean estreno){
     this.titulo=titulo;
     this.clasificacion=clasificacion;
     this.genero=genero;
     this.estreno=estreno;
     total ++; //total=total+1;
 }
 public String getTitulo(){
     return titulo;
 }
 public void setTitulo(String titulo){
     this.titulo=titulo;
 }
 public String geTClasificacion(){
     return clasificacion;
 }
 public void setClasificacion(String clasificacion){
     this.clasificacion=clasificacion;
 }
 public String getGenero(){
     return genero;
 }
 public void setGenero(String genero){
     this.genero=genero;
 }
 public boolean isEstreno(){
   return estreno;  
 }
 public void setEstreno(boolean estreno){
     this.estreno=estreno;
 }
 public String getDatos(){
     String texto = "Titulo:" + titulo + "\nClasificacion:" + clasificacion +
             "\nGenero: " + genero + "\nEstreno: "; 
 if(estreno)
      texto+="Si"; //texto=texto+"Si";
 else 
     texto+="No"; //texto=texto+"No";
 return texto;
 
 }
}
