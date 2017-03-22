
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], addUserForm: Form[models.users.User], user: models.users.User,  categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.138*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user, categories)/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""

	"""),format.raw/*7.2*/("""<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						"""),_display_(/*13.8*/if(loginForm.hasGlobalErrors)/*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
            						"""),format.raw/*14.19*/("""<p class="alert alert-warning">
            					"""),_display_(/*15.19*/loginForm/*15.28*/.globalError.message),format.raw/*15.48*/("""
           				"""),format.raw/*16.16*/("""</p>
						""")))}),format.raw/*17.8*/("""
						"""),_display_(/*18.8*/if(flash.containsKey("error"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
						    """),format.raw/*19.11*/("""<div class="alert alert-warning">
						    """),_display_(/*20.12*/flash/*20.17*/.get("loginRequired")),format.raw/*20.38*/("""
						    """),format.raw/*21.11*/("""</div>
						""")))}),format.raw/*22.8*/("""
						

							"""),format.raw/*25.8*/("""<!-- The login form -->
							"""),_display_(/*26.9*/helper/*26.15*/.form(action = controllers.routes.LoginController.loginSubmit())/*26.79*/ {_display_(Seq[Any](format.raw/*26.81*/("""

								"""),format.raw/*28.9*/("""<div class="form-group">
								"""),_display_(/*29.10*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.113*/("""
								"""),format.raw/*30.9*/("""</div>
								<div class="form-group">
								"""),_display_(/*32.10*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.123*/("""
								"""),format.raw/*33.9*/("""</div>
							"""),format.raw/*34.18*/("""
								"""),format.raw/*35.54*/("""
								"""),format.raw/*36.30*/("""
							"""),format.raw/*37.19*/("""
							"""),format.raw/*38.88*/("""
							"""),format.raw/*39.8*/("""<div class="form-group"> <input type="submit" value="Sign In" class="btn btn-primary"> </div>
						""")))}),format.raw/*40.8*/("""
					
					"""),format.raw/*42.6*/("""</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User? Signup!</h2>

						"""),_display_(/*51.8*/if(flash.containsKey("success"))/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""
							"""),format.raw/*52.8*/("""<div class="alert alert-success">
							"""),_display_(/*53.9*/flash/*53.14*/.get("success")),format.raw/*53.29*/("""
							"""),format.raw/*54.8*/("""</div>
						""")))}),format.raw/*55.8*/("""
						"""),_display_(/*56.8*/if(flash.containsKey("fail"))/*56.37*/{_display_(Seq[Any](format.raw/*56.38*/("""
							"""),format.raw/*57.8*/("""<div class="alert alert-danger">
							"""),_display_(/*58.9*/flash/*58.14*/.get("fail")),format.raw/*58.26*/("""
							"""),format.raw/*59.8*/("""</div>
						""")))}),format.raw/*60.8*/("""
					"""),format.raw/*61.6*/("""</div>
					"""),_display_(/*62.7*/form(action = routes.HomeController.addUserSubmit, 'class -> "form-horizontal", 'role->"form")/*62.101*/ {_display_(Seq[Any](format.raw/*62.103*/("""

						"""),format.raw/*64.7*/("""<div class="form-row">
							<label>
							"""),_display_(/*66.9*/inputText(addUserForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*66.91*/("""
							"""),format.raw/*67.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*72.9*/inputText(addUserForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*72.91*/("""
							"""),format.raw/*73.8*/("""</label>
						</div>

						

						<div class="form-row">
							<label>
							"""),_display_(/*80.9*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*80.86*/("""
							"""),format.raw/*81.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*86.9*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*86.112*/("""
							"""),format.raw/*87.8*/("""</label>
						</div>


						<div class="actions">
							<input type="submit" value="Save" class="btn btn-primary">
							<a href=""""),_display_(/*93.18*/routes/*93.24*/.LoginController.login()),format.raw/*93.48*/("""">
							</a>
						</div>


					</div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->

""")))}),format.raw/*105.2*/("""
""")))}),format.raw/*106.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],addUserForm:Form[models.users.User],user:models.users.User,categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,addUserForm,user,categories)

  def f:((Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,addUserForm,user,categories) => apply(loginForm,addUserForm,user,categories)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 16:46:31 GMT 2017
                  SOURCE: /home/wdd/Desktop/project/update16marchProject/app/views/login.scala.html
                  HASH: 4c7129d52b2bd4e275f47999a5030185581c6f18
                  MATRIX: 827->1|1074->137|1101->155|1129->228|1156->230|1195->261|1234->263|1263->266|1501->478|1539->507|1579->509|1626->528|1703->578|1721->587|1762->607|1806->623|1848->635|1882->643|1921->673|1961->675|2000->686|2072->731|2086->736|2128->757|2167->768|2211->782|2254->798|2312->830|2327->836|2400->900|2440->902|2477->912|2538->946|2663->1049|2699->1058|2775->1107|2910->1220|2946->1229|2988->1253|3025->1307|3062->1337|3098->1356|3134->1444|3169->1452|3300->1553|3339->1565|3585->1785|3626->1817|3665->1818|3700->1826|3768->1868|3782->1873|3818->1888|3853->1896|3897->1910|3931->1918|3969->1947|4008->1948|4043->1956|4110->1997|4124->2002|4157->2014|4192->2022|4236->2036|4269->2042|4308->2055|4412->2149|4453->2151|4488->2159|4560->2205|4663->2287|4698->2295|4799->2370|4902->2452|4937->2460|5046->2543|5144->2620|5179->2628|5280->2703|5405->2806|5440->2814|5602->2949|5617->2955|5662->2979|5823->3109|5856->3111
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|55->25|56->26|56->26|56->26|56->26|58->28|59->29|59->29|60->30|62->32|62->32|63->33|64->34|65->35|66->36|67->37|68->38|69->39|70->40|72->42|81->51|81->51|81->51|82->52|83->53|83->53|83->53|84->54|85->55|86->56|86->56|86->56|87->57|88->58|88->58|88->58|89->59|90->60|91->61|92->62|92->62|92->62|94->64|96->66|96->66|97->67|102->72|102->72|103->73|110->80|110->80|111->81|116->86|116->86|117->87|123->93|123->93|123->93|135->105|136->106
                  -- GENERATED --
              */
          