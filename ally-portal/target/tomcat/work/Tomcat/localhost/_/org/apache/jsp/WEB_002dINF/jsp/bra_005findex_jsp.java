/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-26 03:11:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bra_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"Mosaddek\">\r\n");
      out.write("<meta name=\"keyword\"\r\n");
      out.write("\tcontent=\"FlatLab, Dashboard, Bootstrap, Admin, Tprolate, Theme, Responsive, Fluid, Retina\">\r\n");

	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");

      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.html\">\r\n");
      out.write("\r\n");
      out.write("<title>ALLELUJA-品牌商管理</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/bootstrap-reset.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--external css-->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/assets/font-awesome/css/font-awesome.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/owl.carousel.css\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<!-- Custom styles for this tprolate -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/style-responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!--时间组件-->\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"container\" class=\"\">\r\n");
      out.write("\t\t<!--header start-->\r\n");
      out.write("\t\t<header class=\"header white-bg\">\r\n");
      out.write("\t\t\t<div class=\"sidebar-toggle-box\">\r\n");
      out.write("\t\t\t\t<div data-original-title=\"Toggle Navigation\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\tclass=\"icon-reorder tooltips\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--logo start-->\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"logo\">ALLE<span>LUJA</span></a>\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"logo\" style=\"margin-left: 40%;\">品牌商</a>\r\n");
      out.write("\t\t\t<!--logo end-->\r\n");
      out.write("\t\t\t<div class=\"top-nav \">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"user_id_val\">\r\n");
      out.write("\t\t\t\t<!--search & user info start-->\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right top-menu\">\r\n");
      out.write("\t\t\t\t\t<li><input type=\"text\" class=\"form-control search\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Search\"></li>\r\n");
      out.write("\t\t\t\t\t<!-- user login dropdown start-->\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\" href=\"#\"> <img alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/img/touxiang.png\" width=\"29\" height=\"29\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"username\" id=\"show_user_name\"></span> <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"log-arrow-up\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\" icon-suitcase\"></i>Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-cog\"></i> Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a hrefdropdown=\"#\"><i class=\"icon-bell-alt\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tNotification</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"login.html\"><i class=\"icon-key\"></i>退出</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<!-- user login  end -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!--search & user info end-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!--header end-->\r\n");
      out.write("\t\t<!--sidebar start-->\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t\t<div id=\"sidebar\" class=\"nav-collapse \">\r\n");
      out.write("\t\t\t\t<!-- sidebar menu start-->\r\n");
      out.write("\t\t\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu active\"><a class=\"\" href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-dashboard\"></i> <span>我的账号</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\" ><a id=\"jump_for_page00\" class=\"\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bra_index.html\">基本资料</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"\" id=\"jump_for_page01\">账号安全</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-book\"></i> <span>商品管理</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page02\" class=\"\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bra_additem.html\">商品发布</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page03\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bra_seleitem.html\">商品查询</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page04\" class=\"\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bra_edititem.html\">商品编辑</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page05\" class=\"\" href=\"slider.html\">商品审核</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" class=\"\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-cogs\"></i> <span>订单管理</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page06\" class=\"\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bra_select_order.html\">订单查询</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" class=\"\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-tasks\"></i> <span>物流管理</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page09\" class=\"\" href=\"form_component.html\">物流模板</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page010\" class=\"\" href=\"form_wizard.html\">发货地址</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page011\" class=\"\" href=\"form_validation.html\">揽收网点</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"jump_for_page012\" class=\"\" href=\"login.html\"> <i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>服务模板</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"jump_for_page013\" class=\"\" href=\"inbox.html\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-envelope\"></i> <span>评价管理 </span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"label label-danger pull-right mail-info\">0</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" class=\"\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-glass\"></i> <span>财务管理</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page014\" class=\"\" href=\"blank.html\">个人账户</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page015\" class=\"\" href=\"profile.html\">结算</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page016\" class=\"\" href=\"invoice.html\">结算明细</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page017\" class=\"\" href=\"404.html\">物流费明细</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page018\" class=\"\" href=\"500.html\">银行账号</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a class=\"\" href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-user\"></i> <span>客户服务</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page019\" class=\"\" href=\"blank.html\">投诉</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page020\" class=\"\" href=\"profile.html\">帮助</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"jump_for_page021\" class=\"\" href=\"invoice.html\">建议</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- sidebar menu end-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<!--sidebar end-->\r\n");
      out.write("\t\t<!--main content start-->\r\n");
      out.write("\t\t<section id=\"main-content\">\r\n");
      out.write("\t\t\t<section class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<!--state overview start-->\r\n");
      out.write("\t\t\t\t<div class=\"row state-overview\" style=\"margin:0 auto;text-align:center \">\r\n");
      out.write("\t\t\t\t<h1>欢迎登陆ALLELUJA品牌商后台</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<!--main content end-->\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.nicescroll.js\"\r\n");
      out.write("\t\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.sparkline.js\"\r\n");
      out.write("\t\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/owl.carousel.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.customSelect.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--common script for all pages-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/common-scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--script for this page-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/sparkline-chart.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/easy-pie-chart.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--时间组件-->\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/datetime/bootstrap/js/bootstrap-datetimepicker.min.js\"\r\n");
      out.write("\t\tcharset=\"UTF-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/datetime/bootstrap/js/bootstrap-datetimepicker.zh-CN.js\"\r\n");
      out.write("\t\tcharset=\"UTF-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/datetime/bootstrap/js/datetime.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//owl carousel\r\n");
      out.write("\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#owl-demo\").owlCarousel({\r\n");
      out.write("\t\t\t\tnavigation : true,\r\n");
      out.write("\t\t\t\tslideSpeed : 300,\r\n");
      out.write("\t\t\t\tpaginationSpeed : 400,\r\n");
      out.write("\t\t\t\tsingleItem : true\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//custom select box\r\n");
      out.write("\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('select.styled').customSelect();\r\n");
      out.write("\t\t\t//从页面中获取id\r\n");
      out.write("\t\t\tvar id = getUrlParam(\"Id\");\r\n");
      out.write("\t\t\t$(\"#user_id_val\").val(id);\r\n");
      out.write("\t\t\t//根据id发送ajax获取用户的数据\r\n");
      out.write("\t\t\tget_user(id);\r\n");
      out.write("\t\t\t//为每个跳转url+id属性\r\n");
      out.write("\t\t\tUrl_add_userid(id);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//获取url传的参数\r\n");
      out.write("\t\tfunction getUrlParam(name) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar reg = new RegExp(\"(^|&)\" + name + \"=([^&]*)(&|$)\"); //构造一个含有目标参数的正则表达式对象\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar r = window.location.search.substr(1).match(reg); //匹配目标参数\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (r != null)\r\n");
      out.write("\t\t\t\treturn unescape(r[2]);\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn null; //返回参数值\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//根据id发送ajax获取用户的数据,并进行数据处理\r\n");
      out.write("\t\tfunction get_user(id){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/getUser/\" + id,\r\n");
      out.write("\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t\t$(\"#show_user_name\").text(result.extend.User.compellation);\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//为每个跳转url+id属性\r\n");
      out.write("\t\tfunction Url_add_userid(id){\r\n");
      out.write("\t\t\tfor(var i=0;i<22;i++){\r\n");
      out.write("\t\t\t\t$(\"#jump_for_page0\"+i).attr(\"href\",$(\"#jump_for_page0\"+i).attr(\"href\")+\"?Id=\"+id);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
