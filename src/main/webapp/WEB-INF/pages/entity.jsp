<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>My entity</title>
</head>
<body>

<h2>Enter param</h2>
<form method="post" name="changeEntityForm">
  <label for="paramInBody">paramInBody: </label>
  <input type="paramInBody" name="paramInBody"/></br>
  <label for="paramInURL">paramInURL: </label>
  <input type="number" name="paramInURL"/></br>
  <button type="button" onclick=addMyEntity();>submit</button>
</form>

<script>
    function addMyEntity() {
        var form1 = document.getElementsByName("changeEntityForm")[0];
        var param = document.getElementsByName("paramInURL")[0];
        form1.action = "/addMyEntity/" + param.value;
        form1.submit();
        return false;
    }
</script>

</body>
</html>