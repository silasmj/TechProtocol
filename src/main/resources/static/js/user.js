
function createAUser() {
    const name = document.getElementById("create-user-name").value
    const email = document.getElementById("create-user-email").value

    const user = {
        name: name,
        email: email
    }

    fetch( "http://localhost:8080/createUser", {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        },
        body: JSON.stringify(user)
    })
        .then(response => {
            if(response.status === 200){
                console.log(response.status + " Everything is okay")
            }else{
                console.log(response.status + " Didn't go that well");
            }
        });
}