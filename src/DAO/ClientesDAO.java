
package DAO;

import MODEL.clientesM;
import java.util.LinkedList;

public interface ClientesDAO {
    
    public LinkedList<clientesM> ListarC();

    public clientesM obtener_clientes(int codigo);

    public void crear_clientes(clientesM cliente);

    public void modificar_clientes(clientesM cliente);

    public void eliminar_clientes(int codigo);
    
}

