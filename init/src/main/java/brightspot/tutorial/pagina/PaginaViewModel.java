package brightspot.tutorial.pagina;

import com.psddev.cms.db.Seo;
import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewModel;
import com.psddev.cms.view.PageEntryView;
import com.psddev.handlebars.HandlebarsTemplate;

import brightspot.tutorial.articulo.Articulo;
import brightspot.tutorial.articulo.ArticuloViewModel;

@ViewInterface
@HandlebarsTemplate("brightspot/tutorial/pagina/Pagina")
public class PaginaViewModel extends ViewModel<Articulo> implements PageEntryView{

	public String getTitulo(){
		return model.as(Seo.ObjectModification.class).findTitle();
	}
	 
	public String getOtraCosaComoCadena(){
		return " Esta es ptra cosa como cadena ";
	}

	public String getCuerpo(){
		return "86857865876575876";
	}
	 
	public ArticuloViewModel getElbody(){
		return createView(ArticuloViewModel.class, model);
	}

}