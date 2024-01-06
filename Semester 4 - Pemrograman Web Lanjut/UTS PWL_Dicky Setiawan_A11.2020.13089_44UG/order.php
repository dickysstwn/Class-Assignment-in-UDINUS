<?php
     session_start();
     $level = $_SESSION['level'];
     // cek apakah yang mengakses halaman ini sudah login
     if($_SESSION['level']==""){
         header("location:login.php");
     }
?>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">

    <title>OOTD - Order</title>
</head>

<body>
    <?php include 'ui/navbar.php' ?>
    <div class="container" style="margin-top: 100px;">
        <h3>Your Order</h3>
        <table class="table">
            <tbody>
                <?php
                    include 'config/connect.php';
                    $id_user = $_SESSION['id_user'];
                    $no = 1;
                    $get = mysqli_query($con,"SELECT * FROM cart WHERE id_user = '$id_user' and stat = '1'");
                    while ($a = mysqli_fetch_assoc($get)) {
                ?>
                <tr class="align-middle">
                    <th scope="row"><?php echo $no++ ?></th>
                    <td><?php echo $a['nm_product'] ?></td>
                    <td><img src="assets/img/<?php echo $a['img_product'] ?>" alt="" width="100px"></td>
                    <td><?php echo $a['qty'] ?></td>
                    <td>Rp. <?php echo $a['price'] ?></td>
                </tr>
                <?php } ?>
            </tbody>
        </table>
        <div class="row">
            <div class="col">
                <div class="card ms-auto" style="width: 18rem;">
                    <div class="card-body">
                        <?php
                            include 'config/connect.php';
                            $getdatacart = mysqli_query($con, "SELECT * FROM cart WHERE id_user = '$id_user' and stat = 0");
                            $datacart = mysqli_fetch_assoc($getdatacart);
                            $showtotal = mysqli_query($con,"SELECT SUM(price) AS totalPrice FROM cart WHERE id_user = '$id_user' and stat = 1");
                            $a = mysqli_fetch_assoc($showtotal);
                        ?>
                        <h5 class="card-title text-muted">Total Price</h5>
                        <h4 class="card-subtitle mb-2 text-center">Rp. <?php echo $a['totalPrice'] ?></h4>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
    </script>
</body>

</html>