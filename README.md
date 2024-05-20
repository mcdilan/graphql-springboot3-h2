# Spring-For-GraphQL

query {
  students:findStudentById(studentId:"4"){
    id,
    name,
    lastName,
    age
  }
}

query {
  students:findAllStudents{
    id,
    name,
    lastName,
    age
  }
}

--------------------------------------------

mutation {
  createStudent(inputStudent: {
    name:"Daniel",
    lastName:"Posada",
    age:27,
    courseId:"2"
  }){
	id,
    name,
    lastName,
    age
  }
}

mutation{
	deleteStudentById(studentId:"1")
}

