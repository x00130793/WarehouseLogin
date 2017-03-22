
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

     object main_Scope1 {
import controllers.LoginController
import controllers.security

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,models.users.User,List[models.Category],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User, categories: List[models.Category])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.92*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*11.49*/routes/*11.55*/.Assets.versioned("stylesheets/animate.css")),format.raw/*11.99*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*12.49*/routes/*12.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.105*/(""""  rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*13.49*/routes/*13.55*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.108*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*14.49*/routes/*14.55*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*15.49*/routes/*15.55*/.Assets.versioned("stylesheets/price-range.css")),format.raw/*15.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/responsive.css")),format.raw/*16.102*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*19.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("javascripts/contact.js")),format.raw/*20.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*21.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*23.69*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*24.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*25.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*26.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*27.71*/("""" type="text/javascript"></script>
   <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link  sizes="144x144" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*29.109*/(""" """),format.raw/*29.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="114x114" href=""""),_display_(/*30.35*/routes/*30.41*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*30.109*/(""" """),format.raw/*30.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="72x72" href=""""),_display_(/*31.33*/routes/*31.39*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*31.106*/(""" """),format.raw/*31.107*/("""rel="apple-touch-icon-precomposed">
    <link  href=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*32.92*/(""" """),format.raw/*32.93*/("""rel="apple-touch-icon-precomposed">
   

   
   
   
   
   
    </head>
    <body>
        """),format.raw/*43.32*/("""

   
   """),format.raw/*46.4*/("""<header id="header"><!--header-->
      <div class="header_top"><!--header_top-->
         <div class="container">
            <div class="row">
               <div class="col-sm-6">
                  <div class="contactinfo">
                     <ul class="nav nav-pills">
                        <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                        <li><a href="#"><i class="fa fa-envelope"></i> info.com</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-6">
                  <div class="social-icons pull-right">
                     <ul class="nav navbar-nav">
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                     </ul>
                  </div>
               </div>
            </div>
         </div>
      </div><!--/header_top-->
      
      <div class="header-middle"><!--header-middle-->
         <div class="container">
            <div class="row">
               <div class="col-sm-4">
                  <div class="logo pull-left">
                     <a href="index.html"><img src="images/home/logo.png" alt="" /></a>
                  </div>
               </div>
               <div class="col-sm-8">
                  <div class="shop-menu pull-right">
                     <ul class="nav navbar-nav">
                        <!--<li><a href="#"><i class="fa fa-user"></i> Account</a></li>
                        <li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li>
                        <li><a href="checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                        <li><a href="cart.html"><i class="fa fa-shopping-cart"></i> Cart</a></li>--->
                        <li """),_display_(/*87.30*/if(title == "Login")/*87.50*/{_display_(Seq[Any](format.raw/*87.51*/("""class="active"""")))}),format.raw/*87.66*/(""">
                                    """),_display_(/*88.38*/if(user != null)/*88.54*/ {_display_(Seq[Any](format.raw/*88.56*/("""
                                        """),format.raw/*89.41*/("""<a href=""""),_display_(/*89.51*/controllers/*89.62*/.routes.LoginController.logout()),format.raw/*89.94*/("""">Logout """),_display_(/*89.104*/user/*89.108*/.getfName()),format.raw/*89.119*/("""</a>
                                    """)))}/*90.39*/else/*90.44*/{_display_(Seq[Any](format.raw/*90.45*/("""
                                        """),format.raw/*91.41*/("""<a href=""""),_display_(/*91.51*/controllers/*91.62*/.routes.LoginController.login()),format.raw/*91.93*/(""""><h5><b>SIGN IN or SIGN UP</b></h5></a>
                                    """)))}),format.raw/*92.38*/("""

                        """),format.raw/*94.25*/("""</li>
                     </ul>
                  </div>
               </div>
            </div>
         </div>
      </div><!--/header-middle-->
   
      <div class="header-bottom"><!--header-bottom-->
         <div class="container">
            <div class="row">
               <div class="col-sm-9">
                  <div class="navbar-header">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                     </button>
                  </div>
                  <div class="mainmenu pull-left">
                     <ul class="nav navbar-nav collapse navbar-collapse">
                        <li><a href=""""),_display_(/*116.39*/controllers/*116.50*/.routes.HomeController.index()),format.raw/*116.80*/("""" class="active">Home</a></li>
                        <li><a href="404.html">New in</a></li>
                        <li class="dropdown"><a href="#">Woman<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="shop.html">Product1</a></li>
                                    </ul>
                                </li> 
                        <li class="dropdown"><a href="#">Men<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="blog.html">Product1</a></li>
                                    </ul>
                                </li> 
                        <li><a href="">Kids</a></li>
                        <li><a href="">Accessories</a></li>
                     </ul>
                  </div>
               </div>

            </div>
         </div>
      </div><!--/header-bottom-->
   </header><!--/header-->
   

   
   <section>
      <div class="container">
         <div class="row">
            <div class="col-sm-3">
               <div class="left-sidebar">
                  <a href=""""),_display_(/*146.29*/routes/*146.35*/.HomeController.products(0)),format.raw/*146.62*/(""""></a><h2>Category</h2></a>
                  <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                     <div class="panel panel-default">
                        <div class="list-group">
                              <!-- A link to display all products -->


                              <!-- Start of For loop - For each c in categories add a list item -->
                              <!-- Also show the number of products in each category -->
                           <div class="panel panel-default">
                              <div class="panel-heading">
                                 <h4 class="panel-title">
                              """),_display_(/*158.32*/for(c <- categories) yield /*158.52*/ {_display_(Seq[Any](format.raw/*158.54*/("""
                                 """),format.raw/*159.34*/("""<a href=""""),_display_(/*159.44*/routes/*159.50*/.HomeController.products(c.getId)),format.raw/*159.83*/("""" class="list-group-item">"""),_display_(/*159.110*/c/*159.111*/.getName),format.raw/*159.119*/("""
                                 """),format.raw/*160.34*/("""</a>
                              """)))}),format.raw/*161.32*/("""
                                 """),format.raw/*162.34*/("""</h4>
                              </div>
                           </div>
                        </div>
                     </div>
                     
                     <!--<div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title">
                              <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                 <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                 Womens
                              </a>
                           </h4>
                        </div>
                        <div id="womens" class="panel-collapse collapse">
                           <div class="panel-body">
                              <ul>
                                 <li><a href="#">Fendi</a></li>
                                 <li><a href="#">Guess</a></li>
                                 <li><a href="#">Valentino</a></li>
                                 <li><a href="#">Dior</a></li>
                                 <li><a href="#">Versace</a></li>
                              </ul>
                           </div>
                        </div>
                     </div>
                     <div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title"><a href="#">Kids</a></h4>
                        </div>
                     </div>-->
                  </div><!--/category-products-->
               
                  
                  
                  <div class="price-range"><!--price-range-->
                     <h2>Price Range</h2>
                     <div class="well text-center">
                         <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                         <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                     </div>
                  </div><!--/price-range-->
                  
                  <div class="shipping text-center"><!--shipping-->
                     <img src="images/home/shipping.jpg" alt="" />
                  </div><!--/shipping-->
               
               </div>
            </div>
            
            <div class="col-sm-9 padding-right">
               
 
               """),_display_(/*216.17*/content),format.raw/*216.24*/("""
     
            
            """),format.raw/*219.13*/("""</div>
         </div>
      </div>
   </section>
   
   <footer id="footer"><!--Footer-->
      <div class="footer-top">
         <div class="container">
            <div class="row">
               <div class="col-sm-2">
                  <div class="companyinfo">
                     <h2><span>A</span>&<span>Js</span></h2>
                     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>
                  </div>
               </div>
               <div class="col-sm-7">
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe1.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe2.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe3.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe4.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
               </div>
               <div class="col-sm-3">
                  <div class="address">
                     <img src="images/home/map.png" alt="" />
                     <p>Dublin, Ireland</p>
                  </div>
               </div>
            </div>
         </div>
      </div>
      
      <div class="footer-widget">
         <div class="container">
            <div class="row">
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Service</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Online Help</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">Order Status</a></li>
                        <li><a href="#">Change Location</a></li>
                        <li><a href="#">FAQ’s</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Quock Shop</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">T-Shirt</a></li>
                        <li><a href="#">Mens</a></li>
                        <li><a href="#">Womens</a></li>
                        <li><a href="#">Gift Cards</a></li>
                        <li><a href="#">Shoes</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Policies</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Terms of Use</a></li>
                        <li><a href="#">Privecy Policy</a></li>
                        <li><a href="#">Refund Policy</a></li>
                        <li><a href="#">Billing System</a></li>
                        <li><a href="#">Ticket System</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>About Shopper</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Company Information</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Store Location</a></li>
                        <li><a href="#">Affillate Program</a></li>
                        <li><a href="#">Copyright</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-3 col-sm-offset-1">
                  <div class="single-widget">
                     <h2>About Shopper</h2>
                     <form action="#" class="searchform">
                        <input type="text" placeholder="Your email address" />
                        <button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
                        <p>Get the most recent updates from <br />our site and be updated your self...</p>
                     </form>
                  </div>
               </div>
               
            </div>
         </div>
      </div>
      
      <div class="footer-bottom">
         <div class="container">
            <div class="row">
               <p class="pull-left">Copyright © 2017 The lads.</p>
               <p class="pull-right">Designed by <span><a target="_blank" href="http://www.it-tallaght.ie/">ITT Students</a></span></p>
            </div>
         </div>
      </div>
      
   </footer><!--/Footer-->
   

  
        
   
   
        
        

   <script src=""""),_display_(/*390.18*/routes/*390.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*390.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*391.18*/routes/*391.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*391.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*392.18*/routes/*392.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*392.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*393.18*/routes/*393.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*393.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*394.18*/routes/*394.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*394.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*395.18*/routes/*395.24*/.Assets.versioned("javascripts/main.js")),format.raw/*395.64*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,categories:List[models.Category],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,categories)(content)

  def f:((String,models.users.User,List[models.Category]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,categories) => (content) => apply(title,user,categories)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 16:09:08 GMT 2017
                  SOURCE: /home/wdd/Desktop/project/update16marchProject/app/views/main.scala.html
                  HASH: 95a76c83501df4eb4550012f2c12a7f9121fba1d
                  MATRIX: 878->66|1063->156|1091->158|1170->263|1205->272|1239->280|1264->285|1353->347|1368->353|1431->394|1526->462|1541->468|1606->512|1701->580|1716->586|1788->636|1884->705|1899->711|1974->764|2069->832|2084->838|2154->886|2249->954|2264->960|2334->1008|2429->1076|2444->1082|2513->1129|2618->1207|2633->1213|2694->1252|2746->1277|2761->1283|2823->1324|2902->1376|2917->1382|2987->1431|3066->1483|3081->1489|3145->1532|3224->1584|3239->1590|3301->1631|3380->1683|3395->1689|3457->1730|3536->1782|3551->1788|3617->1833|3696->1885|3711->1891|3774->1933|3853->1985|3868->1991|3943->2045|4022->2097|4037->2103|4113->2158|4192->2210|4207->2216|4275->2263|4431->2392|4446->2398|4536->2466|4566->2467|4663->2537|4678->2543|4768->2611|4798->2612|4893->2680|4908->2686|4997->2753|5027->2754|5108->2808|5123->2814|5211->2881|5240->2882|5360->3064|5396->3073|7450->5100|7479->5120|7518->5121|7564->5136|7630->5175|7655->5191|7695->5193|7764->5234|7801->5244|7821->5255|7874->5287|7912->5297|7926->5301|7959->5312|8020->5355|8033->5360|8072->5361|8141->5402|8178->5412|8198->5423|8250->5454|8359->5532|8413->5558|9370->6487|9391->6498|9443->6528|10695->7752|10711->7758|10760->7785|11491->8488|11528->8508|11569->8510|11632->8544|11670->8554|11686->8560|11741->8593|11797->8620|11809->8621|11840->8629|11903->8663|11971->8699|12034->8733|14521->11192|14550->11199|14611->11231|21484->18076|21500->18082|21564->18124|21644->18176|21660->18182|21731->18231|21811->18283|21827->18289|21904->18344|21984->18396|22000->18402|22069->18449|22149->18501|22165->18507|22241->18561|22321->18613|22337->18619|22399->18659
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|62->29|62->29|62->29|62->29|63->30|63->30|63->30|63->30|64->31|64->31|64->31|64->31|65->32|65->32|65->32|65->32|75->43|78->46|119->87|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|121->89|121->89|121->89|121->89|122->90|122->90|122->90|123->91|123->91|123->91|123->91|124->92|126->94|148->116|148->116|148->116|178->146|178->146|178->146|190->158|190->158|190->158|191->159|191->159|191->159|191->159|191->159|191->159|191->159|192->160|193->161|194->162|248->216|248->216|251->219|422->390|422->390|422->390|423->391|423->391|423->391|424->392|424->392|424->392|425->393|425->393|425->393|426->394|426->394|426->394|427->395|427->395|427->395
                  -- GENERATED --
              */
          