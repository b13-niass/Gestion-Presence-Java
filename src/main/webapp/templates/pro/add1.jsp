<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="right-middle">
    <div class="breadcrumbs">
        <span>Promotions</span>
        <div>
            <span>Promos ></span>
            <span>Creation</span>
        </div>
    </div>
    <div class="content">
        <div class="content-left">
            <div>1</div>
            <div></div>
            <div>2</div>
        </div>
        <div class="content-right">
            <span>Promotion</span>
            <form action="" method="post">
                <div class="form-intput">
                    <span>libelle</span>
                    <input class="lib" type="text" placeholder="libelle" name="libelle" id=""/>
                    <i style="font-size: 0.7rem;color:darkred;">
                        Le libellé est obligatoire
                    </i>
                    <i style="font-size: 0.7rem;color:darkred;">
                        La promo existe déjà
                    </i>
                    <i style="font-size: 0.7rem;color:darkred;">
                        Le libellé est obligatoire
                    </i>
                </div>
                <div class="form-intput">
                    <span>Date Début</span>
                    <input type="text" placeholder="JJ-MM-AAAA" name="dateDebut" id=""/>
                    <i style="font-size: 0.7rem;color:darkred;">
                        La date de début est obligatoire
                    </i>
                    <i style="font-size: 0.7rem;color:darkred;">
                        La date de début est obligatoire
                    </i>
                </div>
                <div class="form-intput">
                    <span>Date Fin</span>
                    <input type="text" placeholder="JJ-MM-AAAA" name="dateFin" id=""/>
                    <i style="font-size: 0.7rem;color:darkred;">
                        La date de fin est obligatoire
                    </i>
                    <i style="font-size: 0.7rem;color:darkred;">
                        La date de fin est obligatoire
                    </i>
                </div>
                <i style="text-align: center;font-size: 0.7rem;color:darkred;width:100%;">
                    L'intervall entre date de début et date de fin doit être >= 4mois
                </i>
                <i style="text-align: center;font-size: 0.7rem;color:darkred;width:100%;">
                    L'intervall entre date de début et date de fin doit être >= 4mois
                </i>
                <div class="form-intput btn-create">
                    <button type="submit" name="ajouter_ref">Ajouter Référentiel (s)</button>

                    <button type="submit" name="creer_promo">Créer Promotion</b>
                </div>
            </form>
            <span>Référentiels</span>
        </div>
    </div>
</div>