/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivned
 */
public class Inventario {
   private Pelicula peliculas[];

public Inventario(int n){
    peliculas=new Pelicula[n];
}  
public boolean agregarPelicula(String titulo, String clasificacion,String genero,boolean estreno){
    if(Pelicula.total< peliculas.length){
        peliculas[Pelicula.total]=new Pelicula(titulo,clasificacion,genero,estreno);
        return true;
    }else
        return false;
    
}
public String getPelicula(byte nomPelicula){
    if ((nomPelicula>=1) && (nomPelicula<=Pelicula.total))
        return peliculas[nomPelicula-1].getDatos();
    else
        return "Nombre de Pelicula inexistente";
}
public byte getTotal(){
    return Pelicula.total;
}
}
