/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-26 03:08:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<title>注册页面</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta name=\"description\" content=\"User login page\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- bootstrap & fontawesome -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/css/bootstrap.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/font-awesome/4.2.0/css/font-awesome.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- text fonts -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/fonts/fonts.googleapis.com.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- ace styles -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/css/ace.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if lte IE 9]>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/assets/css/ace-part2.min.css\" />\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/css/ace-rtl.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if lte IE 9]>\r\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"/assets/css/ace-ie.min.css\" />\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"/assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/assets/js/respond.min.js\"></script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 验证js -->\r\n");
      out.write("\t\t<script src=\"/assets/js/check.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 供应商分销商按钮的样式 -->\r\n");
      out.write("\t\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t\t#center-box .btn-info {\r\n");
      out.write("\t\t\t\t\tmargin:10px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</style>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body class=\"login-layout\">\r\n");
      out.write("\t\t<div class=\"main-container\">\r\n");
      out.write("\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-leaf green\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"red\">跨境</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"white\" id=\"id-text2\">M2B2C平台</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"blue\" id=\"id-company-text\">&copy; 阿里路亚</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"position-relative\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"select-box\" class=\"login-box visible widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-coffee green\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t请选择您的入驻信息\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"center-box\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" data-target=\"#signup-box\" class=\"btn btn-info\">供应商入驻</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" data-target=\"#asignup-box\" class=\"btn btn-info\">分销商入驻</button><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!--<button type=\"button\" data-target=\"#signup-box\" class=\"btn btn-info\">分销商(个人)</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" data-target=\"#signup-box\" class=\"btn btn-info\">分销商(企业)</button>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!--</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<div class=\"social-or-login center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">第三方登录</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- /.widget-main -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"toolbar clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/forget\" class=\"forgot-password-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t忘记密码\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/login\" class=\"user-signup-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t返回登录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /.widget-body -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /.login-box -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"signup-box\" class=\"signup-box widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header green lighter bigger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-users blue\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t供应商用户注册\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>填写信息: </p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form class=\"g_register\" id=\"2personRegForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"用户名\" name=\"username\" id=\"2regName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"邮箱\" name=\"email\" id=\"2email\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" placeholder=\"密码\" name=\"password\" id=\"2pwd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" placeholder=\"确认密码\" name=\"RePassword\" id=\"2pwdRepeat\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-retweet\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"手机号码\" name=\"phone\" id=\"2phone\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"企业名称\" name=\"companyName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"真实姓名\" name=\"compellation\" id=\"2compellation\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-circle\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"roleid\" value=\"2\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace\" checked/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"lbl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t接受\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/contract\" target=\"_blank\">用户协议</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-24\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"width-30 pull-left btn btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-refresh\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">重置</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" id=\"g_register\" class=\"width-65 pull-right btn btn-sm btn-success\" onclick=\"REGISTER.reg(this.id);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">注册</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-right icon-on-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"toolbar center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/login\"  class=\"back-to-login-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t返回登录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /.widget-body -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /.signup-box -->\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.position-relative -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"asignup-box\" class=\"signup-box widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header green lighter bigger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-users blue\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t分销商用户注册\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>填写信息: </p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form class=\"f_register\" id=\"3personRegForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"用户名\" name=\"username\" id=\"3regName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" id=\"register_email\" class=\"form-control\" placeholder=\"邮箱\" name=\"email\" id=\"3email\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"register_password\" class=\"form-control\" placeholder=\"密码\" name=\"password\" id=\"3pwd\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"register_RePassword\" class=\"form-control\" placeholder=\"确认密码\" name=\"RePassword\" id=\"3pwdRepeat\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-retweet\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"register_phone\" class=\"form-control\" placeholder=\"手机号码\" name=\"phone\" id=\"3phone\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"register_companyName\" class=\"form-control\" placeholder=\"企业名称\" name=\"companyName\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"register_name\" class=\"form-control\" placeholder=\"真实姓名\" name=\"compellation\" id=\"3compellation\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-circle\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"roleid\" value=\"3\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace\" checked/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"lbl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t接受\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/contract\" target=\"_blank\">用户协议</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-24\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"width-30 pull-left btn btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-refresh\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">重置</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" id=\"f_register\" class=\"width-65 pull-right btn btn-sm btn-success\" onclick=\"REGISTER.reg(this.id);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">注册</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-right icon-on-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"toolbar center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"/page/login\" class=\"back-to-login-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-arrow-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t返回登录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /.widget-body -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /.signup-box -->\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.position-relative -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!-- /.col -->\r\n");
      out.write("\t\t\t\t</div><!-- /.row -->\r\n");
      out.write("\t\t\t</div><!-- /.main-content -->\r\n");
      out.write("\t\t</div><!-- /.main-container -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- basic scripts -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if !IE]> -->\r\n");
      out.write("\t\t<script src=\"/assets/js/jquery.2.1.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if IE]>\r\n");
      out.write("<script src=\"/assets/js/jquery.1.11.1.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if !IE]> -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.jQuery || document.write(\"<script src='/assets/js/jquery.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if IE]>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" window.jQuery || document.write(\"<script src='/assets/js/jquery1x.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 验证js -->\r\n");
      out.write("\t\t<!-- <script src=\"/assets/js/check.js\"></script> -->\r\n");
      out.write("\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//改变背景\r\n");
      out.write("jQuery(function($) {\r\n");
      out.write("// $('#btn-login-light').on('click', function(e) {\r\n");
      out.write("\t$('body').attr('class', 'login-layout light-login');\r\n");
      out.write("\t$('#id-text2').attr('class', 'grey');\r\n");
      out.write("\t$('#id-company-text').attr('class', 'blue');\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("jQuery(function($) {\r\n");
      out.write("\t $(document).on('click', '.toolbar a[data-target]', function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tvar target = $(this).data('target');\r\n");
      out.write("\t\t$('.widget-box.visible').removeClass('visible');//hide others\r\n");
      out.write("\t\t$(target).addClass('visible');//show target\r\n");
      out.write("\t });\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("jQuery(function($) {\r\n");
      out.write("\t $(document).on('click', '#center-box button[data-target]', function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tvar target = $(this).data('target');\r\n");
      out.write("\t\t$('.widget-box.visible').removeClass('visible');//hide others\r\n");
      out.write("\t\t$(target).addClass('visible');//show target\r\n");
      out.write("\t });\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tvar REGISTER={\r\n");
      out.write("\t\tparam:{\r\n");
      out.write("\t\t\t//单点登录系统的url\r\n");
      out.write("\t\t\tsurl:\"\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tinputcheck:function(roleId){\r\n");
      out.write("\t\t\t\t//不能为空检查\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"regName\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"用户名不能为空a\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"regName\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"pwd\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"pwd\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"phone\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"手机号不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"phone\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"email\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"邮箱不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"email\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"compellation\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"姓名不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"compellation\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//密码检查\r\n");
      out.write("\t\t\t\tif ($(\"#\"+roleId+\"pwd\").val() != $(\"#\"+roleId+\"pwdRepeat\").val()) {\r\n");
      out.write("\t\t\t\t\talert(\"确认密码和密码不一致，请重新输入！\");\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"pwdRepeat\").select();\r\n");
      out.write("\t\t\t\t\t$(\"#\"+roleId+\"pwdRepeat\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tbeforeSubmit:function(roleId) {\r\n");
      out.write("\t\t\t\t//检查用户是否已经被占用\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t            \turl : REGISTER.param.surl + \"/user/check/\"+escape($(\"#\"+roleId+\"regName\").val())+\"/1?r=\" + Math.random(),\r\n");
      out.write("\t            \tsuccess : function(data) {\r\n");
      out.write("\t            \t\tif (data.data) {\r\n");
      out.write("\t            \t\t\t//检查手机号是否存在\r\n");
      out.write("\t            \t\t\t$.ajax({\r\n");
      out.write("\t            \t\t\t\turl : REGISTER.param.surl + \"/user/check/\"+$(\"#\"+roleId+\"phone\").val()+\"/2?r=\" + Math.random(),\r\n");
      out.write("\t\t\t\t            \tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t            \t\tif (data.data) {\r\n");
      out.write("\t\t\t\t\t            \t\tREGISTER.doSubmit(roleId);\r\n");
      out.write("\t\t\t\t            \t\t} else {\r\n");
      out.write("\t\t\t\t            \t\t\talert(\"此手机号已经被注册！\");\r\n");
      out.write("\t\t\t\t            \t\t\t$(\"#\"+roleId+\"phone\").select();\r\n");
      out.write("\t\t\t\t            \t\t}\r\n");
      out.write("\t\t\t\t            \t}\r\n");
      out.write("\t            \t\t\t});\r\n");
      out.write("\t            \t\t} else {\r\n");
      out.write("\t            \t\t\talert(\"此用户名已经被占用，请选择其他用户名\");\r\n");
      out.write("\t            \t\t\t$(\"#\"+roleId+\"regName\").select();\r\n");
      out.write("\t            \t\t}\t\r\n");
      out.write("\t            \t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t            \t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdoSubmit:function(roleId) {\t\t\r\n");
      out.write("\t\t\t$.post(\"/user/register\",$(\"#\"+roleId+\"personRegForm\").serialize(), function(data){\r\n");
      out.write("\t\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t\talert('用户注册成功，请登录！');\r\n");
      out.write("\t\t\t\t\tREGISTER.login();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"注册失败！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tlogin:function() {\r\n");
      out.write("\t\t\t location.href = \"/page/login\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\treg:function(id) {\r\n");
      out.write("\t\t\tvar roleId = \"\";\r\n");
      out.write("\t\t\tif(id == \"g_register\"){\r\n");
      out.write("\t\t\t\troleId = 2 ;\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\troleId = 3 ;\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (this.inputcheck(roleId)) {\r\n");
      out.write("\t\t\t\tthis.beforeSubmit(roleId);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("\t</body>\r\n");
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
