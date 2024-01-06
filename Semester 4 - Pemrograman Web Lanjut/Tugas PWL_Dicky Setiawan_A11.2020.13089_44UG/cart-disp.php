<?php
session_start();
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Meta Tags -->
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="./myCSS/cart-disp.css" media="all" rel="stylesheet" type="text/css" />
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
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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

  <h2 class="title">Cart Display</h2>

  <section>
    <img src="./Asset/backgroundgreen.jpg" alt="" id="bgImg" />
  </section>

  <?php
  if (!empty($_SESSION['cart'])) {
    $max = sizeof($_SESSION['cart']['arrCart']);
    for ($i = 0; $i < $max; $i++) {
      $total = $_SESSION['cart']['arrCart'][$i]['jml'] * $_SESSION['cart']['arrCart'][$i]['hrg'];
      echo '
      <div class="plantea-container">
      <div class="plantea-card">
        <div class="plantea-content">
          <table>
            <tr>
              <th>Nama</th>
              <th>Harga</th>
              <th>Jumlah</th>
              <th>Total</th>
            </tr>
          </table>
          <table class="desc-product">
            <tr>
              <td>'. $_SESSION['cart']['arrCart'][$i]['nmBrg'] .'</td>
              <td>'. $_SESSION['cart']['arrCart'][$i]['hrg'] .'</td>
              <td>'. $_SESSION['cart']['arrCart'][$i]['jml'] .'</td>
              <td>'. $total .'</td>
            </tr>
          </table>
          <div class="button">
            <a href="cart-remove.php" class="Heading">Hapus Semua</a>
            <h5 class="Action">Bayar</h5>
          </div>
        </div>
      </div>
      ';
    }
  }else
	  echo "cart kosong";

  ?>

</body>

</html>