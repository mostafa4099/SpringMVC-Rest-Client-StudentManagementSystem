<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<script>
        function doSelect(a, b) {
           document.frm.Name.value = a;
           document.frm.walletid.value = b;
            $('#theModal').modal('hide');
            //opener.document.sendmoney.walletId.value = b;
            //opener.document.frm.menuDescription.value = b;
            /*  oMenuGenarationForm.groupId.value=a;
              alert(oMenuGenarationForm.groupId.value);
              window.oMenuGenarationForm.groupId.value;*/
          
        }
	</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">X</button>
		<h1>Wallet</h1>
	</div>
	<div class="modal-body">
		<div class="panel panel-default">
			<div class="panel-heading text-center">User Information</div>
			<div class="panel-body">
				<table>

					<tr>
						<th>Name</th>
						<th>Wallet Id</th>
						<th>Mobile Number</th>
						<th>Action</th>
					</tr>
					
						<tr>
							<td><c:forEach var="Name" items="${Name}"><p>${Name}</p></c:forEach></td>
							<td><c:forEach var="walletID" items="${walletID}"><p>${walletID}</p></c:forEach></td>
							<td><c:forEach var="MobileNo" items="${MobileNo}"><p>${MobileNo}</p></c:forEach></td>

							<td>
							 <a href="#" onclick="doSelect('${search.Name}','${search.walletID}')">Select</a>
						    </td>
						</tr>

				</table>
			</div>
		</div>
		<!-- <div class="modal-footer">
			<div class="panel-footer">
				<input type="button" value="Find Employee" id="empbutton" />
				<div class="col-xs-10" id="lblstatus"></div>
			</div>
		</div> -->
	</div>
</body>
</html>