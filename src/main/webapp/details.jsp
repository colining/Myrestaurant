<%@ page language="java"
         isELIgnored="false"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- saved from url=(0047)http://www.51meal.com/shop.asp?nowmenuid=500001 -->
<HTML>
<HEAD>
    <TITLE> 程序员的菜</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=gb2312">
    <link rel="stylesheet" href="./css/styles.css" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="http://cdn.amazeui.org/amazeui/2.7.2/css/amazeui.min.css">
    <script type="text/javascript" src="http://cdn.amazeui.org/amazeui/2.7.2/js/amazeui.min.js"></script>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <SCRIPT language=JavaScript type=text/JavaScript>
        <!--

        -->
    </SCRIPT>
    <style>
        .header {
            text-align: center;

        }

        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }

        .header p {
            font-size: 14px;
        }

        .footer p {
            color: #7f8c8d;
            text-align: center;
            background: #2d3e50;
            bottom: 0px;
            padding: 15px;
            width: 500px;;
        }
    </style>
</HEAD>
<BODY leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<div class="header">
    <div class="am-g">
        <h1>程序员的菜</h1>
        <p>hello world，希望你们不会打架<br/>请不要讨论：缩进，换行，空格，回车等内容</p>
    </div>
    <hr/>

</div>

<div class="am-g">
    <div class="am-u-lg-6 am-u-ms-8 am-u-sm-centered">
        <ul class="am-nav am-nav-pills am-nav-justify">
            <li class="am-active"><a href="#">首页</a></li>
            <li><a href="#">订餐</a></li>
            <li><a href="#">定制餐饮</a></li>
            <li><a href="#">反馈与建议</a></li>
        </ul>
        <br>
    </div>
</div>

<TABLE cellSpacing=0 cellPadding=0 width=776 align=center border=0>
    <TBODY>
    <TR vAlign=top>
        <TD width=181 background="images/002.gif">
            <TABLE cellSpacing=0 cellPadding=0 width=181 border=0>
                <TBODY>
                <TR>
                    <TD><IMG height=234 src="images/left_top.jpg" width=181></TD>
                </TR>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD align=middle height=30><FONT color=#000000>
                        <SCRIPT
                                language=javascript src="images/DateTime2.js"></SCRIPT>
                        <SCRIPT
                                language=javascript>tick('cn');</SCRIPT>
                    </FONT></TD>
                </TR>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD>　</TD>
                </TR>
                <TR>
                    <TD background="images/003.gif" height=4></TD>
                </TR>
                <TR>
                    <TD>　</TD>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD>　</TD>
                </TR>
                <TR>
                    <TD background="images/003.gif" height=4></TD>
                </TR>
                <TR>
                    <TD align=middle>
                        <TABLE cellSpacing=0 cellPadding=0 width="94%" border=0>
                            <TBODY>
                            <TR>
                                <TD>　</TD>
                            </TR>
                            </TBODY>
                        </TABLE>
                    </TD>
                </TR>
                </TBODY>
            </TABLE>
        </TD>
        <TD>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD><IMG height=72 src="images/001.jpg" width=595></TD>
                </TR>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD width="90%">
                        <div class='cnt'>
                            <marquee
                                    style="FONT-SIZE: 13px; COLOR: #0000FF" scrollamount='5'
                                    direction='left'><IMG height=15 src="images/tp009.gif" width=15>
                                欢迎您使用我学我会网上订餐系统，祝您用餐愉快！
                            </marquee>
                        </div>
                        &nbsp;&nbsp;</TD>
                </TR>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                <TR>
                    <TD align=right background="images/004.gif" height=19></TD>
                </TR>
                </TBODY>
            </TABLE>
            <TABLE cellSpacing=0 cellPadding=0 width="96%" align=center border=0>
                <TBODY>
                <TR>
                    <TD>

                        <TABLE cellSpacing=1 cellPadding=1 width="100%" align=center
                               bgColor=#c0c0c0 border=0>
                            <TBODY>
                            <TR bgColor=#dadada>

                                <TD width="100%" align="center">我学我会网上点餐系统用户请直接登录</TD>
                            </TR>
                            </TBODY>
                        </TABLE>
                        <BR>
                    </TD>
                </TR>
                </TBODY>
            </TABLE>
            <table width="90%" border="0" align="center" cellpadding="0"
                   cellspacing="0">
                <tr>
                    <td width="90" height="90" valign="top"><img
                            src=${requestScope.dish.img} border="0" width="80" height="80"></td>
                    <td valign="top">
                        <table width="98%" border="0" cellspacing="1" cellpadding="0"
                               align="center">
                            <tr>
                                <td><strong>${requestScope.dish.dishname}</strong></td>
                            </tr>
                            <tr>

                                <font color="#ff0000">现价：人民币${requestScope.dish.price}元</font><br>
                                <td>${requestScope.dish.dishdesc}</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td height="30">编号: ${requestScope.dish.dishid}</td>
                    <td>
                        <table width="145" border="0" cellspacing="1" cellpadding="0">
                            <tr>
                                <td align="center" width="70"><a href="
                                                                 LoginControlBack?actionType=dishToCart&dishId=${currentDish.dishid }">
                                    <img
                                            src="images/buy_cn.gif" border=0 width="60" height="20"></a>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
            <P align=center><STRONG><FONT size=4>详细资料</FONT></STRONG></P>
            <HR align=center width="100%" color=#000000 noShade SIZE=1>

            <P align=center><IMG
                    style="BORDER-LEFT-COLOR: #000000; BORDER-BOTTOM-COLOR: #000000; WIDTH: 232px; BORDER-TOP-COLOR: #000000; POSITION: static; HEIGHT: 172px; BORDER-RIGHT-COLOR: #000000; align: "
                    height=294 alt="" hspace=0 src="${requestScope.dish.img}" width=350
                    border=0></P>
            <P align=center><FONT size=3>${requestScope.dish.dishdesc}</FONT></P>
            <br>
        </td>
    </tr>
