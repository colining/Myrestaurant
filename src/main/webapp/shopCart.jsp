<%@ page import="restaurant.bean.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="restaurant.bean.CartItemBean" %>
<%@ page language="java"
         isELIgnored="false"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>购物车</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <link rel="stylesheet" href="./css/styles.css" type="text/css"/>

</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
      text="#000000" link="#000000" vlink="#000000" alink="#000000">

<!--<table width="100%" border="0" cellspacing="0" cellpadding="0"-->
<!--bgcolor="#FFFFFF" height="100%">-->
<!--<tr valign="top">-->
<!--<td>-->
<!--<table width="98%" border="0" cellspacing="1" cellpadding="2"-->
<!--align="center">-->
<!--<tr valign="bottom">-->
<!--<td height="30"><img-->
<!--src="http://i-560.wz8.cn/pic1/shop/cart.gif"> <font-->
<!--color="#000000">您的购物车中有以下商品</font></td>-->
<!--</tr>-->
<!--</table>-->
<!--<table width="98%" border="0" cellspacing="2" cellpadding="0"-->
<!--align="center">-->
<!--<tr bgcolor=#808000>-->
<!--<td height="1" bgcolor="#999999"></td>-->
<!--</tr>-->
<!--</table>-->
<!--<table width="98%" border="0" cellspacing="2" cellpadding="0"-->
<!--align="center">-->
<!--<tr>-->
<!--<td height="5"></td>-->
<!--</tr>-->
<!--</table>-->
<!--<table width="98%" border="0" cellspacing="0" cellpadding="0"-->
<!--align="center">-->
<!--<tr>-->
<!--<td>-->
<!--<table width="100%" border="0" align="CENTER" cellpadding="2"-->
<!--cellspacing="1" bgcolor="#c0c0c0">-->
<!--<tr bgcolor="#dadada">-->
<!--<td height="22" width="50">-->
<!--<div align="CENTER"><font color="#000000">编号</font></div>-->
<!--</td>-->
<!--<td width="610" height="22">-->
<!--<div align="CENTER"><font color="#000000">商品名称</font></div>-->
<!--</td>-->
<!--<td height="22" width="104">-->
<!--<div align="CENTER"><font color="#000000">单价</font></div>-->
<!--</td>-->
<!--<td height="22" width="100">-->
<!--<div align="CENTER"><font color="#000000">数量</font></div>-->
<!--</td>-->
<!--<td width="116" height="22">-->
<!--<div align="CENTER"><font color="#000000">金额</font></div>-->
<!--</td>-->
<!--</tr>-->


<!--<tr bgcolor="#ffffff">-->
<!--<td width="50" align="center" height="22"><font-->
<!--color="#000000">22</font></td>-->
<!--<td align="center" height="22"><font color="#000000">皮蛋瘦肉粥</font>-->
<!--<input type="hidden" name="prodid" value="500047"></td>-->
<!--<td width="104" align="center" height="22"><font-->
<!--color="#000000">￥5</font></td>-->
<!--<td width="100" class="hh" align="center" height="22">3</td>-->
<!--<td width="116" class="bb" align="center" height="22"><font-->
<!--color="#000000">￥15</font></td>-->
<!--</tr>-->


<!--<tr bgcolor="#ffffff">-->
<!--<td width="50" align="center" height="22"><font-->
<!--color="#000000">20</font></td>-->
<!--<td align="center" height="22"><font color="#000000">炸酱面</font>-->
<!--<input type="hidden" name="prodid" value="500045"></td>-->
<!--<td width="104" align="center" height="22"><font-->
<!--color="#000000">￥8</font></td>-->
<!--<td width="100" class="hh" align="center" height="22">1</td>-->
<!--<td width="116" class="bb" align="center" height="22"><font-->
<!--color="#000000">￥8</font></td>-->
<!--</tr>-->


<!--<tr bgcolor="#ffffff">-->
<!--<td width="50" align="center" height="22"><font-->
<!--color="#000000">19</font></td>-->
<!--<td align="center" height="22"><font color="#000000">肉丝茄子</font>-->
<!--<input type="hidden" name="prodid" value="500044"></td>-->
<!--<td width="104" align="center" height="22"><font-->
<!--color="#000000">￥10</font></td>-->
<!--<td width="100" class="hh" align="center" height="22">1</td>-->
<!--<td width="116" class="bb" align="center" height="22"><font-->
<!--color="#000000">￥10</font></td>-->
<!--</tr>-->


