package brightspot.tutorial.articulo;

import brightspot.tutorial.imagen.Imagen;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.ToolUi;

public class Articulo extends Content{
	
	@Required
	private String cabecera;

	private Imagen imgCabecera;

	@ToolUi.RichText
	private String cuerpo;

	public String getCabecera (){
		return cabecera;
	}

	public void setCabecera(String cabecera){
	this.cabecera = cabecera;
	}

	public Imagen getImgCabecera(){
		return imgCabecera;
	}

	public void setImgCabecera(Imagen imgCabecera){
		this.imgCabecera = imgCabecera;	
	}

	public String getCuerpo(){
		return cuerpo;
	}

	public void setCuerpo(String cuerpo){
		this.cuerpo = cuerpo;
	}

}