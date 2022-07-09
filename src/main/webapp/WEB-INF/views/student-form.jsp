<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h4>Save Student</h4>
	<br>
	<form:form method="post" action="save" modelAttribute="studentInfo">
		<form:hidden path="id" />
		<div class="mb-3 row">
			<c:set var="firstNameHasBindError">
				<form:errors path="firstName" />
			</c:set>
			<label for="firstName" class="col-sm-2 col-form-label">First
				Name:</label>
			<div class="col-sm-4">
				<form:input
					class="form-control ${not empty firstNameHasBindError?'is-invalid':''}"
					path="firstName" />
				<div id="firstName" class="invalid-feedback">
					${firstNameHasBindError}</div>
			</div>
		</div>
		<div class="mb-3 row">
			<c:set var="lastNameHasBindError">
				<form:errors path="lastName" />
			</c:set>
			<label for="lastName" class="col-sm-2 col-form-label">Last
				Name:</label>
			<div class="col-sm-4">
				<form:input
					class="form-control ${not empty lastNameHasBindError?'is-invalid':''}"
					path="lastName" />
				<div id="firstName" class="invalid-feedback">
					${lastNameHasBindError}</div>
			</div>
		</div>
		<div class="mb-3 row">
			<c:set var="courseHasBindError">
				<form:errors path="course" />
			</c:set>
			<label for="course" class="col-sm-2 col-form-label">Course
				Name:</label>
			<div class="col-sm-4">
				<form:input
					class="form-control ${not empty courseHasBindError?'is-invalid':''}"
					path="course" />
				<div id="course" class="invalid-feedback">
					${courseHasBindError}</div>
			</div>
		</div>
		<div class="mb-3 row">
			<c:set var="countryHasBindError">
				<form:errors path="country" />
			</c:set>
			<label for="course" class="col-sm-2 col-form-label">Country
				Name:</label>
			<div class="col-sm-4">
				<form:input
					class="form-control ${not empty countryHasBindError?'is-invalid':''}"
					path="country" />
				<div id="country" class="invalid-feedback">
					${countryHasBindError}</div>
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label"></label>
			<div class="col-sm-4">
				<input type="submit" class="btn btn-sm btn-primary" value="Save" />
			</div>
		</div>

	</form:form>
	<br> <a href="list" class="btn btn-link">Back to Student List</a>
</div>
<%@ include file="common/footer.jspf"%>