
package BR;

import BE.productobe;
import DAO.productodao;
import java.util.List;

public class productobr {

    public productobr() {
    }
    public List<productobe> listar(){
        return new productodao().listadoPrductos();
    }
     public List<productobe> ListaC(productobe e){
        return new productodao().ListaCodigo(e);
    }
    
    public int nuevo(productobe e){
        return new productodao().registrar(e);
    }
    public int actualizardatos(productobe e){
        return new productodao().actualizar(e);
    }
    public int eliminar(productobe e){
        return new productodao().eliminar(e);
    }
   
    
    
    
    
}
