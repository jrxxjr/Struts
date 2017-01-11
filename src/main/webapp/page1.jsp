<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<body>

<a href="/struts/main.do">Home</a> | 
<a href="/struts/page1.do">Página 1</a> |
<a href="/struts/page2.do">Página 2</a>

	<h1>Exemplo Struts</h1>
	<h2><bean:write name="page1Form" property="message" /></h2>

</body>
</html>