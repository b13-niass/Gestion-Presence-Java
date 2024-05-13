<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="left">
    <label for="checkbox-burger">
        <i class="fa fa-close"></i>
    </label>

    <div class="logo"></div>
    <div>Menu</div>
    <div class="menu-vertical">
        <div class="menu-item">
            <a href="<c:url value="/dashboard" />" class="">
                <i class="dash-icon"></i>
                Dashboard
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/pro" />" class="">
                <i class="promo-icon"></i>
                Promos
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/ref" />" class="">
                <i class="ref-icon"></i>
                Réferentiels
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/user" />" class="">
                <i class="user-icon"></i>
                Utilisateurs
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/visiteur" />" class="disabled">
                <i class="visit-icon"></i>
                Visiteurs
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/app" />" class="">
                <i class="visit-icon"></i>
                Apprenant
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/pre" />" class="">
                <i class="presence-icon"></i>
                Presence
            </a>
        </div>
        <div class="menu-item">
            <a href="<c:url value="/event" />">
                <i class="event-icon"></i>
                Evénements
            </a>
        </div>
    </div>
</div>