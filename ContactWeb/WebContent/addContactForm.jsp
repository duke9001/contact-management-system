<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
		<h:form>
			<h:panelGrid border="0" columns="2">
				<h:outputText value="nic:"></h:outputText>
				<h:inputText value="#{contactController.contact.nic}"></h:inputText>
				
				<h:outputText value="First Name:"></h:outputText>
				<h:inputText value="#{contactController.contact.fname }"></h:inputText>
				
				<h:outputText value="Last Name:"></h:outputText>
				<h:inputText value="#{contactController.contact.lname }"></h:inputText>
				


			</h:panelGrid>
			<h:commandButton value="add" action="#{contactController.addContactAction}"></h:commandButton>
		</h:form>
	</f:view>
</body>
</html>