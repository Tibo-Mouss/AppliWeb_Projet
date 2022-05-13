<!--
    JBoss, Home of Professional Open Source
    Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
    contributors by the @authors tag. See the copyright.txt in the
    distribution for a full listing of individual contributors.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
-->
<!-- Plain HTML page that kicks us into the app -->

<html>
<head>
<!--  <meta http-equiv="Refresh" content="0; URL=HelloWorld">   --> 
  <title>Scans Reader Homepage</title>
  <link rel="stylesheet" href="style.css">
  <link rel="icon" type="image/png" sizes="16x16" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKRTzM01UrruPkwsMJQP66NNDtkJ_A_fdCLQ&usqp=CAU">
  <style>
    /* On le mets ici uniquement pour les éléments de la hotbar qui changent chaque page*/
    .house_homepage {
      box-shadow: 0 0 7px 7px lightblue inset;
      -moz-box-shadow: 7px 7px 5px blue;
      -webkit-box-shadow: 0px 0px 30px blue;
      -khtml-box-shadow: 7px 7px 5px blue;
    }
  </style>

  <script src="script.js"></script>

</head>
<body>

<div class="main_title">
  <a href="index.html">Scans Reader</a>
</div>

<table class="centered_table top_bar_text">
  <tbody>
    <tr>
      <th>
        <a href="index.html">
          <img class="house_homepage" src="https://cdn-icons-png.flaticon.com/512/25/25694.png"/>
        </a>
      </th>
      <th>
        <a href="categories.html">Categories</a>
      </th>
      <th>
        <a href="ma_liste.html">Ma liste</a>
      </th>
      <th>
        <input type="text" placeholder="Search.." name="search">
      </th>
      <th class="searchbar">
        <button type="submit"><img class="loupe_homepage" src="https://www.a-c-c.fr/wp-content/uploads/2014/09/loupe-blanc-min.png"/></button>
      </th>
    </tr>
  </tbody>
</table>

<h2>Suggestions</h2>


<table class="centered_table" id="tableHomePage">
    <tr>
        <td class="box"> <a href="manga_description.html">
        <div class="mouse_hover_image">
            <img class="manga_cover" src="http://images1.fanpop.com/images/photos/2500000/Death-note-manga-covers-death-note-2531412-691-1024.jpg">
            <div class="text_on_image">NOM MANGA</div>
            <table class="stars">
              <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Golden_star.svg/640px-Golden_star.svg.png"></td>
              <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Golden_star.svg/640px-Golden_star.svg.png"></td>
              <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Golden_star.svg/640px-Golden_star.svg.png"></td>
              <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Golden_star.svg/640px-Golden_star.svg.png"></td>
              <td><img src="https://upload.wikimedia.org/wikipedia/commons/7/78/BlackStar.PNG"></td>
            </table>
        </div>
        </a></td>
    </tr>
</table>




<br><br>
</body>


</html>