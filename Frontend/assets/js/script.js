$("button").on("click", function () {

    var data = new FormData($("#file-form")[0]);
    console.log(data)

    $.ajax({
        url: "http://localhost:8080/uploader/upload",
        method: "post",
        data: data,
        contentType: false,
        processData: false,
        success: function (res) {
            $('#image').attr('src', `data:image/png;base64,${res}`);
        }
    })

});
