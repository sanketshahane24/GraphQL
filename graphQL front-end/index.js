var schools;
const data = JSON.stringify({
    query:`{
        school{
            schoolId
            schoolName
            studentList{
              studentName
            }
          }
    }`
})

$.ajax({
    method:"POST",
    url:"http://localhost:9090/graphql",
    contentType:"application/json",
    headers:{"access-control-allow-origin":"*",
"access-control-allow-headers":"*"},
    data : data,
    success: (response)=>{
        schools = response.data.school

        console.log(schools)

        for(var s=0;s<schools.length;s++){
            $("#schools").append(`<div>Sr No:${s} 
           <p> School Name : ${schools[s].schoolName} </p> </div>`)
        }
    },
    error:(error)=>{console.log(error)}
})