<!--<tr bgcolor="#dadada">-->
<!--<td width="50" height="22" align="center"><font-->
<!--color="#000000">合计</font></td>-->
<!--<td height="22" align="center"><font color="#000000">-</font></td>-->
<!--<td width="104" height="22" align="center"><font-->
<!--color="#000000">-</font></td>-->
<!--<td width="100" class="hh" height="22" align="center"><font-->
<!--color="#000000">-</font></td>-->
<!--<td width="116" class="bb" align="center" height="22"><font-->
<!--color="#000000">￥33 </font></td>-->
<!--</tr>-->
<!--</table>-->
<!--<br>-->
<!--<table width="300" border="0" cellspacing="1" cellpadding="4"-->
<!--align="CENTER" bgcolor="#c0c0c0">-->
<!--<tr bgcolor="#dadada">-->
<!--<td height="10" align="center"><a href="#"><font-->
<!--color="#000000">清空购物车</font></a></td>-->
<!--<td height="10" align="center" style="cursor:hand" onClick="#"><font-->
<!--color="#000000">继续购物</font></td>-->
<!--<td height="10" align="center" style="cursor:hand" onClick="#"><font-->
<!--color="#000000">生成订单</font></td>-->
<!--</tr>-->
<!--</table>-->
<!--</td>-->
<!--</tr>-->
<!--</table>-->
<!--</td>-->
<!--</tr>-->
<!--</table>-->

<table>
    <tr>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>购买数量</th>
        <th>操作</th>
    </tr>
    <%
        User userName = (User) session.getAttribute("loginUser");
        Map<Integer, CartItemBean> MyCart = (Map<Integer, CartItemBean>) session.getAttribute("shoppingCar");

    %>
    <%--<c:choose>--%>
    <%--<c:when test="${userName==null }">--%>
    <%--<c:choose>--%>
    <%--<c:when test="${MyCart==null||MyCart.size()==0 }"> 您还未添加商品到购物车！！--%>
    <%--</c:when>--%>
    <%--<c:otherwise>--%>
    <%--<c:forEach items="${MyCart}" var="cart">--%>
    <%--<tr id="product">--%>
    <%--<td class="thumb"><img src="${cart.value.dish.img}"/>--%>
    <%--<a href="product-view.jsp">${cart.value.ep_name}</a>--%>
    <%--</td>--%>
    <%--<td class="price" id="price">--%>
    <%--<span>${cart.value.ep_price}</span>--%>
    <%--<input type="hidden" value="${cart.value.ep_price}"/>--%>
    <%--</td>--%>
    <%--<td class="number">--%>
    <%--<dl>--%>
    <%--<dt>--%>
    <%--<input id="number" type="text" name="number" value="${cart.value.count }"/>--%>
    <%--</dt>--%>
    <%--<dd onclick="reloadPrice(1,true);">修改</dd>--%>
    <%--</dl>--%>
    <%--</td>--%>
    <%--<td class="delete"><a href="javascript:delShopping(1);">删除</a></td>--%>
    <%--</tr>--%>
    <%--</c:forEach>--%>
    <%--</c:otherwise>--%>
    <%--</c:choose>--%>
    <%--</c:when>--%>
    <%--<c:otherwise>--%>

    <c:choose>
        <c:when test="${shoppingCar == null}"> 您还未添加商品到购物车！<a href="javascript:history.go(-1)">click to
            back</a></c:when>
        <c:when test="${shoppingCar==null }">
            <c:redirect url="javascript:history.go(-1)"></c:redirect>
        </c:when>

        <c:otherwise>
            <c:forEach items="${shoppingCar}" var="shopping">
                <c:out value="${shopping.key}"/>
                <c:out value=""/>

                <tr id="product_id_1">
                    <td class="thumb"><img src="shopping.value.dish.img"/><a href="product-view.jsp">${shopping.value.dish.dishid}</a></td>

                    <td class="price" id="price_id_1"><span>${shopping.value.dish.price}</span> <input type="hidden"
                                                                                               value="${shopping.value.dish.price}"/>
                    </td>
                    <td class="number">
                        <dl>
                            <dt><input id="number_id_1" type="text" name="number" value="${shopping.value.quantity}"/>
                            </dt>
                            <dd onclick="reloadPrice(1,true);">修改</dd>
                        </dl>
                    </td>
                    <td class="delete"><a href="javascript:delShopping(1);">删除</a></td>
                </tr>

            </c:forEach>
        </c:otherwise>
    </c:choose>
    <%--</c:otherwise>--%>
    <%--</c:choose>--%>
</table>

<br>
</body>
</html>
