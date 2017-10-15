function onLoad() {
    hotelDB = firebase.database().ref("Hotel");
    reservationDB = firebase.database().ref("Reservation");
 }

function onSubmit() {
    first_name = document.getElementById("first_name").value;
    last_name = document.getElementById("last_name").value;
    email = document.getElementById("email").value;
    check_in_date = getDateObject(document.getElementById("check_in_date").value);
    check_out_date = getDateObject(document.getElementById("check_out_date").value);
    room_num = parseInt(document.getElementById("room_num").value);
    bed_type = document.getElementById("bed_type").value;
    credit_card_num = parseInt(document.getElementById("credit_card_num").value);
    bill = parseFloat(document.getElementById("bill_amount").value);
    login_id = parseInt(document.getElementById("login_id").value);
     reservationDB.child(login_id).set({"_checkInDate" : check_in_date, "_checkOutDate" : check_out_date, "_checkedIn" : false, "_hotelID" : "hotelid", "_loginID" : login_id, "_ownerBillAmount" : bill, "_ownerCreditCardNumber": credit_card_num, "_ownerFirstName" : first_name, "_ownerLastName" : last_name, _room : {"_roomNumber" : room_num, "_roomType" : bed_type}});
     alert("The data has been submitted!");
 }

 function getDateObject(aString) {
     aList = aString.split("/");
     return {"date" : 0, "day" : parseInt(aList[1]), "hours" : 0, "minutes" : 0, "month" : parseInt(aList[0]), "seconds" : 0, "time" : 0, "timezoneOffset" : 0, "year" : parseInt(aList[2])};
 }

 function alertEmail() {
     alert("Thank you for your comment! We will get back to you shortly!");
 }

//ADDING TO DB
//db.child("first").set({_hotelID : "TESTING PLS WORK",
//     _name : "hotelname PLS PLS "});

//GETTING ELEMENT
//document.getElementsByClassName("wall");
