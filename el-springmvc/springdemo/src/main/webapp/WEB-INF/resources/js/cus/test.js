$(document).ready(function () {
    init();
});

function init() {
    $.ajax({
        "type":"post",
        "data":{"name":"data"},
        "url":"testr",
        "success":function (data) {
            $("#dataTable").tmpl(data.testModel).appendTo("#trbody");
        },
        "error":function (data) {
            alert("数据绑定出错");
        }
    });
}