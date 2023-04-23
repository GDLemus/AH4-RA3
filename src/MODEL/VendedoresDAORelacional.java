package MODEL;

import DAO.VendedoresDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class VendedoresDAORelacional implements VendedoresDAO{

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<vendedoresM> listarV() {
       String sql = "SELECT * FROM vendedores";
        LinkedList<vendedoresM> listarV = new LinkedList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
//                listar.add(new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
//            }
          listarV.add(new vendedoresM(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
                  }
          return listarV;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void crear_vendedor(vendedoresM vendedores) {
    String sql = "insert into vendedores (nombre,caja,ventas,genero,password) values (?,?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, vendedores.getNombre());
            ps.setInt(2, vendedores.getCaja());
            ps.setInt(3, vendedores.getVentas());
            ps.setString(4, vendedores.getGenero());
            ps.setString(5, vendedores.getPass());
            ps.executeUpdate();
             
        } catch (Exception e) {
            System.out.println(e);
        
        }
    
    }

    @Override
    public void modificar_vendedor(vendedoresM vendedores) {
     
        String sql = "update vendedores set nombre=?, caja=?, ventas=?, genero=?, password=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, vendedores.getNombre());
            ps.setInt(2, vendedores.getCaja());
            ps.setInt(3, vendedores.getVentas());
            ps.setString(4, vendedores.getGenero());
            ps.setString(5, vendedores.getPass());
            ps.setInt(6, vendedores.getCodigo());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println(e);
        
        }
    
    }

    @Override
    public void eliminar(int codigo) {
    
        String sql = "delete from vendedores where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }  
    
    }

    @Override
    public vendedoresM obtener(int codigo) {
      
    String sql = "select * from vendedores where codigo= ?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {

            vendedoresM vm = new vendedoresM(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            return vm;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }
            
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public vendedoresM consultar(String nombre, String password){
    
    
        String sql = "select * from vendedores where nombre= ? and password = ?";
    
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, password);
            rs = ps.executeQuery();
        
            if (rs.next()) {
                vendedoresM sgt = new vendedoresM(rs.getInt(1), rs.getString(2), rs.getString(6));
                return sgt;
            }
        
        } catch (Exception e) {
        }
    
    return null;
    }
}
 