<?php
session_start();
if(empty($_SESSION['cart']['arrCart']))
  $_SESSION['cart']['arrCart'] = array();
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Meta Tags -->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
    <link
      rel="stylesheet"
      href="./myCSS/home.css"
      media="all"
      rel="stylesheet"
      type="text/css"
    />
    <title>Home</title>
  </head>

  <body>
    <header class="header">
      <nav class="navbar navbar-expand-lg navbar-dark bgNav">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="./Asset/logo plantiae.JPG" alt="" class="plantea-logo" />
            <p class="plantea-title">Plantea</p>
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarTogler">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
              <li><a href="home.php">Home</a></li>
              <li>
                <a href="cart-disp.php">Cart</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>

    <h2 class="title"> Home</h2>

    <section>
      <img src="./Asset/backgroundgreen.jpg" alt="" id="bgImg" />
    </section>

    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content">
          <h5>Aglonema Red Chocin</h5>
          <p>Lorem ipsum dolor sit amet.</p>
            <a href="addCart.php?brg=AglonemaRedChocin&hrg=35000&jml=1">
              Add To Cart
            </a>
        </div>
      </div>
    </div>
    
    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content2">
          <h5>Aglonema Anjamani</h5>
          <p>Lorem ipsum dolor sit amet.</p>
          <a href="addCart.php?brg=AglonemaAnjamani&hrg=35000&jml=1&">
            Add To Cart
          </a>
        </div>
      </div>
    </div>
    
    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content3">
          <h5>Aglonema Snow White</h5>
          <p>Lorem ipsum dolor sit amet.</p>
          <a href="addCart.php?brg=AglonemaSnowWhite&hrg=35000&jml=1&">
            Add To Cart
          </a>
        </div>
      </div>
    </div>

    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content4">
          <h5>Aglonema Suksom</h5>
          <p>Lorem ipsum dolor sit amet.</p>
          <a href="addCart.php?brg=AglonemaSuksom&hrg=35000&jml=1&">
            Add To Cart
          </a>
        </div>
      </div>
    </div>
    
    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content5">
          <h5>Aglonema Super White</h5>
          <p>Lorem ipsum dolor sit amet.</p>
          <a href="addCart.php?brg=AglonemaSuperWhite&hrg=35000&jml=1&">
            Add To Cart
          </a>
        </div>
      </div>
    </div>
    
    <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content6">
          <h5>Aglonema Venus</h5>
          <p>Lorem ipsum dolor sit amet.</p>
          <a href="addCart.php?brg=AglonemaVenus&hrg=35000&jml=1&">
            Add To Cart
          </a>
        </div>
      </div>
    </div>
  
  </body>
</html>
