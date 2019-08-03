package brightspot.tutorial.articulo;

import brightspot.tutorial.imagen.Imagen;

import com.psddev.cms.rte.RichTextViewBuilder;
import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewModel;
import com.psddev.dari.util.StorageItem;
import com.psddev.handlebars.HandlebarsTemplate;


@ViewInterface
@HandlebarsTemplate("/brightspot/tutorial/articulo/Articulo")
public class ArticuloViewModel extends ViewModel<Articulo>{

	public String getLaCabecera(){
		return model.getCabecera();
	}

	public String getImgCabeceraUrl(){
		Imagen imgCabecera = model.getImgCabecera();
		if (imgCabecera != null) {
			StorageItem file = imgCabecera.getFile();
			if (file != null) {
				return file.getPublicUrl();
			}
		}

		return null;
	}

	public CharSequence getCuerpo(){
		String body = model.getCuerpo();
		 
		if(body != null){
			return RichTextViewBuilder.buildHtml(body, (rte) -> null);
		}

		return null;
	}
}
