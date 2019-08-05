package brightspot.tutorial.elementoInteraccion;

import brightspot.tutorial.imagen.Imagen;
import com.psddev.cms.db.Content;
import com.psddev.cms.db.ToolUi;
import java.util.*;

public class ElementoInteraccion extends Content {

	@ToolUi.Note("Con este titulo se puede buscar en el CMS esta interaccion")
	@Required
	private String titulo;
	
	@ToolUi.Note("Este es el titulo que se mostrara en la aplicacion")
	@Required
	private String title;

	@ToolUi.Note("Elemento a mostrar en la aplicacion si el valor url esta vacio")
	private Imagen image;
	
	@ToolUi.Note("Vinculo de la interaccion html a mostrar")
	@Required
	private String url;
	 
	@ToolUi.Note("Tiempo para consultar si hay que mostrar una nueva interaccion")
	@Required
	private Integer time = 20;
	
	private EstadoSonido habilitaSonido;

	public enum EstadoSonido{
		DESHABILITADO, HABILITADO
	}
	
	 public String getTitulo(){
		return this.title;
	 }

	 public String getTitle(){
		return this.title;
	 }

	 public String getUrl(){
		return this.url;
	 }
	 
	 public Integer getTime(){
		return time;
	 }

	 public Integer getHabilitaSonido(){
		if (habilitaSonido == EstadoSonido.HABILITADO) {
			return 1;
		}
		return 0;
	 }
	 
	 public void setTitulo(String title){
	 	 this.title = title;
	 }

	 public void setTitle(String title){
	 	 this.title = title;
	 }

	 public void setImage(Imagen image){
		this.image = image;
	 }

	 public void setUrl(String url){
		this.url = url;
	 }

	 public Imagen getImage(){
		return image;
	 }

}