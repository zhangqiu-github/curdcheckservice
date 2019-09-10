<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lisence</title>
<script type="text/javascript">
function submitclick() {
	document.form.action = "lisence";
    document.form.submit();
}
</script>
</head>
<body>
    <form name="form" method="post" enctype="multipart/form-data">
        <fieldset>
        	<legend>提交数据源文件</legend>
        	<p>
                <label>序号：</label> <label>${motherboard}</label>
            </p>
            <p>
                <label>选择文件：</label> <input type="file" id="file" name="file" tabindex="2">
            </p>
            <p id="buttons">
                <input id="submit" type="submit" tabindex="4" value="注册" onclick="submitclick()">
            </p>
        </fieldset>
    </form>
</body>
</html>