</table>

<%--<TABLE cellSpacing=0 cellPadding=0 width=776 align=center border=0>--%>
    <%--<TBODY>--%>
    <%--<TR>--%>
        <%--<TD background="images/005.gif" height=8></TD>--%>
    <%--</TR>--%>
    <%--</TBODY>--%>
<%--</TABLE>--%>
<%--<TABLE cellSpacing=0 cellPadding=0 width=776 align=center border=0>--%>
    <%--<TBODY>--%>
    <%--<TR>--%>
        <%--<TD bgColor=#eeeeee>--%>
            <%--<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>--%>
                <%--<TBODY>--%>
                <%--<TR>--%>
                    <%--<TD align=middle><BR>--%>
                        <%--<P align=center><FONT color=#000000>Copyright &copy;--%>
                            <%--2010&nbsp;&nbsp;&nbsp;&nbsp; XXXX有限公司所有</FONT></P>--%>
                        <%--<P align=center>　</P>--%>
                        <%--<BR>--%>
                        <%--<BR>--%>
                    <%--</TD>--%>
                <%--</TR>--%>
                <%--</TBODY>--%>
            <%--</TABLE>--%>
        <%--</TD>--%>
    <%--</TR>--%>
    <%--</TBODY>--%>
<%--</TABLE>--%>
<hr/>
<!--页脚-->
<footer data-am-widget="footer"
        class="am-footer am-footer-default"
        data-am-footer="{  }">
    <div class="am-footer-switch">
    <span class="am-footer-ysp" data-rel="mobile"
          data-am-modal="{target: '#am-switch-mode'}">
          程序员的菜
    </span>
        <span class="am-footer-divider"> | </span>
        <a id="godesktop" data-rel="desktop" class="am-footer-desktop" href="javascript:">
            电脑版
        </a>
    </div>
    <div class="am-footer-miscs ">

        <p>由 <a href="http://colining.cn/" title="colining.cn"
                target="_blank" class="">colining.cn</a>
            提供技术支持</p>
        <p>CopyRight©2017 RTQ Inc.</p>
        <p>赛博ICP备1024</p>
    </div>
</footer>
</BODY>
</HTML>