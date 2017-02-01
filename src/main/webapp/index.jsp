<%-- 
    Document   : index
    Created on : Jan 30, 2017, 12:30:40 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Area of Rectangle</h1>
        <form id="areaRectangle" name="areaRectangle" method="POST" action="CalculatorController?calcType=rectangle">           
            Enter Width: <input type="text" name="width" value="">
            Enter Length: <input type="text" name="length" value="">
            <br>          
            <input type="submit" name="submit" value="Submit">
        </form>
        
        <h1>Area of Circle</h1>
        <form id="areaCircle" name="areaCircle" method="POST" action="CalculatorController?calcType=circle">
            Radius: <input type="text" name="radius" value="">
             <input type="submit" name="submit" value="Submit">            
        </form>
        
        <h1>Length of Missing Side (Right Triangle)</h1>
        <form id="areaTriangle" name="areaTriangle" method="POST" action="CalculatorController?calcType=triangle">
            Side A: <input type="text" name="sideA" value="">
            Side B: <input type="text" name="sideB" value="">
            Side C: <input type="text" name="sideC" value="">
            
             <input type="submit" name="submit" value="Submit">            
        </form>
        
        <p><a href="index.jsp">Back to Home</a></p>
    </body>
</html>


