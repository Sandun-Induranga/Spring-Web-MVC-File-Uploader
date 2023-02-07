$("button").on("click", function () {

    var data = new FormData();
    let file = $("input:first-child")[0].files[0];
    let filePath = $("input:first-child")[0].files[0].name;
    data.append("file", file, filePath);

    $.ajax({
        url:"http://localhost:8080/uploader/upload",
        method:"post",
        enctype:"multipart/form-data",
        data:$("#file-form").serialize(),
        contentType:"application/json",
        success:function () {
            alert("Done");
        }
    })

});
