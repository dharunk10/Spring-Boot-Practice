function showCourses(){
    fetch("http://localhost:8080/course")
    .then((response) => response.json())
    .then((course) => {
        const courseList = document.getElementById("coursetable");

        course.forEach(data => {
            var row = `<tr>
                <td>${data.courseID}</td>
                <td>${data.courseName}</td>
                <td>${data.trainer}</td>
                <td>${data.durtionInWeeks}</td>
                </tr>`;
            courseList.innerHTML += row;
        });
        
    });
}
function showEnrolledmem(){
    fetch("http://localhost:8080/course/enrolled")
    .then((response) => response.json())
    .then((enrolled) => {
        const enrolledmem = document.getElementById("enrolledmem");

        enrolled.forEach(data => {
            var row = `<tr>
                <td>${data.name}</td>
                <td>${data.emailId}</td>
                <td>${data.courseName}</td>
                </tr>`;
            enrolledmem.innerHTML += row;
        });
        
    });
}