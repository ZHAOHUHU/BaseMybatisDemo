$(function () {
    $("#but").click(function () {
        $.ajax({
            url: "/list",
            data: {},
            success: function (data) {
                alert(data);
            }
        });
    });
});

