
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user, categories)/*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
       <div class="col-sm-12">

          """),_display_(/*9.12*/if(flash.containsKey("success"))/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
              """),format.raw/*10.15*/("""<div class="alert alert-success">
              """),_display_(/*11.16*/flash/*11.21*/.get("success")),format.raw/*11.36*/("""
              """),format.raw/*12.15*/("""</div>
          """)))}),format.raw/*13.12*/("""
          """),format.raw/*14.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*29.12*/for(p <- products) yield /*29.30*/ {_display_(Seq[Any](format.raw/*29.32*/("""
              """),format.raw/*30.15*/("""<tr>
                  <td>"""),_display_(/*31.24*/p/*31.25*/.getId),format.raw/*31.31*/("""</td>
                  <td>"""),_display_(/*32.24*/p/*32.25*/.getName),format.raw/*32.33*/("""</td>
                  <td>"""),_display_(/*33.24*/p/*33.25*/.getCategory.getName),format.raw/*33.45*/("""</td>
                  <td>"""),_display_(/*34.24*/p/*34.25*/.getDescription),format.raw/*34.40*/("""</td>
                  <td>"""),_display_(/*35.24*/p/*35.25*/.getStock),format.raw/*35.34*/("""</td>
                  <td>&euro; """),_display_(/*36.31*/("%.2f".format(p.getPrice))),format.raw/*36.58*/("""</td>
              </tr>
					""")))}),format.raw/*38.7*/(""" """),format.raw/*38.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 16:09:08 GMT 2017
                  SOURCE: /home/wdd/Desktop/project/update16marchProject/app/views/products.scala.html
                  HASH: 3e5fda78be88c180deef3c4cc658ba7c7e447789
                  MATRIX: 805->1|992->93|1022->97|1082->130|1110->131|1156->150|1184->151|1212->152|1260->175|1302->209|1341->211|1371->215|1505->323|1545->355|1584->357|1628->373|1705->423|1719->428|1755->443|1799->459|1849->478|1889->490|2396->970|2430->988|2470->990|2514->1006|2570->1035|2580->1036|2607->1042|2664->1072|2674->1073|2703->1081|2760->1111|2770->1112|2811->1132|2868->1162|2878->1163|2914->1178|2971->1208|2981->1209|3011->1218|3075->1255|3123->1282|3187->1316|3215->1317|3370->1442
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|69->38|69->38|75->44
                  -- GENERATED --
              */
          