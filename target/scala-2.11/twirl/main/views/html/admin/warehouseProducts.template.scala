
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object warehouseProducts_Scope0 {
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

class warehouseProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.AdminController.products(0)),format.raw/*11.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.AdminController.products(c.getId)),format.raw/*16.71*/("""" class="list-group-item">"""),_display_(/*16.98*/c/*16.99*/.getName),format.raw/*16.107*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
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
          
          </tbody>
        </table>
        
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*51.27*/("""{"""),format.raw/*51.28*/("""
        """),format.raw/*52.9*/("""return confirm('Are you sure?');
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""
  """),format.raw/*54.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*57.2*/("""
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
object warehouseProducts extends warehouseProducts_Scope0.warehouseProducts
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 17:43:18 GMT 2017
                  SOURCE: /home/wdd/Desktop/Warehouse Login/app/views/admin/warehouseProducts.scala.html
                  HASH: c2c2e35a0c37995d048ad3aa89e8598d48214adf
                  MATRIX: 829->1|1016->93|1044->95|1104->128|1132->129|1178->148|1206->149|1234->150|1281->172|1293->177|1329->205|1368->207|1397->210|1663->449|1678->455|1727->483|1978->707|2014->727|2054->729|2103->750|2140->760|2155->766|2210->800|2264->827|2274->828|2304->836|2355->859|2403->880|2413->881|2453->900|2534->950|2575->963|2664->1025|2705->1057|2745->1059|2788->1074|2864->1123|2878->1128|2914->1143|2957->1158|3006->1176|3045->1187|3617->1731|3646->1732|3682->1741|3746->1778|3774->1779|3804->1782|3881->1829
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|82->51|82->51|83->52|84->53|84->53|85->54|88->57
                  -- GENERATED --
              */
          