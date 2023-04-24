
package DAO;


import java.util.LinkedList;
import MODEL.sucursalesM;

public interface SucursalesDAO {

    public LinkedList<sucursalesM> ListarS();

    public sucursalesM obtener_sucursales(int codigo);

    public void crear_sucursal(sucursalesM sucursal);

    public void modificar_sucursales(sucursalesM sucursal);

    public void eliminar_sucursales(int codigo);

}