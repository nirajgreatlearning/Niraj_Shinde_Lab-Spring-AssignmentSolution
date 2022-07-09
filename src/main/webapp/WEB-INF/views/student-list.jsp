<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col">
			<a href="${ baseUrl }/student/showFormForAdd" class="btn btn-info">Add Student</a>
		</div>
	</div>
	<br>
	<div class="row">
		<div class="col">
			<c:if test="${students.size() > 0}">
				<table class="table table-striped table-hover">
					<thead class="table bg-primary">
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Course</th>
							<th>Country</th>
							<th>Action</th>
						</tr>
					</thead>
					<c:forEach items="${students}" var="student">
						<tr>
							<td><c:out value="${student.firstName}" /></td>
							<td><c:out value="${student.lastName}" /></td>
							<td><c:out value="${student.course}" /></td>
							<td><c:out value="${student.country}" /></td>
							<td><a class="btn btn-sm btn-primary"
								href="${ baseUrl }/student/showFormForUpdate?studentId=${student.id}">Update</a> |
								<a class="btn btn-sm btn-danger" onclick="return confirm('Are you sure you want to Delete?');"
								href="${ baseUrl }/student/delete?studentId=${student.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</table>


			</c:if>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>