$("button").on("click", function () {
    console.log($("input:first-child").val());

    $.ajax({
        url:"http://localhost:8080/uploader/upload",
        method:"post",
        data:$("input:first-child").val(),
        success:function () {
            alert("Done");
        }
    })

});
