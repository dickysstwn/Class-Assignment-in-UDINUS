<!DOCTYPE html>
<html>
    <head>
        <title> DS PROJECT | Q&S </title>
        <link rel="shortcut icon" type="image/jpg" href="gambar/icon.ico"/>
        <link rel="stylesheet" href="PBW.css">
    </head>
<body>
    <header>
        <div class="pembuka">
            <br></br>
            <a href="index.html"><img src="gambar/logo.jpg" alt="logo" width="150" height="150" align="center"></a>
            <h1>DS PROJECT</h1>
        </div>
        <div class="navigasi">
            <hr></hr>
                <a href="about.html">ABOUT</a>
                <a href="creator.html">CREATOR</a>
                <a href="index.html"><img src="gambar/logo.jpg" alt="logo" width="50" height="50" align="center"></a>
                <a href="contact.html">CONTACT</a>
                <a href="gallery.html">GALLERY</a>
            <hr></hr>
        </div>
    </header>
    <div class="white-board">
        <hr></hr>
        <h1>Question and Suggestion</h1>
        <p>If there are any questions or suggestions about content or work on this web can be submitted here: </p>
        <p2><form action="" method="get" name="myform">
            <label for="name">Name</label><br>
            <input type="text" class="textboxname" name="nama"/><br>
            <label for="question">Question or Suggestion</label><br>
            <textarea class="textboxquestion" name="question" rows="4" cols="50"></textarea><br>
            <input type="submit" value="simpan" name="simpan">
        </form></p2>
        <hr></hr>
        <?php
        If (isset($_GET['simpan']))
        {
            $nama=$_GET['nama'];
            echo "Your Name                     : <b>$nama</b><br>";
            $question=$_GET['question'];
            echo "Your Question or Suggestion   : <b>$question</b>";
        }
        ?>
    </div>
</body>
</html>