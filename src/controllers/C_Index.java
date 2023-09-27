package controllers;

import etu2011.framework.annotations.ModelController;
import etu2011.framework.annotations.Scope;
import etu2011.framework.annotations.UrlMapping;
import etu2011.framework.enumerations.Scopes;
import etu2011.framework.renderer.ModelView;

@ModelController
@Scope(Scopes.PROTOTYPE)
public class C_Index {

    @UrlMapping(url="/")
    public ModelView getIndex()
    {
        return new ModelView("Test.jsp");
    }

}
