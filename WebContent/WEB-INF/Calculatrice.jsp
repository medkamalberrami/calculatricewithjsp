<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%! int resultat=0;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercice JSP</title>
<script language="javascript" type="text/javascript">

function testFocus()
{
	alert('testFocus');
}
</script>
</head>

<body>
<% //calculs

	String firstNumber = (String) request.getAttribute("premier1");
	String secondNumber = (String) request.getAttribute("deuxieme2");
	String operation = (String) request.getAttribute("operation");
	String resultat =  (String) request.getAttribute("resultat");
	
	
	
	if(firstNumber != null && secondNumber != null && resultat != null){
		out.print("le resultat de l'operation de "+ firstNumber +" "+operation+" "+secondNumber +" est :"+ resultat);
	}
%>
<FORM>
opérande 1:
<input type=text name="premier"/>
<br>
opérande 2:
<input type=text name="deuxieme"/>
<br>
------------------------------------<br>


<select name="operateur" id="operateur">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select> <p> <input type="submit"/>
            </p>
<br>
</FORM>
</body>
</html>