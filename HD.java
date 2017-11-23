package ubr.usp.pcs.mvc;

public class HD {
		 
	    //Atributos
	    private String fabricante;
	    private String modelo;
	    private int capacidade;
	    private String tecnologia;
	    private int Id;
	 
	    //Metodos publicos
	 
	    public String getFabricante() {
	        return fabricante;
	    }
	    
	    public void setFabricante(String fabricante) {
	        this.fabricante = fabricante;
	    }
	    
	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	 
	    public int getCapacidade() {
	        return capacidade;
	    }
	 
	    public void setCapacidade(int capacidade) {
	        this.capacidade = capacidade;
	    }
	 
	    public String getTecnologia() {
	        return tecnologia;
	    }
	    
	    public void setTecnologia(String tecnologia) {
	        this.tecnologia = tecnologia;
	    }
	    
	    public int getId() {
	        return Id;
	    }
	 
	        
	    public HD (String fabricante, String modelo, int capacidade, String tecnologia, int Id){
	        this.fabricante=fabricante;
	        this.modelo=modelo;
	        this.capacidade=capacidade;
	        this.tecnologia=tecnologia;
	        this.Id=Id;
	    }
	
}
