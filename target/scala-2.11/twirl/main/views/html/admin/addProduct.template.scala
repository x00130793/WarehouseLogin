
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.75*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
		
		"""),format.raw/*14.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*16.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*16.81*/("""
		"""),_display_(/*17.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*17.95*/("""

		"""),_display_(/*19.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*25.4*/("""
		"""),_display_(/*26.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*26.83*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*27.83*/("""

		"""),format.raw/*29.3*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*30.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.71*/("""

	"""),format.raw/*32.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*35.14*/routes/*35.20*/.AdminController.products()),format.raw/*35.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*38.3*/(""" """),format.raw/*38.4*/("""<!-- End Form definition -->

""")))}),format.raw/*40.2*/(""" """),format.raw/*40.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((play.data.Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 16:09:08 GMT 2017
                  SOURCE: /home/wdd/Desktop/project/update16marchProject/app/views/admin/addProduct.scala.html
                  HASH: 9e3e197203b1a1a3f5efbc99ad1ad6393964cae8
                  MATRIX: 852->109|1020->182|1050->285|1078->288|1090->293|1129->324|1168->326|1196->328|1317->423|1427->523|1468->525|1501->531|1622->626|1720->703|1750->707|1862->798|1893->803|2114->1004|2144->1008|2244->1087|2274->1091|2374->1170|2405->1174|2490->1233|2578->1300|2608->1303|2766->1434|2781->1440|2829->1467|2930->1538|2958->1539|3019->1570|3047->1571
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|43->12|43->12|43->12|45->14|47->16|47->16|48->17|48->17|50->19|56->25|57->26|57->26|58->27|58->27|60->29|61->30|61->30|63->32|66->35|66->35|66->35|69->38|69->38|71->40|71->40
                  -- GENERATED --
              */
          