<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Online Shopping</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<%@ include file="header.jsp" %>



<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="C:\Users\karthika-Mk\workspace\demo1\demo1\src\main\webapp\WEB-INF\views\images\2.jpg" alt="Party wear costume" style="width:100%;">
        <div class="carousel-caption">
          <h3>Party wear costume</h3>
        
        </div>
      </div>

      <div class="item">
        <img src="C:\Users\karthika-Mk\workspace\demo1\demo1\src\main\webapp\WEB-INF\views\images\3.jpg" alt="Accessories For womens" style="width:100%;">
        <div class="carousel-caption">
          <h3>Accessories For womens</h3>
          
        </div>
      </div>
    
      <div class="item">
        <img src="C:\Users\karthika-Mk\workspace\demo1\demo1\src\main\webapp\WEB-INF\views\images\4.jpg" alt="Trending  Dresses" style="width:100%;">
        <div class="carousel-caption">
          <h3>Trending  Dresses</h3>
          
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>






</body>
</html>
