/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-26 03:23:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pro_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");

	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
	pageContext.setAttribute("LOGIN_ADRESS", "http://localhost:8084");
	pageContext.setAttribute("SEARCH_ADRESS", "http://localhost:8086");

      out.write("\r\n");
      out.write("<title>ALLELUJA-搜索详情</title>\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>index</title>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"edge\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/index.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/common.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<!--\r\n");
      out.write("\t\t<script src=\"js/jquery.fly.min.js\"></script>-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/public.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/base.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"top\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"search\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"light\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"light1\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--最大的背景-->\r\n");
      out.write("\t<div class=\"maxbj\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!--头部-->\r\n");
      out.write("\t<top>\r\n");
      out.write("\t<section class=\"seck\">\r\n");
      out.write("\t\t<div class=\"register_login\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"user_id\"> <em id=\"show_user_name\">您好，</em>\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/login.html\" id=\"page_log\">会员登录</a> <a\r\n");
      out.write("\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/register.html\" id=\"page_reg\">快速注册</a>\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sto_index.html\" id=\"jump_for_page1\">回到首页</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"vip_center\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sto_personal.html\" id=\"jump_for_page\">个人中心</a> <a\r\n");
      out.write("\t\t\t\thref=\"#\">商户中心</a> <a href=\"#\">帮助</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t</top>\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\t<div class=\"maxbj1\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<b class=\"logo\"><h1>ALLELUJA</h1></b>\r\n");
      out.write("\t\t\t<search>\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"查询关键词...\" required\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 440px; height: 30px; text-indent: 2em; float: left; box-shadow: none\" id=\"input_search_pro\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"search_pro_btn()\">搜索</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</search>\r\n");
      out.write("\t\t\t<div class=\"sping_car\">\r\n");
      out.write("\t\t\t\t<b></b> <a href=\"#\"><em>我的购物车</em></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/slider.js\"></script>\r\n");
      out.write("\t<!--gong告-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.onload = function() {\r\n");
      out.write("\t\t\t\t$(\"top\").animate({\r\n");
      out.write("\t\t\t\t\t'margin-top': '0'\r\n");
      out.write("\t\t\t\t}, 2)\r\n");
      out.write("\t\t\t\t$(\".advertisement\").animate({\r\n");
      out.write("\t\t\t\t\t'top': '30',\r\n");
      out.write("\t\t\t\t\t'opacity': '1'\r\n");
      out.write("\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t$(\".flexslider\").animate({\r\n");
      out.write("\t\t\t\t\t'margin-top': '0'\r\n");
      out.write("\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t$(\"aside\").animate({\r\n");
      out.write("\t\t\t\t\t'top': '30',\r\n");
      out.write("\t\t\t\t\t'opacity': '1'\r\n");
      out.write("\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t$(\"top\").animate({\r\n");
      out.write("\t\t\t\t\t'margin-top': '-400'\r\n");
      out.write("\t\t\t\t}, 1000)\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<!--分类选项-->\r\n");
      out.write("\t<div class=\"filter\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title-h\">按条件筛选</div>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>分类</dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"show_scate_list\"></dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>价格</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i> <a href=\"#\" rel=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"sort\" class=\"all on\">升序</a> <a href=\"#\" rel=\"1\" name=\"sort\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"sx_child\">降序</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--分类插件-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/tagSelect.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\tnew SelectTag({\r\n");
      out.write("\t\t\t\t\tchild: \".sx_child\", //所有筛选范围内的子类\r\n");
      out.write("\t\t\t\t\tover: 'on', //选中状态样式名称\r\n");
      out.write("\t\t\t\t\tall: \".all\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<!--商品展示-->\r\n");
      out.write("\t<span class=\"as blessing_package\"> <a href=\"#\"\r\n");
      out.write("\t\tstyle=\"color: #000\"><h3 style=\"float: left\">&nbsp;所有商品</h3></a>\r\n");
      out.write("\t\t<div class=\"detailed_navigation\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\" id=\"page_info_area\"></div>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"currency\">\r\n");
      out.write("\t\t\t<div align=\"center\" id=\"Prompt_message_null\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/empty_search_result-551f162e825a44193cc0559f75795b4a.png\"\r\n");
      out.write("\t\t\t\t\talt=\"proty search result\" /> <span>没有查到符合条件的记录</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul id=\"show_ul_li0\">\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"show_ul_li1\">\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"show_ul_li2\">\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"show_ul_li3\">\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"show_ul_li4\">\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--页脚-->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<section class=\"foot_in\">\r\n");
      out.write("\t\t\t<!--left-->\r\n");
      out.write("\t\t\t<div class=\"foot_in_left\"></div>\r\n");
      out.write("\t\t\t<!--right-->\r\n");
      out.write("\t\t\t<div class=\"foot_in_right\">\r\n");
      out.write("\t\t\t\t<!--<div>\r\n");
      out.write("            \t<h5>联系我们</h5>\r\n");
      out.write("                <p><img src=\"images/dian.png\" width=\"40\" height=\"40\" style=\" float:left\"><em style=\" float:left; line-height:40px; color:#eb4e01; font-size:20px\">&nbsp;&nbsp;&nbsp;6001-666-888</em></p>\r\n");
      out.write("                <p><img src=\"images/wx.png\" width=\"40\" height=\"40\" style=\" float:left\"><em style=\" float:left; line-height:40px; color:#eb4e01; font-size:20px\">&nbsp;&nbsp;&nbsp;<a href=\"#\" style=\"color:#eb4e01\">在线客服</a></em></p>\r\n");
      out.write("            </div>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<div class=\"foots\">\r\n");
      out.write("\t\t<div class=\"foots_in\">\r\n");
      out.write("\t\t\t<a href=\"#\" style=\"float: left\">\r\n");
      out.write("\t\t\t\t<h1>ALLELUJA</h1>\r\n");
      out.write("\t\t\t</a> <em>CopyRight © 2000-2016 BitAuto,All Rights Reserved.</em>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--侧边栏-->\r\n");
      out.write("\t<div class=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"###\" class=\"toolbar-item toolbar-item-weixin\"\r\n");
      out.write("\t\t\tstyle=\"position: relative\"> <em\r\n");
      out.write("\t\t\tstyle=\"position: absolute; display: block; line-height: 20px; font-size: 12px; color: #f00; top: -20px; left: 0\">(0)</em>\r\n");
      out.write("\t\t\t<!--<span class=\"toolbar-layer\"></span>-->\r\n");
      out.write("\t\t</a> <a href=\"###\" class=\"toolbar-item toolbar-item-feedback\"></a> <a\r\n");
      out.write("\t\t\thref=\"###\" class=\"toolbar-item toolbar-item-app\"> <span\r\n");
      out.write("\t\t\tclass=\"toolbar-layer\"></span>\r\n");
      out.write("\t\t</a> <a href=\"javascript:scroll(0,0)\" id=\"top\"\r\n");
      out.write("\t\t\tclass=\"toolbar-item toolbar-item-top\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t//页面加载之后\r\n");
      out.write("\t$(function () {\r\n");
      out.write("\t\t//发送ajax请求分类列表数据\r\n");
      out.write("\t\tget_cate_list();\r\n");
      out.write("\t\t//从页面中获取id\r\n");
      out.write("\t\tvar id = getUrlParam(\"Id\");\r\n");
      out.write("\t\t//根据id发送ajax获取用户的数据\r\n");
      out.write("\t\tget_user(id);\r\n");
      out.write("\t\t$(\"#user_id\").val(id);\r\n");
      out.write("\t\t$(\"#jump_for_page\").attr(\"href\",$(\"#jump_for_page\").attr(\"href\")+\"?Id=\"+id); \r\n");
      out.write("\t\t$(\"#jump_for_page1\").attr(\"href\",$(\"#jump_for_page1\").attr(\"href\")+\"?Id=\"+id); \r\n");
      out.write("\t\t//从页面中获取搜索名称\r\n");
      out.write("\t\tvar q = getUrlParam(\"q\");\r\n");
      out.write("\t\tvar cate = getUrlParam(\"cate\");\r\n");
      out.write("\t\tvar sort = getUrlParam(\"sort\");\r\n");
      out.write("\t\t//进行数据查询\r\n");
      out.write("\t\tget_solr_pro(q,cate,sort);\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//判断用户登陆状态\r\n");
      out.write("\tfunction user_islogin(){\r\n");
      out.write("\t\tvar islogin = $(\"#show_user_name\").val();\r\n");
      out.write("\t\tif(islogin == 1 ){\r\n");
      out.write("\t\t\t$(\"#page_log\").text(\"退出登陆\");\r\n");
      out.write("\t\t\t$(\"#page_reg\").hide();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#page_reg\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//根据id发送ajax获取用户的数据,并进行数据处理\r\n");
      out.write("\tfunction get_user(id){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/getUser/\" + id,\r\n");
      out.write("\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t$(\"#show_user_name\").text($(\"#show_user_name\").text()+result.extend.User.compellation)\r\n");
      out.write("\t\t\t\t\t.attr(\"value\",1);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//判断用户登陆状态\r\n");
      out.write("\t\t\t\tuser_islogin();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//获取url传的参数\r\n");
      out.write("\tfunction getUrlParam(name) {\r\n");
      out.write("\r\n");
      out.write("\t\tvar reg = new RegExp(\"(^|&)\" + name + \"=([^&]*)(&|$)\"); //构造一个含有目标参数的正则表达式对象\r\n");
      out.write("\r\n");
      out.write("\t\tvar r = window.location.search.substr(1).match(reg); //匹配目标参数\r\n");
      out.write("\r\n");
      out.write("\t\tif (r != null)\r\n");
      out.write("\t\t\treturn unescape(r[2]);\r\n");
      out.write("\r\n");
      out.write("\t\treturn null; //返回参数值\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//请求分类数据\r\n");
      out.write("\tfunction get_cate_list(){\r\n");
      out.write("\t\t//发送ajax请求列表数据\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t        url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/itemcat/list\",\r\n");
      out.write("\t        type : \"GET\",\r\n");
      out.write("\t        dataType : \"jsonp\", // 返回的数据类型，设置为JSONP方式\r\n");
      out.write("\t        jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback\r\n");
      out.write("\t        jsonpCallback: 'cateListResponse', //设置回调函数名\r\n");
      out.write("\t        data : {\r\n");
      out.write("\t            q : \"javascript\", \r\n");
      out.write("\t            count : 1\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//返回分类列表数据后进行的数据处理\r\n");
      out.write("\tfunction cateListResponse(result){\r\n");
      out.write("\t\tvar count = 0;\r\n");
      out.write("\t\t$(\"#ul_show_fcate\").append($(\"<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>\"));\r\n");
      out.write("\t\t$(\"#show_scate_list\").append($(\"<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>\"));\r\n");
      out.write("\t\t$.each(result, function() {\t\r\n");
      out.write("\t\t\t$.each(this,function(){\r\n");
      out.write("\t\t\t\t$(\"#ul_show_fcate\").append($(\"<a href='#' value='\"+this.n+\"' class='fcate_a'>\"+this.n+\"</a>\"));\r\n");
      out.write("\t\t\t\t$.each(this.i,function(){\r\n");
      out.write("\t\t\t\t\t$(\"#show_scate_list\").append(this.n);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//进行商品数据查询\r\n");
      out.write("\tfunction get_solr_pro(q,cate,sort){\r\n");
      out.write("\t\t//发送ajax请求列表数据\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t        url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SEARCH_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/search/query\",\r\n");
      out.write("\t        type : \"POST\",\r\n");
      out.write("\t        data : {\r\n");
      out.write("\t            q :q, \r\n");
      out.write("\t            cate :cate,\r\n");
      out.write("\t            sort :sort\r\n");
      out.write("\t        },success : function(result){\r\n");
      out.write("\t        \tconsole.log(result);\r\n");
      out.write("\t        \tif(result.code==100){\r\n");
      out.write("\t        \t\t//进行商品数据填充\r\n");
      out.write("\t        \t\tdeal_pros_result(result);\r\n");
      out.write("\t        \t\t//处理分页信息\r\n");
      out.write("\t        \t\tbuild_page_info(result);\r\n");
      out.write("\t        \t}else{\r\n");
      out.write("\t        \t\talert(result.extend.message);\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//处理传来的商品数据\r\n");
      out.write("\tfunction deal_pros_result(result){\r\n");
      out.write("\t    var products = result.extend.searchResult;\r\n");
      out.write("\t    var count = 0;\r\n");
      out.write("\t    var num = 0;\r\n");
      out.write("\t    if(products.itemList!=null&&products.itemList.length!=0){\r\n");
      out.write("\t    \t$(\"#Prompt_message_null\").hide();\r\n");
      out.write("\t    \t$.each(products.itemList,function(){\r\n");
      out.write("\t    \t\t var pics = this.picture.split('--');\r\n");
      out.write("\t    \t\t if(num<5){\r\n");
      out.write("\t    \t\t$(\"#show_ul_li\"+count).append($(\"<li></li>\")\r\n");
      out.write("\t    \t\t\t\t.append($(\"<a></a>\").attr(\"href\",\"/pro_detail.html?id=\"+this.id+\"&Id=\"+$(\"#user_id\").val())\r\n");
      out.write("\t    \t\t\t\t\t\t.append($(\"<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>\").attr(\"src\",pics[0])))\r\n");
      out.write("\t    \t\t\t\t.append($(\"<light1></light1>\")\r\n");
      out.write("\t    \t\t\t\t\t\t.append($(\"<img src='/static/images/saoguang.png'>\")))  \r\n");
      out.write("\t    \t\t\t\t.append($(\"<span></span\").text(\"￥\"+this.price)) \r\n");
      out.write("\t    \t\t\t\t.append($(\"<a href=''></a>\")\r\n");
      out.write("\t    \t\t\t\t\t\t.attr(\"href\",\"/pro_detail.html?id=\"+this.id+\"&Id=\"+$(\"#user_id\").val())\r\n");
      out.write("\t    \t\t\t\t\t\t.append($(\"<p></p>\").append(this.pro_name+\"  \"+this.sell_point)))\r\n");
      out.write("\t    \t\t\t\t.append($(\"<em></em>\")\r\n");
      out.write("\t    \t\t\t\t\t\t.append($(\"<a href='#'>收藏</a>\"))\r\n");
      out.write("\t    \t\t\t\t\t\t.append($(\"<a href='javascript:void(0)' class='add_scar'>加入购物车</a>\"))) );\r\n");
      out.write("\t    \t\t }else{\r\n");
      out.write("\t    \t\t\t count = count+1;\r\n");
      out.write("\t    \t\t\t num = 0;\r\n");
      out.write("\t    \t\t\t $(\"#show_ul_li\"+count).append($(\"<li></li>\")\r\n");
      out.write("\t \t    \t\t\t\t.append($(\"<a></a>\").attr(\"href\",\"/pro_detail.html?id=\"+this.id+\"&Id=\"+$(\"#user_id\").val())\r\n");
      out.write("\t \t    \t\t\t\t\t\t.append($(\"<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>\").attr(\"src\",pics[0])))\r\n");
      out.write("\t \t    \t\t\t\t.append($(\"<light1></light1>\")\r\n");
      out.write("\t \t    \t\t\t\t\t\t.append($(\"<img src='/static/images/saoguang.png'>\")))  \r\n");
      out.write("\t \t    \t\t\t\t.append($(\"<span></span\").text(\"￥\"+this.price)) \r\n");
      out.write("\t \t    \t\t\t\t.append($(\"<a href=''></a>\")\r\n");
      out.write("\t \t    \t\t\t\t\t\t.attr(\"href\",\"/pro_detail.html?id=\"+this.id+\"&Id=\"+$(\"#user_id\").val())\r\n");
      out.write("\t \t    \t\t\t\t\t\t.append($(\"<p></p>\").append(this.pro_name+\"  \"+this.sell_point)))\r\n");
      out.write("\t \t    \t\t\t\t.append($(\"<em></em>\")\r\n");
      out.write("\t \t    \t\t\t\t\t\t.append($(\"<a href='#'>收藏</a>\"))\r\n");
      out.write("\t \t    \t\t\t\t\t\t.append($(\"<a href='javascript:void(0)' class='add_scar'>加入购物车</a>\"))) );\r\n");
      out.write("\t    \t\t }\r\n");
      out.write("\t    \t\t num = num +1;\r\n");
      out.write("\t    \t});\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//分页信息\r\n");
      out.write("\tfunction build_page_info(result) {\r\n");
      out.write("\t\t$(\"#page_info_area\").empty();\r\n");
      out.write("\t\t$(\"#page_info_area\").append(\r\n");
      out.write("\t\t\t\t\"当前第 \" + result.extend.searchResult.pageCount + \" 页,共有 \"\r\n");
      out.write("\t\t\t\t\t\t+ result.extend.searchResult.curPage + \" 页,一共 \"\r\n");
      out.write("\t\t\t\t\t\t+ result.extend.searchResult.recordCount + \" 条数据。\");\r\n");
      out.write("\t\tif(result.extend.searchResult.curPage!=1&&result.extend.searchResult.pageCount!=result.extend.searchResult.curPage){\r\n");
      out.write("\t\t\t$(\"#page_info_area\")\r\n");
      out.write("\t\t\t.append($(\"<input type='button' class='prev_btn' value='上一页'>&nbsp;&nbsp;&nbsp;&nbsp;\"))\r\n");
      out.write("\t\t\t.append($(\"<input type='button' class='next_btn' value='下一页'>\"));\r\n");
      out.write("\t\t}else if(result.extend.searchResult.curPage!=1&&result.extend.searchResult.pageCount==result.extend.searchResult.curPage){\r\n");
      out.write("\t\t\t$(\"#page_info_area\")\r\n");
      out.write("\t\t\t.append($(\"<input type='button' class='prev_btn' value='上一页'>&nbsp;&nbsp;&nbsp;&nbsp;\"));\r\n");
      out.write("\t\t}else if(result.extend.searchResult.curPage=1&&result.extend.searchResult.pageCount!=result.extend.searchResult.curPage&&result.extend.searchResult.pageCount!=0){\r\n");
      out.write("\t\t\t$(\"#page_info_area\")\r\n");
      out.write("\t\t\t.append($(\"<input type='button' class='next_btn' value='下一页'>\"));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* $totalRecord = result.extend.searchResult.total;\r\n");
      out.write("\t\t$pageRecord = result.extend.searchResult.pageNum; */\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t//商品分类搜索\r\n");
      out.write("\t$(document).on(\"click\", \".scate_a\", function() {\r\n");
      out.write("\t\tvar cate_name = $(this).text();\r\n");
      out.write("\t\t//进行数据查询\r\n");
      out.write("\t\twindow.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pro_search.html?Id=\"+$(\"#user_id\").val()+\"&q=\"+cate_name+\"&cate=1&sort=0\");\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//搜索按钮方法\r\n");
      out.write("\tfunction search_pro_btn(){\r\n");
      out.write("\t\tvar q = $(\"#input_search_pro\").val();\r\n");
      out.write("\t\tif(q!=\"\"&&q.length>0){\r\n");
      out.write("\t\twindow.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pro_search.html?Id=\"+$(\"#user_id\").val()+\"&q=\"+q+\"&cate=0&sort=0\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
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
