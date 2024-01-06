<?php
session_start();
if ($_SERVER["REQUEST_METHOD"] == "GET") {	
	$brg = $_GET['brg'];
	$hrg = $_GET['hrg'];
	$jml = $_GET['jml'];
	// Checker jika sudah ketemua data pada array maka ubah ke true
    $find=false;
	// Cek apakah array kosong atau tidak
	if (!empty($_SESSION['cart']['arrCart'])){
		// Buat variable untuk menghitung panjang array
		$max=sizeof($_SESSION['cart']['arrCart']);
		for ($i=0;$i<$max;$i++){
			// Buat variable untuk mencari data pada array
			$cari=array_search($brg, $_SESSION['cart']['arrCart'][$i]);
			// cek apakah variable cari ada datanya
			if ($cari) {
				// jika iya maka array dengan data jml ditambah 1 kemudian break loop
				$_SESSION['cart']['arrCart'][$i]['jml']+=1;
				$find=true;
				break;
			}			
		}			
	}
	// Jika find not true maka
	if (!$find){
		// buat array baru dan tampung nilai nilai sebelumnya 
		// Ini Array assosiative
		$item = array('nmBrg'=>$brg, 'jml'=>$jml, 'hrg'=>$hrg);
		// kemudian push array / masukkan data array
		array_push($_SESSION["cart"]["arrCart"],$item);										
	}
}
// Hubungkan ke shopping cart
header("location:cart-disp.php");	
?>