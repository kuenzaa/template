
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.32*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<!-- welcome my new page scala play angular page..we are rolling,,rocking putain de fois je suis fort en Scala,Play-fa angularjs
  MErde je suis ,fort en Scala ,un Guru, the becoming Of Full Stack Developer<>>> Quelle Soiree,..-->
<html ng-app="myapp">
<html>

<title>play-angual-scala-welcom</title>

<link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.versioned("images/favicon.png")),format.raw/*13.96*/("""">
<link rel='stylesheet' href='"""),_display_(/*14.31*/routes/*14.37*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.css"))),format.raw/*14.95*/("""'>
<link rel='stylesheet' href='"""),_display_(/*15.31*/routes/*15.37*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*15.99*/("""'>
<link rel="stylesheet" media="screen" href=""""),_display_(/*16.46*/routes/*16.52*/.WebJarAssets.at("lib/font-awesome/css/font-awesome.min.css")),format.raw/*16.113*/("""">
<script type='text/javascript' src='"""),_display_(/*17.38*/routes/*17.44*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*17.98*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*18.38*/routes/*18.44*/.WebJarAssets.at(WebJarAssets.locate("angular.min.js"))),format.raw/*18.99*/("""'></script>

<script src='"""),_display_(/*20.15*/routes/*20.21*/.Assets.versioned("lib/angularjs/angular.js")),format.raw/*20.66*/("""' type="text/javascript"></script>

<link rel='stylesheet' href=""""),_display_(/*22.31*/routes/*22.37*/.Assets.versioned("stylesheets/main.css")),format.raw/*22.78*/("""">

<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.versioned("javascripts/main.js")),format.raw/*24.61*/("""" type="text/javascript"></script>


  </head>


   <body style="" data-twttr-rendered="true">
    <a class="sr-only" href="#content">Skip navigation</a>

    <!-- Docs master nav -->


    <div class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!--<a class="navbar-brand" href="#">Project name</a> a effacer--project or logo deleteed-->
            </div>
            <div class="navbar-collapse collapse" style="height: 1px;">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">Business</a></li>
                    <li><a href="#contact">Personnal</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li class="divider"></li>
                            <li class="dropdown-header">Nav header</li>
                            <li><a href="#">Separated link</a></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="../navbar/">Default</a></li>
                    <li><a href="../navbar-static-top/">For Pros</a></li>


                    <li><a href="/user/signup" class="btn btn-default">Sign In</a></li>




                    <li><a href="/users/sign_up" class="btn btn-primary">LIST YOUR JOB</a></li>



                </ul>



            </div><!--/.nav-collapse -->
        </div>
    </div>






    <!--here comes la bar de researche qui quide les dutilsateure and  end users----->



    <div class="bs-header" id="content">
        <div class="container">



            <div class="row">
                <div class="col-md-3">
                    <!-- Logo -->
                    <div class="logo">
                        <h1><a href="index.html">Olson Admin</a></h1>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="row">
                        <div class="col-lg-10">
                            <div class="input-group form">
                                <input type="text" class="form-control" placeholder="Something...">
                           <span class="input-group-btn">
                             <button class="btn btn-info" type="button">Search</button>
                           </span>
                            </div>
                        </div>
                    </div>
                </div>

            </div>



        </div>
    </div>












    <!-- Docs page layout -->


    <!-- Callout for the old docs link -->



    <div class=".container bs-docs-container">
        <div class="row">
            <div class="col-md-2">
                <div class="bs-sidebar hidden-print affix-top" role="complementary" style="">
                    <ul class="nav bs-sidenav">

                        <li class=""><a href="#Gategories">Gategories</a>



                        </li><li class=""><a href="#Accounting">Accounting</a></li>
                        <li class=""><a href="#Art-Design">Art-Design</a></li>
                        <li class=""><a href="#Bioengineering">Bioengineering</a></li>
                        <li class=""><a href="#Admin">Admin</a></li>
                        <li class=""><a href="#Architec">Architec</a>
                        </li><li class=""><a href="#Engineering">Engineering</a></li>
                        <li class=""><a href="#Business">Business</a></li>
                        <li class=""><a href="#Finanance">Finanance</a></li>
                        <li class=""><a href="#Managment">Managment</a></li>
                        <li class=""><a href="#Office">Office</a></li>
                        <li class=""><a href="#Managment">Managment</a></li>
                        <li class=""><a href="#Goverment">Goverment</a></li>
                        <li class=""><a href="#Sales-Service">Sales-Service</a></li>
                        <li class=""><a href="#Legal-Parleg">Legal-Parleg</a></li>
                        <li class=""><a href="#Customer-Service">Customer-Service</a></li>
                        <li class=""><a href="#Medical">Medical</a></li>
                        <li class=""><a href="#Healtcare-services">Healtcare-services</a></li>
                        <li class=""><a href="#Marketing">Marketing</a></li>
                        <li class=""><a href="#Computer-Enginee">Computer-Enginee</a></li>
                        <li class=""><a href="#Web-desinger">Web-desinger</a></li>
                        <li class=""><a href="#Human-Ressources">Human-Ressources</a></li>
                        <li class=""><a href="#Real Estate">Real Estate</a></li>
                        <li class=""><a href="#Manufacturing">Manufacturing</a></li>
                        <li class=""><a href="#Retails-Sales">Retails-Sales</a></li>
                        <li class=""><a href="#General-labor">General-labor</a></li>
                        <li class=""><a href="#Contractors">Contractors</a></li>
                        <li class=""><a href="#Salon-Spa">Salon-Spa</a></li>
                        <li class=""><a href="#Fitness-Person-Train">Fitness-Person-Train</a></li>
                        <li class=""><a href="#Food-Hospitality">Food-Hospitality</a></li>
                        <li class=""><a href="#Restaurant-services">Restaurant-services</a></li>
                        <li class=""><a href="#Hotel-Accomo">Hotel-Accomo</a></li>
                        <li class=""><a href="#Travel-Flight-vaccat">Travel-Flight-vaccat</a></li>
                        <li class=""><a href="#Education">Education</a></li>
                        <li class=""><a href="#Non-forprofit">Non-forprofit</a></li>
                        <li class=""><a href="#Security-Person-Pro">Security-Person-Pro</a></li>
                        <li class=""><a href="#Daily-Deals">Daily-Deals</a></li>






                    </ul>
                </div>
            </div>








            <div class="col-md-10" role="main">
                <!-- Glyphicons
      ====================================== -->
                <div class="jumbotron">
                    <div class="container">
                        <h1>Merde, je suis trop fort!</h1>
                        <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
                        <p><a class="btn btn-primary btn-lg" role="button">Learn more �</a></p>
                    </div>
                </div>



                <!-- Jumbotron
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="jumbotron">Jumbotron</h1>
                    </div>
                    <p>A lightweight, flexible component that can optional extend the entire viewport to showcase key content on your site. To make the jumbotron full width, don't include it within a <code>.container</code>. Placing it within a container will keep it at the width of the rest of your content and provide rounded corners.</p>
                    <div class="bs-example">
                        <div class="jumbotron">
                            <div class="container">
                                <h1>Hello, world!</h1>
                                <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
                                <p><a class="btn btn-primary btn-lg">Learn more</a></p>

                                """),_display_(/*236.34*/content),format.raw/*236.41*/("""

                            """),format.raw/*238.29*/("""</div>
                        </div>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"jumbotron"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"container"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;h1&gt;</span>Hello, world!<span class="nt">&lt;/h1&gt;</span>
                        <span class="nt">&lt;p&gt;</span>...<span class="nt">&lt;/p&gt;</span>
                        <span class="nt">&lt;p&gt;&lt;a</span> <span class="na">class=</span><span class="s">"btn btn-primary btn-lg"</span><span class="nt">&gt;</span>Learn more<span class="nt">&lt;/a&gt;&lt;/p&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>
                </div>



                <!-- Page header
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="page-header">Page header</h1>
                    </div>
                    <p>A simple shell for an <code>h1</code> to appropriately space out and segment sections of content on a page. It can utilize the <code>h1</code>'s default <code>small</code> element, as well as most other components (with additional styles).</p>
                    <div class="bs-example">
                        <div class="page-header">
                            <h1>Example page header <small>Subtext for header</small></h1>
                        </div>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"page-header"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;h1&gt;</span>Example page header <span class="nt">&lt;small&gt;</span>Subtext for header<span class="nt">&lt;/small&gt;&lt;/h1&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>
                </div>



                <!-- Thumbnails
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="thumbnails">Thumbnails</h1>
                    </div>
                    <p class="lead">Extend Bootstrap's <a href="../css/#grid">grid system</a> with the thumbnail component to easily display grids of images, videos, text, and more.</p>

                    <h3 id="thumbnails-default">Default example</h3>
                    <p>By default, Bootstrap's thumbnails are designed to showcase linked images with minimal required markup.</p>
                    <div class="bs-example">
                        <div class="row">
                            <div class="col-sm-6 col-md-3">
                                <a href="#" class="thumbnail">
                                    <img data-src="holder.js/100%x180" alt="100%x180" src="data:image/png;base64,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" style="height: 180px; width: 100%; display: block;">
                                </a>
                            </div>
                            <div class="col-sm-6 col-md-3">
                                <a href="#" class="thumbnail">
                                    <img data-src="holder.js/100%x180" alt="100%x180" src="data:image/png;base64,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" style="height: 180px; width: 100%; display: block;">
                                </a>
                            </div>
                            <div class="col-sm-6 col-md-3">
                                <a href="#" class="thumbnail">
                                    <img data-src="holder.js/100%x180" alt="100%x180" src="data:image/png;base64,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" style="height: 180px; width: 100%; display: block;">
                                </a>
                            </div>
                            <div class="col-sm-6 col-md-3">
                                <a href="#" class="thumbnail">
                                    <img data-src="holder.js/100%x180" alt="100%x180" src="data:image/png;base64,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" style="height: 180px; width: 100%; display: block;">
                                </a>
                            </div>
                        </div>
                    </div><!-- /.bs-example -->
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"row"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"col-sm-6 col-md-3"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;a</span> <span class="na">href=</span><span class="s">"#"</span> <span class="na">class=</span><span class="s">"thumbnail"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;img</span> <span class="na">data-src=</span><span class="s">"holder.js/100%x180"</span> <span class="na">alt=</span><span class="s">"..."</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;/a&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                        ...
                        <span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>

                    <h3 id="thumbnails-custom-content">Custom content</h3>
                    <p>With a bit of extra markup, it's possible to add any kind of HTML content like headings, paragraphs, or buttons into thumbnails.</p>
                    <div class="bs-example">
                        <div class="row">
                            <div class="col-sm-6 col-md-3">
                                <div class="thumbnail">
                                    <img data-src="holder.js/300x200" alt="300x200" src="data:image/png;base64,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"""),
format.raw("""joLDKRG1RAvkCCis/QxsQKCOgsMpEbVEC+QIKKz9DGxAoI6CwykRtUQL5AgorP0MbECgjoLDKRG1RAvkCCis/QxsQKCOgsMpEbVEC+QIKKz9DGxAoI6CwykRtUQL5AgorP0MbECgjoLDKRG1RAvkCCis/QxsQKCOgsMpEbVEC+QL/Ag1TKDpTl19vAAAAAElFTkSuQmCC" style="width: 300px; height: 200px;">
                                    <div class="caption">
                                        <h3>Thumbnail label</h3>
                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a href="#" class="btn btn-primary">Apply</a> <a href="#" class="btn btn-default">Button</a></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-3">
                                <div class="thumbnail">
                                    <img data-src="holder.js/300x200" alt="300x200" src="data:image/png;base64,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" style="width: 300px; height: 200px;">
                                    <div class="caption">
                                        <h3>Thumbnail label</h3>
                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a href="#" class="btn btn-primary">Apply</a> <a href="#" class="btn btn-default">Button</a></p>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-6 col-md-3">
                                <div class="thumbnail">
                                    <img data-src="holder.js/300x200" alt="300x200" src="data:image/png;base64,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" style="width: 300px; height: 200px;">
                                    <div class="caption">
                                        <h3>Thumbnail label</h3>
                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a href="#" class="btn btn-primary btn-lg" role="button">Apply �</a> <a href="#" class="btn btn-default">Button</a></p>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-6 col-md-3">
                                <div class="thumbnail">
                                    <img data-src="holder.js/300x200" alt="300x200" src="data:image/png;base64,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" style="width: 300px; height: 200px;">
                                    <div class="caption">
                                        <h3>Thumbnail label</h3>
                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a href="#" class="btn btn-primary btn-lg" role="button">Apply here �</a> <a href="#" class="btn btn-default">Button</a></p>
                                    </div>
                                </div>
                            </div>




                        </div>
                    </div><!-- /.bs-example -->
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"row"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"col-sm-6 col-md-3"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"thumbnail"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;img</span> <span class="na">data-src=</span><span class="s">"holder.js/300x200"</span> <span class="na">alt=</span><span class="s">"..."</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"caption"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;h3&gt;</span>Thumbnail label<span class="nt">&lt;/h3&gt;</span>
                        <span class="nt">&lt;p&gt;</span>...<span class="nt">&lt;/p&gt;</span>
                        <span class="nt">&lt;p&gt;&lt;a</span> <span class="na">href=</span><span class="s">"#"</span> <span class="na">class=</span><span class="s">"btn btn-primary"</span><span class="nt">&gt;</span>Button<span class="nt">&lt;/a&gt;</span> <span class="nt">&lt;a</span> <span class="na">href=</span><span class="s">"#"</span> <span class="na">class=</span><span class="s">"btn btn-default"</span><span class="nt">&gt;</span>Button<span class="nt">&lt;/a&gt;&lt;/p&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                        <span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>
                </div>




                <!-- Alerts
                ================================================== -->





                <!-- Progress bars
                ================================================== -->


                <!-- Media object
                ================================================== -->




                <!-- List group
                ================================================== -->





                <!-- Panels
                ================================================== -->






                <!-- Wells
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="wells">Wells</h1>
                    </div>

                    <h3>Default well</h3>
                    <p>Use the well as a simple effect on an element to give it an inset effect.</p>
                    <div class="bs-example">
                        <div class="well">
                            Look, I'm in a well!
                        </div>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"well"</span><span class="nt">&gt;</span>...<span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>
                    <h3>Optional classes</h3>
                    <p>Control padding and rounded corners with two optional modifier classes.</p>
                    <div class="bs-example">
                        <div class="well well-lg">
                            Look, I'm in a large well!
                        </div>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"well well-lg"</span><span class="nt">&gt;</span>...<span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>

                    <div class="bs-example">
                        <div class="well well-sm">
                            Look, I'm in a small well!
                        </div>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"well well-sm"</span><span class="nt">&gt;</span>...<span class="nt">&lt;/div&gt;</span>
                    </code></pre></div>
                </div>

            </div>



        </div>

    </div>

    <!-- Footer
    ================================================== -->
    <footer class="bs-docs-footer" role="contentinfo">
  <div class="container">
    <div class="bs-docs-social">
  <ul class="bs-docs-social-buttons">
    <li>
      <iframe class="github-btn" src="https://ghbtns.com/github-btn.html?user=twbs&amp;repo=bootstrap&amp;type=watch&amp;count=true" width="100" height="20" title="Star on GitHub"></iframe>
    </li>
    <li>
      <iframe class="github-btn" src="https://ghbtns.com/github-btn.html?user=twbs&amp;repo=bootstrap&amp;type=fork&amp;count=true" width="102" height="20" title="Fork on GitHub"></iframe>
    </li>
    <li class="follow-btn">
      <iframe id="twitter-widget-0" scrolling="no" frameborder="0" allowtransparency="true" class="twitter-follow-button twitter-follow-button-rendered" title="Twitter Follow Button" src="http://platform.twitter.com/widgets/follow_button.3476cd70032ff6b94ecc9ea63ab78a8b.en.html#_=1442074935423&amp;dnt=false&amp;id=twitter-widget-0&amp;lang=en&amp;screen_name=getbootstrap&amp;show_count=true&amp;show_screen_name=true&amp;size=m" style="position: static; visibility: visible; width: 224px; height: 19px;" data-screen-name="getbootstrap"></iframe>
    </li>
    <li class="tweet-btn">
      <iframe id="twitter-widget-1" scrolling="no" frameborder="0" allowtransparency="true" class="twitter-share-button twitter-share-button-rendered twitter-tweet-button" title="Twitter Tweet Button" src="http://platform.twitter.com/widgets/tweet_button.8d007ddfc184e6776be76fe9e5e52d69.en.html#_=1442074935425&amp;count=horizontal&amp;dnt=false&amp;id=twitter-widget-1&amp;lang=en&amp;original_referer=http%3A%2F%2Fgetbootstrap.com%2Fgetting-started%2F%23examples&amp;related=mdo%3ACreator%20of%20Bootstrap&amp;size=m&amp;text=Getting%20started%20%C2%B7%20Bootstrap&amp;type=share&amp;url=http%3A%2F%2Fgetbootstrap.com%2F&amp;via=getbootstrap" style="position: static; visibility: visible; width: 94px; height: 19px;" data-url="http://getbootstrap.com/"></iframe>
    </li>
  </ul>
</div>



    <p>Maintained by the <a href="https://github.com/orgs/twbs/people">core team</a> with the help of <a href="https://github.com/twbs/bootstrap/graphs/contributors">our contributors</a>.</p>
    <p>Code licensed under <a rel="license" href="https://github.com/twbs/bootstrap/blob/master/LICENSE" target="_blank">MIT</a>, documentation under <a rel="license" href="https://creativecommons.org/licenses/by/3.0/" target="_blank">CC BY 3.0</a>.</p>
    <ul class="bs-docs-footer-links text-muted">
      <li>Currently v3.3.5</li>
      <li>·</li>
      <li><a href="https:/"""),
format.raw("""/github.com/twbs/bootstrap">GitHub</a></li>
      <li>·</li>
      <li><a href="../getting-started/#examples">Examples</a></li>
      <li>·</li>
      <li><a href="../2.3.2/">v2.3.2 docs</a></li>
      <li>·</li>
      <li><a href="../about/">About</a></li>
      <li>·</li>
      <li><a href="http://expo.getbootstrap.com">Expo</a></li>
      <li>·</li>
      <li><a href="http://blog.getbootstrap.com">Blog</a></li>
      <li>·</li>
      <li><a href="https://github.com/twbs/bootstrap/issues">Issues</a></li>
      <li>·</li>
      <li><a href="https://github.com/twbs/bootstrap/releases">Releases</a></li>
    </ul>
  </div>
</footer>

    <!-- JS and analytics only. -->
    <!-- Bootstrap core JavaScript
================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->

      <script src=""""),_display_(/*514.21*/routes/*514.27*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*514.81*/(""""></script>
<script src=""""),_display_(/*515.15*/routes/*515.21*/.WebJarAssets.at(WebJarAssets.locate("js/bootstrap.min.js"))),format.raw/*515.81*/(""""></script>

    <!-- Enable tooltips. Used primarily to validate that JQuery + Bootstrap JS are loaded. Remove this script if you don't want tooltips. -->
    <script type="text/javascript">
    jQuery(function ($) """),format.raw/*519.25*/("""{"""),format.raw/*519.26*/("""
        """),format.raw/*520.9*/("""$("[rel='tooltip']").tooltip()
    """),format.raw/*521.5*/("""}"""),format.raw/*521.6*/(""");
    </script>





</body>

</html>




















"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Sep 16 11:31:50 CDT 2015
                  SOURCE: /home/ikebrown/kuenzaa/task/app/views/main.scala.html
                  HASH: 0fecadc064c664803adf26f34b43801fddb7405c
                  MATRIX: 530->3|655->33|683->35|1078->403|1093->409|1153->448|1213->481|1228->487|1307->545|1367->578|1382->584|1465->646|1540->694|1555->700|1638->761|1705->801|1720->807|1795->861|1871->910|1886->916|1962->971|2016->998|2031->1004|2097->1049|2190->1115|2205->1121|2267->1162|2312->1180|2327->1186|2388->1226|11046->9856|11075->9863|11134->9893|52061->50752|52077->50758|52153->50812|52207->50838|52223->50844|52305->50904|52550->51120|52580->51121|52617->51130|52680->51165|52709->51166
                  LINES: 20->3|25->3|27->5|35->13|35->13|35->13|36->14|36->14|36->14|37->15|37->15|37->15|38->16|38->16|38->16|39->17|39->17|39->17|40->18|40->18|40->18|42->20|42->20|42->20|44->22|44->22|44->22|46->24|46->24|46->24|258->236|258->236|260->238|538->514|538->514|538->514|539->515|539->515|539->515|543->519|543->519|544->520|545->521|545->521
                  -- GENERATED --
              */
          