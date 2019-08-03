import com.psddev.cms.view.JsonView;
import com.psddev.cms.view.PageEntryView;
import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewModel;
import com.psddev.cms.db.Content;
import com.psddev.dari.db.Recordable;
import com.psddev.dari.util.StorageItem;
import java.util.*;

import brightspot.tutorial.quintojuez.Quintojuez; 
import brightspot.tutorial.elementoInteraccion.ElementoInteraccion; 
import brightspot.tutorial.imagen.Imagen; 

@JsonView
@ViewInterface
public class QuintojuezViewModel extends ViewModel<Quintojuez> implements PageEntryView {

	public List<Dictionary> getSetlist(){
		List<Dictionary> dRet = new ArrayList<Dictionary>();
		Dictionary lista = new Hashtable(); 
		ElementoInteraccion qj = model.getInteraccion();

		if(qj != null){ 
			String sTitle	 = qj.getTitle();
			String sImageUrl = getImgUrl();
			String sUrl		 = qj.getUrl();
			Integer sTime	 = qj.getTime(); 
			Integer iHabilita= qj.getHabilitaSonido();
			  
			if (sTitle == null) 
				sTitle = "";
			if (sImageUrl == null) 
				sImageUrl = "";
			if (sUrl == null) 
				sUrl = ""; 
		 
			lista.put("title", sTitle); 
			lista.put("image", sImageUrl); 
			lista.put("url",   sUrl); 
			lista.put("time",  sTime); 
			lista.put("habilitaSonido", iHabilita);
		 }
		 dRet.add(lista);
	
	return dRet;
	}  

	private String getImgUrl(){
		Imagen img = model.getInteraccion().getImage();
		if (img != null) {
			StorageItem file = img.getFile();
			if (file != null) {
				return file.getPublicUrl();
			}
		}

		return null;
	}
	 
}