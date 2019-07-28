<%--
  Created by IntelliJ IDEA.
  User: chengyuanliang
  Date: 2019/7/25
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title<==>hi</title>
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css" rel="stylesheet">

    </style>
</head>
<body>
    <div>
        <h1>页面的跳转啊</h1>
    </div>

    <script type="text/javascript" src="../../resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="../../resources/js/bootstrap.min.js"></script>
    <script type="text/javascript">

        $(function () {
            alert(12334);
        });
        $(function(){
            $("input[name=title]").blur(function(){
                var title = $(this).val();
                if(title.length < 1){
                    alert("文档名称不能为空");
                    return;
                }
            })

            $("textarea[name=summary]").blur(function(){
                var title = $(this).val();
                if(title.length < 1){
                    alert("文档摘要不能为空");
                    return;
                }
            })

            $("input[name=uploadUser]").blur(function(){
                var title = $(this).val();
                if(title.length < 1){
                    alert("上传人不能为空");
                    return;
                }
            })

            $("input[name=createDate]").blur(function(){
                var title = $(this).val();
                if(title.length < 1){
                    alert("上传时间不能为空");
                    return;
                }

                var reg =/^\d{4}[-]\d{2}[-]\d{2}$/;

                if(!reg.test(title)){
                    alert("请输入正确格式");
                    return;
                }

            })

            $("input[name=btn]").click(function(){
                var id = $("input[name=id]").val();
                var title = $("input[name=title]").val();
                var summary = $("textarea[name=summary]").val();
                var uploadUser = $("input[name=uploadUser]").val();
                var createDate = $("input[name=createDate]").val();


                var reg =/^\d{4}[-]\d{2}[-]\d{2}$/;

                if(title.length < 1){
                    alert("文档名称不能为空");
                    return;
                }

                if(summary.length < 1){
                    alert("文档摘要不能为空");
                    return;
                }

                if(uploadUser.length < 1){
                    alert("上传人不能为空");
                    return;
                }

                if(createDate.length < 1){
                    alert("上传时间不能为空");
                    return;
                }

                if(!reg.test(createDate)){
                    alert("时间请输入正确格式");
                    return;
                }


                alert("updeee")
                $.ajax({
                    url:"/Edoc/edoc/update",
                    type:"post",
                    dataType:"json",
                    data:{
                        "title": title,
                        "id":id,
                        "summary":summary,
                        "uploadUser":uploadUser,
                        "createDate":createDate

                    },
                    success:function(data){
                        if(data > 0){
                            alert("成功修改")
                        }

                    }
                });
            })


        })
    </script>
</body>
</html>
