$("button").on("click", function () {
    console.log($("input:first-child").val());

    $.ajax({
        url:"http://localhost:8080/uploader/upload",
        method:"post",
        enctype:"multipart/form-data",
        data:$("#file-form").serialize(),
        success:function () {
            alert("Done");
        }
    })

});
