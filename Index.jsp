<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="test" uri="http://rupali.com"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
			 <form>
                <div class="form-group row">
                  <label for="quoteOrderDate" class="col-sm-2 col-form-label">Order Date:</label>
                  <div class="col-sm-10">
                  <input type="date" class="form-control" id="quoteOrderDate" aria-describedby="dateHelp" placeholder="Order Date">
                  </div>
                </div>
                <div class="form-group row">
                  <label for="quoteUserId/Name" class="col-sm-2 col-form-label">User Id/Name:</label>
                  <div class="col-sm-10">
                  <input type="text" class="form-control" id="quoteUserId/Name" placeholder="User Id/Name">
                  </div>
                </div>
                <div class="form-group row">
                    <label for="quoteGSTNumber" class="col-sm-2 col-form-label">GST Number:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="quoteGSTNumber"  placeholder="GST Number">
                    </div>
                </div>
        
                <div class="form-group row">
                    <label for="quoteShippingAddress"class="col-sm-2 col-form-label">Shipping Address:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="quoteShippingAddress" placeholder="Shipping Address">
                    </div>
                 </div>
                 <div class="form-group row">
                    <label for="quoteCity" class="col-sm-2 col-form-label">City:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="quoteCity" placeholder="City">
                    </div>
                    
                  </div>
                  <div class="form-group row" >
                    <label for="quotePhoneNumber" class="col-sm-2 col-form-label">Phone Number:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="quotePhoneNumber" placeholder="Phone Number">
                    </div>
                  </div>
                  <div class="form-group row">
                    <label for="quoteEmail" class="col-sm-2 col-form-label">E-mail:</label>
                    <div class="col-sm-10">
                    <input type="email" class="form-control" id="quoteEmail"  placeholder="E-mail">
                    </div>
                    
                  </div>
                  <div class="form-group row">
                    <label for="quotePincode" class="col-sm-2 col-form-label">Pincode:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="quotePincode" placeholder="Pincode">
                    </div>
                  </div>
                  
                  <div class="form-group row">
                    <div class="col-sm-10 offset-sm-2">
                        <button type="submit" id="addMoreProductsButton" onMouseMove="myFunction()" class="btn btn-primary">Add More Products</button>
                    </div>
                </div>
                
               
               
	<div id="addMoreProductsDiv" style="display:none;" >
<h3>Available products are:</h3>
    <test:tag1 query="Select * from admin.productdetails" database="jdbc:derby:C:\Users\RUPALI TRIPATHI\MyDB;create=true" username="admin" password="derby"></test:tag1>
		</div>
		
                <div class="form-group row">
                    <div class="col-sm-10 offset-sm-2">
                        <button type="submit" id="computeCosts" class="btn btn-primary">Compute Costs</button>
                    </div>
                </div>
                
            
              </form>
              
              <script>
function myFunction() {
	document.getElementById('addMoreProductsDiv').style.display = "block";
}
</script>
		
</body>
</html>
