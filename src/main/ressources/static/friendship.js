

function createUser() {
    const userToCreate = {
        email: document.getElementById("create-user-email").value,
        name: document.getElementById("create-user-name").value

    }
    fetch("http://localhost:8080/createUser", {

    method: "POST",
    headers: { "Content-type": "application/json; charset=UTF-8" },
    body: JSON.stringify(userToCreate)
})
    .then(response => response.json())
    .then(result => {
       console.log(result.status);
    });
}