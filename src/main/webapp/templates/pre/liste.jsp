<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="right-middle">
    <div class="breadcrumbs">
        <div>Presences :
            <a href="/pro" style="text-decoration: none; color:#009186;font-weight: bold;">
            <span>
                Promotion 6 ?>
            </span>
            </a>
        </div>

        <div>
            <span>Presence ></span>
            <span>Liste</span>
        </div>
    </div>

    <div class="content">
        <div class="tableau">
            <div class="tableau-titre">
                <form action="" method="post" style="width: 80%;">
                    <select class="statut" name="status">
                        <option value="" selected>Statut</option>

                        <option value="1">Present</option>
                        <option value="2">Absent</option>
                        <option value="1">Present</option>
                        <option value="2">Absent</option>

                    </select>
                    <select class="referentiels" name="referentiels">
                        <option value="" selected>Referentiels</option>
                        <option value="">
                        </option>
                        <option value=""><</option>

                    </select>
                    <div>
                        <input type="text" class="date" name="date" id="" value=""/>

                        <input type="text" class="date" name="date" id="" placeholder="JJ-MM-AAAA"
                               value=""/>
                    </div>
                    <button type="submit" name="search_presence" style="cursor: pointer;">Rafraichir</button>
                </form>
                <form action="" method="post" style="width: 20%;display:flex;justify-content: end;">
                    <button type="submit" name="all_presence" value="1" style="width: 30%;cursor: pointer;">All</button>
                </form>
            </div>
            <div class="tableau-head">
                <div class="row">
                    <div class="col">Matricule</div>
                    <div class="col">Nom</div>
                    <div class="col">Prénom</div>
                    <div class="col">Téléphone</div>
                    <div class="col">Référentiel</div>
                    <div class="col">Heure D'activité</div>
                    <div class="col">Status</div>
                </div>
            </div>
            <div class="tableau-body">

                <div class="row">
                    <div class="col">sdsddsd</div>
                    <div class="col">sdsdsddsd</div>
                    <div class="col">sdsdsdsd</div>
                    <div class="col">sdsdsddsd</div>
                    <div class="col">sdsdsdsd</div>
                    <div class="col"><span class="a_l_heure">dsdsdsdwew3</span></div>
                    <div class="col"><span
                            class="">323erer</span>
                    </div>
                </div>
            </div>
            <div class="tableau-footer">
                <div class="per-page">
                    <span>Items per page</span>
                    <form action="" method="POST">
                        <input type="hidden" name="page" value="/pre">
                        <select name="per_page_pre" onchange="this.form.submit()" id="">
                            <option value="5">5</option>
                        </select>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>