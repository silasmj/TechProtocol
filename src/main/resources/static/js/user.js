
function addAFriend() {
    const email = document.getElementById("add-user-mail").value
    const host = document.getElementById("add-user-host").value

    const friend = {
        email: email,
        host: host
    }

    fetch( "http://localhost:8080/sendRequest", {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        },
        body: JSON.stringify(friend)
    })
        .then(response => {
            if(response.status === 200){
                console.log(response.status + " Everything is okay")
            }else{
                console.log(response.status + " Didn't go that well");
            }
        });
}