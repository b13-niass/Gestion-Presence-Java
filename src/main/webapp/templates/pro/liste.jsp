<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="right-middle">
    <div class="breadcrumbs">
        <div>
            <a href="/pro" style="text-decoration: none; color:#009186;font-weight: bold;">
            <span>
                Promotion 6
            </span>
            </a>
        </div>
        <div>
            <span>Promos ></span>
            <span>Liste</span>
        </div>
    </div>
    <div class="content">
        <div class="tableau">
            <div class="tableau-titre">
                <div>
                    Liste des Promotions
                    <span>(6)</span>
                </div>
                <div class="search-add">
                    <input type="text" name="search" id="" placeholder="Rechercher ici..." />
                    <a href="/create-pro1">
                        <i class="fa fa-plus"></i>Nouvelle
                    </a>
                </div>
            </div>
            <div class="tableau-head">
                <div class="row">
                    <div class="col">Libelle</div>
                    <div class="col">Date Début</div>
                    <div class="col">Date Fin</div>
                    <div class="col">Actions</div>
                </div>
            </div>
            <div class="tableau-body">
                <div class="row">
                    <div class="col">
                        <i class="services-icon"></i>
                        <span style="color: green;">sss</span>
                    </div>
                    <div class="col"></div>
                    <div class="col"></div>
                    <div class="col">
                        <form action="" method="post">
                            <input type="hidden" name="idPromotion" value="">
                            <input type="hidden" name="page" value="/pro">
                            <input type="checkbox" name="activer_promotion" class="to-check"
                            onchange="this.form.submit()">
                        </form>
                    </div>
                </div>
            </div>
            <div class=" tableau-footer">
                <div class="per-page">
                    <span>Items per page</span>
                    <form action="" method="POST">
                        <input type="hidden" name="page" value="/pro">
                        <select name="per_page_pro" onchange="this.form.submit()" id="">
                            <option value="5">5</option>
                        </select>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>