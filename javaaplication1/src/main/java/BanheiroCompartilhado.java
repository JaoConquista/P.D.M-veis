public class BanheiroCompartilhado {

    private boolean ocupado;
    private String ocupante;

    public BanheiroCompartilhado(){
        this.ocupado = false;
        this.ocupante = "";
    }

    public boolean getOcupado(){
        return ocupado;
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public String getOcupante() {
        return ocupante;
    }
    public void setOcupante(String ocupante) {
        this.ocupante = ocupante;
    }

    public String usarBanheiro(String nome){
        if(this.ocupado){
            return "O banheiro está ocupado no momento por " + this.ocupante;
        }else{
            this.ocupado = true;
            this.ocupante = nome;
            return "O Banheiro esta sendo usado por " + nome;
        }
    }

    public String desocuparBanheiro(String nome){
            this.ocupado = false;
            this.ocupante = "";

        return nome + " deixou o banheiro livre";
    }
}
