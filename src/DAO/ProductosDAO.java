
package DAO;

import MODEL.productosM;

import java.util.LinkedList;


public interface ProductosDAO {
    
    public LinkedList<productosM> ListarP();

    public productosM obtener_productos(int codigo);

    public void crear_productos(productosM producto);

    public void modificar_productos(productosM producto);

    public void eliminar_productos(int codigo);
}
