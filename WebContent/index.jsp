<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="windows-1256"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Pizza Delivery</title>
</head>
<body>
<f:view>
	<h:form>
		<h:outputLabel>Nom Pizza :</h:outputLabel>
		<h:selectOneMenu value="#{managedPizza.pizzaList}">
			<f:selectItem itemLabel="Marguerita" itemValue="marguerita" />
			<f:selectItem itemLabel="Marguerita" itemValue="marguerita" />
			<f:selectItem itemLabel="Marguerita" itemValue="marguerita" />
			<f:selectItem itemLabel="Marguerita" itemValue="marguerita" />
		</h:selectOneMenu><br>
		<h:outputLabel>Quantité : </h:outputLabel>
		<h:inputText value="#{managedPizza.quantity}"/><br>
		<h:outputLabel>Client :</h:outputLabel>
		<h:inputText value="#{managedPizza.client}"/><br>
		<h:outputLabel>Adresse :</h:outputLabel>
		<h:inputText value="#{managedPizza.adresse}"/><br>
		<h:commandButton value="ajouter" actionListener="#{managedPizza.ajouter}"></h:commandButton>
	</h:form>
</f:view>
</body>
</html>