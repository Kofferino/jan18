class Countdown {

    birthday;

    constructor(birthday, wrapper){
        this.birthday = moment(birthday);
        $("<div class='container-fluid'></div>").append("<div id='row' class='row'></div>");
    }

    render(){
        for(let i=0; i<5; i++){
            $("#row").append()
        }
    }
}