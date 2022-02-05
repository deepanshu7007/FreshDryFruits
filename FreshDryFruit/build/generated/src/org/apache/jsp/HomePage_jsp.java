package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.shop.entities.User;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/NavBar.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" >\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css\">\r\n");
      out.write("        <title>world!</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-black\">\r\n");
      out.write("            <div class=\"container-fluid \">\r\n");
      out.write("                <span><img src=\"https://img.icons8.com/small/16/ffffff/bull.png\" /></span>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"HomePage.jsp\">Dry Fruits</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                        data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("                        aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav   \">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"HomePage.jsp\"><i class=\"bi bi-house\"></i>Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\"><i class=\"bi bi-collection\"></i>Menu</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\"><i class=\"bi bi-cart3\"></i> Shop</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ContactPage.jsp\"><i class=\"bi bi-person-lines-fill\"></i> Contact-Us</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                            User u = (User) session.getAttribute("currentUser");
                            if (u != null) {
                        
      out.write("\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ProfilePage.jsp\"><i class=\"bi bi-person\"></i> ");
      out.print(u.getName());
      out.write("</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ProfilePage.jsp\"><i class=\"bi bi-box-arrow-left \"></i> Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                        } else {
                        
      out.write("\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"LoginPage.jsp\"><i class=\"bi bi-person\"></i> Log-in</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item justify-content-lg-end\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"nav-link bi bi-person-plus\" href=\"SubmitForm.jsp\"><i class=\"bi bi-person-plus\"></i> Sign-up</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"p-5 mb-4 bg-light text-light bg-black\" style=\"clip-path: polygon(20% 0%, 80% 0%, 100% 0, 100% 80%, 68% 98%, 17% 78%, 0 88%, 0 0);\">\n");
      out.write("    <div class=\"container-fluid py-5\">\n");
      out.write("      <h1 class=\"display-5 fw-bold\" style=\"font-family: 'Dancing Script', cursive;\">Fry Dry Fruit</h1>\n");
      out.write("      <p class=\"col-md-8 fs-4\">Using a series of utilities, you can create this jumbotron, just like the one in previous\n");
      out.write("        versions of Bootstrap. Check out the examples below for how you can remix and restyle it to your liking.</p>\n");
      out.write("      <button class=\"btn btn-primary btn-lg\" type=\"button\">Login</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"carouselExampleIndicators\" class=\"carousel slide container\" data-ride=\"carousel\">\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("      <div class=\"carousel-indicators\">\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\"\n");
      out.write("          aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\"\n");
      out.write("          aria-label=\"Slide 2\"></button>\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\"\n");
      out.write("          aria-label=\"Slide 3\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-inner\" style=\"height: 50%\n");
      out.write("      ;\">\n");
      out.write("        <div class=\"carousel-item active\">\n");
      out.write("          <div class=\"card pb-5\" >\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              Our Specialities\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body align-items-center\">\n");
      out.write("              <img src=\"https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg\"\n");
      out.write("                class=\"rounded float-start w-25 h-25\" alt=\"...\">\n");
      out.write("              <div class=\"card w-50 ps-xl-5 border-0\" style=\"width: 18rem;\">\n");
      out.write("                <div class=\"card-body pl-lg-5 \">\n");
      out.write("                  <h5 class=\"card-title\">Gulab Jamun</h5>\n");
      out.write("                  <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.\n");
      out.write("                    and with love and care we distribute it to you we Hope you will like it\n");
      out.write("                  </p>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              Our Speciality\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body align-items-center\">\n");
      out.write("              <img src=\"https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg\"\n");
      out.write("                class=\"rounded float-start w-25 h-25\" alt=\"...\">\n");
      out.write("              <div class=\"card w-50\" style=\"width: 18rem;\">\n");
      out.write("                <div class=\"card-body pl-lg-5 \">\n");
      out.write("                  <h5 class=\"card-title\">Gulab Jamun</h5>\n");
      out.write("                  <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.\n");
      out.write("                    and with love and care we distribute it to you we Hope you will like it\n");
      out.write("                  </p>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"carousel-item \">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              Our Specialities\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body align-items-center\">\n");
      out.write("              <img src=\"https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg\"\n");
      out.write("                class=\"rounded-3 float-start w-25 h-25\" alt=\"...\">\n");
      out.write("              <div class=\"card w-50\" style=\"width: 18rem;\">\n");
      out.write("                <div class=\"card-body pl-lg-5 \">\n");
      out.write("                  <h5 class=\"card-title\">Gulab Jamun</h5>\n");
      out.write("                  <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.\n");
      out.write("                    and with love and care we distribute it to you we Hope you will like it\n");
      out.write("                  </p>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("        data-bs-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"visually-hidden\"></span>\n");
      out.write("      </button>\n");
      out.write("      <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("        data-bs-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"visually-hidden\"></span>\n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"carousel-control-prev \" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\"></span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"carousel-control-next \" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\"></span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"container pt-5\">\n");
      out.write("  <div class=\"row align-items-center\">\n");
      out.write("    \n");
      out.write("    <div class=\"col\">\n");
      out.write("      <div class=\"card text-black\" style=\"width: 18rem;\">\n");
      out.write("        <img src=\"http://yaadi.in/wp-content/uploads/2021/06/d526bdd5df43af45f212a81d4dd19902.jpg\" class=\"card-img-top \" alt=\"...\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("        <img src=\"https://images.news18.com/ibnkhabar/uploads/2021/07/shutterstock_1735916885-1.jpg?im=Resize,width=509,aspect=fit,type=normal\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("        <img src=\"https://m.media-amazon.com/images/I/31GVbXE3Y8L.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"text-center bg-black text-white\" style=\"clip-path: polygon(24% 11%, 76% 0, 100% 26%, 99% 100%, 67% 100%, 19% 100%, 0 100%, 0 0);\n");
      out.write("     \">\n");
      out.write("    <footer class=\"py-5\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("                <h5>Section</h5>\n");
      out.write("                <ul class=\"nav flex-column\">\n");
      out.write("                    <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("                    <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("                    <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("                    <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-4 offset-1\">\n");
      out.write("                <form>\n");
      out.write("                    <h5>Subscribe to our newsletter</h5>\n");
      out.write("                    <p>Monthly digest of whats new and exciting from us.</p>\n");
      out.write("                    <div class=\"d-flex w-100 gap-2\">\n");
      out.write("                        <label for=\"newsletter1\" class=\"visually-hidden\">Email address</label>\n");
      out.write("                        <input id=\"newsletter1\" type=\"text\" class=\"form-control\" placeholder=\"Email address\">\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\">Subscribe</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- <div class=\"align-items-center d-flex justify-content-between py-4 my-4 border-top\"> -->\n");
      out.write("        <p>© 2021 Company, Inc. All rights reserved.</p>\n");
      out.write("        <ul class=\"list-unstyled d-flex\">\n");
      out.write("            <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#twitter\"></use></svg></a></li>\n");
      out.write("            <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#instagram\"></use></svg></a></li>\n");
      out.write("            <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#facebook\"></use></svg></a></li>\n");
      out.write("        </ul>\n");
      out.write("</div>\n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("\n");
      out.write("></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
