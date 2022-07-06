package accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Encomienda;
import servicios.Conexion;

/**
 * crud
 * @author mselfene
 */
public class DAO {
    
    public static boolean Create(Encomienda encomienda){
        try{
            Connection conexion = Conexion.getConexion(); 
            String query = "INSERT INTO encomienda(en_id, en_destinatario, en_direccion, en_tipo, en_entregadomicilio, en_tamano, en_remitente) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ins = conexion.prepareStatement(query);
            ins.setInt(1, encomienda.getEn_id());
            ins.setString(2, encomienda.getEn_destinatario());
            ins.setString(3, encomienda.getEn_direccion());
            ins.setString(4, encomienda.getEn_tipo());
            ins.setBoolean(5, encomienda.isEn_entregadomicilio());
            ins.setString(6, encomienda.getEn_tamano());
            ins.setString(7, encomienda.getEn_remitente());
            
            if(ins.executeUpdate() > 0) {
                return true;
            }
            conexion.close();
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar "+ ex.getMessage());
        }
        return false;
    }
    
    
    
    public static boolean Modificar(Encomienda encomienda) {

    try {
            Connection conexion = Conexion.getConexion(); 
            String query = ("UPDATE encomienda SET en_id=?, en_destinatario=?, en_direccion=?, en_tipo=?, en_entregadomicilio=?, en_tamano=?, en_remitente=? WHERE en_id=?");
            
            PreparedStatement ins = conexion.prepareStatement(query);
            ins.setInt(1, encomienda.getEn_id());
            ins.setString(2, encomienda.getEn_destinatario());
            ins.setString(3, encomienda.getEn_direccion());
            ins.setString(4, encomienda.getEn_tipo());
            ins.setBoolean(5, encomienda.isEn_entregadomicilio());
            ins.setString(6, encomienda.getEn_tamano());
            ins.setString(7, encomienda.getEn_remitente());
            ins.setInt(8, encomienda.getEn_id());
            
            if(ins.executeUpdate() > 0) {
                return true;
            }
            conexion.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al modificar " + e.getMessage());
            }
        return false;
    }
    
    
    
    public static void eliminarUsuario(int idEliminar){
        try{
            Connection conexion = Conexion.getConexion(); 
            String query = "DELETE FROM encomienda WHERE en_id=?";
            PreparedStatement eliminar = conexion.prepareStatement(query);
            eliminar.setInt(1, idEliminar);
            eliminar.execute();
            eliminar.close();
            conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al eliminar encomienda "+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al eliminar encomienda "+e.getMessage());
        }
    }
    
        public static ArrayList<Encomienda> mostrarTodos() {
        ArrayList<Encomienda> listaUsuarios = new ArrayList<Encomienda>();
        try{
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM encomienda";
            PreparedStatement listarTodos = conexion.prepareStatement(query);
            ResultSet rs = listarTodos.executeQuery();
            while(rs.next()){
                Encomienda dto = new Encomienda();
                dto.setEn_id(rs.getInt("en_id"));
                dto.setEn_destinatario(rs.getString("en_destinatario"));
                dto.setEn_direccion(rs.getString("en_direccion"));
                dto.setEn_tipo(rs.getString("en_tipo"));
                dto.setEn_entregadomicilio(rs.getBoolean("en_entregadomicilio"));
                dto.setEn_tamano(rs.getString("en_tamano"));
                dto.setEn_remitente(rs.getString("en_remitente"));
                listaUsuarios.add(dto);
            }
        }catch(SQLException s){
            System.out.println("Error SQL al listar Encomiendas "+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar Encomiendas s"+e.getMessage());
        }
        return listaUsuarios;

    }
        
        
    public static  Encomienda buscarPorIds(int id){
            ArrayList<Encomienda> listarId = new ArrayList<Encomienda>();
            Encomienda idBuscado = null;
            try{
                Connection conexion = Conexion.getConexion();
                String query = "SELECT en_id, en_destinatario, en_direccion, en_tipo, en_entregadomicilio, en_tamano, en_remitente FROM encomienda WHERE en_id=?";
                PreparedStatement buscarPorId = conexion.prepareStatement(query);
                buscarPorId.setInt(1, id);
                ResultSet rs = buscarPorId.executeQuery();
                while(rs.next()){
                    Encomienda idEncontrada = new Encomienda();
                    idEncontrada.setEn_id(rs.getInt("en_id"));
                    idEncontrada.setEn_destinatario(rs.getString("en_destinatario"));
                    idEncontrada.setEn_direccion(rs.getString("en_direccion"));
                    idEncontrada.setEn_tipo(rs.getString("en_tipo"));
                    idEncontrada.setEn_entregadomicilio(rs.equals("en_entregadomicilio"));
                    idEncontrada.setEn_tamano(rs.getString("en_tamano"));
                    idEncontrada.setEn_remitente(rs.getString("en_remitente"));
                    
                    return idEncontrada;
                }
                System.out.println("asdasd "+ idBuscado);
            }catch(SQLException s){
                System.out.println("Error SQL al listar usuario"+s.getMessage());
            }catch(Exception e){
                System.out.println("Error al listar usuario"+e.getMessage());
            }
            return null;
    }

   
    public static void eliminarID(int idEliminar){
        try{
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM encomienda WHERE en_id=?";
            PreparedStatement eliminar = conexion.prepareStatement(query);
            eliminar.setInt(1, idEliminar);
            eliminar.execute();
            eliminar.close();
            conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al eliminar usuario"+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al eliminar usuario"+e.getMessage());
        }
    }
    
    





    
    

}
