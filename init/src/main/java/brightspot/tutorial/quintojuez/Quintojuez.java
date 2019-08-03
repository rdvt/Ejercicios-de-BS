package brightspot.tutorial.quintojuez;
 
import com.psddev.cms.db.Content;
import com.psddev.cms.db.ToolUi;
import brightspot.tutorial.imagen.Imagen;
import com.psddev.cms.db.ToolUi;
import java.util.*;

import brightspot.tutorial.elementoInteraccion.ElementoInteraccion; 
 
public class Quintojuez extends Content {

	@ToolUi.Note("Titulo para buscar este elemento en el CMS")
	private String titulo;

	@ToolUi.Note("Seleccione la interaccion a mostrar")
	private ElementoInteraccion interaccion;

	public ElementoInteraccion getInteraccion(){
		return interaccion;
	}

	public void setInteraccion(ElementoInteraccion interaccion){
		this.interaccion = interaccion;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
}
