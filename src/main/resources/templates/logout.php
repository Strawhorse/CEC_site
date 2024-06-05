<?php
if(!isset($_SESSION['email']) && !isset($_SESSION['password'])){

    print 'Redirecting...';
    header('Refresh:3 ; URL=index.html');
}

?>
