function deleteStudents(){
    var checkedCheckboxs = document.querySelectorAll('input[name=idStud]:checked')
    if(checkedCheckboxs.length == 0){
        alert("Выберите хотя бы одного студента!");
        return;
    }
    //1-2-4-8 - string

    var ids = " ";
    for(var i = 0; i<checkedCheckboxs.length;i++){
        ids = ids + checkedCheckboxs[i].value + " ";
    }

    document.getElementById("hiddenDelete").value = ids;
    document.getElementById('formDelete').submit();
}

function modifyStudent(){
    var checkedCheckboxs = document.querySelectorAll('input[name=idStud]:checked')
    if(checkedCheckboxs.length == 0){
        alert("Выберите одного студента!");
        return;
    }
    if(checkedCheckboxs.length > 1){
        alert("Выберите только одного студента!");
        return;
    }

    document.getElementById("hiddenModify").value = checkedCheckboxs[0].value;
    document.getElementById('formModify').submit();
}