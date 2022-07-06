package negocio;

/**
 *
 * @author mselfene
 */
public class Encomienda {
    
    private int en_id;
    private String en_destinatario;
    private String en_direccion;
    private String en_tipo;
    private boolean en_entregadomicilio;
    private String en_tamano;
    private String en_remitente; 

    public Encomienda() {
    }

    public Encomienda(int en_id, String en_destinatario, String en_direccion, String en_tipo, boolean en_entregadomicilio, String en_tamano, String en_remitente) {
        this.en_id = en_id;
        this.en_destinatario = en_destinatario;
        this.en_direccion = en_direccion;
        this.en_tipo = en_tipo;
        this.en_entregadomicilio = en_entregadomicilio;
        this.en_tamano = en_tamano;
        this.en_remitente = en_remitente;
    }

    public int getEn_id() {
        return en_id;
    }

    public void setEn_id(int en_id) {
        this.en_id = en_id;
    }

    public String getEn_destinatario() {
        return en_destinatario;
    }

    public void setEn_destinatario(String en_destinatario) {
        this.en_destinatario = en_destinatario;
    }

    public String getEn_direccion() {
        return en_direccion;
    }

    public void setEn_direccion(String en_direccion) {
        this.en_direccion = en_direccion;
    }

    public String getEn_tipo() {
        return en_tipo;
    }

    public void setEn_tipo(String en_tipo) {
        this.en_tipo = en_tipo;
    }

    public boolean isEn_entregadomicilio() {
        return en_entregadomicilio;
    }

    public void setEn_entregadomicilio(boolean en_entregadomicilio) {
        this.en_entregadomicilio = en_entregadomicilio;
    }

    public String getEn_tamano() {
        return en_tamano;
    }

    public void setEn_tamano(String en_tamano) {
        this.en_tamano = en_tamano;
    }

    public String getEn_remitente() {
        return en_remitente;
    }

    public void setEn_remitente(String en_remitente) {
        this.en_remitente = en_remitente;
    }

    @Override
    public String toString() {
        return "EncomiendaBD{" + "en_id=" + en_id + ", en_destinatario=" + en_destinatario + ", en_direccion=" + en_direccion + ", en_tipo=" + en_tipo + ", en_entregadomicilio=" + en_entregadomicilio + ", en_tamano=" + en_tamano + ", en_remitente=" + en_remitente + '}';
    }
    
    
}
