package POOURU;

public class Camioneta {
	
	private int ruedas, largo, ancho, motor, peso, pesoTotal, capacidadCarga;
	private String color;
	private boolean asientosCuero, climatizador, manejo, trRuedas;
	
	public Camioneta () {
		ruedas = 4;
		largo = 500;
		ancho = 200;
		motor = 1600;
		peso = 500;
		capacidadCarga = 500;
	}
	
	 public String DimeDatosGenerales() {//Getter
	        return "La plataforma del vehiculo tiene " + ruedas+ " ruedas"+
	            ". Mide "+largo/100 + " metros y de ancho " + ancho +
	            " cm, con un peso de plataforma de "+ peso + " Kg,"+ " una capacidad de carga de "
	            + capacidadCarga + "Kg"+ " y un motor de "+ motor+".";
	    }
	 
	 public void estableceColor(String colorCamioneta) { 
			color = colorCamioneta;
		}
	 
	 public String dimeColor() {
		 return "La camioneta es de color: "+ color;
	 }
	 
	 public void estableceAsientos(String asientosCam) {
		 
		 if(asientosCam.equalsIgnoreCase("si")) {
			 asientosCuero = true;
		 }else {
			 asientosCuero = false;
		 }
	 }
	 
	 public String dimeAsientos() { 
	       
	        if(asientosCuero == true) {
	           
	            return "La camioneta tiene asientos de cuero";
	           
	        }else {
	           
	            return "La camioneta tiene asientos serie";
	        }
	       
	    }
	 
	 public void confClimatizador(String climatizador) {//Setter
	       
	        if(climatizador.equalsIgnoreCase("si")) {
	           
	            this.climatizador =true;
	           
	        }else {
	           
	            this.climatizador= false;
	        }
	       
	    }
	   
	    public String dimeClimatizador() {//Getter
	       
	        if(climatizador==true) {
	           
	            return "La camioneta tiene climatizador";
	           
	        }else {
	           
	            return "La camioneta lleva aire acondicionado";
	        }
	    }
	    
	    public String dimePesoCam() {
		       
	        int pesoCarroceria = 1000;
	       
	        pesoTotal = peso + pesoCarroceria;
	       
	        if(asientosCuero == true) {
	             
	            pesoTotal = pesoTotal + 50;
	        }
	       
	        if(climatizador ==true) {
	           
	            pesoTotal = pesoTotal +20 ;
	        }
	       
	        return "El peso de la camioneta es "+ pesoTotal+"Kg";
	       
	    }
	    
	    public void confTraccion(String traccionRuedas) {
	    	if(traccionRuedas.equalsIgnoreCase("si")) {
	    		trRuedas = true;
	    	}else {
	    		trRuedas = false;
	    	}
	    }
	    
	    public String dimeTraccion() {
	    	if(trRuedas == true) {
	    		return "La camioneta tiene traccion en las 4 ruedas";
	    	}else {
	    		return "La camioneta tiene traccion en las ruedas delanteras";
	    	}
	    }
	    
	    public void confManejo(String modoManejo) {
	    	if(modoManejo.equalsIgnoreCase("si")) {
	    		manejo = true;
	    	}else {
	    		manejo = false;
	    	}
	    }
	    
	    public String dimeManejo() {
	    	if(manejo == true) {
	    		return "La camioneta es automatica";
	    	}else {
	    		return "La camioneta es sincronica";
	    	}
	    }
	    
	    public int precioCam() {
		       
	        int precioFinal = 5000;
	       
	        if(asientosCuero) {
	           
	            precioFinal+=1000;
	        }
	       
	        if(climatizador) {
	            precioFinal+=1500;
	        }
	        
	        if(trRuedas) {
	        	precioFinal+=800;
	        }
	        
	        if(manejo) {
	        	precioFinal+=500;
	        }
	       
	        return precioFinal;
	    }
	    
	    


}
